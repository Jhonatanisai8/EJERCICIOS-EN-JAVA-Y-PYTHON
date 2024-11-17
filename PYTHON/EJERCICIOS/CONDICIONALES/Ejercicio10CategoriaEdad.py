"""
EJERCICIO DE LOGICA DE PROGRAMACION:
Pide al usuario que ingrese su edad 
y determina si es un niño (0-12), 
adolescente (13-17), adulto (18-64) 
o adulto mayor (65+).
"""
# variable
edad = 0

# pedimos la edad al usuario
edad = int(input("Ingrese su edad por favor: "))

# evaluamos la edad segun las condiciones
if edad > 0 and edad <= 12:
    print("Esta en la categoria de niño.")
elif edad >= 13 and edad <= 17 :
    print("Esta en la categoria de adolecente.")
elif edad >= 18 and edad <= 64: 
    print("Esta en la categoria de adulto.")
elif edad >= 65:
    print("Esta en la categoria de adulto mayor.")
else:
    print("Ingrese una edad valida.")
    
    
    
    