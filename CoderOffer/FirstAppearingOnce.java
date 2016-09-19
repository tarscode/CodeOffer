/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FirstAppearingOnce
 * 作者: liuyang
 * 时间: 16/9/19 下午5:50
 * 题目: 字符流中第一个不重复的字符
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class FirstAppearingOnce {
    //Insert one char from stringstream
    private int[] map = new int[256];
    private int[] sort = new int[256];
    private int index = 0;
    private int first = 256;
    private char chars = '#';

    public void Insert(char ch) {
        map[ch] = map[ch] + 1;
        sort[ch] = map[ch] == 2 ? 256 : index++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (int i = 0; i < 256; i++) {
            if(map[i]==0){
                continue;
            }
            if (map[i] == 2 ) {
                if((char) i==chars){
                    first = 256;
                    chars = '#';
                }
                continue;
            }
            if (sort[i] < first) {
                first = sort[i];
                chars = (char) i;
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        FirstAppearingOnce t = new FirstAppearingOnce();
        String str = "google";
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            t.Insert(ch);
            System.out.println(t.FirstAppearingOnce());
        }
    }
}