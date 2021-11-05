#### Descrição
* Sempre existe a possibilidade de que alguém execute seu programa da maneira errada. Ele não deve apenas travar silenciosamente, mas, em vez disso, deve imprimir uma mensagem que informe ao usuário o erro que ele cometeu.
* Neste estágio, vamos implementar o tratamento de erros para várias situações excepcionais que o usuário pode encontrar.
#### Objetivos
* Adicione tratamento de exceções para possíveis erros e mensagens de erro de saída para o console:
    * se o ```-sortingType``` argumento for fornecido, mas o tipo não, imprime uma mensagem ```No sorting type defined!```
    * se o ```-dataType``` argumento for fornecido, mas o tipo não, imprimir ```No data type defined!```
    * se forem fornecidos argumentos de linha de comando desconhecidos, imprima ```"-arg" is not a valid parameter. It will be skipped```.para cada argumento desconhecido ```-arg```;
    * se houver strings na entrada, mas o tipo de dados for definido como long, imprima ```"abc" is not a long. It will be skipped```.para cada string ```abc``` da entrada.
#### Exemplos
* O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
* Exemplo 1: classificação de números naturalmente sem erros
```
$> java SortingTool -sortingType natural -dataType long
> 1 -2   33 4
> 42
> 1                 1
Total numbers: 7.
Sorted data: -2 1 1 1 4 42 333 
```
* Exemplo 2: classificação de números por contagem sem erros
```
$> java SortingTool -sortingType byCount -dataType long
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
* Exemplo 3: tipo de classificação ausente
```
$> java SortingTool -sortingType
No sorting type defined!
```
* Exemplo 4: tipo de dados ausentes
```
$> java SortingTool -dataType
No data type defined!
```
* Exemplo 5: argumentos inválidos e valor de entrada
```
$> java SortingTool -dataType long -sortingType natural -abc -def
"-abc" is not a valid parameter. It will be skipped.
"-def" isn not a valid parameter. It will be skipped.
> a 2 -42
"a" is not a long. It will be skipped.
Total numbers: 2.
Sorted data: -42 2
```
