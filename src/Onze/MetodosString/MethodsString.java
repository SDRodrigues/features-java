package Onze.MetodosString;

public class MethodsString {
    public static void main(String[] args) {
        // etodos strings
        var pais = "           Brasil!!";
        System.out.println("pais.repeat(3)" + pais.repeat(3)); // repete a quantidade informada
        System.out.println("pais.repeat(3)" + pais.isBlank()); // retorna um boolean true se estiver vazio
        System.out.println("pais.repeat(3)" + pais.strip()); // remove os espacos
        System.out.println("pais.trim" + pais.trim());
    }
}
