/* Chữ số La Mã được biểu thị bằng bảy ký hiệu khác nhau: I, V, X, L, C, D and M.

Kí hiệu       Gía trị
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Ví dụ: 2 được viết là II bằng chữ số La Mã, chỉ là hai số cộng lại với nhau. 12 được viết là XII, đơn giản là X + II. 
Số 27 viết là XXVII tức là XX + V + II.

Chữ số La Mã thường được viết từ lớn nhất đến nhỏ nhất từ ​​trái sang phải. Tuy nhiên, chữ số của bốn không phải là IIII. 
Thay vào đó, số bốn được viết là IV. Bởi vì số một đứng trước số năm nên chúng ta trừ nó thành bốn. Nguyên tắc tương tự 
áp dụng cho số chín, được viết là IX.

*/

import java.util.HashMap;
import java.util.Map;

public class SoLaMaSangSoNguyen {
    public static int romanToInt(String s){

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i ++){
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            }else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
    }
}
