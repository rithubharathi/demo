import java.util.*;
public class Vowels {
	public int countVowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				count++;
			else
				continue;
		}
		//System.out.println("count is:"+count);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Vowels vo = new Vowels();
		System.out.println(vo.countVowels(s));
	}
}
