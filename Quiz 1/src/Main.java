public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 28;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        // before sorting
        System.out.print("Before Bubble Sort: ");
        printArrayElements(numbers);

        bubbleSort(numbers);

        // after sorting
        System.out.print("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);

        // reset array for selection sort
        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 28;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        // before sorting
        System.out.print("\n\nBefore Selection Sort: ");
        printArrayElements(numbers);

        selectionSort(numbers);

        // after sorting
        System.out.print("\n\nAfter Selection Sort: ");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] nums) {
        // runs when unsortedPartitionIndex is from [1.. up to nums.length - 1]
        // n-1 instructions for iteration (where n = nums.length)
        for (int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {

            // runs when i [0..unsortedPartitionIndex -1]
            // n-2 instructions so its always minus 1 for inner for loop
            for (int i = 0; i < unsortedPartitionIndex; i++) {

                // swap the 2 adjacent elements
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums [i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] nums) {
        // runs when lastUnsortedIndex is from [1.. up to nums.length - 1]
        // n-1 instructions (where n = nums.length)
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;

            // runs when i is from [1.. up to lastUnsortedIndex]
            // n-1 instructions
            for (int i = smallest + 1; i <= lastUnsortedIndex; i++) {
                if (nums[i] < nums[smallest]) {
                    smallest = i;
                }
            }

            //swap value of smallest with value of lastUnsortedIndex
            if (smallest != lastUnsortedIndex); {
                int temp = nums[smallest];
                nums[smallest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int [] nums) {
        // shorter version of for loop (int i = 0; i < nums.length; i++)
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}