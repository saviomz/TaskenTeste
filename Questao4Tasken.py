def contar_vogais_consoantes(linha):
    vogais = "aeiouAEIOU"
    consoantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"
    
    num_vogais = sum(1 for char in linha if char in vogais)
    num_consoantes = sum(1 for char in linha if char in consoantes)
    
    return num_vogais, num_consoantes

def analisar_linhas(arquivo):
    try:
        with open(arquivo, 'r') as file:
            linhas = file.readlines()
        
        if not linhas:
            print("O arquivo está vazio.")
            return
        
        max_vogais = max_consoantes = 0
        linha_mais_vogais = linha_mais_consoantes = ""

        for linha in linhas:
            num_vogais, num_consoantes = contar_vogais_consoantes(linha)

            if num_vogais > max_vogais:
                max_vogais = num_vogais
                linha_mais_vogais = linha.strip()  

            if num_consoantes > max_consoantes:
                max_consoantes = num_consoantes
                linha_mais_consoantes = linha.strip()

        print(f"Linha com mais vogais ({max_vogais} vogais): {linha_mais_vogais}")
        print(f"Linha com mais consoantes ({max_consoantes} consoantes): {linha_mais_consoantes}")
        print(f"Frase mais bonita: 'Clube de regatas do flamengo'")

    except FileNotFoundError:
        print("Erro: O arquivo não foi encontrado.")

# Chamando a função para ler o arquivo
analisar_linhas('quadrados.txt')
