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

* Bibliotecas:
  * https://hyperskill.org/learn/step/8504

### WWW - World Wide Web
* https://hyperskill.org/learn/step/6633
#### O que é a Web?
* Você já se perguntou quais imagens aparecerão na cabeça das gerações futuras quando se trata da era em que vivemos agora? É provável que o século 21 crie associações com o advento da Internet e da World Wide Web . Sua criação causou grandes mudanças não apenas nas estruturas militares e científicas, mas também na vida das pessoas comuns, dando-nos oportunidades que antes só poderiam ser imaginadas.
* Você ouve tantas vezes frases como "A World Wide Web engolfou nosso planeta", que a definição da Web é naturalmente pressuposta e tida como certa. Mas, realmente, o que é essa Web e por que é tão global?
* A World Wide Web é uma coleção de recursos de informação espalhados pelo mundo e ligados entre si por referência. Às vezes, esse termo é abreviado para WWW , W3 ou simplesmente Web
* A Web também é às vezes chamada ironicamente de Wild Wild Web por analogia com o título do filme Wild Wild West: pensando bem, a semelhança é inegável.
* Uma unidade de dados de hipertexto no W3 é chamada de página da web . Uma página da web pode conter texto, arquivos de mídia, gráficos e links para outras páginas.
* Um grupo de páginas da Web que compartilham um tema de conteúdo comum, design e links entre si é chamado de website . Programas especiais - navegadores - são usados ​​para baixar e navegar nesses sites. Navegadores mais populares: Firefox, Chrome, Opera, Safari.
* Freqüentemente, ao visitar sites, você pode ver "www" na barra de endereço do navegador:
* Este prefixo indica que o endereço do site pertence ao espaço Internet da World Wide Web e não é obrigatório.
#### A história da web
* A World Wide Web foi criada na Organização Europeia para a Energia Nuclear (CERN). O desenvolvimento da rede interna de computadores foi realizado pelo cientista Tim Berners-Lee. Em 1989, ele foi o primeiro a sugerir a ideia de um sistema de gerenciamento de informações que usasse links para consolidar documentos na rede. Ele e seus colegas criaram um projeto de protótipo e lançaram-no para apresentação. Os primeiros anos das páginas da web eram puramente baseados em texto até que o primeiro navegador gráfico NCSA Mosaic foi introduzido em 1993. O evento permitiu que a World Wide Web se transformasse de pesquisa científica em um meio de comunicação.
* Inicialmente, a Internet permitia apenas aos usuários pesquisar e ler informações. Esse período de tempo é condicionalmente conhecido como Web 1.0 (1990-2000) para fornecer uma apresentação geral do ambiente em constante mudança da Internet.
* Logo as pessoas puderam interagir umas com as outras e compartilhar seu conteúdo. Este período é denominado extraoficialmente de Web 2.0 (2000-2010).
* O desenvolvimento da World Wide Web continua até hoje e poderemos ver as mudanças que a Web 3.0 (2010-2020) trará. Atualmente, a Web 3.0 tem como objetivo melhorar a análise de conteúdo e fornecer resultados de pesquisa mais rápidos e relevantes usando inteligência artificial.
#### Internet vs WWW
* A maioria das pessoas usa os termos "Internet" e "WWW" alternadamente, mas, na verdade, essas são duas noções distintas. A Internet é uma rede global de computadores, ou seja, uma infraestrutura técnica que conecta milhões de computadores em todo o mundo. Enquanto o W3 é usado para distribuir dados que contêm links para outros dados, a Internet conecta os computadores entre si para fornecer acesso às informações.
* Simplificando, a WWW é uma forma de obter informações pela Internet, mas a Internet também é usada para acessar informações que não fazem parte da web.
* Agora você entende que a World Wide Web e a Internet significam coisas diferentes. Mais importante, agora você pode demonstrar seu conhecimento e explicar essa diferença para seus amigos.


#### <hr> 

