package Dez.ImmuCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmuCollections {
    public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            strings.add("Ana Lucia");
            strings.add("Joana");
            strings.add("Pricila");
            strings.add("Bianca");

            var s = Set.copyOf(strings);
            s.forEach(System.out::println);

            var n = Set.of("Bia", "Ana", "Lú", "Jô");
            n.forEach(System.out::println);

            var m = Map.of("K1", 1, "K2", 2, "K3", 3);
            m.forEach((k, v) -> System.out.println("Key=" + k + " " + "Value=" + v));
    }
}
