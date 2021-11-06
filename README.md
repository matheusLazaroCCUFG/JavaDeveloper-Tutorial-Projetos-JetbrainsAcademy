# Java Developer - Jetbrains Academy
# <hr>
## Tutorial seletivo com teoria e implementações em Java
### Convenções de código Oracle
https://www.oracle.com/technetwork/java/codeconventions-150003.pdf
#### O número de espaços
* A primeira convenção é usar 4 espaços como unidade de indentação em todo o código do programa.
#### A localização das chaves
* Coloque a <strong>chave de abertura</strong> no <strong>final da linha</strong> onde o bloco começa.
* Coloque a <strong>chave de fechamento</strong> no <strong>início da próxima linha</strong>
* Exemplo:
```java
public class NumberOfSpacesExample {
    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
```
#### Evite espaços extras
* Entre parênteses
* Antes de parêntese aberto
* Antes do ponto e vírgula
#### O comprimento de uma linha
* Comprimento máximo de uma linha
  * Evitar linhas com mais de 80 char
    * Util quando laptops sao usados.
#### <hr>
#### Ler uma sequência de comprimento desconhecido com ```while```
* O ```while``` loop também pode ser usado para ler uma sequência de char de comprimento arbitrário. Para isso, podemos invocar o ```hasNext()``` método de ```Scanner``` dentro da condição. O método retorna ```true``` se o próximo elemento existe e ```false``` caso contrário.
```java 
Scanner scanner = new Scanner(System.in);

int sum = 0;
while (scanner.hasNext()) {
    int elem = scanner.nextInt();
    sum += elem;
}

System.out.println(sum);
```
* Se a sequência de entrada for ```1 2 3```, o código será impresso ```6```; se for ```5 18 9 23 4```, o código será impresso ```59```.
* Como você vê, o ```while``` loop pode ser usado para resolver diferentes tarefas interessantes em seus programas.
#### <hr>
#### switch, case e default
* <strong>A instrução switch</strong> fornece uma maneira de escolher entre vários casos com base no valor de uma única variável (não uma expressão!). A variável pode ser um número inteiro, caractere, string ou enumeração. Os dois últimos tipos serão estudados posteriormente.
* Usando a instrução switch, o código anterior será semelhante a este:
```java 
switch (action) {
    case 1:
        System.out.println("Starting a new game...");
        break;
    case 2:
        System.out.println("Loading a saved game");
        break;
    case 3:
        System.out.println("Displaying help...");
        break;
    case 4:
        System.out.println("Exiting...");
        break;
    default:
        System.out.println("Unsuitable action, please, try again");
}
```
* Como você pode ver, esse código é bem estruturado e mais fácil de ler do que a instrução condicional igual.
#### <hr>
#### A classe de utilitário Arrays
* Se você precisa processar matrizes, pode importar e usar métodos padrão agrupados na classe de utilitário ```Arrays```.
  * converter uma matriz em string usando ```Arrays.toString(array)``` e depois imprimi-la:
    ```java 
    byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
    String arrayAsString = Arrays.toString(famousNumbers); // [0, 1, 2, 4, 8, 16, 32, 64]
    System.out.println(arrayAsString);
    ```
  * classificar uma matriz inteira ou parte dela usando ```Arrays.sort(array)```:
    ```java 
    long[] bigNumbers = { 200000000L, 400000000L, 100000000L, 300000000L }; // it's unsorted
    
    Arrays.sort(bigNumbers); // sorting whole array
     
    System.out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]
    ```
  * comparando matrizes: duas matrizes são iguais se contiverem os mesmos elementos na mesma ordem:
    ```java 
    int[] numbers1 = { 1, 2, 5, 8 };
    int[] numbers2 = { 1, 2, 5 };
    int[] numbers3 = { 1, 2, 5, 8 };
    
    System.out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
    System.out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"
    ```
  * preencher uma matriz inteira ou parte dela por alguns valores:
    ```java 
    int size = 10;
    char[] characters = new char[size];
    
    // It takes an array, start index, end index (exclusive) and the value for filling the array
    Arrays.fill(characters, 0, size / 2, 'A'); 
    Arrays.fill(characters, size / 2, size, 'B');
    
    System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
    ```
* Obviamente, a ```Arrays``` classe contém muitos outros métodos úteis, incluindo cópia de array, pesquisa em arrays e assim por diante. Para detalhes, veja : https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
#### <hr>
#### StringBuilder
#### Strings mutáveis
* Como você deve saber, as strings em Java são <strong>imutáveis</strong>. Isso significa que, uma vez criada, uma string não pode ser alterada. Se quisermos modificar o conteúdo de um objeto string, devemos criar uma nova string. Essa pode não ser a melhor maneira quando fazemos muitas modificações, porque cada operação cria um novo objeto, o que é ruim para o desempenho.
* Felizmente, existe uma classe especial chamada ```StringBuilder``` que é usada para criar objetos de string mutáveis. Um objeto desta classe é semelhante a uma string regular, exceto que pode ser modificado. Por exemplo, é melhor usar do ```StringBuilder``` que ```String``` quando muitas concatenações são executadas em tempo de execução.
#### Construindo objetos
* É possível criar um objeto vazio do tipo ```StringBuilder```:
```java 
StringBuilder empty = new StringBuilder();
System.out.println(empty); // ""
```
* ou passe uma string para ele:
```java 
StringBuilder sb = new StringBuilder("Hello!");
System.out.println(sb); // "Hello!"
```
```
Observe, não precisamos importar nada para usar esta classe em programas.
```
#### Alguns métodos importantes
* A ```StringBuilder``` classe fornece um conjunto de métodos úteis para manipular objetos. Vamos considerar alguns deles.
  * ```int length()``` retorna o comprimento (a contagem de char), como em strings regulares. Este método não modifica o objeto.
```java 
StringBuilder sb = new StringBuilder("I use Java");
System.out.println(sb.length()); // 10
```
  * ```char charAt(int index)``` retorna um caractere localizado no índice especificado. O primeiro caractere tem o índice 0. Este método não modifica o objeto.
```java 
StringBuilder sb = new StringBuilder("I use Java");
System.out.println(sb.charAt(0)); // 'I'
System.out.println(sb.charAt(6)); // 'J'
```
  * ```void setCharAt(int index, char ch)``` define um caractere localizado no índice especificado para <strong>ch</strong>.
```java 
StringBuilder sb = new StringBuilder("start");
sb.setCharAt(1, 'm');
System.out.println(sb); // "smart"
```
  * ```StringBuilder deleteCharAt(int index)``` remove o caractere na posição especificada.
```java 
StringBuilder sb = new StringBuilder("dessert");
sb.deleteCharAt(2);
System.out.println(sb); // "desert"
```
  * ```StringBuilder append(String str)``` concatena a string fornecida ao final do ```StringBuilder``` objeto de chamada . Existem também várias sobrecargas para pegar tipos primitivos e até matrizes de char.
```java 
StringBuilder sb = new StringBuilder("abc");
sb.append("123");
System.out.println(sb); // "abc123"
```
  * Também é possível invocar esse método várias vezes no mesmo objeto na mesma instrução porque esse método retorna o mesmo objeto modificado.
```java 
StringBuilder messageBuilder = new StringBuilder(); // empty

messageBuilder
        .append("From: Kate@gmail.com\n")
        .append("To: Max@gmail.com\n")
        .append("Text: I lost my keys.\n")
        .append("Please, open the door!");

System.out.println(messageBuilder);
```
* Saída:
```
From: Kate@gmail.com
To: Max@gmail.com
Text: I lost my keys.
Please, open the door!
```
  * ```StringBuilder insert(int offset, String str)``` insere a string fornecida no ```StringBuilder``` objeto existente na posição fornecida indicada pelo deslocamento. Este método tem muitas sobrecargas para diferentes tipos.
```java 
StringBuilder sb = new StringBuilder("I'm a programmer.");
sb.insert(6, "Java ");
System.out.println(sb); // I'm a Java programmer.
```
  * ```StringBuilder replace(int start, int end, String str)``` substitui a substring do índice de string especificado (inclusivo) para o índice final (exclusivo) com uma determinada string.
```java 
StringBuilder sb = new StringBuilder("Let's use C#");
sb.replace(10,12,"Java");
System.out.println(sb); // Let's use Java
```
  * ```StringBuilder delete(int start, int end)``` remove a substring do índice inicial (inclusivo) para o índice final (exclusivo).
```java 
StringBuilder sb = new StringBuilder("Welcome");
sb.delete(0,3);
System.out.println(sb); // "come"
```
  * ```StringBuilder reverse()``` faz com que essa sequência de char seja substituída pelo reverso da sequência.
```java 
StringBuilder sb = new StringBuilder("2 * 3 + 8 * 4");
sb.reverse();
System.out.println(sb); // "4 * 8 + 3 * 2"
```
```
Observe, quando você tem um StringBuilder objeto, pode obter um String invocando o toString método.
```
* Para obter mais detalhes sobre os métodos, consulte a documentação: https://docs.oracle.com/javase/10/docs/api/java/lang/StringBuilder.html
#### O length() e a capacity()
* Existem dois métodos que não devem ser confundidos: ```length``` e ```capacity```. O ```length``` retorna o número real de char, enquanto ```capacity``` retorna a quantidade de armazenamento disponível para os char recém-inseridos, além da qual ocorrerá uma alocação. A capacidade é uma parte da representação interna de ```StringBuilder``` e seu valor mudará dinamicamente.
* O exemplo a seguir o ajudará a distinguir melhor esses métodos:
```java 
StringBuilder sb = new StringBuilder(); // initial capacity is 16

System.out.println(sb.length());   // 0
System.out.println(sb.capacity()); // 16

sb.append("A very long string");

System.out.println(sb.length());   // 18
System.out.println(sb.capacity()); // 34
```
* É possível especificar a capacidade ao criar um ```StringBuilder``` objeto, mas não é usado com muita frequência:
```java 
StringBuilder sb = new StringBuilder(30);

System.out.println(sb.length());   // 0
System.out.println(sb.capacity()); // 30
```
# <hr>
### Varargs - parâmetros de comprimento variável
* É possível passar um número arbitrário de argumentos do mesmo tipo para um método usando a sintaxe especial chamada <strong>varargs (argumentos de comprimento variável)</strong>. Esses argumentos são especificados por três pontos após o tipo. No corpo do método, você pode processar esse parâmetro como uma matriz regular do tipo especificado.
* O método a seguir usa um parâmetro <strong>vararg</strong> inteiro e produz o número de argumentos na saída padrão usando a propriedade de <strong>comprimento</strong> de matrizes.
```java 
public static void printNumberOfArguments(int... numbers) {
    System.out.println(numbers.length);
}
```
* Como você pode ver, uma sintaxe especial ```...``` é usada aqui para especificar um parâmetro <strong>vararg</strong>.
* Agora, você pode invocar o método passando vários números inteiros ou uma matriz de ints.
```java 
printNumberOfArguments(1);
printNumberOfArguments(1, 2);
printNumberOfArguments(1, 2, 3);
printNumberOfArguments(new int[] { }); // no arguments here
printNumberOfArguments(new int[] { 1, 2 });
```
* Este código resulta em:
```java 
1
2
3
0
2
```
* Este exemplo também demonstra a diferença entre os argumentos e parâmetros de um método. O método possui apenas um único parâmetro, mas pode ser chamado com vários argumentos.
#### Varargs e outros parâmetros
* Se um método possui mais de um parâmetro, o ```vararg``` parâmetro deve ser o último na declaração do método.
* Aqui está um exemplo incorreto:
```java 
public static void method(double... varargs, int a) { /* do something */ }
```
* A versão correta do método é:
```java 
public static void method(int a, double... varargs) { /* do something */ }
```
# <hr>
### Enums em Java
* Quando uma variável pode tirar apenas um de um pequeno conjunto de valores possíveis, é uma boa ideia usar enums em um programa. Enum é uma palavra-chave especial abreviada para enumeração que nos permite criar uma lista de constantes agrupadas por seu conteúdo: estações, cores, estados, etc. Quando armazenamos um monte de constantes em um lugar e as manipulamos juntas , isso nos ajuda a evitar erros e torna o código mais legível e claro.
* Agora, vamos examinar mais de perto como os enums funcionam.
#### Definindo um enum
* Podemos criar nossa própria enumeração de maneira semelhante à declaração de classes. De acordo com a Convenção do Código Java, as constantes em um enum são escritas em letras maiúsculas. Todas as constantes devem ser separadas por vírgulas. Dê uma olhada no exemplo de enum ```Season```:
```java 
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER // four instances
}
```
```
É possível declarar um enum dentro da classe. Nesse caso, não precisamos usar o publicmodificador na declaração enum.
```
* Em geral, um enum pode ser considerado uma classe com instâncias predefinidas. Aqui, temos quatro instâncias de estações ```SPRING```, ```SUMMER```, ```AUTUMN``` e ```WINTER``` dentro do armazenamento ```Season```. Se quisermos estender a lista de constantes, podemos simplesmente adicionar outra instância em nosso enum: meados do inverno, inverno australiano, etc. Não se esqueça de que na vida real elas têm que fazer sentido.
* Agora que temos uma ideia de como definir enums básicos, vamos aprender como usá-los em um programa.
#### Métodos para processar enums
* Suponha que tenhamos que escrever um programa com um enum que exiba três status de usuário possíveis. Vamos criar um enum ```UserStatus``` com estes status:
```java 
public enum UserStatus {
    PENDING, ACTIVE, BLOCKED
}
```
* E agora inicializamos uma variável do tipo ```UserStatus``` do exemplo anterior:
```java 
UserStatus active = UserStatus.ACTIVE;
```
* Cada valor enum tem um nome que pode ser acessado usando o método ```name()```:
```java 
System.out.println(active.name()); // ACTIVE
```
* Às vezes, podemos precisar acessar uma instância de enumeração por seu nome. Isso pode ser feito com o ```valueOf()``` método que nos fornece outra maneira de inicializar uma variável:
```java 
UserStatus blocked = UserStatus.valueOf("BLOCKED"); // BLOCKED
```
* Uma coisa importante a lembrar sobre esse método é que ele diferencia maiúsculas de minúsculas . Isso significa que, se a string fornecida não corresponder exatamente a nenhuma constante, obteremos uma <strong>IllegalArgumentException</strong>.
```java 
UserStatus blocked = UserStatus.valueOf("blocked"); // IllegalArgumentException, valueOf is case-sensitive
```
* Se quisermos ver todas as constantes de uma enumeração, podemos obtê-las em uma matriz usando o ```values()``` método:
```java 
UserStatus[] statuses = UserStatus.values(); // [PENDING, ACTIVE, BLOCKED]
```
* Outro método chamado ```ordinal()``` retorna a posição ordinal de uma instância de um enum:
```java 
System.out.println(active.ordinal()); // 1 (starting with 0)
System.out.println(UserStatus.BLOCKED.ordinal()); // 2
```
* Embora um enum seja um tipo de referência, duas variáveis podem ser comparadas corretamente usando o ```equals``` método e o operador ```==```.
#### Enums na instrução switch
* Um <strong>enum</strong> pode ser usado com sucesso na ```switch``` instrução. Dependendo do status, nosso programa pode realizar diferentes ações indicadas pelo ```switch``` extrato. Nesse caso, ele imprime respostas diferentes:
```java 
UserStatus status = ... // some status
 
switch (status) {
    case PENDING:
        System.out.println("You need to wait a little.");
        break;
    case ACTIVE:
        System.out.println("No problems, you may pass here.");
        break;
    case BLOCKED:
        System.out.println("Stop! You can't pass here.");
        break;
    default:
        System.out.println("Unsupported enum constant.");
}
```
* A mensagem que nosso programa envia depende do valor da variável ```status```.
#### Iterando sobre um enum
* Uma das melhores maneiras de iterar em um enum é usar um ```for``` ou um ```for-each``` loop. Vamos aplicá-lo ao nosso exemplo de enum:
```java 
    for (UserStatus status : UserStatus.values()) {
        System.out.println(status);
    }
/* the output is
PENDING 
ACTIVE
BLOCKED
*/
```
* Aqui, usamos o ```values()``` método para retornar uma matriz de valores enum. Esse loop é útil ao iterar enums com um grande número de constantes.
# <hr>
### Campos e métodos em enum
* Usamos enums para definir conjuntos de variáveis imutáveis. Depois de defini-los, podemos precisar estender a funcionalidade do enum e adicionar valores às constantes. Assim como uma classe, um enum pode ter campos, construtores e métodos. É por isso que um enum é útil ao trabalhar com valores que você não vai alterar.
* Para provar isso, vamos considerar o seguinte exemplo.
#### Amostra enum
* Suponha que tenhamos que escrever um programa que exibe o nível da bateria de um smartphone, banco de energia ou qualquer dispositivo com uma escala discreta.
* Em primeiro lugar, vamos criar um enum com vários níveis de limite que representam o nível de carga da bateria:
```java 
public enum ChargeLevel {
    FULL, HIGH, MEDIUM, LOW
}
```
* Suponha que precisemos exibir o nível de carga da bateria visualmente. Queremos que seja dividido em vários segmentos e tenha também uma indicação de cor, desta forma:
* Para fazer isso, adicionaremos campos e valores correspondentes ao nosso enum. Quando os definimos, devemos fornecer valores para o construtor do enum. Aqui, criamos um construtor no ```ChargeLevel``` enum e adicionamos dois campos ```sections``` e ```color```. Além disso, existem dois métodos ```getSections()``` e ```getColor()``` que retornam os valores dos campos respectivamente.
```java 
public enum ChargeLevel {

    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    int sections;
    String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }
}
```
* Observe que todas as instâncias enum são criadas pela JVM da mesma maneira que um campo estático de uma classe. Esse é o motivo pelo qual um enum não pode conter um construtor público. Isso significa que não podemos criar objetos enum invocando um construtor enum com a ```new``` palavra - chave, mas temos que escolher uma das instâncias predefinidas.
Lembre-se de que, se seu enum contiver campos e métodos, você deve sempre defini-los após a lista de constantes no enum.
* Agora temos uma classe com informações adicionais reunidas em um só lugar: o número de seções a destacar e a cor.
```java 
System.out.println(ChargeLevel.LOW.sections); // 1
System.out.println(ChargeLevel.LOW.color); // red
```
* É possível estender um enum adicionando métodos estáticos personalizados. Por exemplo, vamos adicionar um método que encontre uma ```ChargeLevel``` instância por um determinado número de seções:
```java 
public enum ChargeLevel {

    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    int sections;
    String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    public static ChargeLevel findByNumberOfSections(int sections) {
        for (ChargeLevel value: values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }
}
```
* Dentro do ```findByNumberOfSections()``` método, iteramos sobre os valores possíveis usando um ```for-each``` loop. Aqui está um exemplo da saída do nosso método:
```java 
System.out.println(ChargeLevel.findByNumberOfSections(2)); // MEDIUM
```
#### Conclusão
* Como um enum é um tipo de classe especial em Java, podemos adicionar construtores, campos e métodos a ele. Assim, é possível aprimorar nosso enum para incluir os valores de que precisamos. Os valores das constantes são definidos quando declaramos o enum. Se você deseja adicionar campos, métodos e construtores enum, deve fazê-lo após a declaração das constantes enum.
#### <hr>
#### Scanner double ou float - decimal
* Se você resolver nossos problemas de codificação localmente ou tentar repetir nossos exemplos, poderá encontrar um problema com seu computador com configurações de localidade diferentes. Nesse caso, o Scanner não pode ler números de ponto flutuante com o caractere de ponto ( 3.1415 ). Tente inserir números escritos com o separador de vírgula ( 3,1415 ).
* Se você deseja usar o caractere de ponto sem modificar suas configurações locais, tente usar o seguinte código para criar um scanner:
```java 
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
```
#### <hr>
### O que é uma exceção (exception)?
* Alguns erros em seu código não impedem a execução do programa. Nesse caso, o programa só travará ao tentar executar uma linha "interrompida": uma linha com um erro chamada de <strong>exceção</strong>. Assim, as exceções são os erros detectados durante a <strong>execução</strong> do programa (em tempo de execução), enquanto os erros de sintaxe são aqueles detectados durante a <strong>compilação</strong> do programa em código de bytes. Uma exceção interrompe a execução normal de um programa.
* Vamos considerar vários tipos de exceções e como evitá-las.
#### ArithmeticException
* Suponha que você esteja escrevendo um programa que lê dois inteiros da entrada padrão e, em seguida, produz o resultado da divisão inteira do primeiro número pelo segundo. Olhe o código abaixo.
```java 
import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a / b); // an exception is possible here!
        System.out.println("finished");
    }
}
```
* Se o usuário passar ```9``` e ```3``` como os valores de entrada, o programa produzirá ```3``` junto com a ```"finished"``` string. Mas se o segundo número for ```0```, o programa lançará uma exceção por causa da divisão por zero.
```java 
Exception in thread "main" java.lang.ArithmeticException: / by zero
  at ArithmeticExceptionDemo.main(ArithmeticExceptionDemo.java:11)
```
* Como você pode ver, o programa falha com o ```ArithmeticExceptione``` a ```"finished"``` string não é impressa. Todo o código <strong>antes</strong> da exceção é executado corretamente, e tudo o que vem <strong>depois</strong> não é.
* A mensagem exibida mostra a causa da exceção (```"/ by zero"```), o arquivo e o número da linha onde ocorreu (```ArithmeticExceptionDemo.java:11```). As informações fornecidas são úteis para desenvolvedores, mas não são muito significativas para os usuários finais do programa.
* Para evitar a exceção, podemos verificar o valor antes da divisão e, se o valor for zero, imprimir uma mensagem. Aqui está outra versão do programa. Se o segundo número for zero, o programa imprimirá a string "<strong>Divisão por zero!</strong>".
```java 
import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Division by zero!");
        } else {
            System.out.println(a / b);
        }
        System.out.println("finished");
    }
}
```
* Veja alguns exemplos de entrada. Vamos começar com números inteiros diferentes de zero:
```java 
8 4
```
* O programa ainda funciona da mesma maneira e o resultado é:
```java 
2
finished
```
* Agora, se tentarmos inserir zero como um divisor:
```java 
3 0
```
* O resultado é:
```java 
Division by zero!
finished
```
* Como você pode ver, a nova versão do programa não lança uma exceção e sempre termina com sucesso. Além disso, ele imprime uma mensagem amigável em vez da mensagem padrão.
#### NumberFormatException
* Outra situação a ser considerada é quando você está tentando converter uma string em um número inteiro. Se a string tiver um formato inadequado, o código lançará uma exceção.
* O programa a seguir lê um número da entrada padrão e, em seguida, produz o número que o segue.
```java 
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int number = Integer.parseInt(input); // an exception is possible here!
        System.out.println(number + 1);
    }
}
```
* Funciona muito bem se a linha de entrada for um número inteiro correto. Mas se a entrada não estiver correta (por exemplo ```"121a"```), o programa irá falhar:
```java 
Exception in thread "main" java.lang.NumberFormatException: For input string: "121a"
  at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
  at java.base/java.lang.Integer.parseInt(Integer.java:652)
  at java.base/java.lang.Integer.parseInt(Integer.java:770)
  at NumberFormatExceptionDemo.main(NumberFormatExceptionDemo.java:9)
```
* Esta mensagem exibe o tipo de exceção (```NumberFormatException```) e a string de entrada passada. O local onde ocorreu a exceção é mostrado na última linha da mensagem:
  * o nome do arquivo é ```NumberFormatExceptionDemo.java```;
  * o ```main``` método;
  * a linha 9.