### HTTP - Protocolo de Transferência de Hipertexto
* https://hyperskill.org/learn/step/6569
#### O que é HTTP
* Sempre que você decidir conferir as fotos de seus amigos nas redes sociais ou deixar uma mensagem para eles, assistir a um vídeo engraçado com gatinhos, ou descobrir o significado de um termo desconhecido no mecanismo de busca, o dispositivo (cliente) a partir do qual você navega na Internet envia uma solicitação ao servidor e recebe uma resposta dele.
* Um cliente é um cliente de um serviço e um servidor é um computador que atende usuários ou outros computadores. Ele pode ser localizado remotamente, a dezenas de milhares de quilômetros de você. A tecnologia quando a carga da rede é distribuída entre servidores e clientes de serviço é chamada de Arquitetura Cliente-Servidor .
* A troca de dados entre o cliente e o servidor ocorre devido ao HTTP . HTTP significa protocolo de transferência de hipertexto . Um protocolo é um conjunto de regras e convenções que definem uma maneira uniforme de trocar dados entre diferentes programas e lidar com erros. Um protocolo é um conjunto de regras específicas pelas quais os programas ou dispositivos se comunicam. Como um garçom em um restaurante, ele aceita suas solicitações, leva-as ao servidor para processamento e, em seguida, retorna a você com uma resposta.
#### História curta de HTTP
* O HTTP foi desenvolvido pelo cientista e funcionário do CERN Tim Berners-Lee , o ideólogo da World Wide Web.
* O trabalho no protocolo continuou por dois anos e, em março de 1991, o HTTP foi usado como uma tecnologia para ajudar no acesso a documentos na Internet e facilitar a navegação em hipertexto. Esta foi a versão do protocolo 0.9. Ele foi projetado para otimizar a comunicação entre o cliente e o servidor na rede. Após o surgimento do padrão HTTP / 0.9, uma separação de funções entre o cliente e o servidor apareceu durante sua interação.
* Atualmente, a versão mais recente do protocolo é HTTP / 2.0 , lançado em 2015. Antes disso, HTTP / 1.1 (lançado em 1999) era usado por até dezesseis anos. Esse padrão satisfez a todos por muitos anos por causa de suas inovações: com o advento do HTTP / 1.1, a transferência de solicitações do cliente para o servidor foi bastante acelerada.
* Nem todos os sites mudaram para HTTP / 2 ainda, mas os navegadores suportam padrões novos e antigos.
#### O que é HTTPS
* Apesar da grande funcionalidade e popularidade do HTTP, há uma desvantagem: os dados são transmitidos de forma não segura. Essa falha pode ser crítica quando se trata de pagar por compras pela Internet ou enviar dados de passaporte: nenhum usuário deseja que suas informações confidenciais sejam divulgadas.
* Para tornar o espaço da Internet mais seguro, os programadores decidiram desenvolver um add-on sobre HTTP, que ajuda a evitar a interceptação de dados por criptografia. A extensão HTTP é chamada de HTTPS e significa HyperText Transfer Protocol Secure .
* HTTPS fornece uma conexão segura entre o navegador do usuário e o servidor web. Freqüentemente, a janela do navegador exibe uma barra de endereço verde ou cadeado indicando transferência de dados criptografados. Você também pode verificar a barra de endereço do seu navegador para ver se possui uma conexão segura. Deve começar com " https: // ".
* Todos os navegadores modernos oferecem suporte a HTTPS. Os usuários da Internet não precisam configurar esta extensão separadamente: ela é ativada automaticamente, se necessário.
```
No momento, os navegadores mais populares, como Chrome, Firefox,
Safari e Edge marcam todas as conexões por HTTP como inseguras.
```
### URL HTTP
* https://hyperskill.org/learn/step/6740
#### O que é URL?
* Imagine que todos os arquivos da Internet estejam localizados em uma megalópole, cada um deles com a sorte de morar em sua própria casa. Dada a escala da Internet, no assentamento resultante, haverá um número inimaginável de quarteirões e ruas. Por exemplo, um artigo interessante, que você deseja compartilhar com seu amigo, mora em uma das casas. Como você explica onde exatamente encontrar o artigo? É isso mesmo, você precisa criar um único padrão pelo qual possa nomear todos os endereços da cidade e, em seguida, dar ao seu amigo o nome da rua e o número da casa, como em uma cidade real!
* Todos os documentos na Internet possuem um endereço pessoal. Por exemplo, o URL do site da JetBrains é parecido com este:
```
https://www.jetbrains.com/
```
* Páginas da Web, imagens, vídeos e outros documentos que podem ser armazenados em seu computador também possuem endereços. Para fazer com que tenham a mesma aparência na Internet, em 1990 os criadores da World Wide Web desenvolveram um padrão especial que define como os endereços devem ser. Esse padrão é chamado de URL, que significa Uniform Resource Locator . Representa a forma padronizada de registrar endereços de arquivos na Internet.
* O padrão tem um recurso específico: nem todos os caracteres podem ser usados ​​em URLs. A lista de caracteres permitidos inclui:
  * Alfabeto latino (ou símbolos do alfabeto inglês);
  * Alfabeto cirílico;
  * Números;
  * Caracteres reservados com significado especial ```!#$&'()*+,/:;=?@[]```;
  * Caracteres não-reservados: ```-_.~```.
