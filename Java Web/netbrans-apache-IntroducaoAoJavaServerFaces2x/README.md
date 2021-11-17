## Introdução ao JavaServer Faces 2.x
* https://netbeans.apache.org/kb/docs/web/jsf20-intro_pt_BR.html
* O JavaServer Faces (JSF) é um framework de interface de usuário (IU) para aplicações Java Web. Foi projetado para complacência, trabalhoa tarefa de escrever e manter as aplicações que são executadas em um servidor de aplicações Java e renderizar como UIs de volta a um cliente de destino. O JSF oferece facilidade de uso das seguintes formas:
    * Facilita a construção de uma IU usando um conjunto de componentes de IU reutilizáveis
    * Simplifica a migração de dados da aplicação para IU e provenientes dela
    * Ajude a gerenciar o estado da IU nas solicitações do servidor
    * Oferece um modelo simples para conectar os eventos gerados pelo cliente ao código da aplicação do servidor
    * Permite personalizar os componentes de UI para que sejam facilmente construídos e reutilizados
* Para obter uma descrição mais completa do framework JSF, consulte o Tutorial do Java EE 7, Capítulo 12: Desenvolvendo Tecnologia do JavaServer Faces <http://docs.oracle.com/javaee/7/tutorial/doc/jsf-develop.htm>.
* Este tutorial demonstra como você pode aplicar o suporte do JSF 2.xa uma aplicação Web utilizando o NetBeans IDE. Comece adicionando o suporte ao framework JSF 2.xa uma aplicação Web básica e continue para executar as seguintes tarefas:
    * crie um bean gerenciado pelo JSF para manipular os dados solicitados,
    * conecte o bean gerenciado às páginas Web da aplicação e
    * converta as pages Web em arquivos de modelo de Facelets.
* O NetBeans IDE oferece, há muito tempo, suporte ao JavaServer Faces. A partir do lançamento JSF 2.0 e Java EE 6, o NetBeans IDE oferece suporte para JSF 2.0 e JSF 2.1. Para obter mais informações, consulte Suporte JSF 2.x no NetBeans IDE .
* Para concluir este tutorial, você precisa dos seguintes recursos e softwares.

<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Software ou Recurso</font></font></th>
<th class="tableblock halign-left valign-top"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Versão Necessária</font></font></th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="https://netbeans.org/downloads/index.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">NetBeans IDE</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Pacote Java EE 7.2, 7.3, 7.4, 8.0</font></font></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">JDK (kit de desenvolvimento Java)</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">7 ou 8</font></font></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="http://glassfish.dev.java.net/"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">GlassFish Server</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Edição de código aberto 3.x ou 4</font></font></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="https://netbeans.org/projects/samples/downloads/download/Samples%252FJavaEE%252FjsfDemo.zip"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Projeto de Aplicação Web `jsfDemo`</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">WL</font></font></p></td>
</tr>
</tbody>
</table>