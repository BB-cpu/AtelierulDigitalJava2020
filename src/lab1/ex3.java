package lab1;
import java.util.Arrays;
public class ex3 {
    public static void main(String[] args) {
        int[] anArray = {3, 2, -3, -2, 3, 0};
        Arrays.sort(anArray);

        System.out.printf("Modified anArray[] : %s",
                Arrays.toString(anArray));
        int sum = 2;
        int a = 0;
        int b = anArray.length - 1;
        while (a < b) {
            if (anArray[a] + anArray[b] > sum) {
                b--;
            } else if (anArray[a] + anArray[b] < sum) {
                a++;
            } else if (anArray[a] + anArray[b] == sum) {
                System.out.print("=>");
                System.out.print(sum);
                a++;
                b--;
            }
        }
    }
}
