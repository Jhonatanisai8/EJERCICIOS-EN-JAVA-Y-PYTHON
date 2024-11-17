"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Crea un programa que pida al usuario su promedio de calificaciones
y el porcentaje de asistencia a clases. Para aprobar el curso,
el estudiante debe tener un promedio mayor o igual a 70 y una
asistencia mínima del 80%. Si el estudiante cumple ambos 
criterios, imprime "Aprobado". Si solo uno de los criterios 
es cumplido, imprime "Aprobado condicional". 
Si ninguno de los criterios es cumplido, imprime "Reprobado".
"""
# pedimos los datos 
promedio_calificaciones = float(input("INGRESA EL PROMEDIO DE CALIFICACIONES: "))
porcentaje_asistencias = int(input("INGRESA EL PORCENTAJE DE ASISTENCIAS: "))
# evaluamos
if promedio_calificaciones >= 70 and porcentaje_asistencias >= 80:
    print("APROVADO.")
elif promedio_calificaciones >= 70 or porcentaje_asistencias >= 80:
    print("APROVADO CONDICIONAL.")
else:
    print("REPROVADO.")