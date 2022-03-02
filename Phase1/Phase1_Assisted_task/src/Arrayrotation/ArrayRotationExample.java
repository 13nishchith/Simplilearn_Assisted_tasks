package Arrayrotation;

public class ArrayRotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotationExample obj=new ArrayRotationExample();
		int arr[]= {1,2,3,4,5,6,7};
		
		int temp[]=obj.rotatearray(arr, 2);
		obj.printarray(temp);

	}
	public void printarray(int num[]) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	public int[] rotatearray (int num[],int k){
		int n=num.length;
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			temp[(n-1)-((i+k)%n)]=num[i];
		}
		return temp;
		
	}

}
