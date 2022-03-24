import java.util.*;
public class ShotaMonth{
	public static void main(String[] args){
		System.out.println("月を入力してください");
		int monthA =new Scanner(System.in).nextInt();

		switch(monthA){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31日まであります");
				break;
			case 2:
				System.out.println("28日まであります");
				break;
			case 14:
				System.out.println("そんな月はありません");
				break;
			default :
				System.out.println("それ以外です");
				break;
		}
	}
}

