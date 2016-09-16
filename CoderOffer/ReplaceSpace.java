/**
 * Created by liuyang on 16/6/26.
 * 替换空格
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        int spaceLen = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ')
                spaceLen++;
        }
        if (spaceLen==0){
            return str.toString();
        }
        char[] tempChar = new char[spaceLen*2];
        str.append(tempChar);
        for (int i = len - 1; spaceLen > 0; i--) {
            if (str.charAt(i) != ' ') {
                str.setCharAt(i+spaceLen*2, str.charAt(i));
            } else {
                str.setCharAt(i+spaceLen*2, '0');
                str.setCharAt(i+spaceLen*2-1, '2');
                str.setCharAt(i+spaceLen*2-2, '%');
                spaceLen--;
            }
        }
        return str.toString();
    }
}