#### Estrutura básica de URL
* Aqui está um exemplo de endereço de URL:
* O endereço URL tem uma certa estrutura baseada no seguinte modelo:
```
<protocol>://<login>:<password>@<host>:<port>/<path>?<request parameters>#<anchor>
```
* Agora, vamos examinar este modelo com mais detalhes:
  * ```<protocol>``` é uma forma de trocar dados com um recurso. Você provavelmente está mais familiarizado com os protocolos HTTP e HTTPS, mas existem outros;
  * ```<login>``` e são prefixos que transmitem dados de autenticação para alguns protocolos, se necessário; ```<password>```
  * ```<host>``` é o nome de domínio ou endereço IP onde o site está localizado. Domínio é o nome do site, IP é seu endereço em uma rede;
  * ```<port>``` é necessário para conexão dentro do host especificado. A porta oficial para conexões HTTP é 80 e a alternativa é 8080, mas também é possível usar qualquer outra porta. A configuração padrão para HTTPS é 443;
  * ```<path>``` indica o endereço exato de um determinado arquivo ou página em um domínio;
  * ```<request parameters>``` são parâmetros transmitidos ao servidor. Dependendo dos parâmetros de solicitação, o site pode alterar ligeiramente sua exibição. Por exemplo, é possível classificar os itens de uma lista em uma ordem diferente;
  * ```<anchor>``` permite que você se conecte a uma parte específica de uma página da web ou documento.
* Esta é a estrutura geral de qualquer URL. Na maioria das vezes, ao acessar páginas da web e documentos localizados em um servidor da web, a maioria dos parâmetros não são obrigatórios e são configurados automaticamente.
* Quando você deseja apenas ver uma página específica na Internet com seu navegador, o modelo de URL parece muito mais fácil:
```
<protocol>://<host>
```
* Por exemplo, pode ser registrado em um formulário:
```
https://www.google.com
```
* Essa simplificação foi criada para facilitar a vida dos usuários comuns da Internet, mas a maioria dos programadores precisa saber o modelo completo, e agora você conhece.
#### URLs absolutos e relativos
* Como sabemos, um URL consiste em várias partes e, quando você está navegando no mesmo site, alguns elementos permanecem os mesmos. Qualquer que seja o IDE que você queira ler no JetBrains, o protocolo e as partes do host de um URL sempre correspondem a https://www.jetbrains.com . Por exemplo, vejamos estes links:
  * https://www.jetbrains.com/pycharm/ sobre PyCharm
  * https://www.jetbrains.com/go/ sobre GoLand
  * https://www.jetbrains.com/idea/ sobre IntelliJ IDEA
* A nova informação em cada link é seu <path>. Existe outra maneira de localizar recursos no mesmo site apenas <path>?<request parameters>#<anchor>. O URL completo é conhecido como absoluto e chamamos de relativo seu equivalente mais curto.
```
Você deve se lembrar que funcionaria apenas no mesmo site, enquanto
você não pode se referir a outro site por um caminho relativo. Cada
vez que você seguir o link com um URL relativo, ele se expandirá para
absoluto, onde todas as partes, incluindo tudo, do protocolo à porta,
corresponderão ao recurso que você está usando neste momento.
```
* Sabemos que por URLs absolutos podemos encontrar facilmente o recurso através da Internet, mas por que precisamos de caminhos relativos, já que eles serão transformados em absolutos de qualquer maneira? Aqui estão as principais razões para isso:
  * Eles são pequenos.
  * Podemos facilmente mover o site para outro host.
  * Eles são um pouco mais rápidos de serem recuperados por um navegador.
#### Conclusão
* Vamos resumir o que você aprendeu sobre URLs neste tópico:
  * Podemos localizar quaisquer recursos na Internet por meio de um URL.
  * Cada URL consiste em várias partes, mas algumas delas são opcionais.
  * Podemos recuperar recursos por meio de um URL absoluto e, em seguida, navegar por eles por meio de caminhos relativos.
  

#### <hr>


#### Mensagens HTTP
* https://hyperskill.org/learn/step/6752
* O protocolo HTTP depende da arquitetura "cliente-servidor" que é construída com base no sistema de mensagens. As mensagens HTTP são uma forma de trocar dados entre clientes e servidores na web. Existem dois tipos de mensagens: solicitações e respostas .
* Uma solicitação é uma operação que um cliente deseja executar no servidor e uma resposta é uma resposta do servidor a uma solicitação recebida. Normalmente, os programadores não precisam se preocupar com a criação de mensagens HTTP, pois são produzidas por navegadores, aplicativos e servidores da web.
#### O formato das mensagens
* No protocolo HTTP, todas as mensagens consistem em cadeias de texto. Tanto as solicitações quanto as respostas têm praticamente o mesmo formato padronizado:
1. Linha de partida que pode variar:
   * para solicitações, indica o tipo de solicitação ( método ) e a URL para onde enviá-la ( destino );
   * para respostas, ele contém um código de status para determinar o sucesso da operação.
