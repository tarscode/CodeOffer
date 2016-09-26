import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: Permutation
 * 【作者】: liuyang
 * 【时间】: 16/9/23 下午10:47
 * 【题目】: 字符串的排列
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str==null||str.length() == 0) {
            return res;
        }
        char[] arr = str.toCharArray();
        TreeSet<String> set = new TreeSet<>();
        Permutation(arr, 0, set);
        res.addAll(set);
        return res;
    }

    public void Permutation(char[] arr, int index, TreeSet<String> set) {
        if (index == arr.length - 1) {
            set.add(String.valueOf(arr));
        } else {
            for (int i = index; i <= arr.length-1; i++) {
                swap(arr, index, i);
                Permutation(arr, index + 1, set);
                swap(arr, index, i);
            }
        }
    }

    public void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        String str = "abc";
        Permutation t = new Permutation();
        System.out.println(t.Permutation(str));
    }
}