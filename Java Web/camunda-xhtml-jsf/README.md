## Camunda - xhtml - jsf
### Automação de documentos
* Documentos automatizados baseados em DDN (Document Design Notation)
* Automação de documentos
    * Representação visual do modelo mental para elaboração de documentos complexos.
### Automação de regras de negócio
* Regras de negócio automatizadas, baseadas na notaçãoo DMN (Decision Model and Notation)
    * notação sobre mapeamento dde decisões, utilizada em conjunto com BPM.
    * Automação das regras de negócio por meio de tabelas de decisão acopladas a processos e formulários.
    * Camunda BPM.
    * Composição:
        * Tabelas de decisões a níveis lógicos.
        * Gera saídas baseado nas regras e condições implementadas.
### Automação de processos
* Plataforma baseada em BPMS
* Implementado no Camunda BPM
* BPM: Business Process Management (Gerenciamento de Processos de Negócios)
    * Abordagem adaptável de gerenciamento com a finalidade de trazer informações de processos a serem executados.
    * Objetiva sistematizar e facilitar a complexa organização de tomada de decisões.
* Corejuridico:
    * Com inovação e flexibilidade, o foco do modelo é otimizar documentos, recursos e centralizar dados.
    * Integrando as etapas jurídicas, organizando uma agenda e atingindo metas, com aumento de produtividade e redução de esforço.
    * Automação de processos gerados por BPM mostra-se íntegra em meio a alta complexidade de gerenciamento de equipes e, com alta personalização.
## O sistema
### Configuração da agenda de tarefas
* Subdivisão em três etapas:
    * Criação de variáveis
    * Apresentação de variáveis
    * Filtragem
* Clicando em: Menu-hambúrguer -> 'Ferramentas' (Canto superior esquerdo da aba Flow)
    * Subtópico: "</> variáveis"
        * O botão [Nova variável] é apresentado.
#### Criação de variáveis
- Nome: O nome dado a variável que aparecerá no filtro de
pesquisas.
- Código: O código da variável, se for uma variável de
processo retornará um dado real guardado dentro dela.
- [ X] Variável local: Para extração de relatórios
- Tipo de dado: O tipo esperado do valor interno.
- Escopo: Onde a variável se encontra.
- Largura da coluna nos relatórios: Quando exportado em
formato tabela, obrigatório para exportação sob pena de
erros.
- Usar no filtro de tarefas: Se deverá aparecer na aba de
‘Filtro’ para ser selecionável em “Apresentar” ou “Filtrar por”.
- Tipo de filtro: A forma cujo campo aparecerá em meio à
aba de filtragem das tarefas, caso selecionado em “Filtrar
por”.
- [ X] Pesquisa exata: Exige escrita correta.
- [Salvar]: Salva a variável da forma como ela está, podendo
ser editada ou excluída depois.
      
-----------
Caso selecionado como “Usar no filtro de tarefas:” poderá
ser selecionada no campo “Apresentar”
- Se selecionada, aparecerá na lista da agenda com seu
valor, caso existente.
Caso selecionado como “Usar no filtro de tarefas:” poderá
ser selecionada no campo “Filtrar por:”
- Se selecionada, aparecerá na lista da aba de filtro com um
campo para definição de seu valor.

### Criação de usuários
* - A criação de novos usuários é feita no menu de edição de
usuários, na hotbar acima do menu-hambúrguer ao
selecionar a aba “COREJUR”, sua tela será recarregada com
um novo menu-hambúrguer aberto.
* - Selecionando a aba “Usuários”, aparecerá o botão “Novo
usuário”
- “Nome:” o nome que aparecerá no sistema, que poderá ser
utilizado em chamadas nos forms.
- “Email:” o e-mail do usuário.
- “Função:” #Deixar em branco#
- “Login:” O usuário que entra no sistema.
- “Senha:” A senha do usuário para entrar no sistema.
- “Confirmação de Senha:” Repetição idêntica de senha.
- “Status:” Seleção entre Ativo/Inativo para permitir uso do
login para entrar no sistema.
- “Perfil:” Permissões bases de usuário.
- “Correspondente: [ X]” #Deixar em branco#
- “Usuário Flow: [ X]” Se o usuário terá acesso ao flow
- “Restrito: [ X]” Restringe o usuário para não ver tarefa de
outras pessoas.
Restrições
- “Variável:” Restringe de acordo com o valor de uma
variável, exemplo baseado na 'Área'.
- “Operador:” Define a operação de restrição.
- “Valor:” Descreve o valor que deverá ser comparado com o
interno da variável perante ao operador escolhido.
- “[Adicionar restrição]” Acrescentar a restrição acima ao
usuário, aparecendo em uma lista logo abaixo.

### Deploy de processos
- Ao selecionar “Processos”, no menu-hambúrguer no canto
superior esquerdo, da aba Flow.
- “[Selecionar arquivo]” receberá um upload de .bpmn e .dmn
- “[Enviar arquivo]” irá enviar os arquivos carregados, é
recomendável subir apenas um por vez.
- Caso já exista um processo com o mesmo “Process ID”
(em caso de BPMN) ou mesmo “Decision ID” (caso DMN) irá
substituir o atualmente existente.
- Alterações dessa forma podem ser vistas selecionando a
seta, não são removíveis, e fica salvo data e hora de
alteração.
- Podem ser vistas e baixadas BPMN e DMN antigas.
- Após alterações de uma BPMN existente, siga para a
migração de processos.
### Desenho de diagramas
* Camunda BPM Modeler -> abri um novo arquivo BPMN
* Adicionar uma Pool/Participante
    * Selecioná-la e configurar:
    * Conteúdo:
        - Id : É o ID genérico gerado automaticamente da pool. Mantenha-o.
        - Name : Será o nome dado a Pool, aparecendo na lateral esquerda.
        - Process Id : O nome de processo, utilizado pelo sistema para substituição e
        atualização de BPMN, por padronização, mantenha mantenha os caracteres
        alfanuméricos em minúsculo e separado por hífens apenas, sem uso de outros
        caracteres especiais.
        - Process Name : Por padronização, mantenha o mesmo nome do “Name”
        acima.
        - Version Tag : #Deixe em branco#
        - [X] Executable : #Deixe selecionado#
### Formulários inteligentes
* Automação de formulários baseada em JSF (Java Server Faces)
* Formulários ricos, que implementam a interface com o usuário de acordo com as regras de negócio e interagem com:
    * Serviços externos
    * Tabelas de decisão
    * Documentos automatizados.
### Integração de sistemas
* 