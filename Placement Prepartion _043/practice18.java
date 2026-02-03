public class practice18 {public static void findSecondMinMax(int[] arr) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int x : arr) {
           
            if (x < firstMin) {
                secondMin = firstMin;
                firstMin = x;
            } else if (x < secondMin && x != firstMin) {
                secondMin = x;
            }
            if (x > firstMax) {
                secondMax = firstMax;
                firstMax = x;
            } else if (x > secondMax && x != firstMax) {
                secondMax = x;
            }
        }

        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Largest  = " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 0, 2, 3, 4 };
        findSecondMinMax(arr);
    }

}
