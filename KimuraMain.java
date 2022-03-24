import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("月>>");
		int input = new Scanner(System.in).nextInt();

		if(input <=12){
			switch (input){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(input + "月は31日まであります。");
					break;
				case 2:
					System.out.println(input + "月は28日まであります。");
					break;
				default:
					System.out.println(input + "月は30日まであります。");
			}
		}else{
			System.out.println("そんな月はありません。");
		}
	}
}
