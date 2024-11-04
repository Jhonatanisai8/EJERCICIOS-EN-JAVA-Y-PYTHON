"""
EJERCICIO DE LOGICA DE PROGRAMACION:
 Escribe un programa que pida al usuario su edad, 
 salario mensual y número de años de antigüedad 
 en su empleo. Para ser elegible para un préstamo,
 debe cumplir con las siguientes condiciones:

- Tener entre 25 y 60 años.
- Tener un salario mensual mayor a $30,000.
- Tener al menos 2 años de antigüedad en su empleo.
Si cumple con estas condiciones, imprime "Préstamo aprobado".
Si no las cumple, indica específicamente cuál(es) 
de las condiciones no se cumplen (por ejemplo, 
"Edad fuera del rango" o "Antigüedad insuficiente").
"""
# pedimos los datos
edad = int(input("INGRESA SU EDAD: "))
anios_antiguedad = int(input("INGRESE SU ANTIGUEDAD DE EMPLEO: "))
salario_mensual = float(input("INGRESA SU SALARIO MENSUAL: "))
# evaluamos 
if edad >= 25 and edad <=60:
    if salario_mensual >= 30000:
        if anios_antiguedad >= 2:
            print("PRESTAMO APROVADO!.")
        else:
            print("ANTIGUEDAD INSUFICIENTE.")
    else:
        print("SALARIO FUERA DE RANGO.")
else:
    print("EDAD FUERA DE RANGO.")