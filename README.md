# Veterinary API

This repository contains a RESTful API for a veterinary service, built using Spring Boot, Hibernate, and Maven. MySQL Workbench was utilized for the database, while Postman was employed for HTTP request testing.

## Overview

The API provides services for managing Pets and Owners in a veterinary context. Pets are associated with Owners using a One-to-One relationship. Basic CRUD operations are supported for both Pets and Owners. Additionally, there are two additional endpoints:

- An endpoint to retrieve a list of all pets of species Dog and breed Caniche.
- Another endpoint to fetch a list of a new DTO object that combines essential data from Pets and Owners.

The project follows a multi-package architecture, including:

- **Model**: Contains entity classes for Hibernate mappings.
- **Controller**: Implements RESTful endpoints.
- **DTO**: Data Transfer Objects for transferring data between layers.
- **Repository**: Interfaces for database access using Spring Data JPA.
- **Service**: Contains business logic.

## Endpoints

### Owners

- **GET /owners/get**: Retrieve a list of all owners.
- **GET /owners/get/{id}**: Retrieve an owner by ID.
- **POST /owners/create**: Create a new owner.
- **PUT /owners/edit/{id}**: Update an existing owner.
- **DELETE /owners/delete/{id}**: Delete an owner by ID.

### Pets

- **GET /pets/get**: Retrieve a list of all pets.
- **GET /pets/get/{id}**: Retrieve a pet by ID.
- **POST /pets/create**: Create a new pet.
- **PUT /pets/edit/{id}**: Update an existing pet.
- **DELETE /pets/delete/{id}**: Delete a pet by ID.

### Additional Endpoints

- **GET /pets/dogs/caniches**: Retrieve a list of pets with species Dog and breed Caniche.
- **GET /pets/get/owners-pets-info**: Retrieve a list of combined data from Pets and Owners.

## Technologies Used

- **Spring Boot**: For creating RESTful APIs.
- **Hibernate**: For object-relational mapping.
- **Maven**: For project management and dependency resolution.
- **MySQL Workbench**: For database design and management.
- **Postman**: For testing HTTP requests.

## Contributions

Contributions are welcome! If you find any issues or want to enhance the functionality, feel free to submit a pull request.

---
Feel free to reach out if you have any questions or feedback!

