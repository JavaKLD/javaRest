# Todo REST API на Java с использованием MySQL

Этот проект представляет собой RESTful API для управления списком задач (Todo), разработанный на языке Java с использованием базы данных MySQL.

## Функциональность

- **Создание задачи**: добавление новой задачи в список.
- **Получение списка задач**: просмотр всех существующих задач.
- **Обновление задачи**: изменение деталей существующей задачи.
- **Удаление задачи**: удаление задачи из списка.

## Технологии

- **Java**: основной язык разработки.
- **Spring Boot**: фреймворк для создания stand-alone приложений на Java.
- **MySQL**: реляционная база данных для хранения данных о задачах.
- **JPA/Hibernate**: для объектно-реляционного отображения (ORM) между Java и MySQL.

## Требования

- Java 8 или новее
- MySQL 5.7 или новее
- Maven 3.6 или новее

## Установка и запуск

### 1. Клонирование репозитория
```bash
git clone https://github.com/JavaKLD/javaRest.git
cd javaRest
```

### 2. Настройка базы данных

- Создайте базу данных MySQL:
  ```sql
  CREATE DATABASE todo_db;
  ```

- Обновите файл `src/main/resources/application.properties` с вашими настройками доступа к базе данных:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
  spring.datasource.username=ВАШ_ПОЛЬЗОВАТЕЛЬ
  spring.datasource.password=ВАШ_ПАРОЛЬ
  ```

### 3. Сборка и запуск приложения

- Соберите проект с помощью Maven:
  ```bash
  mvn clean install
  ```

- Запустите приложение:
  ```bash
  mvn spring-boot:run
  ```

Приложение будет доступно по адресу `http://localhost:8080`.

## Использование API

API предоставляет следующие эндпоинты:

- **GET /tasks**: получить список всех задач.
- **POST /tasks**: создать новую задачу.
- **GET /tasks/{id}**: получить задачу по ID.
- **PUT /tasks/{id}**: обновить задачу по ID.
- **DELETE /tasks/{id}**: удалить задачу по ID.

### Пример запроса на создание новой задачи
```bash
curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{"title": "Новая задача", "description": "Описание задачи"}'
```
