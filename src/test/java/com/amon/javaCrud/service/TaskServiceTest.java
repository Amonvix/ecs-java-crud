
package com.amon.javaCrud.service;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.amon.javaCrud.model.Task;
import com.amon.javaCrud.repository.TaskRepository;

class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnAllTasks() {
        // Arrange
        Task task1 = new Task("First Task", "Test description", false);
        Task task2 = new Task("Second Task", "Another description", true);
        List<Task> tasks = List.of(task1, task2);

        when(taskRepository.findAll()).thenReturn(tasks);

        // Act
        List<Task> result = taskService.getAllTasks();

        // Assert
        assertEquals(2, result.size());
        assertEquals("First Task", result.get(0).getTitle());
    }

    @Test
    void shouldReturnTaskById() {
        // Arrange
        Task task = new Task("Sample Task", "Details", false);
        when(taskRepository.findById(1L)).thenReturn(Optional.of(task));
    

        // Act
        Optional<Task> result = taskService.getTaskById(1L);

        // Assert
        assertEquals(true, result.isPresent());
        assertEquals("Sample Task", result.get().getTitle());
    }
    
    @Test
    void shouldCreateTask() {
        // Arrange
        Task newTask = new Task("New Task", "Create test", false);
        when(taskRepository.save(newTask)).thenReturn(newTask);

        // Act
        Task result = taskService.createTask(newTask);

        // Assert
        assertEquals("New Task", result.getTitle());
        assertEquals("Create test", result.getDescription());
    }

    @Test
    void shouldUpdateTask() {
        // Arrange
        Task existingTask = new Task("Old Title", "Old Desc", false);
        Task updatedTask = new Task("New Title", "New Desc", true);

        when(taskRepository.findById(1L)).thenReturn(Optional.of(existingTask));
        when(taskRepository.save(existingTask)).thenReturn(existingTask);

        // Act
        Optional<Task> result = taskService.updateTask(1L, updatedTask);

        // Assert
        assertEquals(true, result.isPresent());
        assertEquals("New Title", result.get().getTitle());
        assertEquals(true, result.get().isCompleted());
    }

    @Test
    void shouldDeleteTask() {
        // No need to arrange anything because deleteById is void
        // Act
        taskService.deleteTask(1L);

        // Assert
        // Here we would verify interaction
        org.mockito.Mockito.verify(taskRepository).deleteById(1L);
    }
}
