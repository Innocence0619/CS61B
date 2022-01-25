public class Sumarrayfor{
	public static int Sumarrayfor(int [ ] m){
		int l = m.length;
		int i = 0;
		int sum = 0;
		for (i = 0; i<l ; i = i+1){
			sum = sum + m[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[ ] numbers = new int[]{1,2,3,4,5,6};
		System.out.print("the sum of this array is :" + Sumarrayfor(numbers));
	}
}