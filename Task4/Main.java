import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(numbers);
        int median = numbers.size() / 2;
        int result = 0;

        for (int n : numbers) {
            result += Math.abs(n - numbers.get(median));
        }

        System.out.println(result);
    }
}

