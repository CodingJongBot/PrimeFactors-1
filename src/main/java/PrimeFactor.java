import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> facotrs = new ArrayList<>();
        for (int divisor = 2; number > 1; divisor++) {
            while (number % divisor == 0) {
                facotrs.add(divisor);
                number /= divisor;
            }
        }
        return facotrs;
    }
}
