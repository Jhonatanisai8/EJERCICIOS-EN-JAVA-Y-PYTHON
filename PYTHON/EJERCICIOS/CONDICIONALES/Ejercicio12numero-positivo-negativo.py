
"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Pide al usuario un número e
imprime si es positivo, negativo
o cero.
"""

# pedimos el dato al usuario
numero = int(input("Ingresa un numero: "))
# evaluamos segun las condiciones dadas
if  numero > 0:
    print("El numero es positivo.")
elif numero < 0:
    print("El numero es negativo.")
else:
    print("El numero es cero.")
    