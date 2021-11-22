## Resumo Livro: Java EE 7 com JSF, PrimeFaces e CDI - 2ª Edição, por Thiago Faria.
### Introdução ao desenvolvimento Web
* Especificações da JAVA EE
    * Servlets:
        * Componentes Java executados no servidor para gerar conteúdo dinâmico para a web, como HTML e XML.
    * JSP (JavaServer Pages)
        * Especificação de Servlets que permite que aplicações web desenvolvidas em Java sejam mais fáceis de manter. É similar às tecnologias como ASP e PHP, porém mais robusta por ter todas as facilidades da plataforma Java.
    * JSF ( JavaServer Faces)
        *  é um framework web baseado em Java que tem como objetivo simplificar o desenvolvimento de interfaces (telas) de sistemas para a web, através de um modelo de componentes reutilizáveis. A proposta é que os sistemas sejam desenvolvidos com a mesma facilidade e produtividade que se desenvolve sistemas desktop (até mesmo com ferramentas que suportam clicar-e-arrastar componentes).
    * JPA (Java Persistence API):
        *  é uma API padrão do Java para persistência
de dados, que usa um conceito de mapeamento objeto-relacional. Essa
tecnologia traz alta produtividade para o desenvolvimento de sistemas que
necessitam de integração com banco de dados. Só para citar, essa API
possibilita que você desenvolva aplicações usando banco de dados sem
precisar escrever uma linha sequer de SQL.
    * EJB (Enterprise Java Beans):
        *  são componentes que executam em servidores
de aplicação e possuem como principais objetivos, fornecer facilidade e
produtividade no desenvolvimento de componentes distribuídos,
transacionados, seguros e portáveis.
* Protocolo HTTP
    * Protocolo stateless de comunicação cliente-servidor
    * O cliente envia uma requisição para o sevidor, que processa a requisição e devolve uma resposta para o cliente, sendo que nenhuma informação é mantida no servidor em relação às requisições previamente recebidas.
    * Métodos HTTP:
        * Método GET: obter o conteúdo de um arquivo no servidor.
        * Método POST: enviar dados de formulários HTML ao servidor.
#### Desenvolvimento web com Java
* Acesso às páginas:
    * Modelo request-response
        * request:
            * Solicitação do cliente para que alguma ação seja realizada.
        * response:
            * Realiza a solicitação no servidor e responde para o cliente.
        * Implementado através da API de Servlets em Java.
            * Estende a funcionalidade de um servidor web para servir páginas dinâmicas aos navegadores, utilizando o protocolo HTTP.
        * Servidores web:
            * Servlet Container
            * Converte a requisição em um objeto do tipo HttpServletRequest
                * Passado aos componentes web, que podem executar qualquer código Java para que possa ser gerado um conteúdo dinâmico.
            * O componente web devolve um objeto HttpServletResponse
                * Resposta ao cliente
                * Objeto gerado para que o conteúdo gerado seja enviado ao navegador do usuário.
### Persistência de dados dom JPA
#### Persistência
* Preservação dos dados quendo um sistema é encerrado, promovendo a praticidade e usabilidade.
* Uso de Sistemas Gerenciadores de Banco de Dados relacionais e SQL
* Arquivos XML
* Arquivos texto
* etc
#### Mapeamento Objeto Relacional (ORM)
* Técnica de programação para conversão de dados entre banco de dados relacionais e linguagens de programação orientada a objetos.
    * Banco de dados:
        * Entidades são representadas por tabelas, com colunas que armazenem propriedades de diversos tipos.
        * Uma tabela pode se associar com outras e criar relacionamentos diversos.
    * Linugagem orientada a Objetos (Java)
        * Entidades são classes, e objetos dessas classes representam elementos do mundo real.
    * Comparação entre o modelo relacional com o modelo orientado a objetos:

<table>
    <tr>
        <th>Modelo relacional</th>
      <td>tabela</td>
      <td>linha</td>
      <td>coluna</td>
      <td>-</td>
      <td>Chave estrangeira</td>
    </tr>
    <tr>
            <th>Modelo OO</th>
      <td>Classe</td>
      <td>Objeto</td>
      <td>Atributo</td>
      <td>Método</td>
      <td>Associação</td>
    </tr>
</table>
