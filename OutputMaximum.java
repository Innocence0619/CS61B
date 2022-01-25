public  class  OutputMaximum{
	public static int max( int x, int y){
		if (x >=y){
			return x;
		}else{
			return y;
		}
	}

	public static void main(String[] args) {
		System.out.print(max(10,15));
	}
}

/**
1. 函数定义必须在class里面
2. 函数定义必须要有 public static， 相当于def
3. 函数定义的格式为：
  public static [返回类型] 函数名称 （[类型]变量1,[类型2]变量2）{
	函数体
}
4.如果要把结果输出的话直接写 system.out.print(函数（变量1，变量2）)
5. functions 在Java里面又叫 Methods
*/