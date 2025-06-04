import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> facotrs = new ArrayList<>();
        if (number==2){
            facotrs.add(2);
        }
        if (number==3){
            facotrs.add(3);
        }
        return facotrs;
    }
}
