package wordle;

import org.json.JSONArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Word {

    public static String Word() throws IOException {
        String data = new String(Files.readAllBytes(Path.of("./word-list.json")));
        JSONArray jsonArray = new JSONArray(data);
        //*237
        int rand = (int) (Math.random() * 237);
        
        return (String) jsonArray.get(rand);
    }
}
