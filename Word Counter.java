
import java.io.BufferedReader;
import java.io.FileReader;

public class Task2_WordCounter {

    public static void main(String[] args) throws Exception {
        String line;
        int counter = 0;
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        while ((line = br.readLine()) != null) {
            String words[] = line.split(" ");
            counter = counter + words.length;
        }
        System.out.println("Number of words in file:" + counter);
        br.close();

    }
}
