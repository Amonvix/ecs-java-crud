# 🧩 CRUD Java 2025 - Spring Boot API

[![Deploy on Fly.io](https://img.shields.io/badge/Fly.io-Deployed-%230072ff?style=for-the-badge&logo=flydotio&logoColor=white)](https://java-crud-2025-springboot.fly.dev)

🧩 CRUD Java 2025 - Spring Boot API

[![Status](https://img.shields.io/website?down_color=red&down_message=Offline&style=for-the-badge&up_color=brightgreen&up_message=Online&url=https%3A%2F%2Fjava-crud-2025-springboot.fly.dev)](https://java-crud-2025-springboot.fly.dev)

---

## 📚 Tecnologias

- Java 17  
- Spring Boot 3.5  
- Spring Data JPA  
- H2 Database (modo memória)  
- Swagger (documentação automática)  
- Docker + Fly.io(para deploy na Nuvem)

---

## 🚀 Endpoints REST

| Método | Rota                     | Descrição                   |
|--------|--------------------------|-----------------------------|
| GET    | `/api/tasks`             | Lista todas as tarefas      |
| GET    | `/api/tasks/{id}`        | Retorna uma tarefa por ID   |
| POST   | `/api/tasks`             | Cria uma nova tarefa        |
| PUT    | `/api/tasks/{id}`        | Atualiza uma tarefa         |
| DELETE | `/api/tasks/{id}`        | Remove uma tarefa           |

---

## ⚙️ Execução local

```bash
# Build
./mvnw clean package

# Run
java -jar target/crud-java-2025-0.0.1-SNAPSHOT.jar

A API estará acessível em:
http://localhost:8080


📦 Dockerfile usado no Fly.io

'''
FROM openjdk:17-slim
EXPOSE 8080
WORKDIR /app
COPY target/crud-java-2025-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-Dserver.port=${PORT}", "-jar", "app.jar"]
'''

🧠 Observações

Projeto usa H2 em memória, ou seja: os dados somem a cada reinício/deploy.

Ideal para testes, aprendizado e demonstrações.

Produção real? Substitua por PostgreSQL ou outro banco persistente.


📖 Swagger

Documentação automática disponível em:

'''
/swagger-ui.html
ou
/swagger-ui/index.html
'''
Após o deploy:https://java-crud-2025-springboot.fly.dev/swagger-ui.html

🧪 Exemplo de Payload
{
  "id": 1,
  "title": "Exemplo de tarefa",
  "description": "Descrição da tarefa",
  "completed": false
}


👨‍💻 Autor
Daniel Pedroso (Amon)
Desenvolvedor Backend | Java & Python | Projetos com foco em qualidade e deploy profissional.