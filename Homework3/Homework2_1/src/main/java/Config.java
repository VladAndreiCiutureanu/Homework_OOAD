import org.json.JSONObject;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Config {

    private static Config instance;
    private String color;
    private int weight;
    private Config() {
        try{
            System.out.println("Loading Config");
            String content = new String(Files.readAllBytes(Paths.get("config.json")));
            JSONObject obj = new JSONObject(content);
            color = obj.getString("color");
            weight = obj.getInt("weight");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Config getInstance() {
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
