package Dez;

import java.util.List;

public class JavaDezExemplo {
    public static void main(String[] args) { // A inferência de tipo local pode ser usada apenas nos seguintes cenários:
        var numeros = List.of(1, 2, 3 ,4 ,5);
        for (var numero: numeros) {
            System.out.println(numero);
        }
    }
}
