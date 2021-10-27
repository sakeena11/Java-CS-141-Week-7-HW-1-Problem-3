public class Duodecimal {
    public static String toBase12(int n) {
        //TODO: complete this method
        if (n <= 9) {
            return Integer.toString(n);
        }
        else if (n == 10) {
            return "A";
        }
        else if (n == 11) {
            return "B";
        }
        else {
            int x = n % 12; //numbers 0 to 11
            int y = n / 12;
            return toBase12(y) + toBase12(x);
        }
    }


    public static void main(String[] args) {
        //optional main method if you want to use it to test your code
        //offline.  you do not need to complete it for this assignment
        //Mimir will test only the above method
    }
}