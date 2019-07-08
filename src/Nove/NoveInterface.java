package Nove;

public interface NoveInterface {
    int valor = 9; // constante dentro da interface

    String mensagem();

    default void metodo() {
        System.out.println("Metodo Padrao");
        chama();
    }

    private void chama() {
        System.out.println("metodo privado");
    }
}
