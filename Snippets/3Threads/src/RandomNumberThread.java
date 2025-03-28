import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class RandomNumberThread extends Thread {
    private final int threadNumber;

    public RandomNumberThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    private int getRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
    private void writeToFile(int number) {
        Path path = Paths.get("file" + threadNumber + ".txt");
        try{
            Files.write(path, String.valueOf(number).getBytes(), StandardOpenOption.CREATE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void run() {
        int number = getRandomNumber(100);
        writeToFile(number);
    }
}
