#### Descrição
* N é um número <strong>ensolarado</strong> se N + 1 é um número <strong>quadrado perfeito</strong>. Em matemática, um número quadrado ou um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de um inteiro consigo mesmo. Por exemplo, 9 é um número quadrado, pois é igual a 3 2 e pode ser escrito como 3 × 3.
* Nosso programa pode pesquisar números de espiões e palíndromos. E se quisermos encontrar todos os números pares de espiões? Ou encontrar todos os números ímpares entre os números palíndromos? Há algum Palindromico que também seja Espião? Nesta fase, você adicionará a capacidade de pesquisar várias propriedades ao mesmo tempo!
* E se um usuário inserir a mesma propriedade duas vezes por engano? Por exemplo, eles querem encontrar todos os números pares que são pares? Apenas ignore esta propriedade duplicada. Que tal duas propriedades mutuamente exclusivas? Por exemplo, se um usuário deseja encontrar números pares que são ímpares. Nesse caso, o programa iniciará a busca, mas não existem tais números. Precisamos tornar nosso programa infalível. Se uma solicitação contém propriedades mutuamente exclusivas, o programa deve abortar essa solicitação e avisar o usuário. Existem três pares de propriedades mutuamente exclusivas. Uma solicitação não pode incluir números <strong>Even</strong> e <strong>Odd</strong>, <strong>Duck</strong> e <strong>Spy</strong>, <strong>Sunny</strong> e <strong>Square</strong>;
#### Objetivos
* Seu programa deve processar as solicitações do usuário. Nesta fase, seu programa deve:
    1. Bem-vindos, usuários;
    2. Exibir as instruções;
    3. Peça um pedido;
    4. Se um usuário inserir zero, encerre o programa;
    5. Se os números não forem naturais, imprima a mensagem de erro;
    6. Se uma propriedade incorreta for especificada, imprime a mensagem de erro e a lista de propriedades disponíveis;
    7. Para um número, calcule e imprima as propriedades do número;
    8. Para dois números, imprima a lista de números com suas propriedades;
    9. Para dois números e uma propriedade, imprima os números apenas com esta propriedade;
    10. Para dois números e duas propriedades, imprima os números que possuem ambas as propriedades.
    11. Se um usuário especificar propriedades mutuamente exclusivas, aborte a solicitação e avise o usuário.
    12. Depois que uma solicitação foi processada, continue a execução a partir da etapa 3.
* No estágio atual, os nomes das propriedades incluem ```even```, ```odd```, ```buzz```, ```duck```, ```palindromic```, ```gapful```, ```spy```, ```square```, e ```sunny```. O teste não verificará a ordem das propriedades, seu recuo e espaços. Você pode formatar os números como quiser. Por favor, adicione as informações abaixo:
#### Instruções
```
Supported requests:
- enter a natural number to know its properties; 
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and a property to search for;
- two natural numbers and two properties to search for;
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
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]
```

```
The properties [HOT, SUN] are wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]
```

```
The request contains mutually exclusive properties: [ODD, EVEN]
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
  * the second parameters show how many consecutive numbers are to be processed;
- two natural numbers and two properties to search for;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 1

Properties of 1
        buzz: false
        duck: false
 palindromic: true
      gapful: false
         spy: true
      square: true
       sunny: false
        even: false
         odd: true

Enter a request: > 1 8 square

               1 is palindromic, spy, square, odd
               4 is palindromic, spy, square, even
               9 is palindromic, spy, square, odd
              16 is square, even
              25 is square, odd
              36 is square, even
              49 is buzz, square, odd
              64 is square, even

Enter a request: > 1 7 sunny

               3 is palindromic, spy, sunny, odd
               8 is palindromic, spy, sunny, even
              15 is sunny, odd
              24 is sunny, even
              35 is buzz, sunny, odd
              48 is sunny, even
              63 is buzz, sunny, odd

Enter a request: > 1 7 sunny square

The request contains mutually exclusive properties: [SQUARE, SUNNY]
There are no numbers with these properties.

Enter a request: > 1 2 sunny polindromic

The property [POLINDROMIC] is wrong.
Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]

Enter a request: > 1 2 sunny palindromic

               3 is palindromic, spy, sunny, odd
               8 is palindromic, spy, sunny, even

Enter a request: 0

Goodbye!

Process finished with exit code 0
```