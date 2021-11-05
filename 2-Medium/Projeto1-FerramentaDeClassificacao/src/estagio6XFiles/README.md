#### Descrição
* Às vezes, é útil ler dados de um arquivo, em vez de da entrada padrão, e gravar o resultado em outro arquivo em vez de imprimi-lo no console. Adicione esta funcionalidade ao seu programa junto com o suporte de argumento de linha de comando apropriado.
#### Objetivos
* Atualize a análise dos argumentos da linha de comando para oferecer suporte aos argumentos ```-inputFile``` e ```-outputFile```.
* Se ```-inputFile``` for fornecido seguido pelo nome do arquivo, leia os dados de entrada do arquivo.
* Se ```-outputFile``` for fornecido seguido pelo nome do arquivo, envie apenas as mensagens de erro para o console e imprima os resultados no arquivo.
#### Exemplos
* Exemplo 1: o arquivo de entrada é definido
```
java SortingTool -sortingType byCount -inputFile input.txt
```
* Exemplo 2: arquivos de entrada e saída são definidos
```
java SortingTool -sortingType byCount -inputFile data.dat -outputFile out.txt
```