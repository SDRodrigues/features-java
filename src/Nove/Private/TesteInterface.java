package Nove.Private;

public interface TesteInterface {

      void method1(); // vai ser implementado na classe obrigatoriamente

     default void method2() {
        method4();  // method metodo privado sendo executado apenas
         // dentro da interface, sendo executado dentro do metodo2


        method5(); // metodo statico sendo executado dentro
         // apenas dentro da interface
        System.out.println("metodo padrao");
    }

     static void method3() {
        method5(); //static method inside other static method
        System.out.println("metodo static");
    }

    private void method4(){
        System.out.println("metodo privado");
    }

    private static void method5(){
        System.out.println("metodo static privado");
    }
}
