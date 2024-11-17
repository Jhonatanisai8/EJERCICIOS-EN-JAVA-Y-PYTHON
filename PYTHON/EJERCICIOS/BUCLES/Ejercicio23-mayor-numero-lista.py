"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Calcular el mayor numero de una lista.
"""

# creamos la lista 
lista_numeros = [5,4,6,23,2,11,8,567]
# valor maximo 
valor_mayor = -9999
# recorremos la lista  y buscamos el mayor numero
for i in range(len(lista_numeros)):
    if  valor_mayor < lista_numeros[i]:
        valor_mayor = lista_numeros[i]
# mostramos el valor mayor
print(f"Valor Mayor de la lista => {valor_mayor}")