package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManualLotto extends Lotto {

    public ManualLotto(String rawNumbers) {
        String[] numberSplits = rawNumbers.split(",");

        this.numbers = Arrays.stream(numberSplits)
                .map(String::trim) // " 21" -> "21"
                .map(Integer::parseInt) // "21" -> 21
                .collect(Collectors.toList());
    }
}
