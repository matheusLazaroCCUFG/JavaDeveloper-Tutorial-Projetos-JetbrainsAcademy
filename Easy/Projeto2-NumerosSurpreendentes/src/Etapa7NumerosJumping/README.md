#### Descrição
* Um número é um <strong>número de salto</strong> se os dígitos adjacentes dentro do número diferem por 1. A diferença entre 9 e 0 não é considerada como 1. Números de um dígito são considerados números de salto. Por exemplo, 78987 e 4343456 são números de salto, mas 796 e 89098 não são.
* Nesse estágio, também removeremos a limitação de propriedades pendentes em uma solicitação. O programa sabe calcular dez propriedades de números, e seria estranho limitar a consulta a apenas duas propriedades. Vamos remover essa limitação. Deixe o programa indicar todas as propriedades de todos os números da solicitação.
#### Objetivos
* Seu programa deve processar as solicitações do usuário. Nesta fase, seu programa deve:
    1. Bem-vindos, usuários;
    2. Exibir as instruções;
    3. Peça um pedido;
    4. Se um usuário inserir zero, encerre o programa;
    5. Se os números não forem naturais, imprima a mensagem de erro;
    6. Se uma propriedade incorreta for especificada, imprime a mensagem de erro e a lista de propriedades disponíveis;
    7. Para um número, imprima as propriedades do número;
    8. Para dois números, imprima a lista de números com suas propriedades.
    9. Para dois números e propriedades, imprima os números com as propriedades especificadas;
    10. Se um usuário especificar propriedades mutuamente exclusivas, aborte a solicitação e avise o usuário;
    11. Assim que uma solicitação for processada, continue a execução a partir da etapa 3.
* No estágio atual, os nomes das propriedades incluem ```even```, ```odd```, ```buzz```, ```duck```, ```palindromic```, ```gapful```, ```spy```, ```square```, ```sunny```, e ```jumping```. O teste não verificará a ordem das propriedades, seu recuo e espaços. Você pode formatar os números como quiser.
#### Instruções
```
Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and properties to search for;
- separate the parameters with one space;
- enter 0 to exit.
```
#### Mensagens de erro
```
The first parameter should be a natural number or zero.
```

```
The second parameter should be a natural number.
```

```
The property [SUN] is wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]
```

```
The properties [HOT, SUN] are wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]
```

```
The request contains mutually exclusive properties: [SQUARE, SUNNY]
There are no numbers with these properties.
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
  * the second parameter shows how many consecutive numbers are to be processed;
- two natural numbers and properties to search for;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 1234567890

Properties of 1,234,567,890
        buzz: false
        duck: true
 palindromic: false
      gapful: true
         spy: false
      square: false
       sunny: false
     jumping: false
        even: true
         odd: false

Enter a request: > 1234567890 4

   1,234,567,890 is duck, gapful, even
   1,234,567,891 is odd
   1,234,567,892 is even
   1,234,567,893 is gapful, odd

Enter a request: > 1234567890 4 jumping

   1,234,567,898 is jumping, even
   2,101,010,101 is duck, jumping, odd
   2,101,010,121 is buzz, duck, gapful, jumping, odd
   2,101,010,123 is duck, jumping, odd

Enter a request: > 5000 5 duck spy

The request contains mutually exclusive properties: [DUCK, SPY]
There are no numbers with these properties.

Enter a request: > 5000 5 duck jumping

          10,101 is buzz, duck, palindromic, jumping, odd
          10,121 is duck, jumping, odd
          10,123 is duck, jumping, odd
          12,101 is duck, jumping, odd
          21,010 is duck, jumping, even

Enter a request: > 999 6 jumping odd palindromic

          10,101 is buzz, duck, palindromic, jumping, odd
          12,121 is palindromic, jumping, odd
          12,321 is palindromic, square, jumping, odd
          32,123 is buzz, palindromic, jumping, odd
          32,323 is palindromic, jumping, odd
          34,343 is palindromic, jumping, odd

Enter a request: 1 5 hot sunny

The property [HOT] is wrong.
Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]

Enter a request: exit

The first parameter should be a natural number or zero.

Enter a request: 0

Goodbye!

Process finished with exit code 0
```