* Todas as linhas anteriores da mensagem mostram as posições dentro do ```parseInt``` método que faz parte da biblioteca padrão.
* Para evitar essa exceção, é possível verificar a string de entrada usando uma expressão regular. Caso a entrada não esteja correta, podemos enviar uma mensagem de aviso. O seguinte programa faz isso:
```java 
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.matches("\\d+")) { // it checks if the input line contains only digits
            int number = Integer.parseInt(input);
            System.out.println(number + 1);
        } else {
            System.out.println("Incorrect number: " + input);
        }
    }
}
```
* Se a linha de entrada for "121a", o programa não irá parar e imprimirá a mensagem:
```java 
Incorrect number: 121a
```
* Se você tiver problemas para entender o que é a exceção, você pode copiar e colar o nome e pesquisar no Google. Além disso, você é fortemente encorajado a fazê-lo, pois 99 %dos problemas que os alunos encontram já foram resolvidos em fóruns profissionais.
#### <hr>
### Classes Wrapper
* Cada tipo primitivo possui uma classe dedicada a ele. Essas classes são conhecidas como <strong>wrappers</strong> e são <strong>imutáveis</strong> (assim como strings). As classes de wrapper podem ser usadas em diferentes situações:
  * quando uma variável pode ser ```null``` (ausência de um valor);
  * quando você precisa armazenar valores em coleções genéricas (será considerado nos próximos tópicos);
  * quando você deseja usar métodos especiais dessas classes.
* A tabela a seguir lista todos os tipos primitivos e as classes de wrapper correspondentes.
<table> 
  <tr> 
    <th>Primitivo</th>
    <th>Classe Wrapper</th> 
    <th>Constructor Argument</th> 
  </tr> <tr> 
    <td>boolean</td> 
    <td>Boolean</td> 
    <td>boolean or String</td> 
  </tr> <tr> <td>byte</td> 
  <td>Byte</td>
    <td>byte or String</td>
  </tr>
  <tr>
    <td>char</td>
    <td>Character</td>
    <td>char</td>
  </tr>
  <tr>
    <td>int</td>
    <td>Integer</td>
    <td>int or String</td>
  </tr>
  <tr>
    <td>float</td>
    <td>Float</td>
    <td>float, double or String</td>
  </tr>
  <tr>
    <td>double</td>
    <td>Double</td>
    <td>double or String</td>
  </tr>
  <tr>
    <td>long</td>
    <td>Long</td>
    <td>long or String</td>
  </tr>
  <tr>
    <td>short</td>
    <td>Short</td>
    <td>short or String</td>
  </tr>
</table>

* Como você pode ver, o Java fornece oito classes de wrapper: uma para cada tipo primitivo. A terceira coluna mostra o tipo de argumento de que você precisa para criar um objeto da classe de invólucro correspondente.
#### Boxing e unboxing
* <strong>Boxing</strong> é a conversão de tipos primitivos em objetos de classes de invólucro correspondentes. <strong>Unboxing</strong> é o processo inverso. O código a seguir ilustra os dois processos:
```java 
int primitive = 100;
Integer reference = Integer.valueOf(primitive); // boxing
int anotherPrimitive = reference.intValue();    // unboxing
```
* <strong>Autoboxing</strong> e <strong>auto-unboxing</strong> são conversões automáticas executadas pelo compilador Java.
```java 
double primitiveDouble = 10.8;
Double wrapperDouble = primitiveDouble; // autoboxing
double anotherPrimitiveDouble = wrapperDouble; // auto-unboxing
```
* Você pode misturar processos de boxing / unboxing automáticos e manuais em seus programas.
```
O autoboxing funciona apenas quando as partes esquerda e direita de uma
atribuição têm mesmo tipo. Em outros casos, você obterá um erro de compilação.
```
```java 
Long n1 = 10L; // OK, assigning long to Long
Integer n2 = 10; // OK, assigning int to Integer 

Long n3 = 10; // WRONG, assigning int to Long
Integer n4 = 10L; // WRONG assigning long to Integer
```
#### Construindo wrappers com base em outros tipos
* As classes wrapper possuem construtores para criar objetos de outros tipos. Por exemplo, um objeto de uma classe wrapper pode ser criado a partir de uma string (exceto para a ```Character``` classe).
```java 
Integer number = new Integer("10012"); // an Integer from "10012"
Float f = new Float("0.01");           // a Float from "0.01"
Long longNumber = new Long("100000000"); // a Long from "100000000"
Boolean boolVal = new Boolean("true");   // a Boolean from "true"
```
* Você também pode criar objetos wrapper usando métodos especiais:
```java 
Long longVal = Long.parseLong("1000");      // a Long from "1000"
Long anotherLongVal = Long.valueOf("2000"); // a Long from "2000"
```
* Se a string de entrada tiver um argumento inválido (por exemplo, ```"1d0o3"```), ambos os métodos lançam o ```NumberFormatException```.
```
Observe que, desde o Java 9, os construtores estão obsoletos. Você deve usar métodos especiais para criar objetos das classes de wrapper.
```
#### Comparando wrappers
* Assim como para qualquer tipo de referência, o operador ```==``` verifica se dois objetos de invólucro são realmente iguais, ou seja, se eles se referem ao mesmo objeto na memória. O método ```equals```, por outro lado, verifica se dois objetos de invólucro são significativamente iguais, por exemplo, verifica se dois invólucros ou cadeias de char têm o mesmo valor.
```java 
Long i1 = Long.valueOf("2000");
Long i2 = Long.valueOf("2000");
System.out.println(i1 == i2);      // false
System.out.println(i1.equals(i2)); // true
```
* Não se esqueça desse recurso ao trabalhar com wrappers. Mesmo que correspondam aos tipos primitivos, os objetos de invólucro são tipos de referência!
#### <hr>
### Introdução à programação genérica
#### Programação genérica
* Existem situações em que os métodos e classes não dependem dos tipos de dados nos quais operam. Por exemplo, o algoritmo para localizar um elemento em uma matriz pode processar matrizes de strings, inteiros ou classes personalizadas. Não importa o que o array armazena: o algoritmo é sempre o mesmo. Contudo, não podemos escrever este algoritmo como um único método, porque requer argumentos diferentes (```int[]```, ```String[]```, etc.).
* Desde a versão 5, o Java oferece suporte à programação genérica que introduz abstração sobre os tipos. Métodos e classes genéricos podem lidar com diferentes tipos da mesma maneira geral. Um tipo concreto é determinado apenas quando um desenvolvedor cria um objeto da classe ou invoca o método. Essa abordagem nos permite escrever código mais abstrato e desenvolver bibliotecas de software reutilizáveis. Vamos considerá-lo passo a passo usando exemplos escritos em Java.
#### Parâmetros de tipo
* Um tipo genérico é uma classe genérica (ou interface) que é parametrizada em tipos. Para declarar uma classe genérica, precisamos declarar uma classe com a seção de parâmetro de tipo delimitada por colchetes angulares ```<``` ```>```após o nome da classe.
* No exemplo a seguir, a classe ```GenericTypetem``` um único parâmetro de tipo denominado ```T```. Assumimos que o tipo ```T``` é "algum tipo" e escrevemos o corpo da classe independentemente do tipo concreto.
```java 
class GenericType<T> { 

    /**
     * A field of "some type"
     */
    private T t;

    /**
     * Takes a value of "some type" and assigns it to the field
     */
    public GenericType(T t) {
        this.t = t;
    }

    /**
     * Returns a value of "some type"
     */
    public T get() {
        return t;
    }

    /**
     * Takes a value of "some type", assigns it to a field and then returns it
     */
    public T set(T t) {
        this.t = t;
        return this.t;   
    }
}
```
* Depois de ser declarado, um parâmetro de tipo pode ser usado dentro do corpo da classe como um tipo comum. Por exemplo, o exemplo acima usa o parâmetro de tipo ```T``` como:
  * um tipo para um campo
  * um tipo de argumento de construtor
  * um argumento de método de instância e tipo de retorno
* O comportamento de ambos os métodos de instância não depende do tipo concreto de ```T```; ele pode receber / retornar uma string ou um número da mesma maneira.
* Uma classe pode ter qualquer número de parâmetros de tipo. Por exemplo, a seguinte classe tem três.
```java 
class Three<T, U, V> {
    T t;
    U u;
    V v;
}
```
* Mas a maioria das classes genéricas tem apenas um ou dois parâmetros de tipo.
#### A convenção de nomenclatura para parâmetros de tipo
* Há uma convenção de nomenclatura que restringe as opções de nome de parâmetro de tipo a letras maiúsculas simples. Sem essa convenção, seria difícil dizer a diferença entre uma variável de tipo e um nome de classe comum.
* Os nomes de parâmetro de tipo mais comumente usados são:
  * ```T``` - Modelo
  * ```S```, ```U```, ```V``` Etc. - 2ª, 3ª, 4ª tipos
  * ```E``` - Elemento (usado extensivamente por diferentes coleções)
  * ```K``` - Chave
  * ```V``` - Valor
  * ```N``` - Número
#### Criação de objetos de classes genéricas
* Para criar um objeto de uma classe genérica (padrão ou customizada), precisamos especificar o argumento de tipo após o nome do tipo.
```java 
GenericType<Integer> obj1 = new GenericType<Integer>(10);

GenericType<String> obj2 = new GenericType<String>("abc");
```
```
É importante observar que um argumento de tipo deve ser um tipo de referência. Tipos primitivos como int ou double são argumentos de tipo inválido.
```
* Java 7 tornou possível substituir os argumentos de tipo necessários para invocar o construtor de uma classe genérica por um conjunto vazio de argumentos de tipo, desde que o compilador possa inferir os argumentos de tipo a partir do contexto.
```java 
GenericType<Integer> obj1 = new GenericType<>(10);

GenericType<String> obj2 = new GenericType<>("abc");
```
* Usaremos esse formato em todos os outros exemplos.
```
O par de colchetes angulares <>é informalmente chamado de operador de diamante.
```
* Às vezes, declarar uma variável com um tipo genérico pode ser demorado e difícil de ler. A partir do Java 10, podemos escrever em ```var``` vez de um tipo específico para forçar a inferência automática de tipo com base no tipo de valor atribuído.
```java 
var obj3 = new GenericType<>("abc");
```
* Depois de criar um objeto com um argumento de tipo especificado, podemos invocar métodos da classe que recebem ou retornam o parâmetro de tipo:
```java 
Integer number = obj1.get(); // 10
String string = obj2.get();  // "abc"

System.out.println(obj1.set(20));    // prints the number 20
System.out.println(obj2.set("def")); // prints the string "def"
```
* Se uma classe tem vários parâmetros de tipo, precisamos especificar todos eles ao criar instâncias:
```java 
GenericType<Type1, Type2, ..., TypeN> obj = new GenericType<>(...);
```
#### Matriz genérica personalizada
* Como um exemplo mais complicado, vamos considerar a seguinte classe que representa um array imutável genérico. Ele tem um campo para armazenar itens do tipo T, um construtor para definir itens, um método para obter um item por seu índice e outro método para obter o comprimento do array interno. A classe é imutável porque não fornece métodos para modificar a matriz de itens.
```java 
public class ImmutableArray<T> {

    private T[] items;

    public ImmutableArray(T[] items) {
        this.items = items;
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
```
* Esta classe mostra que uma classe genérica pode ter métodos (como comprimento) que não usam o tipo de parâmetro de forma alguma.
* O código a seguir cria uma instância de ```ImmutableArray``` para armazenar três strings e, em seguida, enviar os itens para a saída padrão.
```java 
var stringArray = new ImmutableArray<>(new String[] {"item1", "item2", "item3"});

for (int i = 0; i < stringArray.length(); i++) {
    System.out.print(stringArray.get(i) + " ");
}
```
* É possível parametrizar ```ImmutableArray``` com qualquer tipo de referência, incluindo arrays, classes padrão ou suas próprias classes.
```java 
var doubleArray = new ImmutableArray<>(new Double[] {1.03, 2.04});

MyClass obj1 = ..., obj2 = ...; // suppose, you have two objects of your custom class

var array = new ImmutableArray<>(new MyClass[] {obj1, obj2});
```
* Usamos ```var``` nos exemplos acima para economizar espaço. Em vez de usar var, poderíamos ter especificado explicitamente o tipo, por exemplo, ```ImmutableArray<String> stringArray = ...;``` e assim por diante.
#### <hr>
#### O que são Collections (coleções / listas / list)
#### Quando as matrizes não são suficientes
* A linguagem Java oferece suporte a matrizes para armazenar vários valores ou objetos do mesmo tipo juntos. Uma matriz é inicializada com um tamanho predefinido durante a criação. O tamanho não pode ser alterado no futuro e isso impõe algumas limitações ao seu uso para resolver problemas de negócios. Se quisermos armazenar mais dados, precisamos criar um novo array maior e, em seguida, copiar os dados neste array manualmente. Isso pode ser ineficiente para programas que processam muitos dados.
#### Coleções diferentes
* Felizmente, existe um conjunto de contêineres chamados coleções para agrupar elementos em uma única unidade. Eles são usados para armazenar, recuperar, manipular e comunicar dados agregados.
* As coleções são mais sofisticadas e flexíveis do que os arrays. Em primeiro lugar, eles são redimensionáveis : você pode adicionar qualquer número de elementos a uma coleção. Uma coleção tratará automaticamente a exclusão de um elemento de qualquer posição. O segundo ponto é que as coleções fornecem um rico conjunto de métodos que já estão implementados para você.
* Existem vários tipos de coleções com diferentes estruturas de armazenamento interno. Você pode escolher um tipo de coleção que melhor corresponda ao seu problema, de modo que suas operações mais frequentes sejam convenientes e eficientes.
```
Na verdade, coleções são representações de diferentes estruturas de dados e tipos de dados abstratos da Ciência da Computação. É bom entender a relação entre eles e as coleções em Java. Isso o ajudará a programar entrevistas e a trabalhar para selecionar uma coleção apropriada.
```
#### Características das coleções
* Existem vários recursos específicos de coleções em Java:
  1. Eles são representados por diferentes classes da Java Standard Library.
  2. Todas as coleções modernas são tipos genéricos, enquanto as coleções antigas são não genéricas . Vamos nos concentrar apenas em novas coleções. Como genéricos regulares, eles podem armazenar qualquer tipo de referência, incluindo classes definidas por você (como ```Person``` ou outra coisa).
  3. As coleções podem ser mutáveis (possível adicionar e remover elementos) e imutáveis (impossível fazer isso).
* Além das coleções padrão, há várias bibliotecas externas com coleções. Uma dessas bibliotecas é a Guava Collections, que foi desenvolvida pelo Google. Ele pode ser usado se as coleções padrão não forem suficientes para resolver seus problemas.
#### O exemplo de coleção mais simples
* Há um exemplo de uma coleção simples chamada ```ArrayList```. Para utilizá-lo, faça a seguinte importação:
```
java.util.ArrayList;
```
* Ele funciona de maneira semelhante a um array regular, mas você não precisa redimensioná-lo manualmente para adicionar e remover elementos.
```java 
ArrayList<String> list = new ArrayList<>();

list.add("first");
list.add("second");
list.add("third");

System.out.println(list); // [first, second, third]

System.out.println(list.get(0)); // first
System.out.println(list.get(1)); // second
System.out.println(list.get(2)); // third

list.remove("first");

System.out.println(list); // [second, third]

System.out.println(list.size()); // 2
```
```
Observe, neste exemplo, usamos o getmétodo para acessar um elemento por seu índice. Ao contrário dos arrays, as coleções não têm o []operador.
```
* Esperamos que isso seja o suficiente para o primeiro contato com as coleções. Em outros tópicos, você aprenderá diferentes tipos de coleções com mais detalhes. Agora, a principal coisa a entender é que usar coleções não é mais difícil do que usar um array regular.
```
Todas as coleções modernas são genéricas, portanto, você pode especificar
qualquer tipo de referência como um parâmetro genérico e armazená-lo em uma
coleção. Mas há uma restrição, as coleções não pode armazenar valores primitivos
em tudo ( int, long, char, doublee assim por diante). Você deve usar uma das
classes de mensagens publicitárias ( Integer, Long, Character, Doubleou outra)
em seu lugar.
```
### ArrayList
#### Arrays redimensionáveis
* Uma das classes mais amplamente usadas da Java Class Library é uma classe chamada ```ArrayList``` que representa uma matriz redimensionável de objetos de um tipo especificado. Ao contrário do array padrão denotado como ```[]```, ele pode crescer dinamicamente após a adição e encolher após a remoção de seus elementos. Esse comportamento é muito útil se você não souber o tamanho do array com antecedência ou se precisar de um que possa alterar os tamanhos durante a vida útil de um programa.
* Na verdade, essa classe é construída sobre um array Java padrão, estendendo-o com um conjunto de operações convenientes. Como um array padrão, permite obter o número atual de elementos (seu tamanho) bem como acessar seus elementos por meio de seus índices.
* Existe apenas uma restrição: por ```ArrayList``` ser uma classe genérica, não pode armazenar tipos primitivos. No entanto, ele pode armazenar qualquer tipo de referência, incluindo ```String```'s, classes de wrapper (como ```Integer```' s), other ```ArrayList```'s e classes personalizadas.
#### Criação de uma instância de ArrayList
* Para começar a usar a classe por seu nome abreviado, faça a seguinte importação:
```java 
import java.util.ArrayList;
```
* Vamos considerar várias maneiras de criar instâncias desta classe.
1) A maneira mais simples é usar um construtor sem argumento:
```java 
ArrayList<String> list = new ArrayList<>();
```
* A lista criada está vazia, mas sua capacidade inicial é 10 (por padrão).
2) Também podemos especificar a capacidade inicial do mesmo:
```java 
ArrayList<String> list = new ArrayList<>(50);
```
* Esta lista está vazia, mas sua capacidade inicial está definida para 50.
* 3) Ou você pode construir um ArrayListque consiste em elementos de outra lista:
```java 
ArrayList<String> list = new ArrayList<>(anotherList);
```
* Independentemente de como você cria uma instância de ```ArrayList```, seu tamanho mudará dinamicamente. Nesta lição, criaremos uma lista com a capacidade padrão como no primeiro exemplo.
```
Se você é um usuário avançado, sabe que é melhor criar e usar um ArrayList por
meio de sua Listinterface. Faremos isso nas próximas lições, após aprender
a herança . Acreditamos que a abordagem atual é suficiente por enquanto, uma
vez que requer menos conhecimento para começar a usar coleções dinâmicas.
```
#### Metodos basicos
* A coleção possui um conjunto de métodos convenientes que emulam e estendem a funcionalidade de matrizes padrão. Vamos discutir o que são. Primeiro, vamos inicializar alguma coleção:
```java 
ArrayList<String> names = new ArrayList<>(); // empty collection of strings
```
* Em primeiro lugar, existe um método para determinar o tamanho da coleção ```size``` que retorna o número de elementos da lista. Vamos tentar aprender o tamanho do nosso:
```java 
System.out.println(names.size()); // 0
```
* Como esperado, ele está vazio e o resultado é zero. Também podemos querer aprender o valor da posição especificada do objeto. Para isso, as coleções possuem ```get(int index)``` método que retorna o objeto da lista que está presente no índice especificado.
* A seguir, existem vários métodos para adicionar elementos e definir valores de uma coleção:
  * ```add(Object o)``` adiciona um elemento passado à última posição da coleção;
  * ```add(int index, Object o)``` adiciona um elemento passado à posição especificada da coleção;
  * ```set(int index, Object o)``` substitui o elemento presente no índice especificado pelo objeto;
