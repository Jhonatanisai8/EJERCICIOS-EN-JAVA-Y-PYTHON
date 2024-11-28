"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Imprime una figura geometrica con asteriscos. 
Crea un programa que imprima figuras geometricas 
simples usando asteriscos.
Como por ejemplo un cuadrado.
Ejemplo:
el usuario ingresa la longitud de los lados 
en este caso 5.
se debe mostrar la siguiente figura.

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
"""
# variables 
longitud_lados = int(input("Longitud de los lados por favor: "))
# mostramos el cuadrado 
for i in range(longitud_lados):
    for a in range (longitud_lados):
        print(" * ",end="")
    print("")        