import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int month;
		System.out.print("月を入力>>");
		month=new Scanner(System.in).nextInt();
		if(month>12){
			System.out.println(month+" "+month+"そんな月はありません");
		}else{
			switch(month){	
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(month+" "+month+"は31日まであります");
					break;
				case 2:
					System.out.println(month+" "+month+"は28日まであります");
					break;
				default:
					System.out.println(month+" "+month+"は30日まであります");
					break;
			}
		}
	}
}
