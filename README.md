# Proyecto de Gestión de Libros de la Universidad

Este proyecto es una aplicación basada en Java y Spring Boot para gestionar libros en una universidad. El mismo que sigue el patrón de arquitectura MVC (Modelo-Vista-Controlador).

## Estructura del Proyecto


### Descripción de Archivos

- **com_tuuniversidad_controllers**
  - **LibroController.java**: Controlador REST que maneja las solicitudes HTTP relacionadas con libros.
  ![image](https://github.com/Wellington-Granados/Deber-Web-API-de-Libro/assets/170190822/dc4c4d86-11f6-4d73-b60d-fe503312e185)

- **com_tuuniversidad_models**
  - **Libro.java**: Entidad que representa un libro en la base de datos con atributos como título, autor, y ISBN.
  ![image](https://github.com/Wellington-Granados/Deber-Web-API-de-Libro/assets/170190822/6f9af029-4d4f-43d1-9584-23c9bceef7dd)

- **com_tuuniversidad_repository**
  - **LibroRepository.java**: Interfaz que extiende `JpaRepository` para proporcionar métodos CRUD para la entidad Libro.
  - **LibroRepositoryImpl.java**: Implementación personalizada de métodos adicionales no cubiertos por `JpaRepository`.
  ![image](https://github.com/Wellington-Granados/Deber-Web-API-de-Libro/assets/170190822/b3c32d25-8325-445d-98cc-359429a9b7c8)

- **com_tuuniversidad_service**
  - **LibroService.java**: Interfaz que define los métodos de negocio para las operaciones con libros.
  - **LibroServiceImpl.java**: Implementación de `LibroService` que contiene la lógica de negocio y usa `LibroRepository` para interactuar con la base de datos.
  ![image](https://github.com/Wellington-Granados/Deber-Web-API-de-Libro/assets/170190822/4517dd63-1e75-4157-8e53-af4abf4c9a46)

- **DemoApplication.java**: Archivo principal que arranca la aplicación Spring Boot.
![image](https://github.com/Wellington-Granados/Deber-Web-API-de-Libro/assets/170190822/11f59a11-04f4-48bf-95eb-4e39faa7621f)

## Requisitos Previos

- JDK 11 o superior
- Maven 3.6.3 o superior
- Spring Boot 2.5.4 o superior

## Muchas gracias por leer
