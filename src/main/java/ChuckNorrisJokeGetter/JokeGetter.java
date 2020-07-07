package ChuckNorrisJokeGetter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JokeGetter {

    private static final String HOST = "https://api.chucknorris.io/jokes/random";
    private static Map<String, String> jokeMap;

    public static JSONObject getJokeJsonObject() throws IOException, ParseException {

        jokeMap = new LinkedHashMap<>();

        URL url = new URL(HOST);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        StringBuilder jsonStringBuilder = new StringBuilder();
        if (responseCode != 200) {
            throw new RuntimeException("Response code: " + responseCode);
        } else {
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                jsonStringBuilder.append(scanner.nextLine());
            }
            scanner.close();
        }
        String jsonString = jsonStringBuilder.toString();

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(jsonString);

        String id = String.valueOf(jsonObject.get("id"));
        String jokeString = String.valueOf(jsonObject.get("value"));

        jokeMap.put(id, jokeString);

        return jsonObject;
    }

    public static void main(String[] args) throws IOException, ParseException {

        for (int i = 0; i < 30; i++) {
            JSONObject jokeJsonObject = getJokeJsonObject();
            String joke = String.valueOf(getJokeJsonObject().get("value"));
            System.out.println(joke);


        }

    }
}
