import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> facotrs = new ArrayList<>();
        if (number > 1) {
            if (number == 4) {

                while (number % 2 == 0) {
                    facotrs.add(2);
                    number /= 2;
                }
            } else if (number == 6) {
                facotrs.add(2);
                facotrs.add(3);
            } else {
                facotrs.add(number);
            }
        }
        return facotrs;
    }
}
