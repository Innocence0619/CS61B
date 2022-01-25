# CS61B
Learning CS61B ing
# Java Learning -- W1D1

## Arrays 

arrays in Java = list in python = arrays in MATLAB 

### Syntax

```Java
/*create arrays*/
int [ ] numbers = new int [ 3 ];
numbers[0] = 4;
numbers[1] = 7;
numbers[2] = 10;
/*or */ 
int [ ] numbers = 'new int [ ]'{4,7,10};/* ' '部分不加也可以*/
/*or*/
int [ ] numbers = {1,2,3};
/*output*/
System.out.print(numbers[1]);
/*length*/ 
System.out.print(numbers.length);

```

### Exercise 2 -- [查找一列给定array里的最大数](‪D:\\CS61B\Java\Maxarray.java)

```java
public class Maxarray{
    /** Returns the maximum value from m. */
    public static int max(int[ ] m) { /* int[] m 是数组m的意思，这里可以把int[] 当作一个整体对待*/
      int  l = m.length;/*数组{1，2，3}，长度应该是3，下标分别是 0，1，2*/
      int i=0;，
      int   max = m[0];
        /*这里用了一个比较法则，先默认最大数字是第一个，然后逐一比较，如果某一个数比第一个大就把max替换成这个数字*/
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
       System.out.print("the maximum number this array is :" +max(numbers));/*max(numbers)表明在函数引用数组的时候直接把数组名字写上去就行了*/
    }
}
```

## For loops

### Syntax

In Java, the for loops has the syntax below:

```java
for (initialization; termination; increment) {
    statement(s)
}
```

The initialization, termination, and increment must be **semicolon separated**. Each of these three can feature **multiple comma-separated** statements

```java
for (int i = 0, j = 10; i < j; i += 1) {
    System.out.println(i + j);
}
```

### practice -- 计算一个数组中所有数字的和

#### using while loop

```java
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
```

#### using for loop

```java
public class Sumarrayfor{
	public static int Sumarrayfor(int [ ] m){
		int l = m.length;
		int i = 0;
		int sum = 0;
        /*基本上只有这里和while loop 不一样，其他的地方都一样*/
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
```

### Exercise 3 -- 用for loop查找一列给定array里的最大数

```java
public class Maxarrayfor{
    /** Returns the maximum value from m. */
    public static int max(int[ ] m) {
      int l = m.length;
      int i=0;
      int max = m[0];
        /*基本上也就是把loop改了一下，其他没什么难度*/
      for( i = 0; i < l; i = i + 1){
        if (m[i] > max){
          max = m[i];
        }
      }
        return max;
      }
    
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 32, 10, 6};    
       System.out.print("the maximum number this array is :" +max(numbers));
    }
}
```

## Break and Continue

### syntax

- The `continue` statement skips the rest of the current iteration of the loop, effectively **jumping straight to the increment** condition.(跳过当前的i，直接进入下一个i)
- By contrast, the `break` keyword completely terminates the innermost loop when it is called. （break就是跳出当前的循环）
- 总结一下如果是用continue的话，就用两个循环前后交接；如果是break的话，就用两个循环一个套一个。

### practice 1 -- [Continue](https://pythontutor.com/java.html#mode=display) 

prints each String from an array three times, but skips any strings that contain “horse”

```java
public class ContinueDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            if (a[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
            }
        }
    }
}
```

### practice 2 --[break](https://pythontutor.com/java.html#mode=edit)

```
public class BreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
                if (a[i].contains("horse")) {
                    break;
                }                
            }
        }
    }
}
```

### Exercise 4 -- 滚动窗口替换

Write a function `windowPosSum(int[] a, int n)` that replaces each element a[i] with the sum of a[i] through a[i + n], but only if a[i] is positive valued. If there are not enough values because we reach the end of the array, we sum only as many values as we have.

For example, suppose we call `windowPosSum` with the array `a = {1, 2, -3, 4, 5, 4}`, and `n = 3`. In this case, we’d:

- Replace a[0] with a[0] + a[1] + a[2] + a[3].
- Replace a[1] with a[1] + a[2] + a[3] + a[4].
- Not do anything to a[2] because it’s negative.
- Replace a[3] with a[3] + a[4] + a[5].
- Replace a[4] with a[4] + a[5].
- Not do anything with a[5] because there are no values after a[5].

Thus, the result after calling `windowPosSum` would be `{4, 8, -3, 13, 9, 4}`.

As another example, if we called `windowPosSum` with the array `a = {1, -1, -1, 10, 5, -1}`, and `n = 2`, we’d get `{-1, -1, -1, 14, 4, -1}`.



Starter code is available at [this link](https://goo.gl/bh5zaZ).

Hint 1: Use two `for` loops.

Hint 2: Use `continue` to skip negative values.

Hint 3: Use `break` to avoid going over the end of the array.

```java
public class windowPosSum {
  public static void windowPosSum(int[] a, int n) {
    int i = 0;/*设计i是数组里的数字循环，j是累加的循环*/
      /*循环1： 使得数字下标变化， 并且判断该数字是否需要被累加*/
    for( i = 0; i<a.length; i+=1){ 
      if (a[i]<0){
        continue;
      }
        /*循环2：对于进入累加的数字进行加和。
这里要想到一个办法使得break能帮助后面几个数字跳出循环，因为没有办法加满n个。break的作用是跳出内层循环，并且考虑到当前数字i加上累加的j达到某一个值的时候（在这里是数组长度），就达到了数字下标的最大值，这时候就得跳出循环，不必再累加了。*/
      for( int j = 1; j <= n; j+=1){
        if (i+j == a.length){
          break;
        }
        a[i] = a[i] + a[i+j];
      }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
```

## The Enhanced For Loop

Java also supports iteration through an array using an “enhanced for loop”. The basic idea is that there are many circumstances where we don’t actually care about the index at all. In this case, we **avoid creating an index** variable using a special syntax involving a colon.

For example, in the code below, we do the exact thing as in `BreakDemo` above. However, in this case, we do not create an index `i`. Instead, the `String` `s` takes on the identity of each `String` in `a` exactly once, starting from `a[0]`, all the way up to `a[a.length - 1]`. You can try out this code at [this link](https://goo.gl/wmhVPM).

```java
public class EnhancedForBreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }                
            }
        }
    }
}
```

