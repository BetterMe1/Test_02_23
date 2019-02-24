package xust;


/*
821. 字符的最短距离
 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。

示例 1:
输入: S = "loveleetcode", C = 'e'
输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
说明:
字符串 S 的长度范围为 [1, 10000]。
C 是一个单字符，且保证是字符串 S 里的字符。
S 和 C 中的所有字母均为小写字母。
 */
/*
 * 分析：遍历一遍S，找出字符C在S中的索引，将索引存入数组Cindex中，再次遍历字符串S，将每一个字符索引与Cindex中索引的最小差绝对值存入数组res中，返回res。
 * 
 */
public class Test_0223 {
	public static void main(String[] args) {
		Solution So = new Solution();
		String S = "loveleetcode";
		char C = 'e';
		int[] res = So.shortestToChar(S, C);
		for(int i=0; i<res.length; i++){
			System.out.print(res[i]+" ");
		}
	}
}
class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] Cindex = new int [S.length()];
        int[] res = new int [S.length()];
        int index = 0;
        for(int i=0; i<S.length(); i++){
        	if(S.charAt(i)==C){
        		Cindex[index] = i;
        		index++;
        	}
        }
        for(int i=0; i<S.length(); i++){
        	int min = 2147483647;
        	for(int j=0;j<index;j++){
        		min = Math.min(Math.abs(Cindex[j] - i), min);
        	}
        	res[i] = min;
        }
        return res;
    }
}