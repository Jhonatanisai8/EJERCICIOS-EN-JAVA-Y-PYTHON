"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Crea un programa que genere y muestre 
la tabla de multiplicar de un número 
introducido por el usuario (del 1 al 12).
"""
# pedimos el número
numero = int(input("INGRESA UN NUMERO: "))
# procedemos a mostrar la tabla de multiplicar 
for i in range(1,13,1):
    resultado = numero * i
    print(f"{numero} X {i} = {resultado}")