package lab1;

public class ex4
{
    public static void main(String[]  args)
    {
        int[] arr = { 1, 1, 0, -1, -1 };
        int sum = 0;
        getPairsCount(arr, sum);
    }


    public static void getPairsCount(int[] arr, int sum)
    {

        int count = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        System.out.printf(" %d",count);
    }
}




