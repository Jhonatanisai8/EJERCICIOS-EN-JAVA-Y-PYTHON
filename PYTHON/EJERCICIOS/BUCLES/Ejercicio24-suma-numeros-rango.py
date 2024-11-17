"""
EJERCICIO DE LOGICA DE PROGRAMACION: 
Escribe un programa que sume todos los 
que hay en un determinado rango.
El programa pregunta al usuario el inicio 
y fin.
"""
# variable para la suma
suma = 0
# pedimos los datos 
inicio = int(input("Por favor ingrese el numero de inicio: "))
final = int(input("Por favor ingrese el numero de fin: "))
# procedemos a sumar todos los numeros en ese rango
for i in range(inicio,final+1,1):
    # incremtamos el valor de la variable en cada iteracion
    suma+=i
# mostramos la suma 
print(f"la suma total entre {inicio} y {final} es: {suma}")