* Vamos adicionar alguns nomes à nossa coleção:
```java 
names.add("Justin");      // [Justin]
names.add("Helen");       // [Justin, Helen]
names.add(1, "Joshua");   // [Justin, Joshua, Helen]
names.add(0, "Laura");    // [Laura, Justin, Joshua, Helen]
```
* E substitua um nome por outro:
```java 
names.set(3, "Marie"); // now: [Laura, Justin, Joshua, Marie]
```
* Podemos verificar se tudo está conforme o esperado:
```java 
System.out.println(names);        // [Laura, Justin, Joshua, Marie]
System.out.println(names.size()); // 4
System.out.println(names.get(0)); // the first element is "Laura"
System.out.println(names.get(3)); // the last element is "Marie"
```
* Finalmente, existem métodos para remover elementos da coleção:
  * ```remove(Object o)``` remove a primeira ocorrência do elemento especificado desta lista, se estiver presente;
  * ```remove(int index)``` remove o elemento na posição especificada nesta lista;
  * ```clear()``` remove todos os elementos da coleção.
* Vamos tentar remover elementos por valor e índice:
```java 
names.remove("Justin"); // [Laura, Joshua, Marie]
names.remove(1);        // [Laura, Marie]
names.clear();          // []
```
```
Importante: índices de elementos começam com 0, assim como para matrizes padrão
```
* Tente brincar com este código sozinho e aproveite o poder dele ArrayList.
#### Mais métodos ArrayList
* Ilustramos as possibilidades de métodos básicos para coleções em Java aplicadas a um ```ArrayList``` objeto. Mas esta classe tem mais alguns métodos próprios. Primeiro, vamos criar outro ```ArrayList```:
```java 
/* an ArrayList of Integers, not ints */
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(1);
```
* Também existe um ```addAll(Collection c)``` método para adicionar toda a coleção a um ```ArrayList```. Ele anexa elementos da coleção fornecida ao final da lista:
```java 
ArrayList<Integer> numbers2 = new ArrayList<>();    // creating another list of Integers
numbers2.add(100);
numbers2.addAll(numbers); // [100, 1, 2, 3, 1]
```
* A classe também possui um método chamado ```contains``` que verifica se uma lista contém um valor ou não, e dois métodos e que encontram o índice da primeira e da última ocorrência de um elemento, respectivamente. Eles retornam se não houver tal índice. ```indexOf``` ```lastIndexOf``` ```-1```
* Vamos ver:
```java 
System.out.println(numbers.contains(2));    // true
System.out.println(numbers.contains(4));    // false
System.out.println(numbers.indexOf(1));     // 0
System.out.println(numbers.lastIndexOf(1)); // 3
System.out.println(numbers.lastIndexOf(4)); // -1
```
* Como você pode ver, essa classe fornece um rico conjunto de métodos para trabalhar com elementos. Você não precisa escrevê-los sozinho, como faz com os arrays padrão.
#### Iterando sobre ArrayList
* É possível iterar sobre os elementos de uma instância da classe. Isso é feito da mesma maneira que iterar em um array. No exemplo a seguir, usamos os loops for e for-each para adicionar as cinco primeiras potências de dez em uma lista e, em seguida, imprimir os números na saída padrão.
```java 
ArrayList<Long> powersOfTen = new ArrayList<>();

int count = 5;
for (int i = 0; i < count; i++) {
    long power = (long) Math.pow(10, i);
    powersOfTen.add(power);
}

for (Long value : powersOfTen) {
    System.out.print(value + " ");
}
```
* O código imprime o seguinte:
```java 
1 10 100 1000 10000 
```
* Não é mais difícil do que usar uma matriz padrão.
#### <hr>
### Hashing: visão geral
* Hashing é uma técnica amplamente usada em programação. Quer envie uma mensagem pela Internet, faça login em um site ou pesquise um arquivo em seu computador, você está usando funções hash ! Mas o que são e o que fazem?
#### O que é hashing?
* Formalmente, funções hash são funções que podemos usar para mapear dados de tamanho arbitrário para valores de tamanho fixo. Isso é muito vago, então vamos dar uma olhada em uma comparação da vida real para entendê-los melhor:
* Imagine que você tem um amigo Paul que mantém uma lista telefônica. Seu amigo é preguiçoso e não quer perder muito tempo escrevendo o nome completo de seus contatos. Então, em vez disso, Paulo escreve apenas as consoantes em seus nomes. Por exemplo, em vez de John Smith, Paul escreve Jhn Smth. Em alguns aspectos, esse processo é semelhante ao <strong>hash</strong>. Podemos considerar que "remover todas as vogais" é a <strong>função hash</strong>. Chamamos o resultado da aplicação de uma função hash a alguma entrada de <strong>valor hash</strong> ou simplesmente seu <strong>hash</strong>. Em nosso caso, Jhn Smth é o valor hash de John Smith. Agora, nem todos os valores de hash serão distintos: pense em duas pessoas com nomes Tim Black e Tom Black . O valor hash para ambos os nomes será Tm Blck. Quando isso acontece, chamamos de <strong>colisão</strong>.
* A principal diferença entre nosso exemplo e uma função hash real é que, em nosso caso, os valores hash <strong>não têm um tamanho fixo</strong>. Um exemplo mais preciso seria se Paulo escreveu as primeiras 5 letras em seus nomes. O valor de hash para John Smith seria John S , para Tim Black seria Tim Bl , e para Tim Blacksmith, seria Tim Bl também. Existem mais nomes do que formas possíveis de escrever 5 letras, por isso temos a garantia de colisões. A mesma coisa também é verdadeira para funções hash. Eles recebem dados que podem ser muito grandes e retornam algo de tamanho fixo, então não há como evitar completamente as colisões!
#### Aplicações de funções hash
* Como mencionamos no início, as funções hash têm muitas aplicações. Vejamos alguns dos mais importantes:
* <strong>Resumos de mensagens</strong>: digamos que você tenha uma mensagem que deseja enviar a um amigo pela Internet, mas tem medo de que alguém altere seu conteúdo antes que ela chegue a seu amigo. Uma das coisas que você pode fazer é calcular um valor hash para sua mensagem antes de enviá-la. Quando seus amigos a recebem, eles calculam o valor hash da mensagem usando a mesma função hash que você. Você pode então comparar os dois hashes e verificar se eles são iguais. As funções hash usadas para isso têm a propriedade de ser difícil encontrar colisões. Essas funções hash são chamadas de <strong>função hash criptográfica</strong>. Eles também podem ter outras propriedades, como a do exemplo a seguir.
* <strong>Armazenamento de senha</strong>: você já se perguntou por que os sites não têm a opção de enviar sua senha caso você a esqueça, e eles fazem você redefini-la? Para poder enviá-lo de volta, eles precisam armazená-lo em texto simples. Ao fazer isso, se alguém obtiver acesso ao banco de dados de senhas, poderá facilmente roubar todas as contas! O que os sites fazem é armazenar um hash de sua senha. Quando você envia a senha de login, eles calculam seu hash e verificam se é igual ao que armazenaram. Nesse caso, encontrar colisões não é um grande problema. Aqui, você precisa saber que, se alguém encontrar o hash da sua senha, não será possível descobrir sua senha por meio dele.
* <strong>Tabelas de hash</strong>: um uso mais comum na programação diária são as tabelas de hash. Eles são estruturas de dados rápidas e convenientes que usam hash. Com eles, você pode pesquisar, inserir ou remover elementos de uma tabela. A ideia principal por trás deles é que você deseja usar valores hash para indexar dados em um array. Por exemplo, se você deseja usar uma tabela hash para armazenar uma lista telefônica, pode salvar o par ( Tim Black, 0123456789) no índice Tm Blck. Então, para encontrar o número do telefone de Tim, basta pesquisar no índice Tm Blck. Depois disso, você também pode salvar (Tom Black , 9876543210)no mesmo índice e, sempre que precisar encontrar o número de telefone de Tim ou Tom, você só precisa pesquisar entre dois pares, ao invés de toda a lista telefônica. As funções de hash usadas em tabelas de hash são menos restritivas do que aquelas usadas para resumos de mensagens e armazenamento de senha, e seus valores de hash são, geralmente, números. Veremos mais detalhadamente as tabelas de hash nos tópicos a seguir.
#### <hr>
### Função Hash
#### Introdução
* Em teoria, uma função hash é qualquer função que pode assumir qualquer valor grande e gerar um valor de tamanho fixo. No entanto, nem todas as funções com essa propriedade são úteis, pois diferentes casos de uso precisam de propriedades diferentes. Para entendê-lo melhor, veremos agora algumas propriedades gerais das funções hash e alguns exemplos delas.
#### Definindo uma boa função hash
* Qual é a diferença entre qualquer função hash e uma boa? Para definir uma boa função hash, precisamos aprender três de suas propriedades: eficiente, determinística e uniforme.
* Uma função hash <strong>eficiente</strong> deve calcular o valor do hash em tempo constante: O (1) no tamanho da entrada. Digamos que você tenha uma variedade de "n" inteiros. Então, uma boa função hash levaria tempo O (n), pois n é o tamanho da entrada, e seria capaz de calcular hashes para n > 100.000.000 em menos de um segundo. Agora, digamos que outra função hash leve tempo O (n ^ 2). Então, ele mal conseguia calcular hashes para n ~ 10.000 em um segundo.
* Se duas entradas são iguais, elas devem ter o mesmo valor de hash, é por isso que precisamos que uma função de hash seja <strong>determinística</strong>. Há duas coisas a serem lembradas aqui:
  * Primeiro, determinístico significa que a função não pode ser aleatória. Por exemplo, a função que retorna 0 ou 1 aleatoriamente, independentemente da entrada, é uma função hash, mas não determinística.
  * Em segundo lugar, imagine que você tem duas variáveis distintas, ambas com o mesmo valor, digamos 7. Para um computador, elas ocupam pontos diferentes na memória, então são diferentes, mas essas variáveis ​​são iguais se os valores forem comparados. Nesse caso, queremos que a função hash retorne o mesmo valor. Um exemplo de função hash que não faz isso é a função que retorna o endereço do valor na memória.
* Como você já sabe, a terceira propriedade é uniforme: os valores de hash são distribuídos uniformemente. Isso significa que as entradas devem ser mapeadas igualmente entre os valores de hash possíveis. Outra forma de colocar isso: se agruparmos as entradas possíveis por seu valor de hash, queremos que os grupos tenham tamanhos próximos uns dos outros.
* Essas são as propriedades gerais que qualquer função hash deve ter. Vejamos alguns dos mais comuns para ver como funcionam.
#### Funções de hash padrão
* Para usar funções hash, precisamos primeiro aprender a notação. As funções de hash são geralmente denotadas por h. O valor hash para um objeto específico x é denotado por h (x). As funções de hash usadas na programação do dia-a-dia geralmente pegam um tipo de valor e retornam inteiros. Eles são usados em tabelas hash e têm todas as três propriedades que discutimos acima. Estes são alguns dos hashes mais fáceis e mais comumente usados:
* Inteiros: usamos a função de identidade, que sempre retorna o valor que é fornecido:h (x) = x, ou o módulo: h (x) = x  %p, para algum número p(geralmente um primo). O modulo x  %p retorna o resto ao dividir x por p. Vamos ver como eles funcionam para algum número aleatório, digamos 10. A identidade sempre retornará o número fornecido, então temos h (10) = 10. Para o módulo, se escolhermos p = 7, então nós temos h (10) = 10  %7 = 3. Se escolhermos p = 10, então nós temos h (10) = 10  %10 = 0.
* Matrizes inteiras: digamos que a matriz tenha a forma [v1, v2, ..., vn].
* ...
* valor Hash:
  * x: último valor
  x mod p + x
#### Funções criptográficas de hash
* Os hashes criptográficos são feitos para funcionar com qualquer entrada de qualquer comprimento e tipo, considerando-a como uma sequência de bits: 1's e 0's. Eles também geram uma sequência de bits, mas de comprimento fixo. O computador pode funcionar muito bem com ele, mas para nós é muito difícil "ver" se não o formatarmos de forma clara. Normalmente, existem algumas centenas de bits na saída, então o que fazemos é considerá-lo como um grande número na base 2, convertê-lo na base 16 e escrevê-lo como uma string.
* Os hashes criptográficos ainda respeitam as propriedades acima, mas são mais complexos. Eles têm menos casos de uso, mas são extremamente importantes na segurança. Vamos ver de quais propriedades eles precisam:
  * Imagine que uma empresa armazene uma tabela de pares de nome de usuário e senha para um site que você usa. Se essa tabela vazar, qualquer pessoa poderá ver sua senha. Então, o que eles fazem é salvar o hash da sua senha. Sempre que você envia sua senha, eles calculam o hash e verificam se é igual ao salvo. Agora, se a tabela vazar, um invasor deve encontrar uma senha que tenha o mesmo valor de hash da sua senha para poder fazer login como você. Portanto, a função hash deve tornar muito difícil para um invasor encontrar essa senha. Essa função é chamada de resistente à pré-imagem : dado um valor hashhh, é difícil encontrar uma mensagemmm com hash (m) = h.
  * Uma das maneiras de garantir que uma mensagem não foi alterada é enviando o hash da mensagem junto com a própria mensagem. Suponha que um invasor queira alterar a mensagem, mas não pode alterar o hash. Em seguida, ele precisa encontrar uma mensagem diferente com hash para o mesmo valor. Mesmo que a nova mensagem não faça sentido, ela pode afetar a comunicação de algumas maneiras. Uma função hash que não permite é chamada de segunda pré-imagem resistente ou resistente a colisão fraca : dada uma mensagem m1 é difícil encontrar uma mensagem diferente m2 com hash (m1) = hash (m2).
  * Em alguns casos de uso muito específicos, localizar qualquer par de mensagens com o mesmo hash pode resultar em problemas. Uma função hash que não permite é chamada de resistente à colisão ou resistente à colisão forte : é difícil encontrar qualquer mensagem m1, m2 de tal modo que hash (m1) = hash (m2).
* Quando dizemos que é difícil encontrar algum valor, isso significa que encontrar um valor com as propriedades necessárias levaria anos , mesmo com os supercomputadores mais poderosos. Se você acha que é difícil conseguir essas propriedades, você está certo! Nem todos podem criar tal função. Felizmente, existem alguns padrões que são amplamente usados hoje. Suas implementações são complicadas, por isso não entraremos em detalhes.
* Primeiro, vamos dar uma olhada no MD5 . Foi criado em 1992 como uma alternativa melhor ao seu antecessor, MD4. Ele recebe qualquer entrada e produz um valor hash de 128 bits. Inicialmente, acreditava-se que fosse resistente a colisões, mas em 2004 ficou provado que não. Demorou 12 anos e muita pesquisa para descobrir isso, então é melhor ficar com os hashes existentes do que tentar criar novos!
* Outra função hash criptográfica, mais segura, é SHA256 . Sua saída é de 256 bits e é usada em muitos lugares, sendo um deles a prova de trabalho do Bitcoin . Vamos dar uma olhada em alguns exemplos e ver o que pequenas mudanças na entrada fazem ao valor de hash:
* ...
* Mesmo pequenas mudanças produzem grandes diferenças! Isso é consequência da resistência à colisão e da pré-imagem.
* Valor Hash
  * Para deixar claro, vamos ver como calculamos o valor de hash para a matriz [1, 2, 3, 4] usando p = 5:
    * h0 = 0
    * h1 = h0 * p + v1 = 0 * 5 + 1 = 1
    * h2 = h1 * p + v2 = 1 * 5 + 2 = 7
    * h3 = h2 * p + v3 = 7 * 5 + 3 = 38
    * h4 = h3 * p + v4 = 38 * 5 + 4 = <strong>194</strong>
#### <hr>
### Tabelas hash
#### Introduçao
* Vamos imaginar o seguinte cenário: você tem muitos amigos e uma grande estante cheia de livros. Alguns de seus amigos querem seus livros emprestados, alguns querem devolvê-los e alguns querem saber se você tem um determinado livro. Então, você deseja escrever um programa que permite adicionar livros, remover livros e verificar se um livro está disponível. Para este cenário, qual seria a melhor estrutura de dados a ser usada?
* As tabelas de hash são estruturas que nos permitem inserir e remover valores e verificar se um valor está presente no tempo O (1) para cada uma dessas operações. Tabelas de hash sozinhas não podem garantir esse tempo. Porém, emparelhado com uma boa função hash, tudo funciona bem, tornando-se uma das melhores estruturas de dados para esse fim.  
#### Tabelas hash
* As tabelas de hash são matrizes em que cada entrada é um depósito . Os intervalos podem conter 0 ou mais valores de um tipo. Eles são identificados por seu índice na matriz. Se quisermos inserir um valor na tabela hash, calculamos seu valor hash e o inserimos no balde com um índice igual ao valor hash (módulo do tamanho da matriz se o valor hash for muito grande). Você pode fazer o mesmo para remover um objeto ou procurá-lo.
* Vejamos um exemplo agora. Digamos que temos uma tabela hash com 5 depósitos e estamos inserindo inteiros {1, 3, 5, 6} com a função hash de identidade. A tabela é parecida com esta:
<table align="center" border="1" cellpadding="1" cellspacing="1">
	<tbody>
		<tr>
			<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Índice</font></font></th>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">0</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">1</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">3</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">4</font></font></td>
		</tr>
		<tr>
			<th><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Valores</font></font></th>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{5}</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{1, 6}</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{}</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{3}</font></font></td>
			<td style="text-align: center;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{}</font></font></td>
		</tr>
	</tbody>
</table>

* Agora vamos descobrir como funciona. Como estamos usando a função de identidade, o valor do hash é igual ao próprio valor. Por causa disso, você pode ver que 1 e 3 estão em intervalos nos índices 1 e 3, respectivamente. Agora, 5 e 6 têm valores de hash 5 e 6, mas há poucos baldes! Para encontrar um intervalo para eles, pegamos o módulo do valor do hash pelo número total de intervalos, neste caso, 5. Portanto, 5 módulo 5 é 0 e 6 módulo 5 é 1, e você pode ver na tabela que os valores são colocados nos baldes corretos.
* Existem dois tipos de tabelas de hash. O que está acima é chamado de conjunto hash . Eles podem ser usados ​​em cenários onde precisamos apenas verificar se um valor está presente, por exemplo, o cenário do livro na introdução. Ainda podemos adicionar ou remover elementos, mas, na maioria dos casos, não estamos interessados ​​em obter um valor de um conjunto hash, uma vez que já temos um valor igual que precisamos para poder pesquisar uma tabela hash. As implementações de conjuntos de hash são unordered_set em C ++ e HashSet em Java.
* Outro tipo de tabela hash é um mapa hash . Imagine que você deseja manter uma lista telefônica com nomes e números de amigos e deseja pesquisar números de telefone usando o nome de um amigo. Se você mantiver um conjunto hash dos pares nome-número, precisará saber o número para poder pesquisar. Aqui, os mapas hash podem ajudá-lo. Eles são muito semelhantes aos conjuntos de hash, mas armazenam pares. A primeira entrada do par é chamada de chave e a segunda é o valor . Apenas o hash da chave é usado e, ao pesquisar, procuramos o valor associado a uma chave. No exemplo acima, as chaves seriam os nomes e os valores seriam os números de telefone. As implementações de mapas hash são unordered_map em C ++ e HashMap em Java.
#### Fator de carga
* Ter baldes enormes é sempre uma má notícia! Imagine uma tabela hash com um balde e um grande número de elementos. Então, toda vez que queremos fazer algo, temos que pesquisar em todo o balde para encontrar os elementos de que precisamos. É a mesma coisa que colocar todos os elementos em um array sem qualquer ordem! Se permitíssemos que isso acontecesse, de que adiantaria usar uma tabela hash?
* Agora, pense em um exemplo mais comum: uma tabela hash com 100 depósitos e 200 valores. Uma função hash ideal distribuiria os valores uniformemente e teríamos 2 valores em cada intervalo. Então, sempre que verificamos um valor, temos que verificar a igualdade com os dois valores no intervalo correspondente. Isso não é ruim, mas, idealmente, os baldes devem ter 1 ou 0 elementos. Nem sempre podemos garantir isso, mas podemos melhorar o número médio se, por exemplo, tivermos mais baldes do que elementos. Para isso, temos que introduzir o fator de carga.
* O fator de carga de uma tabela hash é um número realeueuentre 0 e 1 que nos informa o quão cheia está a tabela hash. Podemos calculá-lo a qualquer momento com esta fórmula:
eu = #elements / #buckets
* A maioria das tabelas de hash tem um fator de carga máximo alfa, um número constante entre 0 e 1 que é um limite superior para o fator de carga. Depois de inserir um novo valor na tabela de hash, calculamos o novo fator de carga eu. Se eu > alfa. Em seguida, aumentamos o número de baldes na tabela hash, geralmente criando um novo array com o dobro de baldes e inserindo nele todos os valores do antigo. Observe que temos que recalcular os índices de todos os elementos, pois seus índices são baseados em valores de hash e no número total de intervalos. Um valor comum para o fator de carga máximo é 0,75, o que nos ajuda a garantir que haja baldes suficientes, sem desperdiçar muita memória em baldes vazios.
* Esta imagem ilustra que quanto mais vazio o balde, melhor é para o desempenho da tabela hash. O fator de carga nos ajuda a manter as caçambas o mais próximo possível do vazio. Um fator de carga muito baixo, no entanto, também pode ser um mau sinal, pois significa que usamos muita memória desnecessária para armazenar baldes vazios.]
#### Por que as tabelas de hash são tão rápidas?
* Anteriormente, mencionamos que as tabelas de hash levam O (1) para inserir, remover ou pesquisar um valor ao usar uma boa função hash. Vamos ver porque isso é verdade!
* Para todas essas operações, a tabela hash tem que fazer exatamente 2 coisas: calcular o valor hash e pesquisar em apenas um depósito pelo valor inicial. Uma boa função hash é eficiente , por isso leva O (1)para calcular o valor de hash e é determinístico , portanto, o valor de hash será o mesmo para quaisquer valores iguais, o que significa que pesquisaremos o intervalo correto. Em seguida, uma boa função hash é uniforme , portanto, não haverá alguns baldes muito grandes, enquanto outros estão vazios ou quase vazios. Isso, junto com o fator de carga que explicamos acima, certifique-se de que, em média, haja menos de um elemento em um balde. Então, pesquisar o balde leva tempo O (1). Finalmente, podemos implementar baldes para que a inserção e exclusão deles também leveO (1)O ( 1 ), por exemplo, usando listas vinculadas. Então, se estivermos usando uma boa função hash, todas as operações em uma tabela hash levarão O (1).
#### Resumo
* As tabelas de hash são estruturas de dados que suportam a inserção e remoção rápida de valores e a verificação da presença de um valor.
* As tabelas de hash consistem em depósitos contendo um, vários ou zero valores.
* As funções hash são usadas para determinar um depósito para um valor.
* Hash define objetos de armazenamento com base em seus valores de hash; os mapas de hash armazenam pares de valores-chave com base nos valores de hash das chaves.
* O fator de carga é normalmente usado para determinar quando redimensionar a tabela hash para mantê-la rápida.
#### <hr>
### Modificador protected
<img alt="" height="345" src="https://ucarecdn.com/5c6eeffe-edba-4125-a9a5-13bc0dab2767/" width="789">

