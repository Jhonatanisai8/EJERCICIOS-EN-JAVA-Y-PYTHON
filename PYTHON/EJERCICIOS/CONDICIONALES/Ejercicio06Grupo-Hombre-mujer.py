""""
EJERCICIO DE PROGRAMACION:
Los alumnos de un curso se han dividido en dos grupos A y B
de acuerdo al sexo y el nombre. El grupo A esta formado por
las mujeres con un nombre anterior a la M y los hombres con
un nombre posterior a la N y el grupo B por el resto. 
Escribir un programa que pregunte al usuario su nombre 
y sexo, y muestre por pantalla el grupo que le corresponde.
"""

#caracteres limite
letra_limite_hombre = 'N'
letra_limite_mujer = 'M'

#pedimos los datos al usuario
nombre = input("Ingrese su nombre: ")
genero = input("Genero (H = Masculino) ( F = Femenino): ")

#verificamos a que grupo pertenecen
#comparando los caracteres
if nombre[0] <= letra_limite_mujer and genero[0] == 'F':
    print("Pertenes al Grupo A")
elif nombre[0] >= letra_limite_hombre and genero[0] == 'M':
    print("Perteneces al Grupo A")
else:
    print("Perteneces al Grupo B")
    