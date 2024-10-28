"""
EJERCICIO DE PROGRAMACIÓN:
Escribir un programa que pregunte
al usuario su edad y muestre por 
pantalla si es mayor de edad o no.
"""

#pedimos al usuario su edad
edad = int(input("Ingresa tu edad: "))

#verificamos mediante condicionales
if edad >= 18:
    print("Es mayor de edad...")
else:
    print("Eres menor de edad...")
    
