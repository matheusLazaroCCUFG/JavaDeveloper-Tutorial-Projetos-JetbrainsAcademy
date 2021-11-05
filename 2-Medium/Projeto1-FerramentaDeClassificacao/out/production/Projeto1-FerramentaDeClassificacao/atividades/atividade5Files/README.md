* Todos os aplicativos reais geram arquivos de log para manter registros de seu desempenho, atividades do usuário ou outras informações. Para evitar a falta de espaço livre em disco, às vezes você precisa limpar excluindo arquivos antigos. Isso é o que o código abaixo deve fazer.
* Dê uma olhada no código. O método auxiliar getChildrenencontra todos os arquivos. Leva um diretório como um argumento passado e retorna uma lista de arquivos e diretórios aninhados. Se o diretório estiver vazio, ele retornará uma lista vazia.
* Um arquivo é considerado antigo se foi modificado pela última vez antes do passado thresholdDate.
* Sua tarefa é completar o código para que funcione corretamente. Qual método deve ser invocado para fazer o código ler apenas arquivos antigos e ignorar outros dentro dos diretórios?
* O próprio sistema de diretórios aninhados não deve ser alterado.
* Preencha a lacuna na 7ª linha.
