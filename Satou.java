import java.util.*;
public class Satou{
	public static void main(String[] args){
		System.out.print("1から10のうち好きな数を入力してください>");
		int nums=new Scanner(System.in).nextInt();
		int[] numbers={1,2,3,4,5,6,7,8,9,10};
		int[] answer=new int[10];
		int count=0;
		for(int i=0;i<numbers.length;i++){
			int index=new Random().nextInt(10);
			answer[i]=numbers[index];
			if(answer[i]==3){
				count++;
			}
		}
		System.out.println(Arrays.toString(answer));
		if(count == 0){
			System.out.printf("%dは出ませんでした%n",nums);
		}else{
			System.out.printf("%dは%d回出ました%n",nums,count);
		}
	}
}
