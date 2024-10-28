"""
EJERCICIO DE PROGRAMACION:
Para tributar un determinado impuesto se debe
ser mayor de 16 años y tener unos ingresos 
iguales o superiores a 1000 € mensuales. 
Escribir un programa que pregunte al usuario su 
edad y sus ingresos mensuales y muestre por 
pantalla si el usuario tiene que tributar o no.
"""

#variables
edad = 0
ingresos_mensuales = 0

#pedimos al usuario
edad = int(input("Ingrese su edad: "))
ingresos_mensuales = float(input("Ingresa sus ingresos $ mensuales: "))

#verificamos se debe cumplir ambas condiciones
if (edad >= 16 ) and (ingresos_mensuales >= 1000):
    print("Tiene que tributar....")
else:
    print("No tiene que tributar....")
    
