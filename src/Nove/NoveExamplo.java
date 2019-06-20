package Nove;

public class NoveExamplo implements NoveInterface {
    @Override
    public String mensagem() {
        return null;
    }

    public static void main(String[] args) {
        NoveInterface noveInterface = new NoveClass();
        noveInterface.metodo();
        noveInterface.mensagem();
        System.out.println(noveInterface);
    }
}
