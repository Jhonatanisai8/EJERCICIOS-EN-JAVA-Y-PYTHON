"""
 Escribe un programa que lea un número e 
 imprima si es divisible por 3, por 5, 
 por ambos o por ninguno.
"""
# pedimos el numero al usuario
numero = int(input("Ingresa el numero: "))
# evaluamos 
if numero % 3 == 0 and numero % 5 == 0:
    print("El numero es divisible por 3 y 5.")
elif numero % 5 == 0:
    print("El numero es divisible por 5.")
elif numero % 3 == 0:
    print("El numero es divisible por 3.")
else:
    print("El numero no es divisible por ninguno.")
    
