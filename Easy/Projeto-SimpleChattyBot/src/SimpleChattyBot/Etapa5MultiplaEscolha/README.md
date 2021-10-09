#### Descrição
* No estágio final, você irá melhorar seu bot simples para que ele possa fazer um teste e verificar suas respostas. O teste deve ser um questionário de múltipla escolha sobre programação. Seu bot tem que repetir o teste até que você responda corretamente e parabenizá-lo após a conclusão.
#### Objetivo
* Seu bot pode perguntar o que você quiser, mas existem duas regras para sua saída:
    * a linha com o teste deve terminar com o caractere de ponto de interrogação;
    * uma opção começa com um dígito seguido pelo ponto ( 1., 2., 3., 4.)
* Se um usuário digitar uma resposta incorreta, o bot pode imprimir uma mensagem:
```
Please, try again.
```
* O programa deve parar na resposta correta e imprimir Congratulations, have a nice day! no final.
#### Exemplo
* O símbolo de maior que seguido por um espaço ( > ) representa a entrada do usuário. Observe que não faz parte da entrada.
* <strong>Exemplo 1:</strong> um diálogo com a versão final do seu bot.
```
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter the remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22: that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 3
0!
1!
2!
3!
Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.
> 4
Please, try again.
> 2
Congratulations, have a nice day!
```
* O programa deve terminar com a Congratulations, have a nice day! mensagem.
* Use o modelo fornecido para simplificar seu trabalho. Você pode alterar o texto se quiser. Observe que usamos funções para facilitar a compreensão do programa e adicionar novo código a ele ou editar posteriormente.