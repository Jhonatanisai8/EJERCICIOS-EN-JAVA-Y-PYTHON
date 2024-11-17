"""
Escribe un programa que pida al usuario ingresar 
las longitudes de los tres lados de un triángulo. 
El programa debe determinar si el triángulo es:

Equilátero: todos los lados son iguales.
Isósceles: dos lados son iguales y uno es diferente.
Escaleno: todos los lados son diferentes.
Salida esperada:

Si los lados no forman un triángulo, muestra 
"Las longitudes ingresadas no forman un triángulo".
De lo contrario, muestra el tipo de triángulo.
"""
# pedimos los lados al usuario
# Solicitar al usuario que ingrese las longitudes de los tres lados
lado1 = float(input("Ingresa la longitud del primer lado: "))
lado2 = float(input("Ingresa la longitud del segundo lado: "))
lado3 = float(input("Ingresa la longitud del tercer lado: "))

# Verificar si las longitudes forman un triángulo válido
if (lado1 + lado2 > lado3) and (lado1 + lado3 > lado2) and (lado2 + lado3 > lado1):
    # Clasificar el tipo de triángulo
    if lado1 == lado2 == lado3:
        print("El triángulo es equilátero.")
    elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
        print("El triángulo es isósceles.")
    else:
        print("El triángulo es escaleno.")
else:
    print("Las longitudes ingresadas no forman un triángulo.")


