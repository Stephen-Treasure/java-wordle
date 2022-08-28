package wordle;

import org.json.JSONArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        String data = new String(Files.readAllBytes(Path.of("./word-list.json")));
        JSONArray jsonArray = new JSONArray(data);
        System.out.println(jsonArray);

    }
}
