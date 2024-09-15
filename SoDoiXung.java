// Cho một số nguyên x, trả về true nếu x là một xuôi ngược đều giống nhau và false ngược lại .

public class SoDoiXung {

    public static boolean isPalindrome(int x) {
        int y = x;
        if (y < 0) {
            return false;
        }
        int reversedNum = 0;
        while (x != 0) {

            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;

        }
        return reversedNum == y;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
