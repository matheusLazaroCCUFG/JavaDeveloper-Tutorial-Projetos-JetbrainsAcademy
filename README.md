# Java Developer - Jetbrains Academy
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
#### <br>
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