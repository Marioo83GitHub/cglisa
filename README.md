# LISA Programming Language

<div align="center">
  <img src="logo.png" alt="LISA Logo" width="400">
</div>

LISA es un lenguaje de programación moderno y fácil de usar que compila a código C++ ejecutable. ¡No necesitas conocimientos previos de compiladores o herramientas complejas!

## 🚀 ¿Qué es LISA?

LISA es un lenguaje diseñado para ser:
- **Fácil de aprender:** Sintaxis moderna e intuitiva
- **Rápido:** Se compila a código C++ optimizado
- **Simple:** Un solo comando ejecuta todo el proceso
- **Potente:** Funcionalidades modernas sin complicaciones

## 📋 ¿Qué necesitas instalar?

Solo necesitas 3 cosas básicas:

### 1. **Editor de código**
- Visual Studio Code (recomendado)
- O cualquier editor con terminal integrada

### 2. **Java JDK 24**
- Descarga desde: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
- O usa OpenJDK desde tu gestor de paquetes

### 3. **Compilador C++ (g++)**
- **Windows:** Instala MinGW o usar Git Bash
- **Ubuntu/Linux:** `sudo apt install g++`
- **macOS:** `xcode-select --install`

## 📦 Instalación de LISA

### Paso 1: Descargar LISA
```bash
git clone https://github.com/Marioo83GitHub/cglisa.git
cd cglisa
```

### Paso 2: ¡Listo para usar!
No necesitas compilar nada más. Todo viene precompilado y listo.

## 🎯 Tu primer programa en LISA

### Paso 1: Crear tu archivo
1. Abre tu editor de código (Visual Studio Code)
2. Crea un archivo llamado `example.lc` en la carpeta del proyecto
3. Escribe tu código LISA (ver ejemplos abajo)

### Paso 2: Ejecutar tu programa
Abre la terminal en la carpeta del proyecto y ejecuta:

```bash
./run.sh
```

¡Eso es todo! El script automáticamente:
- ✅ Compila tu código LISA
- ✅ Genera el código C++
- ✅ Compila el ejecutable
- ✅ Ejecuta tu programa

## 💡 Ejemplo básico

Crea un archivo `example.lc` con este contenido:

```lisa
programa principal {
    escribir("¡Hola mundo desde LISA!");
    
    entero numero = 42;
    escribir("El número es: ", numero);
}
```

Luego ejecuta:
```bash
./run.sh
```

## 🛠️ Más ejemplos de código LISA

### Variables y tipos de datos
```lisa
programa principal {
    // Números enteros
    entero edad = 25;
    
    // Números decimales
    decimal precio = 19.99;
    
    // Texto
    texto nombre = "Juan";
    
    // Booleanos
    booleano activo = verdadero;
    
    escribir("Nombre: ", nombre);
    escribir("Edad: ", edad);
}
```

### Operaciones matemáticas
```lisa
programa principal {
    entero a = 10;
    entero b = 5;
    
    entero suma = a + b;
    entero resta = a - b;
    entero multiplicacion = a * b;
    entero division = a / b;
    
    escribir("Suma: ", suma);
    escribir("Resta: ", resta);
    escribir("Multiplicación: ", multiplicacion);
    escribir("División: ", division);
}
```

### Estructuras de control
```lisa
programa principal {
    entero numero = 15;
    
    si (numero > 10) {
        escribir("El número es mayor que 10");
    } sino {
        escribir("El número es menor o igual que 10");
    }
    
    // Bucle
    para (entero i = 1; i <= 5; i = i + 1) {
        escribir("Iteración: ", i);
    }
}
```

## 🚨 Solución de problemas comunes

### ❌ Error: "java no se reconoce como comando"
**Solución:** Java no está instalado o no está en el PATH
- Instala JDK 24
- Verifica con: `java -version`

### ❌ Error: "g++ no se reconoce como comando"
**Solución:** g++ no está instalado
- **Windows:** Instala MinGW o usa Git Bash
- **Linux:** `sudo apt install g++`
- **macOS:** `xcode-select --install`

### ❌ Error: "No such file example.lc"
**Solución:** 
- Asegúrate de que tu archivo se llame exactamente `example.lc`
- Debe estar en la misma carpeta que `run.sh`

### ❌ El programa no hace nada
**Solución:** 
- Revisa que tu código tenga la estructura: `programa principal { ... }`
- Verifica que uses `escribir()` para mostrar resultados

## 📁 ¿Qué contiene el proyecto?

```
cglisa/
├── README.md           # Esta guía
├── logo.png           # Logo de LISA
├── run.sh             # Script que ejecuta todo (¡lo único que necesitas!)
├── example.lc         # Tu código fuente LISA
├── output.cpp         # Código C++ generado (automático)
├── program.exe        # Tu programa ejecutable (automático)
└── [archivos internos del compilador]
```

## 🎯 Flujo de trabajo típico

1. **Escribir código:** Edita `example.lc` con tu código LISA
2. **Ejecutar:** `./run.sh` en la terminal
3. **Ver resultado:** Tu programa se ejecuta automáticamente
4. **Repetir:** Modifica el código y vuelve a ejecutar

## 🤝 ¿Necesitas ayuda?

- 🐛 **Reportar problemas:** [Abrir issue](https://github.com/Marioo83GitHub/cglisa/issues)
- 💡 **Sugerencias:** Usa las issues del repositorio
- 📖 **Más ejemplos:** Revisa la carpeta de ejemplos (si existe)

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - puedes usarlo libremente.

---

<div align="center">
  <b>¡Disfruta programando en LISA! 🚀</b>
</div>