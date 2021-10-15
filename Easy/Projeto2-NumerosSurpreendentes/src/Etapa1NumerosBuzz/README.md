#### Descrição
* Os inteiros podem ser pares ou ímpares. Todos os números que terminam com 0, 2, 4, 6 ou 8 são pares; o resto é estranho. No entanto, os números têm muitas outras propriedades, você aprenderá sobre algumas delas neste projeto.
* Primeiro, vamos falar sobre os números do Buzz . Eles são números que são divisíveis por 7 ou terminam com 7. Por exemplo, o número 14 é um número buzz, já que é divisível por 7 sem resto; o número 17 termina com 7, portanto, também é um número de zumbido. No entanto, o número 75 não é um número Buzz, pois não é divisível por 7 nem termina em 7. O número 7 também é um número Buzz.
* Sua tarefa neste estágio é escrever um programa que imprima a paridade do número natural e determine se esse número é um Buzz. O programa deve imprimir porque esse número é um número Buzz.
* Você sabe como determinar se um número é divisível por 7 ou não? Temos uma ótima dica:
    1. Remova o último dígito;
    2. Multiplique o dígito removido por 2 e subtraia do número restante.
    3. Se o resultado da subtração puder ser dividido por 7, o número inicial será divisível por 7. Você pode aplicar a sequência inteira várias vezes até obter um resultado de subtração relativamente pequeno / fácil de interpretar.
* Por exemplo, pegue 196. Removemos o último dígito e obtemos 19. Subtraímos 12 (o dígito removido multiplicado por 2) para obter 7. Como o último dígito à esquerda é 7, o número é múltiplo de 7. Portanto, 196 é um Buzz número!
* Você pode usar a solução que quiser, os testes não vão verificar.
#### Objetivos
Seu programa deve verificar se o número natural fornecido é um número de zumbido.
    1. Peça a um usuário para inserir um número natural.
    2. Se o número não for natural, imprima uma mensagem de erro.
    3. Calcule e imprima a paridade do número.
    4. Verifique se o número é um número Buzz e imprima a explicação.
    5. Conclua o programa após imprimir a mensagem.
* Os números naturais são números inteiros começando em 1.
* <strong>Explicações:</strong>
```
... is neither divisible by 7 nor does it end with 7
```
```
... is divisible by 7
```
```
... ends with 7
```
```
... is divisible by 7 and ends with 7
```
* <strong>Mensagem de erro:</strong>
```
This number is not natural!
```
#### Exemplos
* O símbolo de maior que seguido por um espaço ( > ) representa a entrada do usuário. Observe que não faz parte da entrada.
* <strong>Exemplo 1:</strong>
```
Enter a natural number:
> 13
This number is Odd.
It is not a Buzz number.
Explanation:
13 is neither divisible by 7 nor does it end with 7.
```
* <strong>Exemplo 2:</strong>
```
Enter a natural number:
> 14
This number is Even.
It is a Buzz number.
Explanation:
14 is divisible by 7.
```
* <strong>Exemplo 3:</strong>
```
Enter a natural number:
> 17
This number is Odd.
It is a Buzz number.
Explanation:
17 ends with 7.
```
* <strong>Exemplo 4:</strong>
```
Enter a natural number:
> 7
This number is Odd.
It is a Buzz number.
Explanation:
7 is divisible by 7 and ends with 7.
```
* <strong>Exemplo 5:</strong>
```
Enter a natural number:
-76
This number is not natural!
```