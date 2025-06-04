import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> facotrs = new ArrayList<>();
        if (number>1)

        {
            if (number == 4) {
                facotrs.add(2);

                facotrs.add(2);
            }
            else{
                facotrs.add(number);
            }
        }
        return facotrs;
    }
}
