// // 36.	Program to check whether a given no is positive, negative or zero using ternary.
class positivennegative {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(
                number + (number > 0 ? " is a positive number." : number < 0 ? " is a negative number." : " is zero."));

    }
}