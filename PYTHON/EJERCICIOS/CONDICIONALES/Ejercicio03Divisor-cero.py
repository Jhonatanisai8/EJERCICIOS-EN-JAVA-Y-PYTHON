"""
Escribir un programa que pida al usuario 
dos números y muestre por pantalla su 
división. Si el divisor es cero el 
programa debe mostrar un error.
De lo contrario mostrar la división.
"""
    
#variables
numero_01 = int(input("Ingresa un numero: "))
divisor = int(input("Ingresa el divisor: "))

#validamos si es cero el divisor
if divisor == 0:
    print("No se puede dividir por cero.. ERRORR!!!")
else:
    #dividimos y mostramos la division
    division = int(numero_01 / divisor);
    print("La division es: ",division)    
