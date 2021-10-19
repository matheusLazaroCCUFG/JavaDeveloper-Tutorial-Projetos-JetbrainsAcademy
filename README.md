# Java Developer - Jetbrains Academy
#### Perfil Hyperskill: https://hyperskill.org/profile/144157174
# <hr>
## Anotações importantes
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
  * Evitar linhas com mais de 80 caracteres
    * Util quando laptops sao usados.
#### <hr>
#### Ler uma sequência de comprimento desconhecido com ```while```
* O ```while``` loop também pode ser usado para ler uma sequência de caracteres de comprimento arbitrário. Para isso, podemos invocar o ```hasNext()``` método de ```Scanner``` dentro da condição. O método retorna ```true``` se o próximo elemento existe e ```false``` caso contrário.
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
  * ```int length()``` retorna o comprimento (a contagem de caracteres), como em strings regulares. Este método não modifica o objeto.
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
  * ```StringBuilder append(String str)``` concatena a string fornecida ao final do ```StringBuilder``` objeto de chamada . Existem também várias sobrecargas para pegar tipos primitivos e até matrizes de caracteres.
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
  * ```StringBuilder reverse()``` faz com que essa sequência de caracteres seja substituída pelo reverso da sequência.
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
* Existem dois métodos que não devem ser confundidos: ```length``` e ```capacity```. O ```length``` retorna o número real de caracteres, enquanto ```capacity``` retorna a quantidade de armazenamento disponível para os caracteres recém-inseridos, além da qual ocorrerá uma alocação. A capacidade é uma parte da representação interna de ```StringBuilder``` e seu valor mudará dinamicamente.
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
* Se você tiver problemas para entender o que é a exceção, você pode copiar e colar o nome e pesquisar no Google. Além disso, você é fortemente encorajado a fazê-lo, pois 99% dos problemas que os alunos encontram já foram resolvidos em fóruns profissionais.
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
* Assim como para qualquer tipo de referência, o operador ```==``` verifica se dois objetos de invólucro são realmente iguais, ou seja, se eles se referem ao mesmo objeto na memória. O método ```equals```, por outro lado, verifica se dois objetos de invólucro são significativamente iguais, por exemplo, verifica se dois invólucros ou cadeias de caracteres têm o mesmo valor.
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
### POO - Programação Orientada a Objetos 
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
#### Implemtnendo o metodo compareTo
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
