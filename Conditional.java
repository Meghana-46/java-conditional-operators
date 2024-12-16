public class Conditional{
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int c = (num1 > num2) 
                        ? (num1 > num3 ? num1 : num3) 
                        : (num2 > num3 ? num2 : num3);

        // Output the result
        System.out.println("The largest number is: " + c);
    }
}