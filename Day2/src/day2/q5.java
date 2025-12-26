package day2;

public class q5 {
	public static void main(String[] args) {
		int arr[]= {10, 25, 7, 30, 15};
		int max=0;
		int max2=0;
		int n=arr.length;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int index=-1;
		for(int j=0; j<arr.length-1;j++) {
			if(arr[j]==max) {
				index=j;
				break;
			}
		}
		if(index!=-1) {
			for(int k=index; k<arr.length-1; k++) {
				arr[k]=arr[k+1];
			}
			n--;	
		}
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>max2) {
				max2=arr[i];
			}
		}
		System.out.println(max2);
		
	}

}
