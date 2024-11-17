"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Crea un programa que pida al usuario tres calificaciones
y calcule si la media de las tres es suficiente para 
aprobar. Considera que la media debe ser 11 o 
más para aprobar.
"""

# pedimos los datos 
nota01 = float(input("Ingrese la nota Nº1: "))
nota02 = float(input("Ingrese la nota Nº2: "))
nota03 = float(input("Ingrese la nota Nº3: "))

# calculamos la media 
media = (nota01 + nota02 + nota03) / 3
print("Promedio Obtenido: ",media)

# evaluamos el resultado de la media
if media >= 11:
    print("Felicitaciones has aprobado....")
else:
    print("Deberias esforzarte un poco mas....")
    


