import java.util.*;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Create a Set to store unique numbers from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num); // Add each number to the set
        }

        // Step 2: Create another Set to store the intersection result
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // Add to result only if it's in set1
            }
        }

        // Step 3: Convert the resultSet into an array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    // For testing
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersection(nums1, nums2);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
