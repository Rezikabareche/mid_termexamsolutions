package math.problems;

public class FindMissingNumber {
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    // Driver Code

    public static void main(String[] args) {
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = array.length;

        // Function call
         System.out.println("the missing number is : " );
                 findMissing(array, n);
    }


    }

