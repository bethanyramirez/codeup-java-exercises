import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {
    public static void main(String[] args) {


        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename); // telling it where the file should go.



        try {
//            if (Files.notExists(dataDirectory)) {
//                Files.createDirectories(dataDirectory);
//            }
//
//            if (!Files.exists(dataFile)) {
//                Files.createFile(dataFile);
//            }

            Files.write(
                    Paths.get("data", "info.txt"),
                    Arrays.asList("strawberries"), // list with one item
                    StandardOpenOption.APPEND
            );

//            List<String> fruits = new ArrayList<>();
//            fruits.add("banana");
//            fruits.add("apple");
//            fruits.add("pineapple");
//
//            Files.write(dataFile, fruits);
//
//            List<String> lines = Files.readAllLines(dataFile);
//            for(String line : lines){
//                System.out.println(line);
//            }
        } catch(IOException ioe){
            System.out.println("look at what went wrong--->" + ioe);
        }
    }
}
