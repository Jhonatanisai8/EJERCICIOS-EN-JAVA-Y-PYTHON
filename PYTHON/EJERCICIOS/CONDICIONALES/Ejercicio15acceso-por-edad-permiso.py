"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Escribe un programa que pida la edad del usuario
y si tiene permiso de los padres (sí o no). 
Si la edad es mayor de 18, puede acceder; 
si es entre 16 y 18, solo puede acceder 
si tiene permiso de los padres; 
si es menor de 16, no puede acceder.
"""
# pedimos los datos al usuario
edad = int(input("Ingresa la edad por favor: "))
permiso_padres = input("¿Tiene permiso de sus padres?: ")
# evaluamos segun las condionales
if edad >= 18: # 1º condicion
    print("Ingreso Permitido.")
    # 2º condicion
elif edad > 16 and edad < 18 and permiso_padres.casefold() == "si":
    print("Ingreso Permitido.")
else:# 3º condicion
    print("Ingreso Denegado.")
    