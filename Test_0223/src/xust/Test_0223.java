package xust;

/*
819. ����ĵ���
 ����һ������ (paragraph) ��һ�����õ����б� (banned)�����س��ִ�����࣬ͬʱ���ڽ����б��еĵ��ʡ���Ŀ��֤������һ���ʲ��ڽ����б��У����Ҵ�Ψһ��
�����б��еĵ�����Сд��ĸ��ʾ�����������š������еĵ��ʲ����ִ�Сд���𰸶���Сд��ĸ��
 
ʾ����
����: 
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
���: "ball"
����: 
"hit" ������3�Σ�������һ�����õĵ��ʡ�
"ball" ������2�� (ͬʱû���������ʳ���2��)���������Ƕ�������ִ������ģ��Ҳ��ڽ����б��еĵ��ʡ� 
ע�⣬������Щ�����ڶ����ﲻ���ִ�Сд����������Ҫ���ԣ���ʹ�ǽ����ŵ���Ҳ���ԣ� ���� "ball,"���� 
"hit"�������յĴ𰸣���Ȼ�����ִ������࣬�����ڽ��õ����б��С�
 
˵����
1 <= ���䳤�� <= 1000.
1 <= ���õ��ʸ��� <= 100.
1 <= ���õ��ʳ��� <= 10.
����Ψһ��, �Ҷ���Сд��ĸ (��ʹ�� paragraph ���Ǵ�д�ģ���ʹ��һЩ�ض������ʣ��𰸶���Сд�ġ�)
paragraph ֻ������ĸ���ո�����б�����!?',;.
������û�����ַ����ߴ������ַ��ĵ��ʡ�
������ֻ������ĸ���������ʡ�ԺŻ������������š�
 */
public class Test_0223 {
	public static void main(String[] args) {
		Solution So = new Solution();
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {""};
		So.mostCommonWord(paragraph, banned);
	}
}
class Solution {
    public void mostCommonWord(String paragraph, String[] banned) {
    	paragraph = paragraph.toLowerCase();
    	paragraph = paragraph.replace(",", " ").replace(".", " ").replace("?", " ").replace("'", " ").replace("!", " ").replace(";", " ");
    	int len = 0;
    	for(int i=0; i<paragraph.length(); i++){
    		if(String.valueOf(paragraph.charAt(i)) == "")
    			len++;
    	}
    	String[] word = new String[len];
    	String temp = "";
    	len = 0;
    	for(int i=0; i<paragraph.length(); i++){
    		if(String.valueOf(paragraph.charAt(i)) != "")
    			temp += String.valueOf(paragraph.charAt(i));
    		else{
    			word[len]= temp;
    			len++;
    			temp = "";
    		}	
    	}
    	for(int i=0; i<word.length; i++){
    		System.out.println(word[i]);
    	}
    }
}