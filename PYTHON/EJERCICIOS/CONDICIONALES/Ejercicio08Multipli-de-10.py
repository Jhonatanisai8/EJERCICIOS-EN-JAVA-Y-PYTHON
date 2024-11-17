
"""
EJERCICIO DE LOGICA DE PROGRAMACION: 
Programa que lea un número entero y 
muestre si el número es múltiplo de 10.
"""

#VARIABLES 
numero = 0

numero = int(input("Ingrese un numero por favor: "))

# evaluamos si es multiplo de 10
if numero % 10 == 0:
    print("El numero ",numero," es multiplo de 10.")
else:
    print("El numero ",numero," no es multiplo de 10.")