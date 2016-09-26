import java.util.List;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: InversePairs
 * 【作者】: liuyang
 * 【时间】: 16/9/23 下午5:02
 * 【题目】: 数组中的逆序对
 * 【内容】: 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class InversePairs {

    public int InversePairs(int [] array) {
        Integer[] count = new Integer[array.length];
        int num = 0;
        Node root = null;
        for(int i=array.length-1;i>=0;i--){
            root = insert(root,count,i,array[i],0);
        }
        for(int i:count){
            num = (num+i)%1000000007;
        }
        return num;
    }

    class Node{
        int val,sum,dup=1;
        Node left;
        Node right;
        public Node(int v,int s){
            this.val = v;
            this.sum = s;
        }
    }

    public Node insert(Node node,Integer[] count,int i,int num,int preSum){
        if(node==null){
            node = new Node(num,0);
            count[i]=preSum;
        }else if(node.val==num){
            node.dup++;
            count[i]=node.sum+preSum;
        }else if(node.val<num){
            node.right =insert(node.right,count,i,num,node.dup+node.sum+preSum);
        }else {
            node.sum++;
            node.left = insert(node.left,count,i,num,preSum);
        }
        return node;
    }

    public static void main(String[] args) {
        InversePairs t = new InversePairs();
        System.out.println();
    }
}