import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(44, 8, 8, 1, 1, 2, 3, 4, 4, 10, 5, 5, 6, 42, 46, 80, 7));
        task1(nums);
        task2(nums);

        List<String> words = new ArrayList<>(List.of("повар", "повар", "повар", "глина", "трамвай", "Повар", "глина", "повар", "hello", "Hello", "hello"));
        task3(words);
        task4(words);

    }

    public static void task1(List<Integer> nums) {
        List<Integer> result1 = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                result1.add(nums.get(i));
            }
        }
        System.out.println(result1);
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> result2 = new HashSet<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                result2.add(nums.get(i));
            }
        }
        List<Integer> sortedList = new ArrayList<>(result2);
        Collections.sort(sortedList);
        System.out.println(sortedList);
    }

    public static void task3(List<String> words) {
        Set<String> result3 = new HashSet<>(words);
        System.out.println(result3);
    }

    public static void task4(List<String> words) {
        /*
        Set<Integer> result4 = new HashSet<>(List.of());
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if(words.get(i).equals(words.get(j))) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
         */
        Map<String, Integer> result4 = new HashMap<>();
        for(int i = 0; i< words.size(); i++) {
            if(!result4.containsKey(words.get(i))) {
                result4.put(words.get(i), 1);
            } else {
                result4.put(words.get(i), result4.get(words.get(i)) +1);
            }
        }
        System.out.println(result4);
    }
}