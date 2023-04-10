package math.problems;

public class FindLowestDifference {
    public static int findSmallestDifference() {
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        // Calculate size of both arrays
        int m = array1.length;
        int n = array2.length;

        int minDiff = Integer.MAX_VALUE; // Initialize with maximum integer value
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int diff = Math.abs(array1[i] - array2[j]); // Calculate absolute difference
                if (diff < minDiff) {
                    minDiff = diff; // Update smallest difference found so far
                }
            }
        }
        return minDiff;
    }

    // Driver Code
    public static void main(String[] args) {
       System.out.println( "the minimumDifference is: " +findSmallestDifference()) ;
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */


        // Call function to print smallest result

    }


    }


