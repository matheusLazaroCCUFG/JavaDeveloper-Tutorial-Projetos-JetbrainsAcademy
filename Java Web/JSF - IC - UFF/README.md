## JavaServer Faces (JSF)
### Model-View-Controller em JSF
* Model: JavaBeans
* View: Facelets
* Controller: FacesServlet
#### JavaBeans
* Ciclo de vida gerenciado pelo container
    * Também chamados de Managed Beans ou Backing Beans.
* Recebem duas anotações:
    * Nome do Bean
        * Definido como anotação do Bean
            * @ Named(nome)
        * O valor definido nessa anotação pode ser referenciado nos Facelets
            * ```#{nome}```
        * Se o nome for omitido, é usado por convenção o nome da classe iniciado com minúscula.
    * Escopo do Bean
        * Beans devem ser anotados com a identificação do seu escopo.
        * Essa anotação indica quando o Bean deve ser instanciado.
        * Escopo dos Beans (mais importantes)
            * @RequestScoped
                * Instanciado para cada requisição/resposta
                * Exemplo: cadastro de usuário.
            * @SessionScoped
                * Instanciado uma vez no início de cada sessão
                * Mantido por toda a sessão do usuário
                * Exemplo: carrinho de compras de um usuário
            * @ApplicationScoped
                * Instanciado uma vez quando o servidor de aplicação inicia
                * Compartilhado por todos os usuários
                * Exemplo: log de usuários online em um fórum
        * Escopo dos Beans (mais específicos)
            * @ConversationScoped
                * Instanciado uma vez no início de cada conversação
                * Uma sessão pode ocnter várias conversações
                * Uma conversação pode ser encerrada pelo usuário
                * Exemplo: uma sessão de chat com o vendedor dentro de uma aplicação de e-commerce.
            * @FlowScoped
                * Instanciado uma vez no início de cada conversação
                * Equivalente ao @ConversationScoped, mas voltado para "Faces Flows"
                * Exemplo: wizard de configuraçao de um site
            * @ViewScoped
                * Instanciado uma vez por página
                * Válido enquanto o usuário permanece na mesma página
                * Exemplo: site com jogos em páginas independentes
            * @Dependent
                * O escopo é definido pelo escopo do componente que usa o bean
                * Exemplo: Bean de conversação de moedas, que pode ser usado sozinho ou dentro de um carrinho de compras.
        * Obs.: Beans com escopo Session, Application e Conversation devem implementar a interface Serializable.
* Navegação entre páginas
    * Navegação direta
        * O método acionado retorna a página que deve ser aberta
        * No Facelet
            ```xhtml 
            <h:commandButton value="Salva"
            action="#{agendaBean.cadastra(contatoBean)}">
            ```
        * No Bean
            ```java 
            public String cadastra(ContatoBean contatoBean) {
                ...
                return "listagem.xhtml";
            }
            ```
        * Obs.: Se não tiver action no Facelet ou retorno no Bean, o JSF acionará a página de origem novamente!
    * Navegação indireta
        * O método acionado retorna um rótulo e o XML de configuração vincula o rótulo a uma página.
        * No Facelet
            ```xhtml 
            <h:commandButton value="Salva"
            action="#{agendaBean.cadastra(contatoBean)}">
            ```
        * No Bean
            ```java 
            public String cadastra(ContatoBean contatoBean) {
                ...
                return "listagem.xhtml";
            }
            ```
        * No faces-config.xml
            ```xml  
            <navigation-rule>
                <from-view-id>cadastro.xhtml</from-view-id>
                <navigation-case>
                    <from-outcome>cadastrado</from-outcome>
                    <to-view-id>listagem.xhtml</to-view-id>
                </navigation-case>
            </navigation-rule>	
            ```
* Exercício 1
    * Aplicação usando JSF para somatório onde o valor inicial e o valor final são informados
    * Informar o número de vezes que:
        * O usuário acessou o serviço
