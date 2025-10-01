package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JackpotGenerator {
    private final List<Integer> number;

    private JackpotGenerator(String[] splits) {
        List<Integer> tempNumbers = new ArrayList<>();
        for (String s : splits) {
            tempNumbers.add(Integer.parseInt(s));
        }
        Collections.sort(tempNumbers);
        this.number = Collections.unmodifiableList(tempNumbers);
    }

    public static JackpotGenerator from(String[] splits) {
        //추가적인 유효성 검사 로직( splits의 길이가 6이 맞는지 등) 있어야 함.
        return new JackpotGenerator(splits);
    }

    public List<Integer> getNumber() {
        return number;
    }
}
