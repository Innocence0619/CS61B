public class Sumarraywhile{
	public static int Sumarray( int[ ] m){
		int l = m.length;
		int i = 0;
		int sum = 0;
		while(i<l){
			sum = sum + m[i];
			i = i +1;
		}
		return sum;
	}
	public static void main(String[] args) {
		int [] numbers = new int []{ 1,2,3,4,5,6};
		System.out.print(Sumarray(numbers));
	}
}