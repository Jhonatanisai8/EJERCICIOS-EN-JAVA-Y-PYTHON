"""
EJERCICIO DE LOGICA DE PROGRAMACIÓN:
Escribe un programa que pida al usuario números 
hasta que ingrese el número 0. Al final, debe
imprimir la suma de todos los números ingresados.
"""
# variables 
numero,suma = 1,0
# mientras que el NUMERO sea != de 0 pedimos numeros 
# incrementamos la variable suma
while numero != 0:
    numero = int(input("Ingresa un número: "))
    suma+=numero
# mostramos la suma 
print(f"Suma total: {suma}")