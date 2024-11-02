
"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Solicita la temperatura y si está lloviendo (sí o no).
Si la temperatura es entre 20 y 30 grados y no está 
lloviendo, muestra un mensaje de
"Clima perfecto para un paseo", de lo contrario
un mensaje de advertencia de "no salir de casa".
"""
# pedimos los datos al usuario
temperatura = int(input("Ingrese la temperatura por favor: "))
lluvia = input("¿Esta lloviendo (SI/NO)?: ")
# evaluamos
if temperatura >= 20 and temperatura <= 30 and not lluvia.casefold() == "si":
    print("Clima perfecto para un paseo.")
else:
    print("No debe salir de casa.")
    