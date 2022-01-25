public class DrawTriangle {
public static void DrawTriangle( int N){
	 	int x = 1;
	 	while(x<= N){
	 		int i = 1;
	 		while(i<=x){
	 			System.out.print("*");
	 			i =i +1;
	 		}
	 		System.out.println(" ");
	 		x = x + 1;
}}

 public static void main(String[] args) {
      DrawTriangle(10);
   }
}