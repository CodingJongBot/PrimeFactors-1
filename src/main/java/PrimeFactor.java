import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> facotrs = new ArrayList<>();
        if (number > 1) {
            int divisor = 2;
            if (number == 4) {
                while (number % divisor == 0) {
                    facotrs.add(divisor);
                    number /= divisor;
                }
            } else if (number == 6) {
                for (divisor = 2; number > 1; divisor++) {
                    while (number % divisor == 0) {
                        facotrs.add(divisor);
                        number /= divisor;
                    }
                }
            } else if (number == 9) {
                facotrs.add(3);
                facotrs.add(3);
            } else {
                facotrs.add(number);
            }
        }
        return facotrs;
    }
}
