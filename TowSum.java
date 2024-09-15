import java.util.HashMap;
import java.util.Map;

// Cho một mảng các số nguyên nums và một số nguyên target, trả về chỉ số của hai số sao cho tổng của chúng bằng target .

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target); // Gọi phương thức twoSum và lưu kết quả

        // Kiểm tra nếu kết quả khác null và in ra
        if (result != null) {
            for (int i : result) {
                System.out.println(i);
            }
        } else {
            System.out.println("Không có kết quả");
        }
    }
}
