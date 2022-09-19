public class UocChungLonNhat {
    public static int gcd(int a, int b) {
        int num1, num2;
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.printf("Ước chung lớn nhất là: %d", num2);
    }
}