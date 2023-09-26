public class PrintOddNumbersAndSum {
    public static void main(String[] args) {
        int start = 7;
        int end = 21;
        int sum = 0;

        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " "); 
                sum += i; 
            }
        }

        System.out.println("\nSum of odd numbers: " + sum);
    }
}
