package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManualLotto extends Lotto {

    public ManualLotto(String rawNumbers) {
        numbers = parseNumbers(rawNumbers);
        validate(numbers);


    }
    private List<Integer> parseNumbers(String rawNumbers) {
        try {
            return Arrays.stream(rawNumbers.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("로또 번호는 숫자만 입력 가능합니다.");
        }
    }

    private void validate (List<Integer> parseNumber){
        if(numbers.size()!=6) {
            System.err.println("6개의 숫자를 입력해주세요!");
            //throw new IllegalArgumentException("6개의 숫자를 입력해주세요!");
        }
    }

    private void validateNumberRange(List<Integer> parseNumber) {

    }
}