* Como você deve se lembrar, um modificador de acesso descreve quem pode usar seu código. Existem 4 deles em Java:
  * ```private```: disponível apenas para a própria classe;
  * ```default```: disponível para classes do mesmo pacote (= pacote-privado );
  * ```protected```: disponível para classes do mesmo pacote e para as classes extensivas.
  * ```public```: disponível em qualquer lugar;
* Já consideramos a maioria deles, mas ainda há um mais interessante: o ```protected``` modificador de acesso. Vamos colocá-lo entre os modificadores que você já conhece:
* Este modificador significa que apenas as subclasses e quaisquer classes do mesmo pacote podem usar um membro da classe. Uma classe de nível superior não pode ser protegida, mas uma classe interna pode ser declarada dessa forma. É aqui que entra a importância de uma decomposição adequada do pacote.
* Agora vamos definir a diferença entre ```protected``` e seus vizinhos de escala, ```private``` e " package-private " (padrão).
#### Comparando modificadores protegidos e outros
* Protegido versus padrão. Você pode pensar em classes do mesmo pacote como vizinhos e subclasses como filhos de uma classe específica. Existem algumas coisas que você pode compartilhar ou fazer com seus vizinhos, por exemplo, discutir um plano de reparos no prédio ou compartilhar o porão. Essas coisas e ações seriam privadas do pacote (padrão).
* Também há coisas que você pode fazer pelas crianças e amigos íntimos, como pedir dinheiro emprestado ou dar um passeio no parque no domingo. Essas coisas serão ```protected```.
* ```Protegido x privado``` . Essa distinção é ainda mais fácil: se uma variável, um método ou uma classe interna é usada apenas pela própria classe, então é ```private```, caso contrário, é ```protected```. Seguindo a regra principal:
```
Use o nível de acesso mais restritivo que faz sentido para um determinado membro.
```
* Se você não tiver certeza se o método é útil para outras classes, é melhor primeiro torná-lo privado e expandir sua disponibilidade posteriormente, se necessário.
### Exemplo
* No exemplo abaixo, o pacote ```org.hyperskill.bluetooth``` tem três classes: ```Laptop```, ```SmartPhone```, e ```SmartWatch```. Todos os gadgets do pacote podem ser conectados via Bluetooth. ```Laptop``` tem um método ```receiveInfo()```, responsável por obter qualquer informação dos gadgets conectados.
```java 
package org.hyperskill.bluetooth;

public class Laptop {

    private String info;

    void receiveInfo(String info) {
        this.info = info;
    }

}
```
* A ```Laptop``` classe tem apenas um único campo ```info``` que não pode ser acessado diretamente, pois é declarado como privado. Mas todas as classes do mesmo pacote podem acessá-lo invocando o ```receiveInfo``` método que é declarado como pacote privado (sem modificador).
* Consideramos que as classes ```SmartPhone``` e ```SmartWatch``` estendem a mesma ```MobileGadget``` classe com o ```printNotification``` método:
```java 
package org.hyperskill.bluetooth;

public class MobileGadget {

    protected void printNotification(String data) {
        System.out.println(data);
    }
}
```
* O ```printNotification``` método é acessível para todas as subclasses desta classe, bem como para todas as classes no mesmo pacote (incluindo a ```Laptop``` classe).
* A ```SmartPhone``` classe pode acessar o ```receiveInfo``` método da ```Laptop``` classe e o ```printNotification``` método da ```MobileGadget``` classe.
```java 
package org.hyperskill.bluetooth;

public class SmartPhone extends MobileGadget {

    private Laptop connectedLaptop;

    public SmartPhone() {
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
```
* A ```SmartWatch``` classe tem um método privado ```countHeartRate```, que não está disponível em outras classes (mesmo em uma classe “irmã” ```SmartPhone```). Ele também usa o ```Laptop``` método do para receber dados e o método dos pais para imprimir a notificação:
```java 
package org.hyperskill.bluetooth;

public class SmartWatch extends MobileGadget {

    private int avgHeartRate;
    private Laptop connectedLaptop;

    public SmartWatch() {
        this.avgHeartRate = 75;
        this.connectedLaptop = new Laptop();
    }

    private int countHeartRate() {
        System.out.println("Counting heart rate");
        return avgHeartRate;
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
```
* Esperamos que você entenda todos os modificadores claramente agora!
* O exemplo de código completo está disponível no GitHub <https://github.com/hyperskill/hs-java-samples/tree/master/src/main/java/org/hyperskill/samples/oop/protectedmodifier>. Tem uma estrutura de embalagem ligeiramente diferente que se aproxima de um projeto real. Você pode navegar na interface da web do GitHub. Você pode copiar este código e tentar alterá-lo para entender melhor o exemplo.
#### <hr>
### Classe Object
#### A classe raiz em Java
* A Java Standard Library tem uma classe chamada ```Object``` que é o pai padrão de todas as classes padrão e suas classes personalizadas. Cada classe estende esta implicitamente, portanto, é uma raiz de herança em programas Java. A classe pertence ao ```java.lang``` pacote importado por padrão.
* Vamos criar uma instância do ```Object```.
```
Object anObject = new Object();
```
* A ```Object``` classe pode se referir a uma instância de qualquer classe porque qualquer instância é um tipo de ```Object``` ( upcasting ).
```java 
Long number = 1_000_000L;
Object obj1 = number; // an instance of Long can be cast to Object

String str = "str";
Object obj2 = str; // the same with the instance of String
```
* Quando declaramos uma classe, podemos estender a ```Object``` classe explicitamente . No entanto, não adianta, uma vez que a extensão já é feita implicitamente. Aconselhamos você a evitar redundância em seu código, mas aqui está um exemplo, apenas no caso:
```java 
class A extends Object { }
```
* Em suas próprias soluções, basta escrever ```class A { }```.
#### Métodos fornecidos pela classe Object
* A ```Object``` classe fornece alguns métodos comuns a todas as subclasses. Possui nove métodos de instância (excluindo métodos sobrecarregados) que podem ser divididos em quatro grupos:
  * tópicos de sincronização : ```wait```, ```notify```, ```notifyAll```;
  * identidade do objeto : ```hashCode```,```equals```;
  * gerenciamento de objetos : ```finalize```, ```clone```, ```getClass```;
  * representação legível : ```toString```;
* Essa forma de agrupar métodos não é perfeita, mas pode ajudá-lo a se lembrar deles. Aqui está uma explicação mais detalhada dos métodos:
  * O primeiro grupo de métodos (```wait```, ```notify```, ```notifyAll```) são para trabalhar em aplicações de vários segmentos.
  * ```hashCode``` retorna um valor de código hash para o objeto.
  * ```equals``` indica se algum outro objeto é "igual" a este específico.
  * ```finalize``` é chamado pelo coletor de lixo (GC) em um objeto quando o GC deseja limpá-lo. ( Observação: este método está obsoleto a partir do JDK 9).
  * ```clone```  cria e retorna uma cópia do objeto.
  * ```getClass``` retorna uma instância de ```Class```, que contém informações sobre a classe de tempo de execução.
  * toString Retorna uma representação de string do objeto.
* Alguns dos métodos listados acima são nativos, o que significa que são implementados no código nativo . Normalmente é escrito em C ou C ++. Os métodos nativos geralmente são usados para fazer interface com chamadas de sistema ou bibliotecas escritas em outras linguagens de programação.
* Nos tópicos a seguir, consideraremos esses métodos de classe com mais detalhes.
#### <hr>
### Visão geral do Framework Collections
* Java fornece a estrutura de coleções que consiste em classes e interfaces para estruturas de dados comumente reutilizáveis, como listas, matrizes dinâmicas, conjuntos e assim por diante. A estrutura tem uma arquitetura unificada para representar e manipular coleções, permitindo que as coleções sejam usadas independentemente dos detalhes de implementação por meio de suas interfaces.
* A estrutura inclui:
  * interfaces que representam diferentes tipos de coleções;
  * implementações primárias das interfaces;
  * implementações legadas de versões anteriores (conhecidas como "coleções antigas");
  * implementações de propósito especial (como coleções imutáveis);
  * algoritmos representados por métodos estáticos que realizam operações úteis em coleções.
* Neste tópico, consideraremos apenas as interfaces básicas do framework de coleções colocado no java.utilpacote.
#### Interfaces comumente usadas
* Existem duas interfaces raiz genéricas ```Collection<E>``` e ```Map<K,V>```, e algumas interfaces mais específicas para representar diferentes tipos de coleções.
* A interface ```Collection<E>``` representa uma coleção abstrata, que é um contêiner para objetos do mesmo tipo. Ele fornece alguns métodos comuns para todos os outros tipos de coleções.
* As interfaces ```List<E>```, ```Set<E>```, ```Queue<E>```, ```SortedSet<E>```, e ```Deque<E>``` representam diferentes tipos de coleções. Você não pode criar diretamente um objeto deles, pois são apenas interfaces. Mas cada um deles tem várias implementações. Por exemplo, a ```ArrayList``` classe, que representa uma matriz redimensionável, é uma representação primária da ```List<E>``` interface. Outras interfaces, bem como suas implementações, serão consideradas nos tópicos a seguir.
* Outra interface raiz é ```Map<K,V>``` que representa um mapa (ou dicionário) para armazenar pares de valores-chave onde ```K``` é o tipo de chaves e ```V``` é o tipo de valores armazenados . No mundo real, um bom exemplo de mapa é uma lista telefônica em que as chaves são os nomes de seus amigos e os valores são seus telefones. A ```Map<K,V>``` interface não é um subtipo da ```Collection``` interface, mas os mapas são frequentemente considerados como coleções, uma vez que fazem parte da estrutura de coleção e têm métodos semelhantes.
```
Observe que as interfaces Collection e Map não se estendem.
```
#### A interface Collection
* Aqui estão os métodos comuns fornecidos pela ```Collection``` interface.
  * ```int size()``` retorna o número de elementos nesta coleção;
  * ```boolean isEmpty()``` retorna ```true``` se esta coleção não contém elementos;
  * ```boolean contains(Object o)``` retorna ```true``` se esta coleção contém o elemento especificado;
  * ```boolean add(E e)``` adiciona um elemento à coleção. Retorna ```true```, se o elemento foi adicionado, senão retorna ```false```;
  * ```boolean remove(Object o)``` remove uma única instância do elemento especificado;
  * ```boolean removeAll(Collection<?> collection)``` remove os elementos desta coleção que também estão contidos na coleção especificada;
  * ```void clear()``` remove todos os elementos desta coleção.
* É possível referir-se a qualquer coleção particular por meio dessa interface base, pois, como você sabe, a superclasse pode ser usada para se referir a qualquer objeto de subclasse derivado dessa superclasse.
* Vamos criar uma ```languages``` coleção e adicionar três elementos a ela:
```java 
Collection<String> languages = new ArrayList<>();

languages.add("English");
languages.add("Deutsch");
languages.add("Français");

System.out.println(languages.size()); // 3
```
* Essa abordagem permite que você substitua a coleção concreta a qualquer momento, sem alterar o código que a usa. Ele também promove a reutilização de software, fornecendo uma interface padrão para coleções e algoritmos para manipulá-los. Pode parecer complicado agora, mas quanto mais você trabalhar com coleções, mais compreensível se tornará.
* É impossível obter um elemento por índice por meio da ```Collection``` interface porque é muito abstrato e não fornece tal método. Mas se não importa para você qual coleção particular usar, você pode trabalhar por meio desta interface.
```
É importante entender que a ordem dos elementos no ArrayListainda é preservada. Simplesmente não podemos chamar o getmétodo por meio da Collectioninterface.
```
* Cada coleção pode ser convertida em uma string usando ```toString``` e comparada com outra coleção usando o ```equals``` método. Esses métodos vêm ```Object``` e seu comportamento depende dos elementos armazenados na coleção e do tipo da coleção em si.
#### Collections mutáveis e imutáveis
* Todas as coleções podem ser divididas em dois grandes grupos: mutáveis e imutáveis. Ambos implementar a ```Collection<E>``` interface, mas coleções imutáveis vai jogar ```UnsupportedOperationException``` ao tentar invocar alguns métodos que eles mudam: por exemplo, ```add```, ```remove```, ```clear```.
* Nos próximos tópicos, consideraremos como criar e quando usar coleções imutáveis. Agora lembre-se de que eles estão presentes aqui.
#### Iterando sobre Collections
* Se desejar iterar sobre todos os elementos de qualquer coleção, você pode usar o loop de estilo para cada .Voltemos à nossa ```languages``` coleção:
```java 
for (String lang : languages) {
    System.out.println(lang);
}
```
* Este código imprime todos os elementos desta coleção.
``` 
English
Deutsch
Français
```
* A ordem dos elementos durante a iteração depende de um tipo de coleção particular que está realmente sendo usado.
* Se você já estiver familiarizado com referências de método ou expressões lambda, poderá usar outro estilo para iterações usando o ```forEach(Consumer<T> consumer)``` método:
```
languages.forEach(System.out::println); // with method reference
languages.forEach(elem -> System.out.println(elem)); // with lambda expression
```
* Parece muito legível, mas é opcional para uso.
#### Removendo elementos
* Também é possível remover elementos de uma coleção mutável (como ```ArrayList```).
```java 
languages.remove("Deutsch");

System.out.println(languages.size()); // 2
```
```
Observe removeque tanto o quanto os containsmétodos dependem do método equalsdos elementos. Se você armazenar classes não padrão na coleção, equals juntamente com hashCode deve ser substituído.
```
* Novamente, se você já estiver familiarizado com as expressões lambda, poderá invocar o ```removeIf``` método para remover todos os elementos que satisfazem o predicado fornecido:
```java 
languages.removeIf(lang -> lang.startsWith("E")); // it removes English

System.out.println(languages.size()); // 1
```
* Use da maneira que quiser.
#### Conclusão
* A estrutura de coleções Java fornece um conjunto de interfaces com métodos comuns para diferentes tipos de coleções. Consideramos a ```Collection<E>``` interface, que é um contêiner abstrato para armazenar valores do mesmo tipo. Qualquer coleção particular (excluindo mapas) pode ser usada por meio dela em um programa e pode ser iterada usando o loop for-each ou o ```forEach``` método.
#### <hr>
### A interface List
* Como você sabe, as listas são o tipo mais próximo de arrays, exceto que seu tamanho pode ser alterado dinamicamente enquanto o tamanho de um array é restrito. Além disso, as listas fornecem um comportamento mais avançado do que os arrays. Neste tópico, você aprofundará seu conhecimento sobre listas e sua relação com a Estrutura de coleções.
```
Uma lista é uma coleção ordenada de elementos. Isso significa que cada elemento tem uma posição na lista especificada por um índice inteiro, como em matrizes regulares.
```
#### A interface da lista
* A ```List<E>``` interface representa uma lista como um tipo de dados abstrato. Ele estende a ```Collection<E>``` interface adquirindo seus métodos e adiciona alguns novos métodos:
  * ```E set(int index, E element)``` substitui o elemento na posição especificada nesta lista pelo elemento especificado e retorna o elemento que foi substituído;
  * ```E get(int index)``` retorna o elemento na posição especificada na lista;
  * ```int indexOf(Object obj)``` retorna o índice da primeira ocorrência do elemento na lista ou -1se não houver tal índice;
  * ```int lastIndexOf(Object obj)``` retorna o índice da última ocorrência do elemento na lista ou -1se não houver tal índice;
  * ```List<E> subList(int fromIndex, int toIndex)``` retorna uma sublista desta lista de ```fromIndex``` incluída para ```toIndex``` excluída.
