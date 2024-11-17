
"""
EJERCICIO DE PROGRAMACION:
Escribir un programa que pida al usuario un
número entero y muestre por pantalla si 
es par o impar.
"""
#variable
numero = 0
#pedimos el numero al usuario
numero = int(input("Ingresa un numero: "))
#evaluamos
if numero % 2 == 0:
    print("El numero ",numero," es par....")
else:
    print("El numero ",numero," es impar....")
    