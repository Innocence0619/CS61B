public class Maxarray{
    /** Returns the maximum value from m. */
    public static int max(int[ ] m) {
      int  l = m.length;
        int i=0;
      int   max = m[0];
        while(i<l){
        	if (m[i]>max){
        		max = m[i];
        	}
        	i= i + 1;
        }
        return max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 32, 10, 6};    
       System.out.print("the maximum number this array is :" +max(numbers));
    }
}