* Como você pode ver, os métodos presumem que uma lista é uma coleção ordenada.
* Você não pode criar uma instância da ```List``` interface, mas pode criar uma instância de uma de suas implementações: ```ArrayList``` ou ```LinkedList``` ou uma lista imutável e, em seguida, usá-la por meio da ```List``` interface comum . Você terá acesso a todos os métodos declarados em ambas ```List<E>``` e ```Collection<E>``` interfaces.
```
Trabalhar com listas por meio da List interface é considerado uma boa
prática em programação, pois seu código não dependerá dos mecanismos
internos de uma implementação específica.
```
#### Listas imutáveis
* A maneira mais simples de criar uma lista é invocar o ```of``` método da ```List``` interface.
```java 
List<String> emptyList = List.of(); // 0 elements
List<String> names = List.of("Larry", "Kenny", "Sabrina"); // 3 elements
List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);  // 8 elements
```
* Ele retorna uma lista imutável contendo todos os elementos passados ou uma lista vazia. Usar este método é conveniente ao criar constantes de lista ou testar algum código.
* Vamos realizar algumas operações:
```java 
List<String> daysOfWeek = List.of(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
);

System.out.println(daysOfWeek.size()); // 7
System.out.println(daysOfWeek.get(1)); // Tuesday
System.out.println(daysOfWeek.indexOf("Sunday")); // 6

List<String> weekDays = daysOfWeek.subList(0, 5);
System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]
```
* Por ser imutável, apenas os métodos que não alteram os elementos da lista funcionarão. Outros lançarão uma exceção.
```java 
daysOfWeek.set(0, "Funday"); // throws UnsupportedOperationException
daysOfWeek.add("Holiday");   // throws UnsupportedOperationException
```
* Essa situação demonstra claramente quando listas imutáveis são necessárias. É difícil imaginar que alguém renomeie um dia ou adicione outro!
```
Tenha cuidado ao trabalhar com listas imutáveis. Às vezes, até
desenvolvedores experientes conseguem UnsupportedOperationException.
```
* Antes do Java 9, outra maneira de criar listas não modificáveis era a seguinte:
```java 
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
```
* Para usá-lo, o pacote ```java.util.Arrays``` deve ser importado.
#### Listas mutáveis
* Quando você precisa usar uma lista mutável, pode escolher uma das duas implementações mutáveis comumente usadas da Listinterface.
* Um deles é familiar para você: a ```ArrayList<E>``` classe. Ele representa uma matriz redimensionável. Além de implementar a ```List``` interface, ele fornece métodos para manipular o tamanho do array usado internamente. Esses métodos não são necessários em programas com frequência, portanto, é melhor usar um objeto dessa classe por meio da ```List``` interface.
```java 
List<Integer> numbers = new ArrayList<>();

numbers.add(15);
numbers.add(10);
numbers.add(20);

System.out.println(numbers); // [15, 10, 20]

numbers.set(0, 30); // no exceptions here

System.out.println(numbers); // [30, 10, 20]
```
* Se você tiver uma lista imutável, poderá obter a versão mutável dela usando o seguinte código:
```java 
List<String> immutableList = Arrays.asList("one", "two", "three");
List<String> mutableList = new ArrayList<>(immutableList); 
```
* Outra implementação mutável da ```List``` interface é a ```LinkedList``` classe. Ele representa uma lista duplamente vinculada com base em nós conectados. Todas as operações que indexam na lista percorrerão a lista do início ou do final, o que estiver mais próximo do índice especificado.
```java 
List<Integer> numbers = new LinkedList<>();
        
numbers.add(10);
numbers.add(20);
numbers.add(30);

System.out.println(numbers); // [10, 20, 30]
```
* O acesso ao primeiro e ao último elemento da lista é sempre realizado em tempo constante ```O(1)``` porque os links são armazenados permanentemente no primeiro e no último elemento, portanto, adicionar um item ao final da lista não significa que você tenha que iterar o lista inteira em busca do último elemento. Mas acessar / definir um elemento por seu índice leva ```O(n)``` tempo para uma lista vinculada.
```
No caso geral, LinkedList perde para ArrayList o consumo de memória e velocidade das operações. Mas depende do problema que você está tentando resolver.
```
#### Iterando sobre uma lista
* Não há problemas para iterar os elementos de uma lista.
```java 
List<String> names = List.of("Larry", "Kenny", "Sabrina");
```
1) Usando o loop "para cada":
```java 
// print every name
for (String name : names) {
    System.out.println(name);
}
```
2) Usando índices e o ```size()``` método:
```java 
// print every second name
for (int i = 0; i < names.size(); i += 2) {
    System.out.println(names.get(i));
}
```
* Quando você precisar passar por todos os elementos de uma lista, recomendamos escolher a primeira maneira de iterar. A segunda maneira é boa quando você precisa pular alguns elementos com base em suas posições na lista.
#### Igualdade de lista
* A questão final é como as listas são comparadas. Duas listas são iguais quando contêm os mesmos elementos na mesma ordem. A igualdade não depende dos tipos dos próprios (listas ```ArrayList```, ```LinkedList``` ou outra coisa).
```java 
Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3));    // true
Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2));    // false
Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3, 1)); // false

List<Integer> numbers = new ArrayList<>();
        
numbers.add(1);
numbers.add(2);
numbers.add(3);

Objects.equals(numbers, List.of(1, 2, 3)); // true
```
* Com isso, concluímos nossa discussão sobre a ```List``` interface e os recursos comuns para todas as listas. Havia muita teoria. Se há algo que você ainda não entende, tente praticar e volte à teoria quando surgirem dúvidas.
#### <hr>
### A interface Set (Conjuntos)
* Quando você precisa manter apenas elementos únicos dentro de uma coleção, para se livrar de duplicatas em uma sequência, ou se você pretende realizar algumas operações matemáticas, você pode usar um Set.
```
Um Set é uma coleção de elementos únicos, como um Set matemático.
Um Set é significativamente diferente de uma matriz ou lista, pois é
impossível obter um elemento por seu índice.
```
* Neste tópico, consideraremos Set's mutáveis e imutáveis e suas diferenças. Todos os nossos exemplos usarão strings e números, uma vez que armazenar objetos de classes personalizadas como elementos possui alguns pontos significativos. Será considerado em outros tópicos.
#### A interface Set
* A estrutura de coleções fornece a ```Set<E>``` interface para representar um Set como um tipo de dados abstrato. Ele herda todos os métodos da ```Collection<E>``` interface, mas não adiciona nenhum novo. Os métodos mais utilizados incluem ```contains```, ```add```, ```addAll```, ```remove```, ```removeAll```, ```size```,e outros que já considerada no tópico anterior sobre a estrutura das coleções.
```
Os métodos add e addAll adicionam elementos ao Set apenas se esses
elementos ainda não estiverem no Set. Um Set sempre contém apenas
elementos únicos.
```
* Um método vale a pena atenção especial quando se fala de ```Set<E>``` interface, como é muitas vezes usado com Set: ```retainAll(Collection<E> coll)```. Ele retém apenas os elementos do Set que estão contidos na coleção especificada.
* Para começar a utilizar um Set, você precisa de um instanciar de suas implementações: ```HashSet```, ```TreeSet```, e ```LinkedHashSet```. Esses são Set mutáveis e usam regras diferentes para ordenar os elementos e têm alguns métodos adicionais. Eles também são otimizados para diferentes tipos de operações. Existem também Set imutáveis , cujos nomes não são importantes para os programadores. Eles também implementam a ```Set<E>``` interface.
* Além disso, há uma implementação de alto desempenho EnumSet para enumtipos. Não o consideraremos neste tópico.
#### Set's imutáveis
* A maneira mais simples de criar um Set é invocar o ```of``` método da ```Set``` interface.
```java 
Set<String> emptySet = Set.of();
Set<String> persons = Set.of("Larry", "Kenny", "Sabrina");
Set<Integer> numbers = Set.of(100, 200, 300, 400);
```
* Ele retorna um Set imutável contendo todos os elementos passados ou um Set vazio. Usar o ```of``` método é conveniente ao criar constantes definidas ou testar algum código.
* A ordem dos elementos dos Set imutáveis não é fixa:
```JAVA 
System.out.println(emptySet); // []
System.out.println(persons);  // [Kenny, Larry, Sabrina] or another order
System.out.println(numbers);  // [400, 200, 300, 100] or another order
```
* Uma das operações de Set mais amplamente utilizadas é verificar se um Set contém um elemento. Aqui está um exemplo:
```java 
System.out.println(emptySet.contains("hello")); // false
System.out.println(persons.contains("Sabrina")); // true
System.out.println(persons.contains("John")); // false
System.out.println(numbers.contains(300)); // true
```
```
Para imutáveis sets, só é possível invocar contains, size e isEmpty métodos.
Todos os outros vão lançar, UnsupportedOperationExceptionpois eles tentam
mudar o Set. Se você quiser adicionar / remover elementos, use um de
HashSet, TreeSetou LinkedHashSet.
```
* A seguir, consideraremos três implementações mutáveis primárias da ```Set``` interface.
#### HashSet
* A ```HashSet``` classe representa um Set apoiado por uma tabela hash . Ele usa códigos hash de elementos para armazená-los de forma eficaz. Não dá nenhuma garantia quanto à ordem de iteração do Set; em particular, não garante que o pedido permanecerá constante ao long do tempo.
* O exemplo a seguir demonstra a criação de um ```HashSet``` e a adição de países a ele (com uma duplicata). O resultado da saída não contém duplicatas.
```java 
Set<String> countries = new HashSet<>();

countries.add("India");
countries.add("Japan");
countries.add("Switzerland");
countries.add("Japan");
countries.add("Brazil");

System.out.println(countries); // [Japan, Brazil, Switzerland, India]
System.out.println(countries.contains("Switzerland")); // true
```
```
Embora tecnicamente a ordem de HashSetseja um pouco determinada por
hashCode, é uma má prática confiar em tais recursos, uma vez que a
dependência é bastante complicada. HashSetdeve ser tratado como um Set
não ordenado.
```
* Você não deve confiar na ordem dos elementos neste Set, mesmo com o loop for-each .
* A ```HashSet``` classe oferece ```O(1)``` desempenho de tempo constante para as operações básicas (```add```, ```remove``` e ```contains```), assumindo que a função hash dispersa os elementos adequadamente entre os baldes.
```
Na prática, os Set são freqüentemente usados para verificar se
alguns elementos pertencem a eles. A HashSetclasse é especialmente
recomendada para tais casos, pois seu containsfuncionamento é altamente
otimizado.
```
#### TreeSet
* A ```TreeSet``` classe representa um Set que nos dá garantias sobre a ordem dos elementos. Corresponde à ordem de classificação dos elementos determinada por sua ordem natural (se eles implementam a ```Comparable``` interface) ou por ```Comparator``` implementação específica .
```
A ordem em que os elementos seriam classificados é a mesma que se você
usasse um algoritmo de classificação em uma matriz ou lista contendo
esses elementos.
```
* A ```TreeSet``` classe implementa a ```SortedSet``` interface que estende a ```Set``` interface base . A ```SortedSet``` interface fornece alguns novos métodos relacionados à comparação de elementos:
  * ```Comparator<? super E> comparator()``` retorna o comparador usado para ordenar os elementos no Set ou ```null``` se o Set usa a ordenação natural de seus elementos;
  * ```SortedSet<E> headSet(E toElement)``` retorna um subSet contendo elementos estritamente menores que ```toElement```;
  * ```SortedSet<E> tailSet(E fromElement)``` retorna um subSet contendo elementos maiores ou iguais a ```fromElement```;
  * ```SortedSet<E> subSet(E fromElement, E toElement)``` retorna um subSet contendo elementos no intervalo ```fromElement``` (inclusivo) ```toElement``` (exclusivo);
  * ```E first()``` retorna o primeiro (mais baixo) elemento do Set;
  * E ```last()``` retorna o último (mais alto) elemento do Set.
* O exemplo a seguir demonstra alguns dos métodos listados:
```java 
SortedSet<Integer> sortedSet = new TreeSet<>();

sortedSet.add(10);
sortedSet.add(15);
sortedSet.add(13);
sortedSet.add(21);
sortedSet.add(17);

System.out.println(sortedSet); // [10, 13, 15, 17, 21]

System.out.println(sortedSet.headSet(15)); // [10, 13]
System.out.println(sortedSet.tailSet(15)); // [15, 17, 21]
 
System.out.println(sortedSet.subSet(13,17)); // [13, 15] 

System.out.println(sortedSet.first()); // minimum is 10
System.out.println(sortedSet.last());  // maximum is 21
```
```
Observe que, embora HashSetseja muito mais rápido do que TreeSet: tempo
constante versus tempo log para a maioria das operações, ele não oferece
garantias de pedido. Se você precisar usar as operações da
SortedSetinterface ou se a iteração ordenada por valor for necessária,
use TreeSet; caso contrário, HashSetseria uma escolha melhor.
```
#### LinkedHashSet
* A ```LinkedHashSet``` classe representa um Set com elementos vinculados. Difere ```HashSet``` por garantir que a ordem dos elementos é a mesma que a ordem em que foram inseridos no Set. Reinserir um elemento que já está em ```LinkedHashSet``` não altera essa ordem.
* Em certo sentido, ```LinkedHashSet``` é algo intermediário entre ```HashSet``` e ```TreeSet```. Implementado como uma tabela hash com uma lista vinculada em execução, este Set fornece iteração ordenada por inserção e é executado quase tão rápido quanto ```HashSet```.
* O exemplo a seguir demonstra isso.
```java 
Set<Character> characters = new LinkedHashSet<>();

for (char c = 'a'; c <= 'k'; c++) {
    characters.add(c);
}
        
System.out.println(characters); // [a, b, c, d, e, f, g, h, i, j, k]
```
* Neste código, a ordem dos char é sempre a mesma e corresponde à ordem em que são inseridos no Set.
```
A LinkedHashSetimplementação poupa seus clientes do pedido caótico
fornecido por, HashSetsem incorrer no aumento do custo do tempo das
operações associado TreeSet. Mas LinkedHashSetrequer mais memória para
armazenar elementos.
```
#### Set operações
* Você já viu algumas operações em Set. Agora, vamos examinar as operações que geralmente são chamadas de operações teóricas de Set que vêm da matemática. É engraçado que em Java eles sejam comuns para todas as coleções, não apenas para Set.
* Aqui está um exemplo de tais operações. Em primeiro lugar, criamos um Set mutável. Em seguida, aplicamos operações a ele, alterando os elementos.
```java 
// getting a mutable set from an immutable one
Set<String> countries = new HashSet<>(List.of("India", "Japan", "Switzerland"));

countries.addAll(List.of("India", "Germany", "Algeria"));
System.out.println(countries ); // [Japan, Algeria, Switzerland, Germany, India]

countries.retainAll(List.of("Italy", "Japan", "India", "Germany"));
System.out.println(countries ); // [Japan, Germany, India]

countries.removeAll(List.of("Japan", "Germany", "USA"));
System.out.println(countries ); // [India]
```
* Após a execução ```addAll```, o Set ```countries``` não contém países duplicados. As operações ```retainAll``` e ```removeAll``` afetam apenas os elementos especificados nos Set passados. Também é possível usar qualquer classe que implemente a ```Collection``` interface para esses métodos (por exemplo ```ArrayList```).
```
Em matemática e outras linguagens de programação, as operações de Set
demonstradas são conhecidas como união ( addAll), intersecção ( retainAll)
e diferença ( removeAll).
```
* Também existe um método que nos permite verificar se um Set é um subSet (ou seja, contido em) outro Set.
```java 
Set<String> countries = new HashSet<>(List.of("India", "Japan", "Algeria"));

System.out.println(countries.containsAll(Set.of())); // true
System.out.println(countries.containsAll(Set.of("India", "Japan")));   // true
System.out.println(countries.containsAll(Set.of("India", "Germany"))); // false
System.out.println(countries.containsAll(Set.of("Algeria", "India", "Japan"))); // true
```
* Como você pode ver, esse método retorna ```true``` até mesmo para um Set vazio e um Set totalmente igual ao Set inicial.
#### Set igualdade
* Por último, mas não menos importante, é como os Set são comparados. Dois Set são iguais quando contêm os mesmos elementos. A igualdade não depende dos tipos de Set em si.
```java 
Objects.equals(Set.of(1, 2, 3), Set.of(1, 3));    // false
Objects.equals(Set.of(1, 2, 3), Set.of(1, 2, 3)); // true
Objects.equals(Set.of(1, 2, 3), Set.of(1, 3, 2)); // true

Set<Integer> numbers = new HashSet<>();

numbers.add(1);
numbers.add(2);
numbers.add(3);

Objects.equals(numbers, Set.of(1, 2, 3)); // true
```
* Assumimos que os exemplos dados não precisam de comentários.
#### <hr>
### A interface Map
* Em algumas situações, você precisa armazenar pares de objetos associados. Por exemplo, ao contar o número de palavras em um texto, a primeira é uma palavra e a segunda é o número de suas ocorrências no texto. Há um tipo especial de coleção chamado mapa para armazenar efetivamente esses pares de objetos.
```
Um mapa é uma coleção de pares de valores-chave . As chaves são sempre únicas, enquanto os valores podem se repetir.
```
* Um bom exemplo de mapa do mundo real é uma lista telefônica em que as chaves são os nomes dos seus amigos e os valores são os telefones associados a eles.
```java 
Keys  : Values
-----------------------
Bob   : +1-202-555-0118
James : +1-202-555-0220
Katy  : +1-202-555-0175
```
* Os mapas têm algumas semelhanças com conjuntos e matrizes;
  * as chaves de um mapa formam um conjunto , mas cada chave possui um valor associado;
  * as chaves de um mapa são semelhantes aos índices de uma matriz , mas as chaves podem ter qualquer tipo, incluindo números inteiros, strings e assim por diante.
* Por esses motivos, você pode encontrar algum tipo de efeito déjà vu ao aprender mapas.
* A seguir, todos os nossos exemplos usarão string e números como chaves, uma vez que o uso de classes personalizadas como tipos de chaves tem alguns pontos significativos da mesma forma que para conjuntos. Será considerado em outros tópicos.
#### A interface Map
* O Collections Framework fornece a ```Map<K,V>``` interface para representar um mapa como um tipo de dados abstratos. Aqui, ```K``` é um tipo de chave e ```V``` um tipo de valor associado. A ```Map``` interface não é um subtipo da ```Collection``` interface, mas os mapas costumam ser considerados coleções, pois fazem parte da estrutura.
* A interface declara muitos métodos para trabalhar com mapas. Alguns dos métodos são semelhantes aos métodos de ```Collection```, enquanto outros são exclusivos de mapas.
1. Métodos de coleção:
  * ```int size()``` retorna o número de elementos no mapa;
  * ```boolean isEmpty()``` retorna ```true``` se o mapa não contém elementos e ```false``` caso contrário;
  * ```void clear()``` remove todos os elementos do mapa.
* Esperamos que esses métodos não necessitem de comentários.
2. Processamento de chaves e valores:
  * ```V put(K key, V value)``` associa o especificado ```value``` ao especificado ```key``` e retorna o valor anteriormente associado a este ```key``` ou ```null```;
  * ```V get(Object key)``` retorna o valor associado à chave ou ```null``` não;
  * ```V remove(Object key)``` remove o mapeamento para a ```key``` do mapa;
  * ```boolean containsKey(Object key)``` retorna ```true``` se o mapa contém o especificado ```key```;
  * ```boolean containsValue(Object value)``` retorna ```true``` se o mapa contém o especificado ```value```.
* Esses métodos são semelhantes aos métodos de coleções, exceto que processam pares de chave-valor.
3. Métodos avançados:
  * ```V putIfAbsent(K key, V value)``` coloca um par se a chave especificada ainda não está associada a um valor (ou está mapeada para ```null```) e retorna ```null```, caso contrário, retorna o valor atual;
  * ```V getOrDefault(Object key, V defaultValue)``` retorna o valor para o qual a chave especificada é mapeada ou ```defaultValue``` se este mapa não contém mapeamento para a chave.
* Esses métodos, juntamente com alguns outros, são freqüentemente usados em projetos reais.    
4. Métodos que retornam outras coleções:
  * ```Set<K> keySet()``` Retorna uma ```Set``` visão das chaves contidas neste mapa;
  * ```Collection<V> values()``` retorna uma Collectionvisão dos valores contidos neste mapa;
  * ```Set<Map.Entry<K, V>> entrySet()``` retorna uma ```Set``` visão das entradas (associações) contidas neste mapa.
* Esta não é uma lista completa de métodos, pois ```Map``` é realmente uma interface enorme. A documentação realmente ajuda a usá-lo.
* Para começar a usar um mapa, você precisa de um instanciar de suas implementações: ```HashMap```, ```TreeMap```, e ```LinkedHashMap```. Eles usam regras diferentes para ordenar os elementos e têm alguns métodos adicionais. Existem também mapas imutáveis cujos nomes não são importantes para os programadores.
#### Mapas imutáveis
* A maneira mais simples de criar um mapa é invocar o ```of``` método da ```Map``` interface. O método leva zero ou qualquer número par de argumentos no formato ```key1, value1, key2, value2, ...``` e retorna um mapa imutável .
```java 
Map<String, String> emptyMap = Map.of();

Map<String, String> friendPhones = Map.of(
        "Bob", "+1-202-555-0118",
        "James", "+1-202-555-0220",
        "Katy", "+1-202-555-0175"
);
```
* Agora vamos considerar algumas operações que podem ser aplicadas a mapas imutáveis usando nosso exemplo com ```friendPhones```.
* O tamanho de um mapa é igual ao número de pares contidos nele.
```java 
System.out.println(emptyMap.size());     // 0
System.out.println(friendPhones.size()); // 3
```
* É possível obter um valor de um mapa por sua chave:
```java 
String bobPhone = friendPhones.get("Bob"); // +1-202-555-0118
String alicePhone = friendPhones.get("Alice"); // null
String phone = friendPhones.getOrDefault("Alex", "Unknown phone"); // Unknown phone
```
```
Observe que o getOrDefaultmétodo fornece uma maneira simples de evitar o NPE,
pois evita nullo do.
```
* Também é possível verificar se um mapa contém uma chave ou valor específico usando os métodos ```containsKey``` e ```containsValue```.
* Podemos acessar diretamente o conjunto de chaves e coleção de valores de um mapa:
```java 
System.out.println(friendPhones.keySet()); // [James, Bob, Katy]
System.out.println(friendPhones.values()); // [+1-202-555-0220, +1-202-555-0118, +1-202-555-0175]
```
```
Por ser imutável, apenas os métodos que não alteram os elementos desse mapa funcionarão. Outros lançarão uma exceção UnsupportedOperationException. Se você gostaria de colocar ou remover elementos, use um de HashMap, TreeMap ou LinkedHashMap.
```
#### HashMap
* A ```HashMap``` classe representa um mapa apoiado por uma tabela hash. Essa implementação fornece desempenho em tempo constante para ```get``` e ```put``` métodos, pressupondo que a função hash dispersa os elementos adequadamente entre os baldes.
* O exemplo a seguir demonstra um mapa de produtos em que a chave é o código do produto e o valor é o nome.
```java 
Map<Integer, String> products = new HashMap<>();

products.put(1000, "Notebook");
products.put(2000, "Phone");
products.put(3000, "Keyboard");

System.out.println(products); // {2000=Phone, 1000=Notebook, 3000=Keyboard}

System.out.println(products.get(1000)); // Notebook

products.remove(1000);

System.out.println(products.get(1000)); // null

products.putIfAbsent(3000, "Mouse"); // it does not change the current element

System.out.println(products.get(3000)); // Keyboard
```
```
Essa implementação é frequentemente usada na prática, pois é altamente otimizada
para colocar e obter pares.
```
#### LinkedHashMap
* O ```LinkedHashMap``` armazena a ordem em que os elementos foram inseridos.
* Vamos ver uma parte do exemplo anterior novamente:
```java 
Map<Integer, String> products = new LinkedHashMap<>(); // ordered map of products

products.put(1000, "Notebook");
products.put(2000, "Phone");
products.put(3000, "Keyboard");

System.out.println(products); // it's always ordered {1000=Notebook, 2000=Phone, 3000=Keyboard}
```
* Nesse código, a ordem dos pares é sempre a mesma e corresponde à ordem em que são inseridos no mapa.
#### TreeMap
* A ```TreeMap``` classe representa um mapa que nos dá garantias sobre a ordem dos elementos. Corresponde à ordem de classificação das chaves determinada por sua ordem natural (se implementarem a ```Comparable``` interface) ou por ```Comparator``` implementação específica .
* Esta classe implementa a ```SortedMap``` interface que estende a ```Map``` interface base . Ele fornece alguns métodos novos, relacionados a comparações de chaves:
  * ```Comparator<? super K> comparator()``` retorna o comparador usado para ordenar os elementos no mapa ou ```null``` se o mapa usa a ordem natural de suas chaves;
  * ```E firstKey()``` retorna a primeira chave (mais baixa) no mapa;
  * ```E lastKey()``` retorna a última chave (mais alta) no mapa;
  * ```SortedMap<K, V> headMap(K toKey)``` retorna um submapa contendo elementos cujas chaves são estritamente menores que ```toKey```;
  * ```SortedMap<K, V> tailMap(K fromKey)``` retorna um submapa contendo elementos cujas chaves são maiores ou iguais a ```fromKey```;
  * ```SortedMap<K, V> subMap(K fromKey, E toKey)``` retorna um submapa contendo elementos cujas chaves estão no intervalo ```fromKey``` (inclusivo) ```toKey``` (exclusivo);
