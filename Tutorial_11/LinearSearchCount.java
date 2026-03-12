public class LinearSearchCount {

    public static int linearSearchCount(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 5, 4, 5};
        int target = 5;

        int result = linearSearchCount(array, target);
        System.out.println("Occurrences of " + target + ": " + result);
    }
}
