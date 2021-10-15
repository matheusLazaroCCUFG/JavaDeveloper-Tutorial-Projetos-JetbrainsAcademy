#### Descrição
* Nesta etapa, o programa deve verificar se um número é <strong>palíndromo</strong>. Um número palíndromo é simétrico; em outras palavras, ele permanece o mesmo, independentemente de o lermos da esquerda ou da direita. Por exemplo, 17371 é um número palíndromo. 5 também é um número palíndromo. 1234 não é. Se for lido da direita, torna-se 4321. Adicione esta nova propriedade ao nosso programa.
* Nas etapas anteriores, o programa podia processar apenas um número. A partir de agora, o programa deve aceitar uma solicitação de um usuário, analisá-la e executá-la. O programa deve imprimir em ```Enter a request``` vez de solicitar um número natural. O programa também deve continuar a execução, a menos que um usuário digite um comando de término. Vamos lá ```0```(zero).
* Seu programa deve dar as boas-vindas aos usuários e imprimir as instruções. Neste ponto, faça seu programa executar dois comandos. Se um usuário inserir um número natural, o programa deve indicar as propriedades desse número. Se um usuário inserir zero, o programa deve ser encerrado. Se um usuário inserir um número negativo por engano, imprima uma mensagem de erro.
#### Objetivos
* Nesta fase, seu programa deve:
    1. Bem-vindos, usuários; 
    2. Exibir as instruções;
    3. Peça um pedido;
    4. Encerre o programa se um usuário inserir zero;
    5. Se um número não for natural, imprima uma mensagem de erro;
    6. Imprima as propriedades do número natural;
    7. Continue a execução a partir da etapa 3, após o processamento da solicitação.
* As propriedades são ```even```, ```odd```, ```buzz```, ```ducke``` palindromic. Os testes não verificarão a ordem das propriedades, indentação e espaços. Você pode formatar os números como quiser. Por favor, adicione as informações abaixo:
#### Instruções:
```
Supported requests:
- enter a natural number to know its properties;
- enter 0 to exit.
```
#### Mensagem de erro:
```
The first parameter should be a natural number or zero.
```
#### Exemplos:
O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
<br><strong>Exemplo 1:</strong>
```
Welcome to Amazing Numbers!

Supported requests:
- enter a natural number to know its properties;
- enter 0 to exit.

Enter a request: > 9223372036854775807

Properties of 9,223,372,036,854,775,807
        even: false
         odd: true
        buzz: true
        duck: true
 palindromic: false

Enter a request: > 101

Properties of 101
        even: false
         odd: true
        buzz: false
        duck: true
 palindromic: true

Enter a request: > -56

The first parameter should be a natural number or zero.

Enter a request: > 0

Goodbye!
```