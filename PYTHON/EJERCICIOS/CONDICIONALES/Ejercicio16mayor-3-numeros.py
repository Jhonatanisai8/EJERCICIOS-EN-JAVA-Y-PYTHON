"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Escribe un programa que pida al usuario 
tres números distintos y determine cuál 
es el mayor y cuál es el menor. Además, 
si los tres números son mayores de 50, 
imprime "Todos los números son altos".
"""
# pedimos los datos al usuario
n1 = int(input("Ingresa un numero: "))
n2 = int(input("Ingresa un numero: "))
n3 = int(input("Ingresa un numero: "))
# evaluamos
# si todos son mayores a 50
if  n1 > 50 and n2 > 50 and n3 > 50:
    print("Todos los numeros son altos.")
elif n1 > n2 and n1 > n3:
    print("El numero mayor es: ",n1)
elif n2 > n1 and n2 > n3:
    print("El numero mayor es: ",n2)
elif n3 > n1 and n3 > n2:
    print("El numero mayor es: ",n3)
    
