"""
EJERCICIO DE LOGICA DE PROGRAMACION: 
Solicita al usuario una palabra 
y cuenta cuántas vocales tiene:
Ejemplo: Si el usuario ingresa "Python", 
el programa debe mostrar: 
Cantidad de vocales que tiene 
la cadena ingresada es 1.
"""
# variables 
lista_vocales = ["a","e","i","o","u"]
contador_vocales = 0
# pedimos la cadena al usuario 
cadena = input("Ingrese por favor una cadena o frase: ")
# procemos a contar cuantas vocales hay en la cadena
for i in range(len(cadena)):
    for j in range(len(lista_vocales)):
        if (cadena[i] == str(lista_vocales[j]).casefold()):
            contador_vocales = contador_vocales+ 1
# mostramos la cantidad de vocales 
print(f"""Cantidad de vocales que tiene 
      la cadena ingresada es: {contador_vocales}""")
            