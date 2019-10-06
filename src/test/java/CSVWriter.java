import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVWriter {

    /** http://qaru.site/questions/415467/java-writing-strings-to-a-csv-file s*/

    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new File("test1.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("id,");
            sb.append("Name");
            sb.append('\n');

            sb.append("1,");
            sb.append("Prashant Ghimire");
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
