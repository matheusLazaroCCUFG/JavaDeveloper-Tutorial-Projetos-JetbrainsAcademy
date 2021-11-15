## Fundamentos Java Web e Spring Boot
### JSON
* https://hyperskill.org/learn/step/6854
* JSON (ou JavaScript Object Notation ) é um formato baseado em texto para armazenar e transmitir dados estruturados. Ele vem da linguagem JavaScript, mas ainda é considerado independente da linguagem: funciona com quase todas as linguagens de programação. Com a sintaxe leve do JSON, você pode facilmente armazenar e enviar para outros aplicativos tudo, desde números e strings a matrizes e objetos. Você também pode criar estruturas de dados mais complexas vinculando matrizes umas às outras.
#### Sintaxe e estrutura básicas
* O texto JSON pode ser construído em uma das duas estruturas:
    * uma coleção de pares de chave: valor (matriz associativa);
    * um conjunto ordenado de valores (matriz ou lista).
* Os objetos JSON são escritos entre chaves ```{}``` e seus pares chave: valor são separados por uma vírgula ```,```. A chave e o valor do par são separados por dois pontos ```:```. Aqui está um exemplo para você:
```javascript 
{
    "first_name": "Sophie",
    "last_name": "Goodwin",
    "age": 34
}
```
* Aqui você pode ver alguns dados do usuário no formato JSON.
* As chaves em um objeto são sempre strings, mas os valores podem ser qualquer um dos sete tipos de valores, incluindo outro objeto ou array.
* As matrizes são escritas entre colchetes ```[]``` e seus valores são separados por uma vírgula ```,```. O valor na matriz, novamente, pode ser de qualquer tipo, incluindo outra matriz ou objeto. Aqui está um exemplo de uma matriz:
```javascript
["night", "street", false, [ 345, 23, 8, "juice"], "fruit"]
```
* Na maioria das vezes, uma matriz incluirá elementos semelhantes.
```
JSON não suporta comentários.
```
#### Objetos aninhados
* JSON é um formato altamente flexível. Você pode aninhar objetos dentro de outros objetos como propriedades:
```javascript 
{
  "persons": [
    {
      "firstName": "Whitney",
      "lastName": "Byrd",
      "age": 20
    },
    {
      "firstName": "Eugene",
      "lastName": "Lang",
      "age": 26
    },
    {
      "firstName": "Sophie",
      "lastName": "Goodwin",
      "age": 34
    }
  ]
}
```
* Se os objetos e matrizes contiverem outros objetos ou matrizes, os dados terão uma estrutura semelhante a uma árvore.
* Os objetos aninhados são totalmente independentes e podem ter propriedades diferentes:
```javascript
{
  "persons": [
    {
      "firstName": "Whitney",
      "age": 20
    },
    {
      "firstName": "Eugene",
      "lastName": "Lang"
    }
  ]
}
```
* Mas, na prática, esses objetos costumam ser semelhantes.
#### camelCase VS under_score
* Se você leu os exemplos de objetos JSON com muito cuidado, pode ter uma dúvida persistente: qual estilo de escrita de palavras compostas deve ser usado para JSON?
* CamelCase é um estilo em que palavras compostas são escritas juntas e sem espaços, mas cada palavra dentro da frase começa com uma letra maiúscula. O estilo é chamado camelCase porque as letras maiúsculas dentro da palavra lembram corcundas de camelo.
* No estilo de sublinhado , as palavras compostas são escritas a partir do sublinhado inferior.
```
Na verdade, a escolha da convenção de nomenclatura JSON correta depende
diretamente de sua linguagem de programação e bibliotecas. Você pode usar
camelCase e Underscore, qualquer escolha será válida, mas não os misture em
um JSON.
```
#### As vantagens do JSON
* JSON é amplamente difundido para troca de dados na Internet devido às suas grandes vantagens:
    * compacidade;
    * flexibilidade;
    * alta legibilidade, mesmo para pessoas longe da programação;
    * a maioria das linguagens de programação tem funções e bibliotecas para ler e criar estruturas JSON.
* O JSON é um formato geral para passar dados estruturados pela rede porque, depois de serializar os dados para JSON, você pode desserializar de volta sem perder nenhuma informação. A principal vantagem do JSON em comparação com o texto simples é a capacidade de descrever relações entre objetos por meio de aninhamento e pares de valor-chave. Portanto, há grandes chances de que os sites que você visita com frequência também usem JSON.
* Outros aplicativos populares de JSON são armazenamento de dados e arquivos de configuração para outros programas.
#### Conclusão
* Agora você viu que JSON é fácil de entender e usar, e é incrível, pois é uma ferramenta muito útil para transferir dados entre aplicativos. Na prática de trabalho, você provavelmente não terá que criar arquivos JSON sozinho, você irá obtê-los de outras fontes, mas se quiser salvar o código em seu computador, você deve salvar os arquivos na ```.json``` extensão.










#### <hr>

* https://hyperskill.org/learn/step/8504
* https://hyperskill.org/learn/step/6752
* https://hyperskill.org/learn/step/6434
* https://hyperskill.org/learn/step/14268
* https://hyperskill.org/learn/step/12593
* https://hyperskill.org/learn/step/15885
* https://hyperskill.org/learn/step/6339
* https://hyperskill.org/learn/step/16299
* https://hyperskill.org/learn/step/13634
* https://hyperskill.org/learn/step/14409
