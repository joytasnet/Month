import java.util.*;
public class AkitaMonth{
	public static void main(String[] args){
		System.out.print("月を入力してください>>");
		int m = new Scanner(System.in).nextInt();
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print(m+"月は31日まであります。");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print(m+"月は30日まであります。");
				break;
			case 2:
				System.out.print(m+"月は28日まであります。");
				break;
			default:
				System.out.print("そんな月はありません。");
		}
	}
}
