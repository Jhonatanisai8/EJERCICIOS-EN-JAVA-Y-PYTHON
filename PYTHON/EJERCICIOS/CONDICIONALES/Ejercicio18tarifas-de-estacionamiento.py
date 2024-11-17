# pedimos los datos
horas = int(input("INGRESE LA CANTIDAD DE HORAS: "))

# variable para el monto
monto_final_pagar= 0
# condicionales
if horas >= 2 and horas <= 5:
    monto_final_pagar = horas * 10;
elif horas > 5:
    monto_final_pagar = horas * 15

print("SU MONTO A PAGAR ES: ",monto_final_pagar)
