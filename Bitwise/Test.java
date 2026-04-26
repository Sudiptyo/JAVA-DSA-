import utils.NumberUtils;

public class Test {
    public static void main(String[] args) {
        int number = 123;
        int base = 10;
        int digits = NumberUtils.countDigits(number, base);
        System.out.println("Number of digits: " + digits);
    }
}
