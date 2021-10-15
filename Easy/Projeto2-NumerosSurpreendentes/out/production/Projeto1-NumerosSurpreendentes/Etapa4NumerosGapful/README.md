#### Descrição
* Nesta etapa, vamos adicionar mais uma propriedade - <strong>Números Gapful</strong>. É um número que contém pelo menos 3 dígitos e é divisível pela concatenação de seu primeiro e último dígito <strong>sem resto</strong>. 12 não é um número Gapful, pois tem apenas dois dígitos. 132 é um número Gapful, pois <strong>1</strong>3<strong>2</strong> % 12 == 0.7881 é outro exemplo de um número Gapful, pois <strong>7</strong>88<strong>1</strong><strong>%</strong> 71 == 0.
* Até esse estágio, o programa poderia processar apenas um número por vez. Agora, um usuário deve ser capaz de inserir dois números para obter as propriedades de uma lista de números. Separe os números com um espaço. O espaço separa o primeiro número da lista e o comprimento da lista. Por exemplo. ```100 2``` diz ao programa para processar dois números: ```100``` e ```101```. ```1 100``` significa que o programa está prestes a processar 100 números, começando com ```1```. Se um usuário inserir um número, o programa deve funcionar da mesma forma que nas etapas anteriores. O programa deve analisar um número e imprimir suas propriedades. Como antes, se um usuário inserir um único ```0```(zero), encerre o programa. As informações sobre cada número devem ser impressas em uma linha no seguinte formato:
```
             140 is even, buzz, duck, gapful
             141 is odd, palindromic
```
* Então, o formato é ```{number} is {property}, {property}, ... {property}```
#### Objetivos
* Seu programa deve processar várias solicitações de usuários. Nesta fase, seu programa deve:
    1. Bem-vindos, usuários;
    2. Exibir as instruções;
    3. Peça um pedido;
    4. Se um usuário inserir zero, encerre o programa;
    5. Se um usuário inserir uma solicitação vazia, imprima as instruções;
    6. Se os números não forem naturais, imprima uma mensagem de erro;
    7. Se um número for inserido, calcule e imprima as propriedades desse número;
    8. Para dois números, imprima a lista de números com propriedades;
    9. Depois que a solicitação for processada, continue a execução a partir da etapa 3.
* No estágio atual, os nomes das propriedades incluem ```even```, ```odd```, ```buzz```, ```duck```, ```palindromic``` e ```gapful```. O teste não verificará a ordem das propriedades, seu recuo e espaços. Você pode formatar os números como quiser. Por favor, adicione as informações abaixo:
* <strong>Instruções</strong>
    ```
    Supported requests:
    - enter a natural number to know its properties;
    - enter two natural numbers to obtain the properties of the list:
      * the first parameter represents a starting number;
      * the second parameter shows how many consecutive numbers are to be printed;
    - separate the parameters with one space;
    - enter 0 to exit.
    ```
* <strong>Mensagens de erro</strong>
```
The first parameter should be a natural number or zero.
```
```
The second parameter should be a natural number.
```
#### Exemplos
* O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
* <strong>Exemplo 1:</strong>
```
Welcome to Amazing Numbers!

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameters show how many consecutive numbers are to be processed;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 7881

Properties of 7,881
        buzz: false
        duck: false
 palindromic: false
      gapful: true
        even: false
         odd: true

Enter a request: > 7880

Properties of 7,880
        buzz: false
        duck: true
 palindromic: false
      gapful: false
        even: true
         odd: false

Enter a request: > 105 5

             105 is buzz, duck, gapful, odd
             106 is duck, even
             107 is buzz, duck, odd
             108 is duck, gapful, even
             109 is duck, odd

Enter a request: > exit

The first parameter should be a natural number or zero.

Enter a request: >

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameters show how many consecutive numbers are to be processed;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 0

Goodbye!

Process finished with exit code 0
```