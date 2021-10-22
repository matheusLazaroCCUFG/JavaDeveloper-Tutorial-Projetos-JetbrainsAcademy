#### Descrição
* Com este projeto, você aprenderá como processar entrada numérica e de texto, classificá-la e gerar informações úteis sobre os dados. Seu programa final trabalhará com números, palavras e linhas. No primeiro estágio, nos limitaremos aos números inteiros.
* O programa deve ler a entrada do usuário consistindo de várias linhas, cada uma contendo inteiros separados por um número arbitrário de espaços. Em seguida, deve contar o número de inteiros na entrada, encontrar o maior e identificar o número de vezes que esse inteiro aparece. Finalmente, ele deve imprimir essas informações no console.
* Se você executar seu programa e tentar digitar os números manualmente, verá que esse processo continuará infinitamente. Para finalizar a entrada, o usuário deve digitar o símbolo de final de arquivo , informando ao sistema operacional que nenhuma outra entrada será fornecida. No Linux e Mac, o atalho para este símbolo é Ctrl + D ou Cmd + D, e no Windows a combinação é Ctrl + Z. Você não precisa verificar especificamente os símbolos de fim de arquivo em seu programa, use scanner.hasNext ... em vez disso. Isso retornará falso se o fim da entrada for alcançado.
#### Objetivos
* Leia inteiros do console até que o final da entrada seja alcançado.
* Calcule as seguintes informações:
    1. O número de inteiros na entrada (X)
    2. O maior número na entrada (Y)
    3. Quantas vezes o maior número ocorre na entrada (Z)
* Produza usando este modelo:
```
Total numbers: X.
The greatest number: Y (Z time(s)).
```
#### Exemplo
* O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
```
> 1 -2   33 4
> 42
> 1                 1
Total numbers: 7.
The greatest number: 42 (1 time(s)).
```