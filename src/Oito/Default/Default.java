package Oito.Default;

public interface Default {
    int valor = 9; // constante dentro da interface

    String mensagem();

    default void metodo() {
        System.out.println("Metodo Padrao");
    }
}
