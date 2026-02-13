import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FCEF3List {
    public static void main() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2,3, 4, 5));
        List<Integer> list2 = Arrays.asList(2, 3, 5, 7,2);
        List<Integer> list3 = Arrays.asList(5, 8, 3, 2,2);
        // Create a copy to preserve the original list1
        List<Integer> common = new ArrayList<>(list1);
        // Retain only elements that exist in both other lists
        common.retainAll(list2);
        common.retainAll(list3);
        System.out.println("Common elements: " + common); // Output: [2, 3, 5]

        List<Integer> commonUniq = list1.stream()
                .filter(list2::contains)
                .filter(list3::contains)
                .distinct() // Use this if you only want unique common elements
                .toList();
        System.out.println(commonUniq);
    }
}
