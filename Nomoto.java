import java.util.*;
public class Nomoto{
	public static void main(String[] args){
		char[] calender={'月','火','水','木','金','土','日'};
		String[] schedule=new String[7];
		for(int i=0;i<schedule.length;i++){
			System.out.printf("%s曜日の予定は>",calender[i]);
			String task=new Scanner(System.in).next();
			schedule[i]=task;
			System.out.println();
		}
		System.out.print("何曜日の予定が知りたいですか(例:木)>");
		Scanner spike=new Scanner(System.in);
		char sarch= spike.next().charAt(0);
		System.out.println();
		for(int i=0;i<schedule.length;i++){
			if(calender[i]== sarch){
				System.out.printf("%s曜日の予定は%sです。",sarch,schedule[i]);
			}
		}
	}
}
