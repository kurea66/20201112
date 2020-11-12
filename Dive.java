import java.util.*;
public class Dive{
	public static void main(String[] args){
		System.out.print("飛んでから何秒後?>");
		int nums=new Scanner(System.in).nextInt();
		System.out.println();
		int[] speed=new int[nums];
		double[] distance=new double[nums];
		for(int i=0;i<nums;i++){
			speed[i]=9*(i+1);
			distance[i]= Math.pow(i+1,2)*9/2;
		}
		System.out.printf("飛んでから%d秒後までの1秒毎の速度推移は"+Arrays.toString(speed)+"です%n",nums);
		System.out.printf("飛んでから%d秒後までの1秒毎の飛行機からの距離推移は"+Arrays.toString(distance)+"です%n",nums);
	}
}
