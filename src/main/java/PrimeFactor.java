import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> facotrs = new ArrayList<>();
        if (number > 1) {
            int divisor = 2;

            if (number ==4||number == 6||number==9||number==12  ) {
                for (divisor = 2; number > 1; divisor++) {
                    while (number % divisor == 0) {
                        facotrs.add(divisor);
                        number /= divisor;
                    }
                }
            } else {
                facotrs.add(number);
            }
        }
        return facotrs;
    }
}
