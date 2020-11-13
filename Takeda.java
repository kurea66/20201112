import java.util.*;
public class Takeda{
	public static void main(String[] args){
		int[] numsA=new int[10];
		int[] numsB=new int[10];
		int[] index=new int[10];
		int count=0;
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
				}else{
					System.out.printf(",[%d]",i);
					count++;
				}
			}
		}
		if(count==0){
			System.out.println("一致しているindexはありませんでした。");
		}else{
			System.out.printf("の合計%d個が一致しています。%n",count);
		}
		int[] counts=new int[count];
		int comp=0;
		for(int i=0;i<numsA.length;i++){
			if(numsA[i]==numsB[i]){
					counts[0+comp]=numsA[i];
					index[comp]=i;
					comp++;
			}
		}
		for(int i=0;i<counts.length;i++){
			for(int j=i+1;j<counts.length;j++){
				if(counts[i] > counts[j]){
					int temp=counts[i];
					counts[i]=counts[j];
					counts[j]=temp;
					temp=index[i];
					index[i]=index[j];
					index[j]=temp;
				}
			}
		}
		for(int i=0;i<counts.length;i++){
			System.out.printf("index[%d]:%d%n",index[i],counts[i]);
		}
	}
}
