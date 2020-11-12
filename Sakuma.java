import java.util.*;
public class Sakuma{
	public static void main(String[] args){
		System.out.print("要素数を入力>");
		int num=new Scanner(System.in).nextInt();
		System.out.println();
		int[] nums=new int[num];
		int count1=0;
		int count7=0;
		int count17=0;
		for(int i=0;i<nums.length;i++){
			int index=new Random().nextInt(20)+1;
			if(index==1){
				nums[i]=index;
				count1++;
			}else if(index==7){
				nums[i]=index;
				count7++;
			}else if(index==17){
				nums[i]=index;
				count17++;
			}else{
				nums[i]=0;
			}
		}
		System.out.println(Arrays.toString(nums));
		if(count1==0){
			System.out.println("1は出ませんでした");
		}else{
			System.out.printf("1は%d回でました。%n",count1);
		}
		if(count1==7){
			System.out.println("7は出ませんでした");
		}else{
			System.out.printf("7は%d回でました。%n",count7);
		}
		if(count1==17){
			System.out.println("17は出ませんでした");
		}else{
			System.out.printf("17は%d回でました。%n",count17);
		}
	}
}
