import com.google.gson.Gson;

import java.io.FileWriter;

public class WriteToJson {
    public static void write(Solution sol){
        Gson gson = new Gson();
        String json = gson.toJson(sol);
        try{
            FileWriter writer = new FileWriter("output.json",true);
                writer.write(json);
                writer.write("\n");
                writer.close();
        }
        catch(Exception e){
            System.out.println("Error writing to file!");
        }
    }
}
