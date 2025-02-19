## To Do List App

### Overview
This project is a simple web application built using Spring Boot for managing a to-do list. It provides CRUD functionalities (Create, Read, Update, Delete) for checklists and their associated items, utilizing a PostgreSQL database.

### Technologies Used
- Spring Boot: Framework for creating and running Spring-based applications.
- PostgreSQL: Open-source relational database management system.

### Features
- Manage Checklists: Create, view, and delete checklists.
- Manage Items: Add, update, mark as done, or remove items within a checklist.
- Retrieve Data: Get checklists and items via API endpoints.

### Project Structure
```cmd
├───main
│   ├───java
│   │   └───com
│   │       └───bts
│   │           └───ToDoList
│   │               │   ToDoListApplication.java
│   │               │
│   │               ├───auth
│   │               ├───controllers
│   │               │       ChecklistController.java
│   │               │       ItemController.java
│   │               │
│   │               ├───data
│   │               │   ├───models
│   │               │   │       Checklist.java
│   │               │   │       Item.java
│   │               │   │       User.java
│   │               │   │
│   │               │   └───repository
│   │               │           ChecklistRepository.java
│   │               │           ItemRepository.java
│   │               │
│   │               └───service
│   │                       ChecklistService.java
│   │                       ItemService.java
│   │
│   └───resources
│       │   application.properties
│       │
│       ├───static
│       └───templates
└───test
    └───java
        └───com
            └───bts
                └───ToDoList
                        ToDoListApplicationTests.java
```

### Running the Application
1. Create PostgreSQL database named todolist, configure the username and password in the `application.properties`
2. Execute `mvn spring-boot:run` in the project directory
3. The application will be accessible at `http://localhost:8080`

### API List
1. Checklist APIs
- GET	/api/checklists: 	Get all checklists
![img_1.png](img/img_1.png)
- GET	/api/checklists/{id}	Get checklist by ID
![img_2.png](img/img_2.png)
- POST	/api/checklists	Create a new checklist
![img.png](img/img.png)
- DELETE	/api/checklists/{id}	Delete a checklist by ID
![img_3.png](img/img_3.png)
- 
2. Item APIs
- GET	/api/items/checklist/{checklistId}	Get all items in a checklist
![img_5.png](img/img_5.png)
- GET	/api/items/{id}	Get item by ID
![img_6.png](img/img_6.png)
- POST	/api/items	Create a new item
![img_4.png](img/img_4.png)
- PUT	/api/items/{id}	Update an item
![img_7.png](img/img_7.png)
- PATCH	/api/items/{id}/status?isDone=true	Mark an item as done
![img_8.png](img/img_8.png)
- DELETE	/api/items/{id}	Delete an item by ID
![img_9.png](img/img_9.png)

3. User APIs