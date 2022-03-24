import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		/*
		 * 月を入力するとその月の日数を調べてくれるアプリ
		 *1,3,5,7,8,10,12 28 2 30
		 実行例
		 月>> 3 3月は31日まであります
		 月>> 14 そんな月はありません
		 */
		System.out.print("月を入力してください>> ");
		int month = new Scanner(System.in).nextInt();
		if (month < 1 || month > 12){
			System.out.print("そんな月はありません");
		}else{
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
				default:
					System.out.println("30日まであります");
					break;
			}
		}
	}
}
