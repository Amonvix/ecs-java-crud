package com.amon.javaCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amon.javaCrud.model.Task;

/**
 * Repository interface for Task entity.
 * Provides default CRUD operations through JPA.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // You can define custom queries here if needed
}
