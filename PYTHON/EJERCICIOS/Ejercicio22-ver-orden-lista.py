""""
EJERCICIO DE LOGICA DE PROGRAMACION
Hacer un programa que verifique en estado
(Descendente,Ascendente,Desordenada) 
esta un lista de numeros enteros.
"""
# Creamos una lista 
lista_numeros = [1,4,2,7,4,2]
# variables bandera
ascendente = False
descendente = False
# recoremos la lista 
for i in range(len(lista_numeros)-1):
    # si el numero en la posion i es mayor a la posion siguiente
    # cambia el valor de la variable
    if lista_numeros[i] > lista_numeros[i+1]:
        descendente = True
    else:
        ascendente = True
# mostramos el estado
if ascendente and descendente:
     print("La lista esta desordenada")
elif ascendente:
     print("La lista esta en forma ascendente")
else:
     print("La lista esta en forma descendente")