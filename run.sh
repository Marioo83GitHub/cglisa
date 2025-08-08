#!/bin/bash

# LISA Compiler & Runner - Versión Simple

echo "🚀 Compilando y ejecutando LISA..."

# Verificar archivo fuente
if [ ! -f "example.lc" ]; then
    echo "❌ Error: Archivo 'example.lc' no encontrado"
    exit 1
fi

# Compilar LISA -> C++ -> Ejecutable -> Ejecutar
if java Main && g++ output.cpp -o program.exe && ./program.exe; then
    echo "✅ Completado exitosamente"
else
    echo "❌ Error en el proceso"
    exit 1
fi