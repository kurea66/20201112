import java.util.*;
public class Tokuda{
	public static void main(String[] args){
		System.out.print("何人ですか~>");
		int peoples=new Scanner(System.in).nextInt();
		System.out.println();
		int[] Score=new int[peoples];
		for(int i=0;i<peoples;i++){
			System.out.printf("%d人目の点数>",i+1);
			int peopleScore=new Scanner(System.in).nextInt();
			Score[i]=peopleScore;
		}
		for(int i=0;i<Score.length-1;i++){
			for(int j=i+1;j<Score.length-1;j++){
				if(Score[i] > Score[j]){
					int temp=Score[i];
					Score[i]=Score[j];
					Score[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(Score));
	}
}
