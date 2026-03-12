public class ThreeSumBruteForce {

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        int k = 2;

        int n = array.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    if (array[i] + array[j] + array[l] == k) {
                        System.out.println(
                            "Triplet: (" + array[i] + ", " + array[j] + ", " + array[l] + ")"
                        );
                    }
                }
            }
        }
    }
}
