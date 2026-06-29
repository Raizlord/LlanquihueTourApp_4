# Llanquihue Tour versión 4.0

## Descripción

Aplicación Java desarrollada para la agencia turística **Llanquihue Tour**, que implementa una jerarquía de clases utilizando herencia simple para representar los distintos servicios turísticos ofrecidos por la empresa.

El proyecto mantiene una organización modular por paquetes, permitiendo reutilizar atributos y comportamientos comunes mediante una superclase y especializar cada tipo de servicio a través de subclases.

---

## Objetivo de esta semana

Implementar una jerarquía de clases aplicando los conceptos de:

* Herencia simple.
* Uso de una superclase y subclases.
* Reutilización de atributos mediante `super`.
* Sobreescritura del método `toString()`.
* Organización del proyecto por responsabilidades.

---

## Clases creadas

### model

* ServicioTuristico
* RutaGastronomica
* PaseoLacustre
* ExcursionCultural

### data

* GestorServicios

### ui

* Main

---

## Estructura del proyecto

```
src/
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   └── GestorServicios.java
│
└── ui/
    └── Main.java


Nota: Se han mantenido las clases `Tour`, `GestorDatos` y `TourService` y el archivo tours.txt en el proyecto, pero no se usan para el objetivo de la actividad formativa.

```


---

## Funcionamiento

El programa crea dos instancias de cada uno de los tipos de servicio turístico y muestra su información por consola utilizando el método `toString()`, sobrescrito en cada subclase.

Se crean:

* 2 rutas gastronómicas.
* 2 paseos lacustres.
* 2 excursiones culturales.

---

## Ejecución del programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main.java`.
3. Observar la información de los servicios turísticos mostrada por consola.

---

## Tecnologías utilizadas

* Java.
* Programación Orientada a Objetos (POO).
* Herencia simple.
* Sobrescritura de métodos (`@Override`).
* Constructores con `super`.
* Arquitectura por paquetes (`model`, `data`, `ui`).

---

## Autor

Tomás Guzmán Vilches

**Actividad Formativa 6: Creando jerarquías de clases con herencia simple – Programación Orientada a Objetos.**
