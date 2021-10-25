#### Descrição
* Agora que é possível classificar os números, é hora de implementar a mesma funcionalidade para palavras e linhas. Mas isso não é tudo para esta fase! Vamos também adicionar um novo tipo de classificação que geralmente é bastante útil: classificação por contagem, um tipo de classificação que organiza os elementos por número de ocorrências.
* Em vez de ```-sortIntegers```, usaremos o ```-sortingType``` argumento universal .
* O resultado da classificação por contagem deve ser pares ```(count, dataEntry)``` classificados pelo ```count``` valor.
* Observe que, a partir desse estágio, seu programa se concentra em classificar os dados do usuário, de modo que não irá mais gerar informações sobre o maior número ou a string mais longa.
#### Objetivos
* Atualize a análise de argumentos de linha de comando para oferecer suporte à definição do tipo de classificação:
    * se o ```-sortingType``` argumento for fornecido, ele deve ser seguido por ```natural``` ou ```byCount```, que define o tipo de classificação.
    * se o argumento não for fornecido, considere ```natural``` ser o tipo de classificação padrão.
* Implemente a classificação natural para palavras e linhas e a classificação por contagem para todos os tipos de dados. Dentro do grupo, os elementos com valores de contagem iguais devem ser classificados naturalmente.
* Nota : para strings (palavras e linhas), a ordem natural é a ordem lexicográfica, para os números é a ordem numérica.
* Imprimir a linha que contém o número total ```m``` de elementos na entrada: ```Total ELEMENTS: m.```, onde ```ELEMENTS``` podem ser ```numbers```, ```words``` ou ```lines```, dependendo da entrada. Em seguida, exiba os resultados da classificação:
    * para classificação natural de números ou palavras, imprima os elementos em uma linha em ordem crescente:
    * ```Sorted data: el_1 el_2 ... el_m```
    * para classificação natural de linhas, imprima elementos classificados lexicograficamente, cada um em uma nova linha:
    * ```
      Sorted data:
      line_1
      line_2
      …
      line_m
      ```
    * para classificar por contagem, imprima elementos classificados pelo número de ocorrências, cada um em uma nova linha, usando o seguinte formato:
    * ```element: count time(s), percentage%```
    * Aqui, ```element``` é um número, palavra ou linha, ```count``` é o número de vezes que ele aparece na entrada e ```percentage``` é a proporção de ```count``` para o número total de elementos na entrada, dado como uma porcentagem.
#### Exemplos
* Execute exemplos de configuração:
```
java SortingTool -sortingType natural -dataType long
```
```
java SortingTool -dataType word -sortingType byCount
```
* Executar exemplos
    * O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
* Exemplo 1 , para classificar longos por contagem:
```java 
> 1 -2   33 4
> 42
> 1                 1
Total numbers: 7.
-2: 1 time(s), 14%
4: 1 time(s), 14%
33: 1 time(s), 14%
42: 1 time(s), 14%
1: 3 time(s), 43%
```
* Exemplo 2 , para classificar números naturalmente:
```
> 1 -2   33 4
> 42
> 1                 1
Total numbers: 7.
Sorted data: -2 1 1 1 4 33 42
```
* Exemplo 3 , para classificar palavras naturalmente:
```
> 1 -2   33 4
> 42
> 1                 1
Total words: 7.
Sorted data: -2 1 1 1 33 4 42 
```
* Exemplo 4 , para classificar linhas naturalmente:
```
> 1 -2   33 4
> 42
> 1                 1
Total lines: 3
Sorted data:
1                 1
1 -2   33 4
42
```