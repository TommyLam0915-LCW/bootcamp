import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(1);
        System.out.println(getDuplicated(integers)); // [2, 3]
    }

    public static Set<Integer> getDuplicated(List<Integer> integers) {
        Set<Integer> results = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (Integer x : integers) {
            if (!set.add(x)) { // If the element already exists in the set, it's a duplicate
                results.add(x);
            }
        }
        return results;
    }
}
