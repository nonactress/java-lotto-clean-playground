package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerate {
    private List<Integer> number;

    public NumberGenerate(String[] splits) {
        number = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            number.add(Integer.parseInt(splits[i]));
        }

        Collections.sort(this.number);
    }

    public List<Integer> getNumber() { return Collections.unmodifiableList(number);}
}
