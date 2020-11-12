import java.util.*;
public class Huruya{
	public static void main(String[] args){
		String[] favorite=new String[5];
		System.out.println("好きな事を5つ入力してください");
		for(int i=0;i<favorite.length;i++){
			System.out.printf("%dつ目>",i+1);
			favorite[i]=new Scanner(System.in).next();
			System.out.println();
		}
		for(int i=0;i<favorite.length-1;i++){
			String temp=favorite[i];
			favorite[i]=favorite[new Random().nextInt(favorite.length-1-i)];
			favorite[new Random().nextInt(favorite.length-1-i)]=temp;
		}
		System.out.println(Arrays.toString(favorite));
	}
}
