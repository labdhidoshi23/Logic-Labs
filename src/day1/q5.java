package day1;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!((arr[left] >= 'a' && arr[left] <= 'z') ||
                  (arr[left] >= 'A' && arr[left] <= 'Z'))) {
                left++;
            }
            else if (!((arr[right] >= 'a' && arr[right] <= 'z') ||
                       (arr[right] >= 'A' && arr[right] <= 'Z'))) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Output: " + new String(arr));
    }
}
