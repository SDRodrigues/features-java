package Onze.ReadWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Write {
    public static void main(String[] args) throws IOException {

        var words = "floresta\ncasa\nsmartphone\nrios";

        Files.writeString(Path.of("palavras"), words);

        System.out.println(words);
    }
}
