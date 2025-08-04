# LISA Programming Language

<div align="center">
  <img src="logo.png" alt="LISA Logo" width="400">
</div>

LISA es un lenguaje de programación compilado que utiliza ANTLR para el análisis sintáctico y genera código C++ ejecutable.

## 🚀 Características

- Sintaxis moderna, expresiva e intuitiva
- Compilación a C++ nativo
- Análisis sintáctico robusto con ANTLR
- Generación automática de código optimizado

## 📋 Requisitos

Antes de usar LISA, asegúrate de tener instalado:

- **Java** (preferiblemente JDK 24)
- **ANTLR 4**
- **g++** (compilador de C++)
- **javac** (compilador de Java)

## 📦 Instalación

1. Clona este repositorio:
```bash
git clone https://github.com/Marioo83GitHub/cglisa.git
cd cglisa
```

2. Asegúrate de tener ANTLR4 en tu classpath o disponible globalmente.

## 🛠️ Uso del Compilador

### Paso 1: Preparar el analizador ANTLR

Genera las clases Java desde la gramática:

```bash
antlr4 Analyzer.g4 -visitor
```

### Paso 2: Compilar el código Java

Compila todos los archivos Java generados:

```bash
javac *.java
```

### Paso 3: Ejecutar el compilador LISA

Ejecuta el compilador principal (asegúrate de tener un archivo `example.lc`):

```bash
java Main
```

**Nota:** El archivo fuente de LISA debe tener la extensión `.lc` y llamarse `example.lc` para que el compilador lo reconozca automáticamente.

### Paso 4: Compilar el código C++ generado

Una vez generado el archivo `output.cpp`, compílalo:

```bash
g++ output.cpp -o program.exe
```

### Paso 5: Ejecutar el programa

```bash
./program.exe
```

## 📝 Ejemplo de uso completo

```bash
# 1. Generar analizador ANTLR
antlr4 Analyzer.g4 -visitor

# 2. Compilar Java
javac *.java

# 3. Compilar archivo LISA (example.lc)
java Main

# 4. Compilar C++ generado
g++ output.cpp -o program.exe

# 5. Ejecutar programa
./program.exe
```

## 📁 Estructura del proyecto

```
lisa-language/
├── README.md
├── logo.png
├── Analyzer.g4         # Gramática ANTLR4
├── Main.java           # Punto de entrada del compilador
├── example.lc          # Archivo de ejemplo en LISA
├── output.cpp          # Código C++ generado
└── program.exe         # Ejecutable final
```