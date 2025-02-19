def compactar_string(entrada):
    resultado = ""
    i = 0

    while i < len(entrada):
        count = 1
        while i + 1 < len(entrada) and entrada[i] == entrada[i + 1]:
            i += 1
            count += 1

        resultado += entrada[i] + str(count)
        i += 1
        
    return resultado

# Capturar a entrada do usuário
entrada = input("Digite a string para compactar: ")
print(compactar_string(entrada))