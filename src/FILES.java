import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FILES {
    public static void main(String[] args)  throws IOException {
        readFile();
        writeFile();
    }

    private static void readFile() throws IOException{
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\JavaLearn\\src\\test.txt");
        //can be used for small text files but for large ones can cause out of memory error
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);

        //for big files use buffered reader
        BufferedReader reader = Files.newBufferedReader(path);
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        //always close reader if using try catch it closes the reader automatically
    }

    private static void writeFile() throws IOException{
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\JavaLearn\\src\\write.txt");
        Files.writeString(path,"Falling through the atmosphere right now\n");

        //for writing in big files
        BufferedWriter writer = Files.newBufferedWriter(path,StandardOpenOption.APPEND);
        writer.write("Baby, are you really down?\n");
        writer.close();
        //always close buffered writer to avoid memory leak
    }
}
