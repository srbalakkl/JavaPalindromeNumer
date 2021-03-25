package PalindromeNumer;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("the palindrome number output is " + isPalindromeNumber(1012));
    }

    static boolean isPalindromeNumber(int num) {
        int r, sum = 0, temp;// r -> remainder
        temp = num; // copying input value NUM before changing it


        while (num != 0) {
            r = num % 10;// here % modulo operator is used to find remainder(last digit of the Num)
            //eg last digit(remainder) of 1234 is 4

            sum = (sum * 10) + r;//(ie) dividend = ( quotient * divisor ) + remainder
            //this statement is used to form a number in reverse order

            num = num / 10;//to omit the last digit eg: 1234 will be 123
        }
        return temp == sum; //verifying input value is equal to the previous ie TEMP value & return true if correct
    }
}
