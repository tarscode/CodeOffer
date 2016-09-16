/**
 * Created by liuyang on 16/9/1.
 * 第一个只出现一次的字符
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        char[] arr = str.toCharArray();
        int[] map = new int[256];
        for (char a : arr) {
            map[a] = map[a] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (map[arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
}
