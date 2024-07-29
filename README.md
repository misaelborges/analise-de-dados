# Análise de dados

Um projeto Java que lê dados de vendas a partir de um arquivo CSV, calcula a média de vendas e exibe os nomes dos vendedores e valores das vendas, valor médio e total.

## Tabela de Conteúdos

- [Descrição](#descrição)
- [Instalação](#instalação)
- [Uso](#uso)
- [Exemplo de Arquivo](#exemplo-de-arquivo)
- [Saída Esperada](#saida-esperada)

## Descrição

Este projeto tem como objetivo demonstrar a leitura de dados de um arquivo, processamento de informações e filtragem de resultados com base em uma condição específica. Ele foi desenvolvido utilizando Java e suas bibliotecas padrão.

## Instalação

1. Clone este repositório:

    ```bash
    https://github.com/misaelborges/analise-de-dados.git
    ```
3. Navegue até o diretório do projeto:

    ```bash
    cd analise-de-dados
    ```
5. Compile o projeto:

    ```bash
    javac Main.java
    ```

## Uso

1. Quando solicitado, insira o caminho do arquivo CSV contendo os dados dos vendas. Exemplo:

    ```
    month,year,saller,items,total;
    ```
## Exemplo de Arquivo

1. Exemplo do caminho do arquivo
   
    ```
    C:\Users\User\Desktop\in.txt
    ```
3. O arquivo CSV deve ter a seguinte estrutura. Exemplo:

    ```plaintext
    1,2016,Logan,12,7625.55
    1,2016,Anakin,59,16020.17
    2,2016,Logan,36,3056.85
    2,2016,Anakin,50,12624
    3,2016,Logan,42,5119.18
    3,2016,Anakin,51,15883.8
    ```

## Saída Esperada

1. O programa calculará as cinco primeiras vendas de 2016 de maior preço médio, ordenadas decrescentemente por preço médio. Exemplo da saída:
   
    ```plaintext
    9/2016, Kal-El, items: 23, $20530.29, average price = $892,62
    7/2016, Kal-El, items: 20, $17126.62, average price = $856,33
    3/2016, Kal-El, items: 25, $21099.27, average price = $843,97
    6/2016, Padme Amidala, items: 25, $16429.74, average price = $657,19
    1/2016, Logan, items: 12, $7625.55, average price = $635,46
    ```
2. Valor total vendido pelo vendedor Logan nos meses 1 e 7 de qualquer ano
   
    ```plaintext
    Valor total vendido pelo vendedor Logan nos meses 1 e 7 = 45357,42
    ```

## Exception

Caso você passe um valor errado no caminho do arquivo, sera lançado uma exeção generica. Exemplo:
    ```plaintext
    C:\Users\User\Desktop\in
    ```

Mesagem lançada: 
    ```plaintext
    Erro: C:\Users\User\Desktop\in (o sistema não pode encontrar o arquivo especificado)
    ```
