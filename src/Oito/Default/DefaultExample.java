package Oito.Default;
// default method
// sao metodos concretos implementados em interfaces, estes metodos,
// como sao concretos, ou seja, ja possuem implementacao,
// nao precisam ser implementados, nas classes que implementarem essa interface
public class DefaultExample {
    public static void main(String[] args) {
        Default classeDefault = new ClasseDefault();
        classeDefault.metodoDefault();
    }

    //
    //os default methods permitem que tenhamos metodos concretos em nossas interface, e esses metodos
    // nao precisam ser obrigatoriamente implementados nas classes
    //que implementam essas interface, pois ja sao metodos concretos, ou seja, ja sao metodos implementados
    //
}
