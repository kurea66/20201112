import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		/*for(int value:nums){
			System.out.println(value);
		}*/
		for(int i=0;i<nums.length/2;i++){
			int temp=0;
			temp=nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		for(int i=0;i<nums.length;i++){
			int shuffle=new Random().nextInt(nums.length);
			int temp=0;
			temp=nums[i];
			nums[i]=nums[shuffle];
			nums[shuffle]=temp;
		}
		for(int i=0;i<nums.length-1;i++){
			int index = new Random().nextInt(nums.length-i);
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
