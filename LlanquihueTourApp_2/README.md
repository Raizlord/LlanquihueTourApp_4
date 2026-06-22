# Llanquihue Tour versión 3.0

## Descripción

Aplicación Java desarrollada para la agencia turística **Llanquihue Tour**, que permite gestionar información de tours mediante lectura de datos desde un archivo de texto.

Los datos se almacenan en una estructura dinámica (ArrayList) y son procesados mediante operaciones de recorrido, filtrado y búsqueda.

El sistema está organizado en paquetes para mejorar la modularidad, reutilización y separación de responsabilidades.

---

## Funcionalidades

- Carga de datos desde archivo ".txt"
- Almacenamiento en "ArrayList"
- Visualización de todos los tours
- Filtrado de tours por precio
- Filtrado de tours por tipo (Cultural, Aventura, Gastronómico, etc)
- Búsqueda de tours por nombre
- Menú interactivo por consola
- Manejo básico de errores con "try-catch"

---

## Estructura del proyecto

src/
├── model/
│ └── Tour.java
│
├── data/
│ └── GestorDatos.java
│
├── service/
│ └── TourService.java
│
├── ui/
│ └── Main.java
│
└── resources/
└── tours.txt

---

## Menú del sistema

El programa incluye un menú por consola con las siguientes opciones:

1. Ver todos los tours  
2. Filtrar por precio mínimo  
3. Filtrar por tipo de tour  
4. Buscar tour por nombre  
0. Salir del sistema  

---

## Ejecución del programa

1. Abrir el proyecto en IntelliJ IDEA o NetBeans.
2. Verificar que el archivo "tours.txt" esté en "src/resources".
3. Ejecutar la clase "Main.java".
4. Interactuar con el menú por consola.

---

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Colecciones (ArrayList)
- Manejo de archivos (BufferedReader, FileReader)
- Manejo de excepciones (try-catch)
- Arquitectura por paquetes (model / data / service / ui)

---

## Autor

Tomás Guzmán Vilches

Actividad Sumativa 5: Organización modular y creación de una librería personalizada – Programación Orientada a Objetos.