* O exemplo abaixo demonstra como criar e usar um objeto de ```TreeMap```. Este mapa é preenchido com eventos, cada um deles possui uma data (chave) e um título (valor).
```
LocalDate é uma classe que representa uma data. A invocação do
LocalDate.of(year, month, day) método cria o objeto de data especificado com o
ano, mês e dia fornecidos.
```
```java 
SortedMap<LocalDate, String> events = new TreeMap<>();

events.put(LocalDate.of(2017, 6, 6), "The Java Conference");
events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
events.put(LocalDate.of(2017, 6, 8), "Discussion: career or education?");
events.put(LocalDate.of(2017, 6, 9), "The modern art");
events.put(LocalDate.of(2017, 6, 10), "Coffee master class");

LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
LocalDate toExclusive = LocalDate.of(2017, 6, 10);

System.out.println(events.subMap(fromInclusive, toExclusive));
```
* O código gera o submapa resultante:
```java 
{2017-06-08=Discussion: career or education?, 2017-06-09=The modern art}
```
```
Use TreeMapapenas quando você realmente precisar da ordem de classificação dos
elementos, uma vez que essa implementação é menos eficaz do que HashMap.
```
#### Iterando em Maps
* É impossível iterar diretamente em um mapa, pois ele não implementa a ```Iterable``` interface. Felizmente, alguns métodos de mapas retornam outras coleções que são iteráveis. A ordem dos elementos durante a iteração depende da implementação concreta da ```Map``` interface.
* O código a seguir mostra como obter chaves e valores em um loop for-each:
```java 
Map<String, String> friendPhones = Map.of(
        "Bob", "+1-202-555-0118",
        "James", "+1-202-555-0220",
        "Katy", "+1-202-555-0175"
);

// printing names
for (String name : friendPhones.keySet()) {
    System.out.println(name);
}

// printing phones
for (String phone : friendPhones.values()) {
    System.out.println(phone);
}
```
* Se quiser imprimir uma chave e seu valor associado na mesma iteração, você pode obter ```entrySet()``` e iterar sobre ela.
```java 
for (var entry : friendPhones.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```
* Este código imprime todos os pares conforme esperamos:
```java 
Bob: +1-202-555-0118
James: +1-202-555-0220
Katy: +1-202-555-0175
```
```
Usamos o varrelease em Java 10 para declarar a variável do loop entry, mas não
é necessário. Se você tiver uma versão mais antiga do Java ou simplesmente não
quiser usar var, pode escrever o tipo de dados explicitamente
como Map.Entry<String, String>.
```
* O mesmo comportamento pode ser obtido usando uma expressão lambda com dois argumentos se você preferir desta forma:
```java 
friendPhones.forEach((name, phone) -> System.out.println(name + ": " + phone));
```
#### Outras coleções como valores
* É possível armazenar outras coleções como valores em mapas, uma vez que as coleções também são objetos.
* Aqui está um exemplo com um mapa de sinônimos:
```java 
Map<String, Set<String>> synonyms = new HashMap<>();

synonyms.put("Do", Set.of("Execute"));
synonyms.put("Make", Set.of("Set", "Attach", "Assign"));
synonyms.put("Keep", Set.of("Hold", "Retain"));

// {Keep=[Hold, Retain], Make=[Attach, Assign, Set], Do=[Execute]}
System.out.println(synonyms);
```
* Armazenar coleções como chaves de um mapa, por outro lado, não é um caso comum e possui algumas restrições. Essas chaves devem ser representadas por coleções imutáveis . Não vamos considerar este caso aqui.
#### Igualdade de Map's
* Dois mapas são considerados iguais se contiverem as mesmas chaves e valores. Os tipos de mapas não são importantes.
* Portanto, os seguintes mapas são totalmente iguais:
```java 
Map<String, Integer> namesToAges1 = Map.of("John", 30, "Alice", 28);
Map<String, Integer> namesToAges2 = new HashMap<>();

namesToAges2.put("Alice", 28);
namesToAges2.put("John", 30);

System.out.println(Objects.equals(namesToAges1, namesToAges2)); // true
```
* Mas os dois mapas a seguir são diferentes, pois o segundo mapa não inclui "Alice":
```java 
Map<String, Integer> namesToAges1 = Map.of("John", 30, "Alice", 28);
Map<String, Integer> namesToAges2 = Map.of("John", 28);

System.out.println(Objects.equals(namesToAges1, namesToAges2)); // false
```
* Com isso, estamos finalizando nossa consideração sobre os mapas. Havia muita teoria. Se houver algo que você não entende, tente praticar mesmo assim e volte à teoria quando surgirem dúvidas.
#### <hr>
### Hierarquia de exceções
* Java é principalmente uma linguagem orientada a objetos. Nesse paradigma, todas as exceções são consideradas objetos de classes especiais organizadas em uma hierarquia de classes. Compreender essa hierarquia é essencial tanto para entrevistas de emprego quanto para a prática diária de programação.
#### Hierarquia de exceções
* A imagem a seguir ilustra a hierarquia simplificada de exceções:
* <img src="https://ucarecdn.com/dce2aef6-e0e1-408a-ad3e-0eff03b06ec7/">
* A classe base para todas as exceções é ```java.lang.Throwable```. Esta classe fornece um conjunto de métodos comuns para todas as exceções:
  * ```String getMessage()``` retorna a mensagem de string detalhada deste objeto de exceção;
  * ```Throwable getCause()``` retorna a causa desta exceção ou nullse a causa é inexistente ou desconhecida;
  * ```printStackTrace()``` imprime o rastreamento de pilha no fluxo de erro padrão.
* Voltaremos aos métodos e construtores desta classe nos tópicos a seguir.
* A ```Throwable``` classe possui duas subclasses diretas: ```java.lang.Error``` e ```java.lang.Exception```.
  * as subclasses da ```Error``` classe representam exceções de baixo nível na JVM, por exemplo: ```OutOfMemoryError```, ```StackOverflowError```;
  * subclasses da ```Exception``` classe lidam com eventos excepcionais dentro de aplicativos, como: ```RuntimeException```, ```IOException```;
  * a ```RuntimeException``` classe é uma subclasse bastante especial de ```Exception```. Ela representa o chamado unchecked exceções, incluindo: ```ArithmeticException```, ```NumberFormatException```, ```NullPointerException```.
* Ao desenvolver um aplicativo, você normalmente processará objetos da ```Exception``` classe e suas subclasses. Não discutiremos ```Error``` suas subclasses aqui.
```
As quatro classes básicas de exceções ( Throwable, Exception,
RuntimeExceptione Error) estão localizados no java.lang pacote. Eles não
precisam ser importados. No entanto, suas subclasses podem ser colocadas
em pacotes diferentes.
```
#### Exceções marcadas e desmarcadas (Checked and Unchecked)
* Todas as exceções podem ser divididas em dois grupos: checkeds e não checkeds. Eles são funcionalmente equivalentes, mas há uma diferença do ponto de vista do compilador.
* <strong>1. As exceções verificadas</strong> são representadas pela Exceptionclasse, excluindo a RuntimeExceptionsubclasse. O compilador verifica se o programador espera a ocorrência de tais exceções em um programa ou não. 
* Se um método lançar uma exceção verificada, isso deve ser marcado na declaração usando a ```throws``` palavra-chave especial . Caso contrário, o programa não será compilado.
* Vamos dar uma olhada no exemplo. Usamos a ```Scanner``` classe, com a qual você já está familiarizado, como um meio de ler a entrada padrão, para ler a partir de um arquivo:
```java 
public static String readLineFromFile() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("file.txt")); // java.io.FileNotFoundException
    return scanner.nextLine();
}
```
* Aqui ```FileNotFoundException``` está uma exceção padrão verificada. Este construtor de ```Scanner``` declara uma ```FileNotFoundException``` exceção, porque assumimos que o arquivo especificado pode não existir. Mais importante ainda, há uma única linha no método que pode lançar uma exceção, portanto, colocamos a throwspalavra - chave na declaração do método.
* <strong>2. As exceções não verificadas</strong> são representadas pela RuntimeExceptionclasse e todas as suas subclasses. O compilador não verifica se o programador espera a ocorrência de tais exceções em um programa.
* Aqui está um método que lança ```NumberFormatException``` quando a string de entrada tem um formato inválido (por exemplo, ```"abc"```).
```java 
public static Long convertStringToLong(String str) {
    return Long.parseLong(str); // It may throw a NumberFormatException
}
```
* Este código sempre é compilado com sucesso sem a ```throws``` palavra - chave na declaração.
```
As exceções de tempo de execução podem ocorrer em qualquer lugar em um
programa. O compilador não exige que você especifique exceções de tempo
de execução nas declarações. Adicioná-los à declaração de cada método
reduziria a clareza de um programa.
```
* A ```Error``` classe e suas subclasses também são consideradas como exceções não verificadas. No entanto, eles formam uma classe separada.
#### Conclusão
* Todas as exceções são representadas pela ```Throwable``` classe, que possui duas subclasses: ```Exception``` e ```Error```. Também existem dois tipos de exceções: checked e unchecked.
* Exceções não verificadas são esperadas pelo compilador, então você não precisa manipulá-las. Eles são representados pela ```RuntimeExceptionsubclass``` e da ```Exceptionclasse```. Erros da ```Error``` classe também são considerados não verificados.
* As exceções verificadas devem ser tratadas e indicadas explicitamente. Eles estão localizados em todas as outras subclasses de ```Exception```.
#### <hr>
### Tratamento de exceções
* Como você já sabe, uma exceção interrompe a execução normal de um programa. Normalmente não é isso que queremos que aconteça. Felizmente, é possível escrever algum código que tratará a exceção sem interromper todo o programa. Para fazer isso, Java fornece um mecanismo de tratamento de exceções que funciona com exceções marcadas e não verificadas .
#### Como lidar com uma exceção
* Depois que uma linha de código lança uma exceção, o sistema de tempo de execução Java tenta encontrar um manipulador adequado para ela. Esse manipulador pode estar localizado no mesmo método em que ocorreu a exceção ou no método de chamada. Assim que um manipulador adequado é encontrado e executado, a exceção é considerada como tratada e o programa é executado normalmente.
* Tecnicamente, uma exceção pode ser tratada no método em que ocorre ou no método de chamada. A melhor abordagem para tratar uma exceção é fazê-lo em um método que tenha informações suficientes para tomar a decisão correta com base nessa exceção.
* Vamos agora aprender três palavras-chave para lidar com exceções: ```try```, ```catch``` e ```finally```.
#### A declaração try-catch
* Aqui está um ```try-catch``` modelo simples para lidar com exceções:
```java 
try {
    // code that may throw an exception
} catch (Exception e) {
    // code for handling the exception
}
```
* O ```try``` bloco é usado para envolver o código que pode lançar uma exceção. Este bloco pode incluir todas as linhas de código, incluindo chamadas de método.
* O ```catch``` bloco é um manipulador para o tipo especificado de exceção e todas as suas subclasses. Este bloco é executado quando uma exceção do tipo correspondente ocorre no ```try``` bloco.
```
Observe que o tipo especificado em um
catch bloco deve estender a Throwableclasse.
```
* No modelo apresentado, o ```catch``` bloco pode manipular exceções da ```Exception``` classe e todas as classes derivadas dela.
* O exemplo a seguir demonstra o fluxo de execução com ```try``` e ```catch```.
```java 
System.out.println("before the try-catch block"); // it will be printed

try {
    System.out.println("inside the try block before an exception"); // it will be printed

    System.out.println(2 / 0); // it throws ArithmeticException

    System.out.println("inside the try block after the exception"); // it won't be printed
} catch (Exception e) {
    System.out.println("Division by zero!"); // it will be printed
}

System.out.println("after the try-catch block"); // it will be printed
```
* A saída:
```
before the try-catch block
inside the try block before an exception
Division by zero!
after the try-catch block
```
* O programa não imprime ```"inside the try block after the exception"``` pois ```ArithmeticException``` abortou o fluxo normal da execução. Em vez disso, ele executa a instrução de impressão no ```catch``` bloco. Após a conclusão do ```catch``` bloco, o programa executa a próxima instrução (impressão ```"after the try-catch block"```) sem retornar ao ```try``` bloco novamente.
* Substituir ```Exception``` por ```ArithmeticException``` ou ```RuntimeException``` na ```catch``` instrução não altera o fluxo de execução do programa. Mas substituí-lo por ```NumberFormatException``` tornará o manipulador inadequado para a exceção e o programa falhará.
```
Como observamos anteriormente, a try-catch instrução pode lidar com exceções
verificadas e não verificadas. Mas há uma diferença: as exceções verificadas
devem ser agrupadas com um try-catchbloco ou declaradas para serem lançadas
no método, enquanto as exceções não verificadas não precisam.
```
#### Obter informações sobre uma exceção
* Quando uma exceção é capturada por um catchbloco, é possível obter algumas informações sobre ela:
```java 
try {
    double d = 2 / 0;
} catch (Exception e) {
    System.out.println(e.getMessage());
}
```
* Este código imprime:
```
An exception occured: / by zero
```
#### Captura de múltiplas exceções
* Sempre é possível usar um único manipulador para todos os tipos de exceções:
```java 
try {
    // code that may throw exceptions
} catch (Exception e) {
    System.out.println("Something goes wrong");
}
```
* Obviamente, esta abordagem não nos permite realizar ações diferentes dependendo do tipo de exceção que ocorreu. Felizmente, o Java suporta o uso de vários manipuladores dentro do mesmo ```try``` bloco.
```java 
try {
    // code that throws exceptions
} catch (IOException e) {
    // handling the IOException and its subclasses    
} catch (Exception e) {
    // handling the Exception and its subclasses
}
```
* Quando ocorre uma exceção no ```try``` bloco, o sistema de execução determina o primeiro ```catch``` bloco adequado de acordo com o tipo da exceção. A correspondência vai de cima para baixo.
```
Importante, o catchbloco com a classe base deve ser escrito abaixo de todos os
blocos com subclasses. Em outras palavras, os manipuladores mais especializados
(como IOException) devem ser escritos antes dos mais gerais (como Exception).
Caso contrário, o código não compilará.
```
* Desde o Java 7, você pode usar uma sintaxe multi-catch para ter várias exceções tratadas da mesma maneira:
```java 
try {
    // code that may throw exceptions
} catch (SQLException | IOException e) {
    // handling SQLException, IOException and their subclasses
    System.out.println(e.getMessage());
} catch (Exception e) {
    // handling any other exceptions
    System.out.println("Something goes wrong");
}
```
* No código acima, ```SQLException``` e ```IOException``` (alternativas) são separados pelo ```|``` caractere. Eles serão tratados da mesma maneira.
```
Observe que as alternativas em uma instrução multi-catch não podem ser
subclasses umas das outras.
```
#### O bloco finally
* Existe outro bloco possível chamado ```finally```. Todas as instruções presentes neste bloco sempre serão executadas independentemente de ocorrer uma exceção no ```try``` bloco ou não.
```java 
try {
    // code that may throw an exception
} catch (Exception e) {
    // exception handler
} finally {
    // code always be executed
}
```
* O exemplo a seguir ilustra a ordem de execução da ```try-catch-finally``` instrução.
```java 
try {
    System.out.println("inside the try block");
    Integer.parseInt("101abc"); // throws NumberFormatException
} catch (Exception e) {
    System.out.println("inside the catch block");
} finally {
    System.out.println("inside the finally block");
}

System.out.println("after the try-catch-finally block");
```
* A saída:
```
inside the try block
inside the catch block
inside the finally block
after the try-catch-finally block
```
* Se removermos a linha que lança NumberFormatException, o ```finally``` bloco ainda é executado após o ```try``` bloco.
```
inside the try block
inside the finally block
after the try-catch-finally block
```
```
Interessante: o finally bloco é executado mesmo se ocorrer uma exceção
no catch bloco.
```
* Também é possível escrever ```try``` e ```finally``` sem nenhum ```catch``` bloco.
```java 
try {
    // code that may throw an exception
} finally {   
    // code always be executed
}
```
* Neste modelo, o ```finally``` bloco é executado logo após o ```try``` bloco.
#### Conclusão
* A ```try-catch``` instrução nos permite lidar com exceções verificadas e não verificadas.
* O ```try``` bloco envolve o código que pode lançar uma exceção enquanto o ```catch``` bloco trata essa exceção caso ela ocorra, também nos permitindo obter algumas informações sobre ela. É possível usar vários manipuladores para fornecer diferentes cenários para diferentes tipos de exceções.
* Finalmente, existe um ```finally``` bloco opcional que sempre é executado. Sua principal característica é que ele executa mesmo se falharmos em manipular uma exceção.
####<hr>
### Saída formatada (Formatted output)
#### Introdução
* Você já está familiarizado com os métodos ```System.out.print()``` e ```System.out.println()``` para imprimir a saída no console. Mas quando você precisa de uma formatação complexa de saída, esses dois métodos não são realmente úteis. Existem dois métodos que você pode usar nesses casos, a saber, ```System.out.printf()``` e ```String.format()```. Vamos discuti-los em detalhes e nos concentrar na formatação de strings e números.
#### Apresentando o método printf ()
* O ```printf()``` wmétodo geralmente tem duas partes. Primeiro, você fornece a string que deseja formatar como o primeiro atributo. Essa string em si inclui regras para formatá-la por meio de especificadores de formato . Alguns exemplos de especificadores de formato são , etc. Na segunda parte, você fornece a lista de argumentos que o Java pode usar para formatar a string de acordo com os especificadores de formato. ```%d``` ```%s```
* Veja o exemplo a seguir para entender as diferentes partes da ```printf()``` função.
```java 
System.out.printf("My Name is %s. I was born in %d", "Mike", 1998);
```
* A primeira parte é ```"My Name is %s. I was born in %d"```, onde ```%s```e ```%d``` são os especificadores de formato.
* A segunda parte é a lista de argumentos: ```"Mike", 1998```.
#### Diferentes casos de uso de printf()
* É hora de conhecer os diferentes casos de uso de especificadores de formato. É muito fácil entender isso com exemplos de código. Vamos tentar agora.
* Você pode exibir um inteiro com o ```%d``` especificador de formato.
```java 
public static void main(String[] args){
    System.out.printf("Display a Number %d", 15000);
}
```
* Java substituirá ```%d``` por 15000. A saída do código acima é ```Display a Number 15000```.
* Se você quiser que vários inteiros sejam exibidos na saída, use vários ```%d``` especificadores.
```java 
public static void main(String[] args){
    System.out.printf("The sum of %d and %d is %d", 15, 40, 55);
}
```
* Java colocará cada argumento no lugar de ```%d```, começando da esquerda. A saída do código acima é ```The sum of 15 and 40 is 55```.
* Se você deseja exibir um valor de ponto flutuante, use o ```%f``` especificador.
```java 
public static void main(String[] args){
    System.out.printf("Display a Number %f", 15.23);
}
```
* Semelhante aos casos acima, o Java colocará 15.23 no lugar de ```%f```. O código acima produzirá a seguinte saída. ```Display a Number 15.230000``` Embora seja tecnicamente correto, parece feio. Você não quer tantos zeros à direita. Você pode definir a precisão com o ```printf()``` método.
```java 
public static void main(String[] args){
    System.out.printf("Display a Number %.2f", 15.23);
}
```
* ```.2f``` decide que o número de dígitos que deve aparecer após a casa decimal é dois. O código fornecido acima produzirá ```Display a Number 15.23```
* Da mesma forma, você pode exibir char e strings com o ```printf()``` método. Dê uma olhada no código a seguir. Se quiser imprimir um caractere, use ```%c```, e se quiser imprimir uma String, use ```%s```.
```java 
public static void main(String[] args){
    char abbr = 'H';
    String element = "Hydrogen";
    System.out.printf("%c stands for %s", abbr, element);
}
```
* Quando este código for executado, o valor da ```abbr``` variável será substituído ```%c``` e o valor da ```element``` variável será substituído ```%s```. A saída do código acima é ```H stands for Hydrogen.``` Isso é tudo sobre o ```printf()``` método. Vamos prosseguir para aprender sobre o ```String.format()``` método.
#### O método Stirng.format()
* O ```format()``` método na ```String``` classe funciona de forma muito parecida com o ```printf()``` método. A principal diferença aqui é que você retorna uma string em vez de imprimi-la. Vamos ver vários exemplos.
* O código a seguir formata um inteiro usando-o.
```java 
public static void main(String[] args){
    int age = 22;
    String str = String.format("My age is %d", age);
    System.out.println(str);
}
```
* Ao executar este código, o Java criará uma String chamada ```str``` concatenando ```My age is``` com o valor da ```age``` variável. Em seguida, ele imprimirá o valor de ```str```. O resultado é:
```java 
My age is 22
```
* Da mesma forma, você também pode formatar outros tipos de dados. Veja o seguinte código.
```java 
public static void main(String[] args){
    int age = 22;
    char initial = 'M';
    String surname = "Anderson";
    double height = 1.72;

    String details = String.format("My name is %c. %s.%nMy age is %d.%nMy height is %.2f.", initial, surname, age, height);
    System.out.println(details);
}
```
* Você pode ver que usamos quatro tipos de dados neste exemplo. Java irá substituir ```%c, %s, %d, %f``` com ```initial```, ```surname```, ```age``` e, ```height``` respectivamente. %né o caractere de nova linha que quebra a linha toda vez que é usado. A saída do nosso código é:
```java 
My name is M. Anderson.
My age is 22.
My height is 1.72.
```
* Vamos resumir o que aprendemos neste tópico.
<table>
	<tbody>
		<tr>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Especificador de Formato</font></font></strong></td>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">tipo de dados</font></font></strong></td>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Impressão de formato</font></font></strong></td>
			<td><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Formatando uma string</font></font></strong></td>
		</tr>
		<tr>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> %d</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">int, short, byte, long</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">System.out.printf ("Exibir um inteiro %d", 15000);</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String.format ("Exibir um inteiro %d", 15000)</font></font></td>
		</tr>
		<tr>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> %c</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">char</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">System.out.printf ("Exibir um caractere %c", 'c');</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String.format ("Exibir um caractere %c", 'c')</font></font></td>
		</tr>
		<tr>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> %f</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">double, float</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">System.out.printf ("Exibir um número de ponto flutuante %f", 123,45);</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String.format ("Exibir um número de ponto flutuante %f", 123.45)</font></font></td>
		</tr>
		<tr>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> %s</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">System.out.printf ("Exibir uma String %s", "String");</font></font></td>
			<td><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">String.format ("Exibir uma String %s", "String")</font></font></td>
		</tr>
	</tbody>
