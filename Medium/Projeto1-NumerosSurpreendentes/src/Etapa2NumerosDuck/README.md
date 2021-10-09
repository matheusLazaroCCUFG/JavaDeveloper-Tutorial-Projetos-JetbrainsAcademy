#### Descrição
* Sua próxima tarefa é determinar se um número é um número de Pato . Um número de pato é um número positivo que contém zeros. Por exemplo, 3210, 8050896, 70709 são números de Pato. Observe que um número com um 0 não é um número de pato. Portanto, números como 035 ou 0212 não são números de pato. Embora 01203 seja um Pato, já que tem um 0 à direita.
* Neste estágio, precisamos simplificar a maneira como exibimos as informações. Já temos várias propriedades que precisamos mostrar; vamos adicionar novos recursos ao nosso programa em cada etapa. A partir de agora, o cartão deve seguir esta notação:
```
Properties of {number}
{property}: true/false
{property}: true/false
...
{property}: true/false
```
* Nesta fase, as propriedades são ```even```, ```odd```, ```buzz``` e ```duck```. Para ```14```, a saída do programa deve ser assim:
```
Properties of 14
        even: true
         odd: false
        buzz: true
        duck: false
```
* A ordem das propriedades, recuo e espaços não são verificados pelos testes. Os testes também não fazem distinção entre maiúsculas e minúsculas.
#### Objetivos
* Seu programa deve imprimir as propriedades de um número natural. Nesta fase, seu programa deve:
1. Peça a um usuário para inserir um número natural;
2. Se o número não for natural, o programa deve imprimir uma mensagem de erro;
3. Se o número for natural, o programa deve indicar as propriedades do número;
4. Conclua o programa após imprimir a mensagem.
#### Exemplos
* O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
* <strong>Exemplo 1:</strong>
```
Enter a natural number:
> -7
This number is not natural!
```
* <strong>Exemplo 2:</strong>
```
Enter a natural number:
> 15
Properties of 15
        even: false
         odd: true
        buzz: false
        duck: false
```
* <strong>Exemplo 3:</strong>
```
Enter a natural number:
> 14
Properties of 14
        even: true
         odd: false
        buzz: true
        duck: false
```
* <strong>Exemplo 4:</strong>
```
Enter a natural number:
> 102
Properties of 102
        even: true
         odd: false
        buzz: false
        duck: true
```