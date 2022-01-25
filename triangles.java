/** Java 中的* 不能被用于多次输入，要画出一个三角形的*就需要用到两次循环。*/

	 public static void main(String[] args) {
	 	int line = 5;
	 	int x = 1;
	 	while(x<= line){
	 		int i = 1;
	 		while(i<=x){
	 			System.out.print("*");
	 			i =i +1;
	 		}
	 		System.out.println(" ");
	 		x = x + 1;
	 	}
		}
	