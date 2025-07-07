# Práctica de Árboles Binarios

## 📌 Información General

- **Título:** Práctica de Árboles  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Esteban Vicente Pesantez Rea  
- **Fecha:** 07/07/2025  
- **Profesor:** Ing. Pablo Torres  

---
## 🛠️ Descripción

Este proyecto implementa operaciones fundamentales sobre árboles binarios de búsqueda (BST) en Java. Incluye el desarrollo y demostración de:

- Inserción de nodos en un árbol BST.  
- Inversión de un árbol (espejo).  
- Listado de nodos por niveles (recorrido por niveles).  
- Cálculo de la profundidad máxima del árbol.

Cada ejercicio imprime el árbol de forma visual y clara, mostrando tanto su estructura como sus propiedades.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código principal:
   ```bash
   javac App.java

********** Ejercicio 01: Insertar en BST **********
Input: [5, 3, 7, 2, 4, 6, 8]
 Árbol BST construido:
├── 5
│   ├── 3
│   │   ├── 2
│   │   └── 4
│   └── 7
│       ├── 6
│       └── 8

********** Ejercicio 02: Invertir árbol binario **********
Input: [4, 2, 7, 1, 3, 6, 9]
 Árbol BST construido:
├── 4
│   ├── 2
│   │   ├── 1
│   │   └── 3
│   └── 7
│       ├── 6
│       └── 9
 Árbol BST invertido:
├── 4
│   ├── 7
│   │   ├── 9
│   │   └── 6
│   └── 2
│       ├── 3
│       └── 1

********** Ejercicio 03: Listar niveles **********
Nivel 0: 4 
Nivel 1: 2 7 
Nivel 2: 1 3 6 9 

********** Ejercicio 04: Profundidad máxima **********
Input: [4, 2, 7, 1, 3, 8]
 Árbol BST usado para profundidad:
├── 4
│   ├── 2
│   │   ├── 1
│   │   │   ├── 8
│   │   └── 3
│   └── 7
Profundidad del árbol: 4
