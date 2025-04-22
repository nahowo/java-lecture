package java_adv2.io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadTextFileV2 {
    private static final String PATH = "source/temp/hello2.txt";
    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("==write String==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        Files.writeString(path, writeString, UTF_8);

        System.out.println("==read String==");
        List<String> lines = Files.readAllLines(path, UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }
    }
}
