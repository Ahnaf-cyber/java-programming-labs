import java.util.Arrays;
public class ThreeSumOptimized {
     public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        int k = 2;
        Arrays.sort(array);
        int n = array.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = array[i] + array[left] + array[right];

                if (sum == k) {
                    System.out.println(
                        "Triplet: (" + array[i] + ", " + array[left] + ", " + array[right] + ")"
                    );
                    left++;
                    right--;
                } else if (sum < k) {
                    left++;
                } else {
                    right--;
                }  } }
    }
}
