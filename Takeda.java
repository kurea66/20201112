import java.util.*;
public class Takeda{
	public static void main(String[] args){
		int[] numsA=new int[10];
		int[] numsB=new int[10];
		int count=0;
		int[] indexs=new int
		for(int i=0;i<numsA.length;i++){
			numsA[i]=new Random().nextInt(5)+1;
			numsB[i]=new Random().nextInt(5)+1;
		}
		System.out.println(Arrays.toString(numsA));
		System.out.println(Arrays.toString(numsB));
		for(int i=0;i<numsA.length;i++){
			if(numsA[i]==numsB[i]){
				if(count==0){
					System.out.printf("[%d]",i);
					count++;
				}
				System.out.printf(",[%d]",i);
			}
		}
		if(count==0){
			System.out.println("一致しているindexはありませんでした。");
		}else{
			System.out.printf("の合計%d個が一致しています。",count);
		}
	}
}