</table>






#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
## POO - Programação Orientada a Objetos 
#### Interface x Classe abstrata
* Uma <strong>classe abstrata</strong> pode conter métodos completos ou incompletos. Uma <strong>Interface</strong> pode conter apenas a assinatura de um método, mas nenhum corpo ou implementação. Portanto, em uma <strong>classe abstrata</strong>, pode-se implementar métodos, mas em uma <strong>Interface</strong>, não.
#### <hr>
### Interface
#### Por que interface
* A ideia geral de OOP e um de seus princípios é abstração. Isso significa que objetos do mundo real podem ser representados por seus modelos abstratos. Projetar modelos é focar nas características essenciais dos objetos e descartar os outros. Para entender o que isso significa, vamos dar uma olhada em um lápis. Um lápis é um objeto que podemos usar para desenhar. Outras propriedades, como material ou comprimento, podem ser importantes para nós às vezes, mas não definem a ideia de um lápis.
* Imagine que precisamos criar um programa de editor gráfico. Uma das funções básicas do programa é o desenho. Antes de desenhar, o programa pede ao usuário para selecionar uma ferramenta de desenho. Pode ser uma caneta, lápis, pincel, marca-texto, marcador, spray e outros. Cada ferramenta de um conjunto tem suas características específicas: um lápis e um spray deixam marcas diferentes e isso importa. Mas há também uma característica essencial que os une: a capacidade de desenhar.
* Agora vamos considerar a ```Pencil``` classe, que é uma abstração de um lápis. Como já discutimos a classe pelo menos deve ter o ```draw``` método que aceita um modelo de curva. Esta é uma função crucial de um lápis para nosso programa. Suponha que ```Curve``` seja uma classe que representa alguma curva:
```java 
class Pencil {
    ...
    public void draw(Curve curve) {...}
}
```
* Vamos definir classes para outras ferramentas, por exemplo, um pincel:
```java 
class Brush {
    ...
    public void draw(Curve curve) {...}
}
```
* Cada um deles possui o método ```draw```, embora o utilize à sua maneira. A capacidade de desenhar é uma característica comum a todos eles. Vamos chamar esse recurso ```DrawingTool```. Então podemos dizer que se uma classe tem o ```DrawingTool``` recurso, ela deve ser capaz de desenhar, isso significa que a classe deve ter o ```void draw(Curve curve) {...}``` método.
* Java permite declarar esse recurso introduzindo interfaces. Esta é a aparência de nossa interface:
```java 
interface DrawingTool {
    void draw(Curve curve);
}
```
* Ele declara o ```draw``` método sem implementação.
* Agora vamos marcar as classes que podem desenhar adicionando ```implements DrawingTool``` à declaração da classe. Se uma classe implementa uma interface, ela deve implementar todos os métodos declarados:
```java 
class Pencil implements DrawingTool {
    ...
    public void draw(Curve curve) {...}
}

class Brush implements DrawingTool {
    ...
    public void draw(Curve curve) {...}
}
```
* Agora, apenas uma rápida olhada na declaração da classe é o suficiente para entender que a classe é capaz de desenhar. Em outras palavras, a ideia principal de uma interface é declarar funcionalidade .
* Outro benefício importante da introdução de interfaces é que você pode usá-las como um tipo:
```java 
DrawingTool pencil = new Pencil();
DrawingTool brush = new Brush();
```
* Agora, os objetos lápis e pincel têm o mesmo tipo. Isso significa que ambas as classes podem ser tratadas de maneira semelhante a um ```DrawingTool```. Esta é outra maneira de apoiar o <strong>polimorfismo</strong>, que ajuda a projetar a função de desenho reutilizável do programa do editor gráfico.
```java 
void drawCurve(DrawingTool tool, Curve curve) {
    System.out.println("Drawing a curve " + curve + " using a " + tool);
    tool.draw(curve);
}
```
* Em muitos casos, é mais importante saber o que um objeto pode fazer, em vez de como ele faz o que faz. Esta é a razão pela qual as interfaces são comumente usadas para declarar um tipo de variável.
#### Declarando interfaces
* Uma interface pode ser considerada um tipo especial de classe que não pode ser instanciada. Para declarar uma interface, você deve escrever a palavra-chave em ```interface``` vez de ```class``` antes do nome da interface:
* Uma interface pode conter:
  * constantes públicas;
  * métodos abstratos sem uma implementação (a palavra-chave```abstract```  não é necessária aqui);
  * métodos padrão com implementação (a palavra-chave ```default```  é necessária);
  * métodos estáticos com implementação (a palavra-chave ```static```  é necessária);
  * métodos privados com implementação.
``` 
Se os modificadores não forem especificados depois que o método for declarado,
seus parâmetros serão "public abstract" por padrão.
```
* A palavra-chave ```abstract``` antes de um método significa que o método não possui um corpo, apenas declara uma assinatura. ```default``` métodos serão discutidos mais detalhadamente.
* Uma interface não pode conter campos (apenas <strong>constantes</strong>), construtores ou métodos abstratos não públicos. Vamos declarar uma interface contendo todos os membros possíveis:
```java 
interface Interface {
        
    int INT_CONSTANT = 0; // it's a constant, the same as public static final int INT_FIELD = 0
        
    void instanceMethod1();
        
    void instanceMethod2();
        
    static void staticMethod() {
        System.out.println("Interface: static method");
    }
        
    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }

    private void privateMethod() {
        System.out.println("Interface: private methods in interfaces are acceptable but should have a body");
    }
}
```
```
Os métodos estáticos, padrão e privados devem ter uma implementação na interface!
```
* Vamos dar uma olhada mais de perto nessa interface. A variável ```INT_CONSTANT``` não é um campo aqui - é uma constante final estática. Dois métodos ```instanceMethod1()``` e ```instanceMethod2()``` são métodos abstratos. O ```staticMethod()``` é apenas um método estático regular. O método padrão ```defaultMethod()``` tem uma implementação, mas pode ser sobrescrito em subclasses. O também ```privateMethodtem``` uma implementação e pode ser usado para decompor ```default``` métodos.
#### Implementando interfaces
* Uma classe pode implementar uma interface usando a palavra-chave ```implements```. Devemos fornecer implementações para todos os métodos abstratos da interface.
* Vamos implementar a interface que consideramos anteriormente:
```java 
class Class implements Interface {

    @Override
    public void instanceMethod1() {
        System.out.println("Class: instance method1");
    }

    @Override
    public void instanceMethod2() {
        System.out.println("Class: instance method2");
    }
}
```
* Agora podemos criar uma instância da classe e chamar seus métodos:
```java 
Interface instance = new Class();

instance.instanceMethod1(); // it prints "Class: instance method1"
instance.instanceMethod2(); // it prints "Class: instance method2"
instance.defaultMethod();   // it prints "Interface: default method. It can be overridden"
```
* Observe que a ```instance``` variável tem ```Interface``` tipo, embora seja aceitável usá-la ```Class``` para denotar tipo.
#### Implementando e estendendo várias interfaces
* Um dos recursos importantes da interface é a herança múltipla .
* Uma classe pode implementar várias interfaces:
```java 
interface A { }
interface B { }
interface C { }
    
class D implements A, B, C { }
```
* Uma interface pode estender uma ou mais interfaces usando a palavra ```extends```- chave :
```java 
interface A { }
interface B { }
interface C { }

interface E extends A, B, C { }
```
* Uma classe também pode estender outra classe e implementar várias interfaces:
```java 
class A { }

interface B { }
interface C { }
    
class D extends A implements B, C { }
```
* Todos os exemplos acima não apresentam problemas.
* A herança múltipla de interfaces é freqüentemente usada na biblioteca de classes padrão Java. A classe String, por exemplo, implementa três interfaces ao mesmo tempo:
```java 
public final class String 
    implements java.io.Serializable, Comparable<String>, CharSequence {
// ...
}
```
#### Interfaces Marker (Marcador)
* Em algumas situações, uma interface pode não ter nenhum membro. Tais interfaces são chamado <strong>marker</strong> ou <strong>tagged interfaces</strong> (interfaces de etiquetados). Por exemplo, uma interface conhecida ```Serializable``` é uma interface de marcador:
```java 
public interface Serializable{ 
}
```
* Outros exemplos de interfaces de marcador são ```Cloneable```, ```Remoteetc```. Eles são usados para fornecer informações essenciais para a JVM.
#### Métodos estáticos
* Você pode declarar e implementar um método estático em uma interface
```java 
interface Car {
    static float convertToMilesPerHour(float kmh) {
        return 0.62 * kmh;
    }
}
```
* Para usar um método estático, você só precisa invocá-lo diretamente de uma interface
```java 
Car.convertToMilesPerHour(4.5);
```
* O principal objetivo dos métodos estáticos de interface é definir a funcionalidade do utilitário que é comum para todas as classes que implementam a interface. Eles ajudam a evitar a duplicação de código e a criação de classes de utilitários adicionais.
#### Conclusão
* Uma interface é um tipo especial de classe que não pode ser instanciada.
* A ideia principal de uma interface é declarar funcionalidade.
* As interfaces ajudam a abstrair de classes específicas e enfatizam a funcionalidade.
  * Isso torna o design de software mais reutilizável e limpo.
* É uma boa prática projetar classes usando interfaces em vez de classes.
* Para implementar uma interface, a palavra- chave ```implements``` é usada.
* Ao contrário de uma classe, uma interface pode estender várias interfaces.
* Uma classe pode implementar várias interfaces.
#### <hr><hr><hr>
### interface Comparable
* Ao trabalhar com dados, você provavelmente precisará fazer o pedido de uma maneira conveniente. Por exemplo, você pode ter que colocar os números em ordem crescente, agrupar as linhas em ordem alfabética e organizar tudo com que trabalha por data, preço ou outras características personalizadas.
* Em Java, é possível implementar vários algoritmos de classificação para qualquer tipo de dados. E se você tiver que trabalhar com tipos personalizados, classificar os elementos de uma coleção e tentar comparar objetos que não são diretamente comparáveis? É aí que a ```Comparable``` interface se torna útil. Neste tópico, aprenderemos tudo sobre essa interface e seu ```compareTo()``` método.
#### Preparando para comparar
Vejamos um exemplo. Criamos uma lista de ```Integer```'s, adicionamos alguns elementos e os classificamos.
```java 
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(55);
    list.add(13);
    list.add(47);

    Collections.sort(list);
    System.out.println(list);
}
```
* Conforme esperado, obtemos:
```java 
[13, 47, 55]
```
* Agora, vamos criar uma classe simples ```Car``` onde queremos classificar os carros por seus números.
```java 
public class Car {
    private int number;
    private String model;
    private String color;
    private int weight;

    // constructor

    // getters, setters
}
```
* Agora tentamos escrever algum código para o ```main``` método, criar nossa coleção e classificá-la usando o ```Collections.sort()``` método.
```java 
public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
    Car car1 = new Car(876, "BMW", "white", 1400);
    Car car2 = new Car(345, "Mercedes", "black", 2000);
    Car car3 = new Car(470, "Volvo", "blue", 1800);
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);

    Collections.sort(cars);
    System.out.println(cars);
}
```
* Como resultado, obtemos um erro de compilação:
```
The method sort(List<T>) in the type Collections 
  is not applicable for the arguments (ArrayList<Car>)
```
* A razão para isso é que classes padrão como ```Integer```, ```String``` e assim por diante, implementam uma interface especial, para que possamos compará-las sem problemas. Quanto à nossa classe personalizada ```Car```, não funciona assim. Vamos ver como podemos consertar isso.
#### Interface Comparable
* ```Comparable``` fornece o ```compareTo()``` método que permite comparar um objeto com outros objetos do mesmo tipo. Também é importante cumprir as condições: todos os objetos podem ser comparados a outros objetos do mesmo tipo da forma mais utilizada, o que significa que ```compareTo()``` devem ser consistentes com o ```equals``` método. Uma sequência de dados tem a <strong>ordem natural</strong>, se para cada 2 elementos ae b, onde aestá localizado à esquerda de b, a condição for verdadeira: ```a.compareTo(b) <= 0```
* É fácil entender como comparar um ```Integer``` ou ```String``` porque eles já implementam a ```Comparable``` interface, mas como comparamos objetos do nosso tipo personalizado? Podemos fazer isso de maneiras diferentes dependendo da tarefa. Podemos compará-los por qualquer campo único ou vários campos.
* Para podermos classificar, devemos reescrever nossa ```Car``` classe usando a ```Comparable``` interface. Por exemplo, podemos comparar nossos ```Car``` objetos por seus ```number```. Veja como você pode implementá-lo:
```java 
public class Car implements Comparable<Car> {

    private int number;
    private String model;
    private String color;
    private int weight;

    // constructor

    // getters, setters

    @Override
    public int compareTo(Car otherCar) {
        return Integer.valueOf(getNumber()).compareTo(otherCar.getNumber());
    }

}
```
* Agora, se executarmos nosso novo código, obteremos o resultado correto.
#### Implementando o metodo compareTo
* Vamos falar sobre o ```compareTo()``` método. Ele compara o objeto atual com o objeto enviado como parâmetro. Para implementá-lo corretamente, precisamos ter certeza de que o método retorna:
  * Um número inteiro positivo (por exemplo, 1), se o objeto atual for maior;
  * Um número inteiro negativo (por exemplo, -1), se o objeto atual for menor;
  * Zero, se forem iguais.
* Abaixo você pode ver um exemplo de como o ```compareTo()``` método é implementado na ```Integer``` classe.
```java 
@Override
public int compareTo(Integer anotherInteger) {
    return compare(this.value, anotherInteger.value);
}

public static int compare (int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
}
```
* Existem algumas outras regras para implementar o ```compareTo()``` método. Para demonstrá-los, imagine que temos uma classe chamada ```Person```:
```java 
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    
    // constructor

    // getters and setters
}
```
* Nós criamos alguns objetos de ```Person``` e os adicionamos à lista ```people```.
```java 
public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    Person tom = new Person("Tom", 22, 185, 65);
    Person bob = new Person("Bob", 22, 175, 85);
    Person kris = new Person("Kris", 30, 180, 90);
    people.add(tom);
    people.add(bob);
    people.add(kris);

    Collections.sort(people);
    System.out.println(people);
}
```
* Uma das regras é manter a ```compareTo()``` implementação consistente com a implementação do ```equals()``` método. Por exemplo, se compararmos nosso povo por sua idade, ```tom``` e eles ```bob``` têm a mesma idade, então:
  * ```tom.compareTo(bob) == 0``` deve ter o mesmo valor booleano que ```tom.equals(bob)```
* Se compararmos nosso pessoal pela altura, Tom é mais alto que Kris e Kris é mais alto que Bob. Portanto, Tom é mais alto que Bob:
  * ```(tom.compareTo(kris) > 0 && kris.compareTo(bob) > 0)``` implica ```tom.compareTo(bob) > 0```
* Kris é mais velho que Bob, portanto Bob é mais novo que Kris:
  * ```kris.compareTo(bob) > 0``` e ```bob.compareTo(kris) < 0```
* Tom e Bob têm a mesma idade, então ambos devem ser mais novos ou mais velhos que Kris:
  * ```tom.compareTo(bob) == 0``` implica que ```tom.compareTo(kris) > 0``` e ```bob.compareTo(kris) > 0``` ou ```tom.compareTo(kris) < 0``` e ```bob.compareTo(kris) < 0```
* Isso garantirá que possamos usar objetos com segurança em conjuntos classificados e mapas classificados.
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
## Arquivos (Files)
* Frequentemente, um programa precisa processar e armazenar dados localizados fora da base de código: definições de configuração, alguns conjuntos de dados para processamento, logs de execução e assim por diante. A maneira mais simples de armazenar dados é usar arquivos compatíveis com todos os sistemas operacionais modernos. Você pode considerar um arquivo como uma coleção de dados que são armazenados em um disco ou outro dispositivo e que podem ser manipulados como uma única unidade quando endereçada por seu nome. Os arquivos podem ser organizados em diretórios que atuam como pastas para outros arquivos e diretórios.
* Neste tópico, aprenderemos como trabalhar com arquivos diretamente de um programa Java.
#### A classe File
* Existe uma classe chamada ```File``` no ```java.io``` pacote. Um objeto desta classe representa um arquivo existente ou não existente ou um diretório. A classe pode ser usada para manipular arquivos e diretórios: criando, removendo, acessando propriedades e muito mais.
* A maneira mais simples de criar um objeto de arquivo é passar um caminho de string para seu construtor. O formato válido da string depende do sistema operacional:
  * O Windows usa barras invertidas para caminhos (```'\'```),
  * Linux, OS X, Android e outros sistemas semelhantes ao UNIX usam a barra (```'/'```).
* Você deve manter essa diferença em mente ao trabalhar com arquivos.
* Se o seu sistema operacional for Windows, não se esqueça de usar o caractere de escape ```'\'```.
* Vamos criar dois objetos da ```File``` classe para plataformas diferentes.
```java 
File fileOnUnix = new File("/home/username/Documents");    // a directory on a UNIX-like system
File fileOnWin = new File("D:\\Materials\\java-materials.pdf"); // a file on Windows
```
* O código funcionará mesmo se um arquivo ou diretório não existir realmente em seu sistema de arquivos. Não cria um novo arquivo ou diretório. Ele apenas representa um arquivo ou diretório "virtual" que já existe ou pode ser criado no futuro.
* Para exibir o caractere para separar o caminho para um arquivo no seu caso, você pode imprimir o seguinte:
```java 
System.out.println(File.separator); // '/' - for Linux
```
* Os objetos da ```File``` classe são imutáveis; ou seja, uma vez criado, o nome do caminho abstrato representado por um objeto nunca será alterado.
#### Caminho absoluto e relativo
* Você já viu exemplos de arquivos descritos por um caminho absoluto . Simplesmente, um caminho é absoluto se começar com o elemento raiz do sistema de arquivos. Ele contém as informações completas sobre a localização do arquivo, incluindo o tipo de sistema operacional.
```
É considerada uma prática inadequada localizar um arquivo usando seu caminho
absoluto dentro de seus programas, pois você perderá a capacidade de
reutilizar seu programa em diferentes plataformas. Outro problema é que você
não pode transferir o arquivo junto com o diretório especificado, você terá
que alterar o código que o acessa.
```
* Um caminho relativo é um caminho que não inclui o elemento raiz do sistema de arquivos. Isso sempre começa no seu diretório de trabalho . Este diretório é representado por um ```.``` (ponto). Um caminho relativo não está completo e precisa ser combinado com o caminho do diretório atual para chegar ao arquivo solicitado.
* Aqui está um exemplo com um arquivo dentro do diretório de imagens que está em seu diretório de trabalho:
```java 
File fileOnUnix = new File("./images/picture.jpg");
File fileOnWin = new File("./images/picture.jpg");
```
* Como você pode ver, os dois caminhos parecem exatamente iguais, o que fornece independência de plataforma. Curiosamente, o caractere de ponto pode ser ignorado, portanto, o caminho ```images/picture.jpg``` também está correto.
```
Para construir programas independentes de plataforma, é uma convenção comum
usar caminhos relativos sempre que possível. Você também pode transferir o
diretório de trabalho que contém, images/picture.jpg sem nenhuma modificação
de código.
```
* Para acessar o diretório pai, basta escrever ```..```(ponto duplo). Portanto, ```../picture.jpg``` é um arquivo colocado no diretório pai do diretório de trabalho. O caminho relativo ```images/../images/picture.jpg``` significa o diretório pai de e ```images```, em seguida, a ```images``` pasta novamente. E ```picture.jpg``` é o arquivo dentro da ```images``` pasta. Em geral ```images/../images/picture.jpg``` e ```images/picture.jpg``` são os mesmos caminhos.
#### Métodos básicos
* Uma instância de File possui uma lista de métodos. Dê uma olhada em alguns deles:
  * ```String getPath()``` retorna o caminho da string para este arquivo ou diretório;
  * ```String getName()``` retorna o nome deste arquivo ou diretório (apenas o sobrenome do caminho)
  * ```boolean isDirectory()``` retorna ```true``` se é um diretório e existe, caso contrário ```false```,;
  * ```boolean isFile()``` retorna ```true``` se for um arquivo existente (não um diretório), caso contrário ```false```,;
  * ```boolean exists()``` retorna ```true``` se este arquivo ou diretório realmente existe em seu sistema de arquivos, caso contrário ```false```,;
  * ```String getParent()``` retorna o caminho da string para o diretório pai que contém este arquivo ou diretório.
