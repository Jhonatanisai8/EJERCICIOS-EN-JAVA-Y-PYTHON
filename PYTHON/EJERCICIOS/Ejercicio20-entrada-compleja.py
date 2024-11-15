# pedimos al usuario la opcion:
opcion = int(input("""INGRESE UNA OPCION:
                   1. SUMAR
                   2. DIVIDIR
                   3. MULTIPLICAR
                   4. RESTAR: """))
numero_01 = int(input("INGRESA UN NUMERO: "))
numero_02 = int(input("INGRESA UN NUMERO: "))
# evaluamos
if opcion == 1:
    print("RESULTADO: ",(numero_01 + numero_02))
elif opcion == 2:
    # validamos la division
    if numero_02 == 0:
        print("No se puede dividir por 0.")
    else:
        print("RESULTADO: ",(numero_01 / numero_02))
elif opcion == 3:
        print("RESULTADO: ",(numero_01 * numero_02))
elif opcion == 4:
        print("RESULTADO: ",(numero_01 - numero_02))
else:
    print("INGRESE UNA OPCION VALIDA.")

    
    
        
    
    