import java.util.*;
public class NaganoMain{
	public static void main(String[] arg){
		System.out.println("月の日数を調べます");
		int mon = new Scanner(System.in).nextInt();
		switch(mon){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(mon + "月は31日あります");
				break;
			case 2:
				System.out.println(mon + "月は28日あります");
			case 4:
				break;
			case 6:
			case 9:
			case 11:
				System.out.println(mon + "月は30日あります");
				break;
			default:
				System.out.println(mon + "そんな月はありません");
		}
	}
}
