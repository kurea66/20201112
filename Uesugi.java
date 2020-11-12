import java.util.*;
public class Uesugi{
	public static void main(String[] args){
		String[] when=new String[4];
		String[] who=new String[4];
		String[] where=new String[4];
		String[] what=new String[4];
		for(int i=0;i<when.length;i++){
			System.out.print("whenを入力しでください>");
			when[i]=new Scanner(System.in).next();
			System.out.println();
		}
		for(int i=0;i<who.length;i++){
			System.out.print("whoを入力しでください>");
			who[i]=new Scanner(System.in).next();
			System.out.println();
		}
		for(int i=0;i<where.length;i++){
			System.out.print("whereを入力しでください>");
			where[i]=new Scanner(System.in).next();
			System.out.println();
		}
		for(int i=0;i<when.length;i++){
			System.out.print("whatを入力しでください>");
			what[i]=new Scanner(System.in).next();
			System.out.println();
		}
		int answer=new Random().nextInt(4);
		System.out.printf("・%s%s%s%s%n",when[answer],who[answer],where[answer],what[answer]);
	}
}
