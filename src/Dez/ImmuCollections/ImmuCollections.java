package Dez.ImmuCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmuCollections {
    public static void main(String[] args) {
            List<String> nomes = new ArrayList<>();
            nomes.add("Ana Lucia");
            nomes.add("Joana");
            nomes.add("Pricila");
            nomes.add("Bianca");

            var s = Set.copyOf(nomes);
//            s.forEach(System.out::println);
            System.out.println(s);

            var n = Set.of("Bia", "Ana", "Lú", "Jô");
//            n.forEach(System.out::println);
            System.out.println(n);

            var m = Map.of("K1", 1, "K2", 2, "K3", 3);
            System.out.println(m);
    }
}
