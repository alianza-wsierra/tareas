# 📋 My Java Project

Este es un proyecto Java simple creado con Java 11 y Gradle para la gestión de tareas pendientes.

## 🚀 Explicación del Proyecto

El objetivo de este proyecto es demostrar una estructura básica de aplicación Java orientada a objetos, donde se pueden crear, listar y actualizar tareas.  
Incluye una interfaz para la gestión de tareas y una implementación en memoria, ideal para propósitos educativos o como base para proyectos más grandes.

- 📦 **Modelo:** La clase `Tarea` representa una tarea con id, tipo y estado.
- 🛠️ **Servicio:** La interfaz `TareaService` define operaciones para crear, listar y marcar tareas.
- 💾 **Implementación:** `TareaServiceImpl` almacena las tareas en una lista interna.
- 🖥️ **App:** La clase principal `App` muestra cómo interactuar con el servicio de tareas.

## 🗂️ Estructura del Proyecto

```
workspace
└── my-java-project
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── example
    │   │   │           ├── App.java
    │   │   │           └── model
    │   │   │               ├── Tarea.java
    │   │   │               ├── TareaService.java
    │   │   │               └── TareaServiceImpl.java
    │   │   └── resources
    │   └── test
    │       ├── java
    │       │   └── com
    │       │       └── example
    │       │           └── AppTest.java
    │       └── resources
    ├── .gitignore
    ├── build.gradle
    ├── settings.gradle
    └── README.md
```

## ⚙️ Requisitos

- ☕ Java 11
- 🛠️ Gradle

## 🏗️ Build y Ejecución

Para compilar el proyecto, navega al directorio del proyecto y ejecuta:

```
./gradlew build
```

Para ejecutar la aplicación web con Spring Boot:

```
./gradlew bootRun
```

Luego, abre tu navegador y accede a:

```
http://localhost:8080
```

Aquí podrás crear, listar y actualizar tareas desde la interfaz gráfica.

## 🧪 Pruebas

Para ejecutar los tests:

```
./gradlew test
```

## 📄 Licencia

Este proyecto está licenciado bajo la licencia MIT.