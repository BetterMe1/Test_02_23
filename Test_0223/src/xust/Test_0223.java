package xust;


/*
821. �ַ�����̾���
 ����һ���ַ��� S ��һ���ַ� C������һ�������ַ��� S ��ÿ���ַ����ַ��� S �е��ַ� C ����̾�������顣

ʾ�� 1:
����: S = "loveleetcode", C = 'e'
���: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
˵��:
�ַ��� S �ĳ��ȷ�ΧΪ [1, 10000]��
C ��һ�����ַ����ұ�֤���ַ��� S ����ַ���
S �� C �е�������ĸ��ΪСд��ĸ��
 */
/*
 * ����������һ��S���ҳ��ַ�C��S�е���������������������Cindex�У��ٴα����ַ���S����ÿһ���ַ�������Cindex����������С�����ֵ��������res�У�����res��
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