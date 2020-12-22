import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {

    public static void main(String[] args) {
        //Берем строки из файла и переводим в одну строку
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\zahar\\IdeaProjects\\Benchmark\\src\\main\\warandpiece.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        var str = sb.toString();

        var arrays = new Arrays();

        arrays.fillArrayList(str);
        var countFindNumberArrayList = arrays.countFindNumberArrayList("тогда");

        arrays.fillLinkedList(str);
        var countFindNumberLinkedList = arrays.countFindNumberLinkedList("тогда");

        arrays.fillHashMap(str);
        var countFindNumberHashMap = arrays.countFindNumberHashMap("тогда");

        System.out.println(countFindNumberArrayList);
        System.out.println(countFindNumberLinkedList);
        System.out.println(countFindNumberHashMap);

    }
}

