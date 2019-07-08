package Onze.ReadWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Read {
    public static void main(String[] args) throws IOException {

        var fileName = "palavras.txt";

        var data = Files.readString(Path.of("palavras"));

        System.out.println(data);
    }
}
