import java.util.*;
public class Kano{
	public static void main(String[] args){
		int[] nums=new int[21];
		for(int i=0;i<nums.length;i++){
			nums[i]=i;
		}
		for(int value:nums){
			if(value%(2*3)==0){
				System.out.println("FizzBazz");
			}else if(value%2 == 0){
				System.out.println("Fizz");
			}else if(value%3 == 0){
				System.out.println("Bazz");
			}else{
				System.out.println(value);
			}
		}
	}
}