* A lista não está completa, mas por enquanto, vamos nos concentrar nesses. Para outros métodos, veja em: <https://docs.oracle.com/javase/7/docs/api/java/io/File.html> .
* Vamos criar uma instância de um arquivo existente e imprimir algumas informações sobre ele.
```java 
File file = new File("/home/username/Documents/javamaterials.pdf");

System.out.println("File name: " + file.getName());
System.out.println("File path: " + file.getPath());
System.out.println("Is file: " + file.isFile());
System.out.println("Is directory: " + file.isDirectory());
System.out.println("Exists: " + file.exists());
System.out.println("Parent path:" + file.getParent());
```
* Como esperamos, o código imprime o seguinte:
```java 
File name: javamaterials.pdf
File path: /home/username/Documents/javamaterials.pdf
Is file: true
Is directory: false
Exists: true
Parent path: /home/username/Documents
```
* Suponha agora que temos uma instância que representa um arquivo não existente e imprime os detalhes sobre ele:
```java 
File name: javamaterials1.pdf
File path: /home/art/Documents/javamaterials1.pdf
Is file: false
Is directory: false
Exists: false
Parent path:/home/art/Documents
```
* O arquivo não existe e o aplicativo não conhece seu tipo.
* Há também um grupo de métodos ```canRead()```, ```canWrite()```, ```canExecute()``` para testar se o aplicativo pode Ler / Modificar / executar o arquivo denotado pelo caminho. É recomendável usar esses métodos, caso contrário, você pode encontrar erros de acesso ao arquivo quando o usuário não tiver permissões suficientes para realizar uma operação com um arquivo.
* Acreditamos que a ```File``` classe fornece uma API muito clara para processar arquivos e diretórios em diferentes plataformas.
#### <hr>
### Lendo Arquivos
* A biblioteca de classes Java padrão fornece várias maneiras de ler dados de arquivos. Alguns deles são bastante antigos, outros surgiram recentemente. Neste tópico, consideraremos apenas dois métodos básicos, o que é suficiente por enquanto. Você pode escolher aquele que é mais adequado para você.
#### Leitura de dados usando Scanner
* É possível usar ```java.util.Scanner``` para ler dados de arquivos. Esta classe é uma abordagem de alto nível para ler dados de entrada. Ele permite a leitura de tipos ou strings primitivos usando expressões regulares.
* Em primeiro lugar, precisamos criar uma instância de ```java.io.File``` e, em seguida, uma instância de ```Scanner``` passagem do objeto de arquivo. Depois disso, podemos obter os dados do arquivo usando o scanner da mesma forma que lemos na entrada padrão.
* Suponha que você tenha uma string chamada ```pathToFile```. Ele mantém o caminho para um arquivo que contém uma sequência de números separados por espaços.
* Vamos criar um objeto de arquivo e então um scanner para ler os dados do arquivo.
```java 
File file = new File(pathToFile);
Scanner scanner = new Scanner(file); // it throws FileNotFoundException (checked)
```
* Ao criar uma instância de ```Scanner``` passagem de arquivo, você deve tratar a exceção verificada ```FileNotFoundException```. Você também pode declarar o método como lançando essa exceção.
* Agora, podemos usar métodos de ```Scanner``` ler dados como strings, inteiros e assim por diante.
* Vamos ler uma linha do arquivo
```java 
while (scanner.hasNext()) {
    System.out.print(scanner.nextLine());
}
```
* Este código lê cada linha do arquivo e a envia para a saída padrão.
* Após usar um scanner, devemos fechar o objeto para evitar vazamentos . Uma maneira conveniente de fechar scanners e lidar com exceções é usar a instrução try-with-resources conforme abaixo. Leia mais sobre try-with-resources no tutorial oficial .
* O exemplo completo de ```Scanner``` uso é apresentado abaixo:
```java 
File file = new File(pathToFile);
 
try (Scanner scanner = new Scanner(file)) {
    while (scanner.hasNext()) {
        System.out.print(scanner.nextLine() + " ");
    }
} catch (FileNotFoundException e) {
    System.out.println("No file found: " + pathToFile);
}
```
* Então, para um arquivo contendo:
```java 
first line
second line
third line
```
* O programa produz para consolar o seguinte resultado:
```java 
first line second line third line
```
* O scanner também permite que você leia inteiros, booleanos, duplos e outros tipos. Os métodos têm nomes correspondentes como ```nextInt```, ```nextBoolean``` e etc. No caso de não haver novos dados disponíveis, qualquer um dos ```next``` métodos retorna ```java.util.NoSuchElementException```.
* Em vez de exibir os dados lidos na saída padrão, você pode armazená-los em uma matriz ou string.
#### Lendo todo o texto de um arquivo como uma única string
* Desde o Java 1.7, há um conjunto de novas classes e métodos para lidar com arquivos. Dentro deste tópico, nos limitaremos a aprender como ler um arquivo de texto inteiro. Observe que este método deve ser usado apenas para pequenos arquivos de texto . Por pequeno, queremos dizer que seu tamanho é menor do que a RAM disponível na JVM. Isso é mais do que suficiente para aprender e realizar pequenas tarefas.
* Em primeiro lugar, faça as seguintes importações:
```java 
import java.nio.file.Files;
import java.nio.file.Paths;
```
* A ```Files``` classe consiste em métodos que operam em arquivos, a ```Paths``` classe contém um conjunto de métodos que retornam um objeto especial para representar o caminho para um arquivo.
* O método a seguir retorna todo o texto de um arquivo especificado:
```java 
public static String readFileAsString(String fileName) throws IOException {
    return new String(Files.readAllBytes(Paths.get(fileName)));
}
```
* Vamos tentar usar o método ```readFileAsString``` para ler o código-fonte do arquivo ```HelloWorld.java``` e imprimi-lo na saída padrão. ```HelloWorld.java``` contém um programa básico tradicional mencionado em um dos primeiros tópicos "O primeiro programa".
```java 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingFileDemo {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {
        String pathToHelloWorldJava = "/home/username/Projects/hello-world/HelloWorld.java";
        try {
            System.out.println(readFileAsString(pathToHelloWorldJava));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}
```
* Ele imprime o código-fonte:
```java 
package org.hyperskill;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```
* Observe que não é difícil modificar o código acima para que ele leia o caminho para o arquivo de destino da entrada padrão em vez de codificá-lo.
#### <hr>
### Writing files (Escrevendo em arquivos)
* Agora que aprendemos como criar e gerenciar arquivos, vamos discutir como escrever texto em um arquivo. Java fornece maneiras diferentes de fazer isso e, nesta lição, consideraremos duas das maneiras mais simples: usando as classes ```java.io.FileWriter``` e  ```java.io.PrintWriter```.
#### A classe FileWriter
* A classe ```FileWriter``` tem um conjunto de construtores para gravar caracteres e strings em um arquivo especificado:
  * ```FileWriter(String fileName);```
  * ```FileWriter(String fileName, boolean append)```;
  * ```FileWriter(File file)```;
  * ```FileWriter(File file, boolean append)```;
* Dois construtores usam um parâmetro adicional ```append``` que indica se é para anexar (```true```) ou sobrescrever (```false```) um arquivo existente.
* Todos esses construtores podem lançar um ```IOException``` por vários motivos:
  * se o arquivo nomeado existe, mas é um diretório;
  * se um arquivo não existe e não pode ser criado;
  * se um arquivo existe, mas não pode ser aberto.
* Nesta lição, às vezes, ignoraremos o mecanismo de tratamento de exceções para simplificar nossos exemplos.
* Vamos considerar o seguinte código:
```java 
File file = new File("/home/username/path/to/your/file.txt");
FileWriter writer = new FileWriter(file); // overwrites the file

writer.write("Hello");
writer.write("Java");

writer.close();
```
* Se o arquivo especificado não existir, ele será criado após a execução deste código. Se o arquivo já existir, este código substituirá os dados.
* O arquivo conterá o texto HelloJava .
* Se você quiser acrescentar alguns novos dados, você deve especificar o segundo argumento como verdadeiro.
```java 
File file = new File("/home/username/path/to/your/file.txt");
FileWriter writer = new FileWriter(file, true); // appends text to the file

writer.write("Hello, World\n");
writer.close();
```
* Este código anexa uma nova linha ao arquivo. Execute-o várias vezes para ver o que acontece. Observe que aqui estamos usando quebras de linha do sistema operacional do tipo Unix. Há uma diferença entre os caracteres de quebra de linha em plataformas diferentes:
* \n SO tipo Unix
* \r\n SO Windows
#### Fechando um FileWriter
* É importante fechar um ```FileWriter``` depois de usá-lo para evitar vazamento de recursos. Isso é feito invocando o método close:
```
writer.close();
```
* Desde o Java 7, a maneira conveniente de fechar um objeto ```FileWriter``` é usar a instrução try-with-resources .
```java 
File file = new File("/home/username/path/to/your/file.txt");

try (FileWriter writer = new FileWriter(file)) {
    writer.write("Hello, World");
} catch (IOException e) {
    System.out.printf("An exception occurred %s", e.getMessage());
}
```
* Isso fechará o gravador automaticamente.
#### A classe PrintWriter
* A ```PrintWriter``` classe permite que você grave dados formatados em um arquivo. Ele pode gerar strings, tipos primitivos e até mesmo uma matriz de caracteres. A classe fornece vários métodos sobrecarregados: ```print```, ```println``` e ```printf```.
```java 
File file = new File("/home/art/Documents/file.txt");
try (PrintWriter printWriter = new PrintWriter(file)) {
    printWriter.print("Hello"); // prints a string
    printWriter.println("Java"); // prints a string and then terminates the line
    printWriter.println(123); // prints a number
    printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
} catch (IOException e) {
    System.out.printf("An exception occurred %s", e.getMessage());
}
```
* Este exemplo primeiro cria uma instância de ```File``` e, segundo, a ```PrintWriter``` na instrução try-with-resources para fechá-la corretamente. Ele escreve ```"Hello"``` e ```"Java"``` na mesma linha e, ```123``` em seguida, em uma nova linha. Este exemplo também chama o avançado ```printf``` método que pode formatar um texto usando ```%d```, ```%s``` e assim por diante. Finalmente, o ```PrintWriter``` é fechado.
* O resultado contém:
```java 
HelloJava
123
You have 400 gold coins
```
* A classe possui vários construtores. Alguns deles são semelhantes aos construtores de FileWriter:
  * ```PrintWriter(String fileName)```;
  * ```PrintWriter(File file)```.
* Outros permitem passar ```FileWriter``` como uma classe que estende a ```Writer``` classe abstrata:
  * ```PrintWriter(Writer writer)```.
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
#### <hr>
## Banco de dados com Java
### Introdução aos bancos de dados
* O mundo hoje está sobrecarregado de informações, e nós também. Como você mantém as informações importantes seguras e classificadas? Você pode simplesmente esperar que não esqueça nem confunda nada, mas é melhor anotar ou salvar no seu dispositivo. Então você o tem em seu computador ou telefone, e o programa mantém as informações seguras. Enquanto o programa está ativo, ele "lembra" de tudo. No entanto, encerrar o programa pode resultar na perda de todas essas informações. É por isso que é melhor manter os dados usando ferramentas mais sofisticadas.
* O desafio é navegar por uma enorme e complexa rede de informações e garantir que tudo o que é importante esteja seguro e organizado: uma tarefa que os bancos de dados administram bem.
#### Banco de dados
* Um banco de dados é uma coleção de dados especificamente organizada para uma rápida pesquisa e recuperação processada por um computador.
* A diferença entre um banco de dados e um arquivo comum é que um arquivo pode ser estruturado ou não, mas um banco de dados deve ter uma estrutura específica. Por exemplo, você pode criar um arquivo com uma lista de tarefas:
* Obviamente, diríamos que esse arquivo tem algum tipo de estrutura, mas do ponto de vista do computador, ainda é um arquivo simples, até que você escreva um programa que gerencie os dados nele. Normalmente, as informações nos bancos de dados são compactadas e armazenadas como binários em vez de texto simples, portanto, está claro que esse tipo de estrutura se destina a computadores, não a humanos.
* Ao contrário de nós, os computadores podem entender facilmente o formato binário dos dados, mas o que lhes permite ler e escrever corretamente? É um programa chamado Database Management System que controla os dados em um banco de dados.
#### Sistema de gerenciamento de banco de dados
* Um sistema de gerenciamento de banco de dados ( DBMS ) é um tipo de software que permite aos usuários definir, criar e controlar dados em um banco de dados.
* O SGBD pode otimizar as consultas, recuperar dados do banco de dados de forma otimizada. Ele também isola os dados do usuário. O SGBD é um mediador entre um usuário e um banco de dados, o que significa que os usuários podem trabalhar com bancos de dados através da interface do SGBD.
* Outro objetivo deste software é ajudar os usuários a trabalhar com diferentes bancos de dados sem expor suas diferenças reais.
* A maioria dos sistemas de gerenciamento de banco de dados tem descrições e tutoriais muito bons em seus sites. Existem também linguagens específicas que você precisa aprender para começar a trabalhar com um banco de dados, mas se você conhece linguagens de programação, pode trabalhar com um banco de dados com suas ferramentas.
```
Embora pareça que todos os bancos de dados têm sintaxes diferentes, a maioria
deles realmente implementa padrões comuns. Quase todos os bancos de dados
relacionais usam o padrão SQL, portanto, você pode aplicar os mesmos comandos
em diferentes DBMSs.
```
#### Acesso aos dados
* Nesta fase, você ainda pode ter dúvidas quanto ao uso de bancos de dados. Você precisa aprender um novo idioma para atualizar e selecionar os dados, o que pode ser demorado, então por que não usar arquivos simples?
* Claro, você pode manter os arquivos localmente, mas à medida que eles aumentam em número, você não será capaz de encontrar informações rapidamente. Os bancos de dados fornecem esquemas e metadados que permitem uma pesquisa rápida dos dados necessários.
``` 
Um esquema descreve como VOCÊ organiza os dados. Os metadados contêm
informações estruturais e estatísticas.
```
* Se você deseja acessar seus dados de vários dispositivos, a maioria dos sistemas oferece uma maneira conveniente de trabalhar com eles pela web.
* Para abrir o acesso restrito a outra pessoa, alguns sistemas de gerenciamento usam autenticação simples de login / senha, enquanto alguns fornecem instrumentos mais poderosos. Com a ajuda deles, você pode conceder acesso a uma parte limitada dos dados de cada usuário.
* Se você ainda não está convencido de como os DBMSs são excelentes, vamos ver o que mais você pode obter deles.
#### A consistência dos dados
* Uma das melhores características dos bancos de dados é a capacidade de manter e restaurar os dados corretamente. Isso não significa que o SGBD saiba como estar correto, mas uma vez que você defina a correção com a configuração ou esquema, pode ter certeza de que nada quebrará essas regras. O DBMS pode fornecer formatos que você pode usar para seus dados. Você também pode configurar todos os testes e restrições que deseja ter.
* Digamos que você tenha alguns dados aos quais vários usuários com seus dispositivos tenham acesso: isso pode criar um conflito de atualizações. As atualizações nos arquivos geralmente seguem a regra "último salvamento vence". Os bancos de dados, por outro lado, isolam diferentes usuários e podem ser configurados para resolver conflitos entre suas atualizações
* Há outra coisa boa sobre bancos de dados. Quando um arquivo comum é corrompido e não pode ser aberto, você perde seus dados para sempre. Em vez disso, usando o DBMS, você pode fazer backups e restaurar os dados para continuar seu trabalho.
```
Claro, você pode emular todas essas operações e desenvolver seu DBMS, mas
primeiro, tente trabalhar com as soluções existentes.
```
#### <hr>
### O que é SQL
* SQL (Structured Query Language) é uma linguagem de programação específica de domínio projetada para lidar com dados em tabelas. Ele foi desenvolvido na década de 1970 e as interfaces do tipo SQL ainda são amplamente utilizadas e suportadas em sistemas de gerenciamento de dados até hoje, incluindo aqueles não baseados em tabelas!
* Compreender uma linguagem que é usada com tanta frequência provavelmente será muito útil. Se você é um engenheiro de software, é bom aprender porque muitos sistemas armazenam e processam dados de negócios por meio de serviços que oferecem suporte a SQL. Por exemplo, o back-end do sistema de informações de uma seguradora pode usar SQL para extrair e atualizar dados sobre seus clientes.
* Começaremos examinando um exemplo concreto de como você pode usar SQL para calcular estatísticas. Em seguida, aprofundaremos nosso conhecimento examinando o que significam as letras do nome SQL.
#### Calculando estatísticas
* O SQL facilita a agregação de dados e o cálculo de estatísticas. Suponha que você precise avaliar as mudanças na popularidade do nome Jessie entre 1920 e 2000 (inclusive) com base nos dados do censo. Usando SQL, você pode completar esta tarefa com apenas 11 linhas de código! Você pode não entender o código abaixo ainda, então tente lê-lo como uma frase escrita em inglês. Ele seleciona registros sobre indivíduos nomeados ```'Jessie'``` que nasceram ```BETWEEN 1920 and 2000```. É agrupa-os por ```year``` e ```gender```, contagem do número de fichas de cada grupo por meio de ```COUNT(*)```, e gera uma tabela com colunas chamadas ```year```, ```gender``` e ```cnt```. Ele também classifica a tabela ```year``` e ```gender``` em ordem decrescente.
* SQL é a linguagem de manipulação de dados padrão usada por empresas orientadas a dados em todo o mundo. Há muito a ganhar com sua compreensão e muito a aprender. O melhor lugar para começar é com o básico, então vamos agora dar uma olhada no que cada letra do nome SQL significa para descobrir exatamente com o que estamos lidando!
#### S é para estruturado
* SQL é uma linguagem usada para extrair e atualizar dados estruturados como tabelas. Esse tipo de dado aparece em várias áreas de aplicação, como planilhas do Excel contendo dados contábeis ou estatísticas de censo no Google BigQuery. Outro exemplo é uma loja online que utiliza um sistema de software especial para manter e acessar tabelas, conhecido como Relational Database Management System (RDBMS) . Isso pode ajudar a processar informações sobre mercadorias, pedidos e clientes.
* O SQL destina-se ao uso com tabelas que possuem uma estrutura específica. As tabelas contêm linhas que representam entidades ou objetos e colunas que contêm os nomes dos atributos dessas entidades. Por exemplo, uma tabela de células de lojas de linha r e a coluna C o valor de atributo C durante R. entidade Na ```"census"``` tabela mostrada na secção anterior, as linhas representam os indivíduos com os atributos ```id```, ```year```, ```name```, e ```gender```. Por exemplo, a terceira linha contém dados sobre Willie, um homem nascido em 1985.
* Os dados geralmente são organizados em um conjunto de tabelas, conhecido como banco de dados . Então, é possível acessar essas tabelas usando seus nomes individuais. Por exemplo, no banco de dados de uma loja online, uma tabela chamada Clientes provavelmente conteria informações gerais sobre os clientes da empresa (seus nomes e detalhes de contato). A tabela Pedidos armazenaria informações sobre os pedidos específicos que eles fazem (cliente, mercadorias, detalhes de pagamento).
#### Q é para consulta
* SQL é uma linguagem de programação com um grande conjunto de recursos de processamento de dados. É declarativo , o que significa que uma instrução escrita em SQL é uma consulta que informa ao sistema o que deve ser feito ou avaliado, mas não especifica como.
* Para ajudar a ilustrar isso, vamos nos concentrar em uma funcionalidade simples: extrair dados de uma tabela. Se tivermos uma tabela chamada ```Customers```, uma consulta para extrair todas as linhas e colunas dela seria escrita da seguinte maneira:
```sql 
SELECT * FROM Customers;
```
* É prática padrão terminar cada instrução SQL com um ponto e vírgula, conhecido como terminador de instrução .
* Palavras-chave como ```SELECT``` não diferenciam maiúsculas de minúsculas na linguagem SQL. Eles podem estar em qualquer caixa de letra, mas geralmente são escritos em caixa alta para torná-los mais visíveis.
#### L é para a linguagem
* Você pode ler a consulta simples no exemplo acima como "selecione tudo dos clientes". O SQL foi projetado para ser o mais semelhante possível a uma linguagem natural . Sua natureza declarativa ajuda a ocultar as complexidades da operação, permitindo ao usuário definir o que é necessário de uma forma relativamente direta. O sistema então analisa a consulta, escolhe o fluxo de controle e o executa.
* O SQL foi originalmente adotado como padrão pelo American National Standards Institute (ANSI) na década de 1980, e há muitos dialetos implementados por fornecedores de software que o suportam. Os dialetos são baseados no padrão ANSI, mas apresentam algumas diferenças técnicas. Por exemplo, eles podem não processar datas ou strings da mesma maneira. Isso significa que as consultas SQL escritas em dialetos diferentes não são compatíveis. No entanto, uma vez que você conheça o básico do SQL, é possível se adaptar a diferentes dialetos com muita facilidade, como acontece com o inglês americano e britânico escrito.
```
A sintaxe do MySQL foi usada neste tópico e em outras partes deste site,
portanto, os exemplos podem não ser compatíveis com outros dialetos SQL.
``` 


