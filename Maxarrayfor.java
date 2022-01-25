public class Maxarrayfor{
    /** Returns the maximum value from m. */
    public static int max(int[ ] m) {
      int l = m.length;
      int i=0;
      int max = m[0];
      for( i = 0; i < l; i = i + 1){
        if (m[i] > max){
          max = m[i];
        }
      }
        return max;
      }
    
    public static void main(String[] args) {
       int[] numbers = {9, 2, 15, 2, 32, 10, 6};    
       System.out.print("the maximum number this array is :" +max(numbers));
    }
}