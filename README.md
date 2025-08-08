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
write("¡Hola mundo desde LISA!");

integer variable numero = 42;
write("El número es: ", numero);
```

Luego ejecuta:
```bash
./run.sh
```

## 🛠️ Más ejemplos de código LISA

### Variables y tipos de datos
```lisa
# Números enteros
integer variable edad = 25;

# Números decimales
decimal variable precio = 19.99;

# Texto (cadenas)
string variable nombre = "Juan";

# Booleanos
boolean variable activo = true;

# Constantes
integer constant MAX_USERS = 100;

write("Nombre: ", nombre);
write("Edad: ", edad);
write("Precio: ", precio);
write("Activo: ", activo);
```

### Operaciones matemáticas
```lisa
integer variable a = 10;
integer variable b = 5;

integer variable suma = a + b;
integer variable resta = a - b;
integer variable multiplicacion = a * b;
integer variable division = a / b;

write("Suma: ", suma);
write("Resta: ", resta);
write("Multiplicación: ", multiplicacion);
write("División: ", division);

# Operación de resto
write("Resto de 10/3: ", remainder of (10 / 3));
```

### Operaciones compactas
```lisa
integer variable contador = 10;

contador += 5;   # contador = contador + 5
contador -= 2;   # contador = contador - 2
contador *= 3;   # contador = contador * 3
contador /= 2;   # contador = contador / 2

write("Contador final: ", contador);
```

### Estructuras de control
```lisa
integer variable numero = 15;

# Condicional is/yes/nope
is (numero > 10)?
yes {
    write("El número es mayor que 10");
}
nope {
    write("El número es menor o igual que 10");
}

# Switch
switch (numero) {
    case 10:
        write("Es exactamente 10");
        stop;
    case 15:
        write("Es exactamente 15");
        stop;
    default:
        write("Es otro número");
}
```

### Bucles
```lisa
# Bucle iterate (for)
integer variable i;
iterate i(from 1 to 5, jumps of 1) {
    write("Iteración: ", i);
}

# Bucle while
integer variable contador = 0;
while (contador < 3) {
    write("Contador: ", contador);
    contador += 1;
}

# Bucle do-while
integer variable numero = 1;
do {
    write("Número: ", numero);
    numero += 1;
} while (numero <= 3);
```

### Arrays (arreglos)
```lisa
# Declarar array con valores
integer array numeros[5] = [1, 2, 3, 4, 5];

# Declarar array vacío
string array nombres[3];

# Acceder a elementos
write("Primer número: ", numeros[0]);
write("Segundo número: ", numeros[1]);

# Modificar elementos
numeros[2] = 10;
write("Tercer número modificado: ", numeros[2]);

# Iterar sobre array
integer variable j;
iterate j(from 0 to 4, jumps of 1) {
    write("Elemento ", j, ": ", numeros[j]);
}
```

### Programación Orientada a Objetos (Clases)
```lisa
# Definir una clase
class Persona
{
    private string property nombre = "Sin nombre";
    private integer property edad = 0;
    
    # Método para inicializar
    public void method inicializar(string n, integer e)
    {
        this.nombre = n;
        this.edad = e;
    }
    
    public void method mostrarInfo()
    {
        write("Nombre: ", this.nombre);
        write("Edad: ", this.edad);
    }
    
    public void method cumplirAnios()
    {
        this.edad += 1;
        write(this.nombre, " ahora tiene ", this.edad, " años");
    }
}

# Crear y usar objetos
Persona object persona1;
persona1.inicializar("Ana", 25);
persona1.mostrarInfo();
persona1.cumplirAnios();

Persona object persona2;
persona2.inicializar("Carlos", 30);
persona2.mostrarInfo();
```

### Entrada de datos del usuario
```lisa
# Solicitar datos al usuario
string variable nombre;
request(nombre, "Ingresa tu nombre: ");

integer variable edad;
request(edad, "Ingresa tu edad: ");

write("Hola ", nombre, ", tienes ", edad, " años");

# Calculadora simple
decimal variable num1, num2;
request(num1, "Primer número: ");
request(num2, "Segundo número: ");

decimal variable resultado = num1 + num2;
write("La suma es: ", resultado);
```

### Ejemplo completo: Calculadora de factorial
```lisa
# Función para calcular factorial
integer function factorial(integer n)
{
    is (n <= 1)?
    yes
    {
        return 1;
    }
    nope
    {
        return n * factorial(n - 1);
    }
}

write("=== Calculadora de Factorial ===");

# Calcular factorial de varios números
integer array numeros[4] = [3, 4, 5, 6];

integer variable i;
iterate i(from 0 to 3, jumps of 1)
{
    integer variable num = numeros[i];
    integer variable result = factorial(num);
    write("Factorial de ", num, " = ", result);
}

# Solicitar número al usuario
integer variable numeroUsuario;
request(numeroUsuario, "Ingresa un número para calcular su factorial: ");
integer variable factorialUsuario = factorial(numeroUsuario);
write("Factorial de ", numeroUsuario, " = ", factorialUsuario);
```

### Ejemplo avanzado: Simulador de semáforo
```lisa
class TrafficLight
{
    private integer property state = 0;
    
    public void method changeLight()
    {
        this.state += 1;
        is (this.state > 2)?
        yes
        {
            this.state = 0;
        }
    }
    
    public void method showLight()
    {
        switch (this.state)
        {
            case 0:
                write("Traffic Light: RED");
                stop;
            case 1:
                write("Traffic Light: YELLOW");
                stop;
            case 2:
                write("Traffic Light: GREEN");
                stop;
            default:
                write("Error: Estado inválido");
        }
    }
}

write("=== Traffic Light Simulator ===");

TrafficLight object light;
light.showLight();

light.changeLight();
light.showLight();

light.changeLight();
light.showLight();

light.changeLight();
light.showLight();
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

## 🎯 Flujo de trabajo típico

1. **Escribir código:** Edita `example.lc` con tu código LISA
2. **Ejecutar:** `./run.sh` en la terminal
3. **Ver resultado:** Tu programa se ejecuta automáticamente
4. **Repetir:** Modifica el código y vuelve a ejecutar

---

<div align="center">
  <b>¡Disfruta programando en LISA! 🚀</b>
</div>