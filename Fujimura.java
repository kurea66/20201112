import java.util.*;
public class Fujimura{
	public static void main(String[] args){
		System.out.print("何人>");
		int people=new Scanner(System.in).nextInt();
		System.out.println();
		String[] peoples=new String[people];
		int[] balls=new int[99];
		int[] scores=new int[people];
		for(int i=0;i<balls.length;i++){
			balls[i]=i+1;
		}
		for(int i=0;i<peoples.length;i++){
			System.out.printf("%d人目の名前>",i+1);
			peoples[i]=new Scanner(System.in).next();
			int index=new Random().nextInt(balls.length-i);
			scores[i]=balls[index];
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
			System.out.printf("%sさんの点数:%d点%n",peoples[i],scores[i]);
		}
		for(int i=0;i<peoples.length-1;i++){
			for(int j=i+1;j<peoples.length;j++){
				if(scores[i]<scores[j]){
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
					String tmp=peoples[i];
					peoples[i]=peoples[j];
					peoples[j]=tmp;
				}
			}
		}
		for(int i=0;i<peoples.length;i++){
			System.out.printf("%d位:%d点:%sさん%n",i+1,scores[i],peoples[i]);
		}
	}
}
