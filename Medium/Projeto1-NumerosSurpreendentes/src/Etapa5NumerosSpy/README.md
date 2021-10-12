#### Descrição
* Nesta etapa, adicionaremos outra propriedade chamada <strong>número de espião</strong>. Um número é considerado espião se a soma de todos os dígitos for igual ao produto de todos os dígitos.
* Nosso programa calcula as propriedades dos números e também sabe como processar uma lista de números. Mas e se quisermos encontrar números que possuem uma determinada propriedade? Por exemplo, no caso de desejarmos encontrar dez números Buzz a partir de 1000. Precisamos adicionar um novo recurso de solicitação para isso. Além disso, adicione uma nova propriedade - Número de espiões. Esses números se escondem bem, então tome cuidado. Sua tarefa é modificar o programa para que ele possa pesquisar esses números.
#### Objetivos
* Seu programa deve processar as solicitações do usuário. Nesta fase, seu programa deve:
    1. Bem-vindos, usuários;
    2. Exibir as instruções;
    3. Peça um pedido;
    4. Se um usuário inserir zero, encerre o programa;
    5. Se os números não forem naturais, imprima uma mensagem de erro;
    6. Se um usuário inserir uma propriedade incorreta, imprime a mensagem de erro e a lista de propriedades disponíveis;
    7. Para um número, imprima as propriedades do número;
    8. Para dois números, imprima a lista de números com suas propriedades;
    9. Para dois números e uma propriedade, imprima a lista de números e suas propriedades filtradas pela propriedade indicada;
    10. Depois que uma solicitação for processada, continue a execução a partir da etapa 3.
* No estágio atual, os nomes das propriedades incluem ```even```, ```odd```, ```buzz```, ```duck```, ```palindromic```, ```gapful```, e ```spy```. O teste não verificará a ordem das propriedades, seu recuo e espaços. Você pode formatar os números como quiser. Por favor, adicione as informações abaixo:
#### Instruções
```
Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and a property to search for;
- separate the parameters with one space;
- enter 0 to exit.
```
### Mensagens de erro
```
The first parameter should be a natural number or zero.
```
```
The second parameter should be a natural number.
```
```
The property [SUN] is wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY]
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
- two natural numbers and a property to search for;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: 9

Properties of 9
        buzz: false
        duck: false
 palindromic: true
      gapful: false
         spy: true
        even: false
         odd: true

Enter a request: 9 7

               9 is palindromic, spy, odd
              10 is duck, even
              11 is palindromic, odd
              12 is even
              13 is odd
              14 is buzz, even
              15 is odd

Enter a request: 99 9 spy

             123 is spy, odd
             132 is gapful, spy, even
             213 is spy, odd
             231 is buzz, gapful, spy, odd
             312 is spy, even
             321 is spy, odd
           1,124 is spy, even
           1,142 is spy, even
           1,214 is spy, even

Enter a request: 9 3 drake

The property [DRAKE] is wrong.
Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]

Enter a request: 9 3 duck

              10 is duck, even
              20 is duck, even
              30 is duck, even

Enter a request: bye

The first parameter should be a natural number or zero.

Enter a request: 0

Goodbye!

Process finished with exit code 0
```