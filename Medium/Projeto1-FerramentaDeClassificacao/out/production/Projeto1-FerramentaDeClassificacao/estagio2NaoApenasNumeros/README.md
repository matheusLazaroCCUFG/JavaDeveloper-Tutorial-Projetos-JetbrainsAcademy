#### Descrição
* Lembra como queríamos que o programa funcionasse não apenas com números, mas também com linhas e palavras? Neste estágio, você adicionará comportamento para tipos de dados de texto ao seu programa. Você também implementará a análise de argumentos de linha de comando que permitirá ao usuário definir o tipo de dados de entrada
* Depois de analisar os argumentos e ler a entrada, o programa deve tratar a entrada de acordo com seu tipo de dados e enviar uma mensagem de informação semelhante à do estágio anterior.
#### Objetivos
1. Analise os argumentos que definem o tipo de dados de entrada:
    * se o ```-dataType``` argumento opcional for fornecido, ele deve ser seguido por ```long```, ```line``` ou ```word```, o que significa que a entrada consiste em números, linhas ou palavras, respectivamente.
    * se o argumento não for fornecido, você deve assumir que o ```-dataType``` argumento é ```word```.
2. Leia a entrada dependendo do tipo:
    * ```long``` - números com um número arbitrário de espaços entre eles, como na etapa anterior.
    * ```line``` - cada linha tratada como uma string inteira.
    * ```word``` - sequências contínuas de caracteres separados por um número arbitrário de espaços.
3. Calcule as seguintes informações sobre os dados:
    * O número de linhas, números ou palavras na entrada.
    * O maior número ou a linha ou palavra mais longa na entrada.
    * Quantas vezes esse elemento maior ou mais longo ocorre na entrada (compare palavras e linhas por comprimento; se dois elementos tiverem o mesmo comprimento, organize-os em ordem alfabética).
4. A maior / maior porcentagem de ocorrência do elemento.
    * Imprima essas informações conforme mostrado nos exemplos. Observe que você deve imprimir a linha mais longa em uma linha separada, então você acabará imprimindo 4 linhas em vez de 2.
#### Exemplos:
* Execute exemplos de configuração:
```
java SortingTool -dataType long
```
```
java SortingTool -dataType line
```
```
java SortingTool -dataType word
```
#### Executar exemplos
* O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
* <strong>Exemplo 1</strong>, para inteiros:
```
> 1 -2   333 4
> 42
> 1                 1
Total numbers: 7.
The greatest number: 333 (1 time(s), 14%).
```
* <strong>Exemplo 2</strong>, para linhas:
```
> 1 -2   333 4
> 42
> 1                 1
Total lines: 3.
The longest line:
1                 1
(1 time(s), 33%).
```
* <strong>Exemplo 3</strong>, para palavras:
```
> 1 -2   333 4
> 42
> 1                 1
Total words: 7.
The longest word: 333 (1 time(s), 14%).
```