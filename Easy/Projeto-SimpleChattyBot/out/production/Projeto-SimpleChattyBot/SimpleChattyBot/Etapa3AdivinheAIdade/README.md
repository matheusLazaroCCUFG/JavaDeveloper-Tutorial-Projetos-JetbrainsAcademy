#### Descrição
* Continue melhorando seu bot, desenvolvendo novas habilidades para ele. Sugerimos um jogo de adivinhação simples que irá prever a idade de um usuário.
* É baseado em um truque matemático simples. Primeiro, dê uma olhada nesta fórmula:
```java
age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
```
* Os números remainder3, remainder5e remainder7são os restos da divisão de agepor 3, 5 e 7, respectivamente.
* Acontece que para cada número variando de 0 a 104, o cálculo resultará no próprio número. Isso se encaixa perfeitamente na faixa etária normal, não é? Peça ao usuário os restos e use-os para adivinhar a idade!
#### Objetivo
* Nesta fase, você se apresentará ao bot. Ele o cumprimentará pelo seu nome e, em seguida, tentará adivinhar sua idade usando operações aritméticas.
* Seu programa deve imprimir as seguintes linhas:
```
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
Your age is {yourAge}; that's a good time to start programming!
```
* Leia três números da entrada padrão. Suponha que todos os números serão fornecidos em linhas separadas.
* Em vez de {yourAge}, o bot imprimirá a idade determinada de acordo com a fórmula especial discutida acima.
#### Exemplo
* O símbolo maior que seguido por um espaço ( > ) representa a entrada do usuário. Observe que não faz parte da entrada.
* <strong>Exemplo 1:</strong> um diálogo com o bot
```
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
```
* Use o modelo fornecido para simplificar seu trabalho. Você pode alterar o texto, mas não o número de linhas impressas.

