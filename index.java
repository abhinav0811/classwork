import java.util.Scanner;

public class pract {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr  = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr [i] = sc.nextInt();
        }
        int smallestDistance = findSmallestDistance(arr);
        System.out.println("The smallest distance between neighboring elements is: " + smallestDistance);
    }

    public static int findSmallestDistance(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;
    }
}