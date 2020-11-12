import java.util.*;
public class Hanamoto{
	public static void main(String[] args){
		int[] nums=new int[4];
		for(int i=0;i<nums.length;i++){
			System.out.print("好きな数字を入力してください>");
			nums[i]=new Scanner(System.in).nextInt();
			System.out.println();
		}
		System.out.println(Arrays.toString(nums));
	}
}
