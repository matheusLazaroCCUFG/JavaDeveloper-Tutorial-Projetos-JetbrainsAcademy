### Ferramenta de classificação
#### Sobre
* No mundo moderno, os dados se tornaram tão abundantes que processá-los não é um negócio fácil. Como alguém pode entender todas essas palavras e números? Neste projeto, você escreverá um programa que processa dados textuais e numéricos e os classifica. Seu programa será capaz de determinar os dados maiores ou mais frequentes e realizar os cálculos necessários sobre eles. Os dados estão esperando para serem classificados!
#### Resultados de aprendizagem
* Familiarize-se com Coleções e aprenda a trabalhar com arquivos, argumentos e linha de comando.
#### <hr>
### Anotações
### Problema de classificaçao
#### Entendendo o problema
* O problema de classificação geralmente surge na prática de programação, quando temos que ordenar uma sequência de elementos. A ordem necessária pode ser crescente ou decrescente. Freqüentemente, a ordem crescente é considerada um padrão.
* Para representar sequências de elementos, muitas linguagens oferecem suporte a matrizes e / ou listas.
* Aqui está uma matriz de seis elementos:
<br>
<img alt="" height="85" src="https://ucarecdn.com/0a2d589b-a820-4d1c-984f-900401a8698c/" width="316">
  
* Como resultado da classificação, obtemos outra matriz do mesmo tamanho:
<br>
  <img alt="" height="87" src="https://ucarecdn.com/526413ac-b091-4fcf-a4db-c8824f774b49/" width="323">

* Muitas linguagens de programação fornecem algoritmos integrados para classificar listas e matrizes. Existem muitos algoritmos de classificação diferentes na ciência da computação e, neste tópico, aprenderemos alguns deles.
#### O que pode ser classificado?
* É possível classificar dados de diferentes tipos:
  * números de acordo com a ordem aritmética;
  * Caracteres Unicode de acordo com sua ordem na tabela de caracteres Unicode;
  * strings ( lexicograficamente ou por tamanho);
  * datas e horas de acordo com a ordem cronológica.
* Além disso, geralmente é possível classificar dados de tipos mais complexos se soubermos como comparar itens. Como regra, esses dados têm um ou mais campos chamados de chaves de classificação , pelas quais a classificação é realizada.
#### Principais recursos dos algoritmos de classificação
  * <strong>Eficiência de tempo</strong>. O tamanho de uma matriz a ser classificada é muito importante para a eficiência. Se quisermos classificar uma matriz que consiste em algumas dezenas de elementos, podemos usar qualquer algoritmo de classificação. Mas e se a matriz contiver muitos dados? Nesse caso, devemos usar apenas os algoritmos de classificação eficazes, caso contrário, os resultados podem demorar muito.
  * <strong>Estabilidade</strong>. Uma matriz para classificar pode conter vários elementos idênticos. Os algoritmos de classificação estável sempre classificam os elementos idênticos na mesma ordem em que aparecem na entrada. Caso contrário, o algoritmo de classificação é instável. A estabilidade é importante quando classificamos estruturas complexas como objetos, tuplas ou qualquer outra coisa.
  * <strong>Classificação no local / fora do local</strong>. Um algoritmo executa uma classificação no local se requer apenas uma quantidade constante de espaço adicional; caso contrário, o algoritmo executa uma classificação fora do local . Quanto maior o tamanho da matriz, mais memória adicional é necessária para os algoritmos fora do lugar .
  * <strong>Classificação interna ou externa</strong>. Um algoritmo realiza uma classificação interna se os dados de classificação forem mantidos inteiramente na memória principal do computador. A classificação externa é necessária quando os dados não cabem na memória principal do dispositivo de computação e, em vez disso, devem ser mantidos na memória externa mais lenta (geralmente um disco rígido).
* Vamos considerar algoritmos de classificação com propriedades diferentes.
* Muitos algoritmos de classificação comparam itens de array durante a classificação, mas alguns algoritmos usam outras técnicas para classificar. Esses algoritmos também são conhecidos como <strong>algoritmos de classificação sem comparação</strong>.
