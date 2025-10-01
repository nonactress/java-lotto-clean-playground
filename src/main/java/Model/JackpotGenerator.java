package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JackpotGenerator {
    private final List<Integer> number;

    private JackpotGenerator(List<Integer> numbers) {
        this.number = numbers;
    }

    public static JackpotGenerator from(String[] splits) {
        if (splits.length != 6) {
            throw new IllegalArgumentException("당첨 번호는 6개여야 합니다.");
        }
        List<Integer> numbers = parseNumbers(splits);
        validateNumbers(numbers);
        Collections.sort(numbers);
        return new JackpotGenerator(Collections.unmodifiableList(numbers));
    }

    private static List<Integer> parseNumbers(String[] splits) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : splits) {
            try {
                numbers.add(Integer.parseInt(s.trim()));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("당첨 번호는 숫자여야 합니다.");
            }
        }
        return numbers;
    }

    private static void validateNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        if (uniqueNumbers.size() != 6) {
            throw new IllegalArgumentException("당첨 번호는 중복될 수 없습니다.");
        }

        for (int number : numbers) {
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("당첨 번호는 1과 45 사이의 숫자여야 합니다.");
            }
        }
    }

    public List<Integer> getNumber() {
        return number;
    }
}