2. Cabeçalhos que descrevem a mensagem e transmitem vários parâmetros.
3. Corpo no qual os dados da mensagem estão localizados.
* A linha de partida e o cabeçalho são atributos obrigatórios, portanto, as outras partes podem estar vazias.
* O formato completo pode ser bastante complicado para iniciantes, por isso consideramos apenas sua parte, que é a mais importante para a compreensão dos princípios gerais.
#### A interação HTTP simplificada
* Aqui está uma interação HTTP simplificada entre um cliente de navegador e um servidor. O cliente e o servidor interagem por meio de solicitações e respostas que seguem o formato estudado:
```
Observe que existem outros tipos possíveis de programas clientes, não
apenas um navegador. Você pode até mesmo escrever seu próprio cliente
HTTP e interagir com os servidores. O único requisito é que esse
programa sempre siga o formato da mensagem.
```
#### Métodos
* O HTTP define um conjunto de métodos de solicitação que especificam qual será a ação desejada para um determinado recurso. Apesar do fato de que seus nomes podem ser substantivos, esses métodos de consulta às vezes são chamados de verbos HTTP .
* Vejamos os métodos de consulta mais comumente usados:
  * ```GET``` método é usado apenas para recuperar dados do servidor;
  * ```POST``` método é usado para enviar dados ao servidor;
  * ```HEAD``` solicita dados do servidor da mesma forma que o ```GET``` método, mas sem um corpo de resposta.
* Cada vez que você clica em um link, você basicamente comunica ao seu navegador que deseja ```GET``` esta página. Quando quiser ```POST``` entrar no seu site favorito, você precisa de seu login e senha para ter acesso a ele.
* Existem mais verbos disponíveis para aprender: https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods . Você não precisa memorizá-los todos agora.
#### Códigos de status
* Para o funcionamento normal de programas de computador e páginas da web que funcionam via HTTP, exceto para o conteúdo da página, o servidor retorna um código de três dígitos, que especifica a solicitação de resposta. Com a ajuda deste código, é possível redirecionar o cliente para outro site ou indicar a mudança de página, bem como detectar um erro no processamento dos dados.
* Atualmente, os padrões definem cinco classes de códigos de status:

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-striped table-bordered table-sm">
	<tbody>
		<tr>
			<td style="width: 200px;"><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">1xx: Informativo</font></font></strong></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Os códigos que começam com "1" são chamados de códigos de informação. </font><font style="vertical-align: inherit;">Eles relatam como as solicitações do cliente são processadas.</font></font></td>
		</tr>
		<tr>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2xx: Sucesso</font></font></strong></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Mensagens desta classe informam que a ação solicitada pelo cliente foi aceita com sucesso para processamento.</font></font></td>
		</tr>
		<tr>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">3xx: Redirecionamento</font></font></strong></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Isso significa que outras ações devem ser tomadas para concluir a solicitação.</font></font></td>
		</tr>
		<tr>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">4xx: Erro do cliente</font></font></strong></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Ele relata erros do lado do cliente.</font></font></td>
		</tr>
		<tr>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">5xx: Erro de servidor</font></font></strong></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">O código indica que a operação não foi bem-sucedida devido a uma falha do servidor.</font></font></td>
		</tr>
	</tbody>
</table>
* Por exemplo, se você carregou um site com sucesso, a resposta que você recebeu tem o código 200.
* Você provavelmente também já passou por uma situação em que seu navegador exibe a mensagem "404 Não Encontrada" quando você insere o endereço de uma página que não existe. Esta é a aparência dessas mensagens de falha:
* Os navegadores exibem mensagens de erro para que os usuários possam entender que algo deu errado, em vez de continuar olhando a página em branco enquanto aguardam o download do conteúdo.
* Agora, quando terminar de ler o tópico, você pode visitar vários sites em um navegador e entender como são suas ações do ponto de vista técnico.
#### Conclusão
* Vamos destacar os pontos principais que acabamos de discutir aqui:
  * As mensagens HTTP podem ser de dois tipos: solicitações e respostas.
  * Eles são compostos pela linha de partida, cabeçalhos e corpo. A linha de início em solicitações inclui método e destino, enquanto em respostas inclui código de status.
  * Os métodos comumente utilizados em mensagens de solicitação são GET, POSTe HEAD.
  * O código de status indica a resposta do servidor como um número de três dígitos. Pode ser uma das 5 classes: Informativo, Sucesso, Redirecionamento, Erro do cliente e Erro do servidor.
* Agora, quando terminar de ler o tópico, você pode visitar vários sites em um navegador e tentar adivinhar como são suas ações do ponto de vista técnico.


#### <hr>

* https://hyperskill.org/learn/step/6434
* https://hyperskill.org/learn/step/14268
* https://hyperskill.org/learn/step/12593
* https://hyperskill.org/learn/step/15885
* https://hyperskill.org/learn/step/6339
* https://hyperskill.org/learn/step/16299
* https://hyperskill.org/learn/step/13634
* https://hyperskill.org/learn/step/14409
