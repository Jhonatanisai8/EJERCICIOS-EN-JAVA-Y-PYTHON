"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Realiza un programa que reciba un año e 
indique si es un año bisiesto o no 
(un año es bisiesto si es divisible por 4,
pero no por 100, a menos que sea divisible 
por 400).
"""

# variable
anio = 0

# pedimos el año al usuario
anio = int(input("Ingresa el año por favor: "))

if ((anio % 4 == 0) and not(anio % 100 == 0) or (anio % 400 == 0)):
    print(anio," es un año bisiesto.")
else:
    print(anio," no es un año bisiesto.")
    
