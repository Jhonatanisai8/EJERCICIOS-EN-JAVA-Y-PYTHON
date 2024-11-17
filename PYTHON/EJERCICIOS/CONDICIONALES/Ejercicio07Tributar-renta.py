"""
EJERCICIO DE PROGRAMACION:
Los tramos impositivos para la declaración de la renta 
en un determinado país son los siguientes:

Renta	                | Tipo impositivo
Menos de 10000€	        => 5%
Entre 10000€ y 20000€	=> 15%
Entre 20000€ y 35000€	=> 20%
Entre 35000€ y 60000€	=> 30%
Más de 60000€	        =>   45%
Escribir un programa que pregunte al usuario su renta 
anual y muestre por pantalla el tipo impositivo 
que le corresponde.
"""

#VARIABLES
renta_anual = 0

#PEDIMOS EL DATO AL USUARIO
renta_anual = float(input("Ingrese su renta anual por favor!: "))

#SEGUN EL MONTO DE LA RENTA LE MOSTRAMOS EL TIPO DE IMPOSITIVO
if renta_anual <= 1000:
    print("Le corresponde pagar el 5% de impositivo por la renta.")
elif renta_anual >= 1001 and renta_anual <= 2000:
    print("Le corresponde pagar el 10% de impositivo por la renta.")
elif renta_anual >= 2001 and renta_anual <= 3500:
    print("Le corresponde pagar el 20% de impositivo por la renta.")
elif renta_anual >= 3501 and renta_anual <= 6000:
    print("Le corresponde pagar el 30% de impositivo por la renta.")
else:
    print("Le corresponde pagar el 45% de impositivo por la renta.")
    
    
    
    
    
