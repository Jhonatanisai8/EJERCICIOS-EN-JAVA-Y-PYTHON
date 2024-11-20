"""
Pide al usuario dos numeros y verifica 
cúales de los numeros en ese rango son 
primos.
"""
numero_inicio = 3
numero_final = 10

def es_primo(numero):
    contador_divisores = 0
    for i in range(1,numero+1,1):
        if numero % i == 0:
            contador_divisores+=1
    return contador_divisores <= 2

for i in range(numero_inicio,numero_final+1):
    if (es_primo(i)):
        print(i)
