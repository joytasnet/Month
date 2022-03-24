import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		System.out.print("月>>");
		int month = new Scanner(System.in).nextInt();
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "月は31日まであります");
				break;
			case 2:
				System.out.println(month + "月は28日まであります");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "月は30日まであります");
				break;
			default:
				System.out.println(month + "そんな月はありません");
		}
	}
}
