package lab9;

import java.util.stream.Stream;

public class main {
	public static <T>int countOccurences(T[] arr,T target){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(target==null){
				if(arr[i]==null){
					count++;
					continue;
				}
			}
			if(target.equals(arr[i])){
				count++;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[3];
		str[0]="manoj";
		str[1]="manoj";
		str[2]="manoj";
		int m=1;
		int n=2;
		System.out.println(countOccurences(str,"manoj"));
		Stream.of(str).skip(m).limit(n).forEach(System.out::println);
	}

}
