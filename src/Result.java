import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Result {
    static void saveResult(Result[] results, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Result result : results) {
            if (result != null) {
                writer.write(result.toString());
                writer.newLine();
            }
        }
        writer.close();
    }
}
