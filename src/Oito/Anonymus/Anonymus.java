package Oito.Anonymus;
// sao classes sem nome,
//utilzamos classes anonimas quando temos interfaces com um ou poucos metodos
// e nao precisamos reaproveitar o codigo da classe,
public class Anonymus {
    public void imprimeTexto() {
        System.out.println("Algum texto");
    }
    public static void main(String[] args) {
        Anonymus anonymus = new Anonymus() { // classe anonima
            public void imprimeTexto() {
                System.out.println("O texto será sobrescrito");
            }
        };

        anonymus.imprimeTexto();
    }
    // ou seja, se nao precisamos reaproveitar a classe
    // em um outro lugar do nosso sistema e esta classe
    // que eu deveria cirar iria apenas implementar
    // uma interface com um ou poucos metodos, podemos utilizar o conceito de classe anonima
}
