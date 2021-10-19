#### Descrição
* Este projeto é chamado de Ferramenta de Classificação, mas, até agora, você ainda não classificou os elementos da entrada do usuário. Vamos adicionar um mecanismo de classificação de números ao programa e fornecer um argumento de linha de comando apropriado para usar esta função.
* O novo ```-sortIntegers``` argumento opcional indica que os números de entrada devem ser classificados.
#### Objetivos
* Atualize a análise de argumentos de linha de comando para oferecer suporte à opção de classificação por número.
* Se o ```-sortIntegers``` argumento for fornecido, ignore os outros argumentos e produza duas linhas: a primeira contendo o número total de números na entrada e a segunda contendo todos os números de entrada em ordem crescente.
* Se o ```-sortIntegers``` argumento não for fornecido, o comportamento do programa deve ser o mesmo do estágio anterior.
#### Exemplo
* Execute um exemplo de configuração:
```
java SortingTool -sortIntegers
```
* Exemplo de execução
    * O símbolo maior que seguido por um espaço (```> ```) representa a entrada do usuário. Observe que não faz parte da entrada.
```
> 1 -2   33 4
> 42
> 1                 1
Total numbers: 7.
Sorted data: -2 1 1 1 4 33 42
```