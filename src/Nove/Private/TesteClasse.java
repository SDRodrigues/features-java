package Nove.Private;

public class TesteClasse implements TesteInterface {
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        TesteInterface testeInterface = new TesteClasse();
        testeInterface.method1();
        testeInterface.method2();


        TesteInterface.method3();
    }
}
