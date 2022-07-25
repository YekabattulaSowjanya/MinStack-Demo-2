package miniStack;

import java.util.*;
class MinStack{
	Stack<Integer> st=new Stack<>();//[-2,0,-3]  [-2,0]
	Stack<Integer> mn=new Stack<>();//[-2,0,-3]  [-2,0]

	public void push(int x) 
	{
	    if(st.empty() || x<=mn.peek())
	        mn.push(x);//[-2,0,-3]
	    st.push(x);//[-2,0,-3]
	}

	public void pop() 
	{
	    if(st.peek().equals(mn.peek())) //-3==-3
	        mn.pop();//-2,0
	    st.pop();//-2,0
	}

	public int top() 
	{
	     return st.peek();//0
	}

	public int getMin() 
	{
	    return mn.peek();//return -3
	}
	
	
	/*int[][] input= {{},{-2},{0},{-3},{},{},{},{}};
    Integer[] result=minStack(input);

for(int i=0;i<result.length;i++) {
	System.out.print(result[i]+" ");
}*/
	   
	
	
	
public static Integer[] minStack(int[][] input) {//method definition #3
		Integer[] result=new Integer[8];//[null(0,0)[0],null(1,0)[1],null(2,0)[2],null(3,0)[3],-3[4],null[5],0[6],-2[7]]
		MinStack st =null;
		for(int i=0;i<input.length;i++) {//0<8
			if(i==0) {	
				st=new MinStack();
				result[i]=null;
			}
			if(i==1 || i==2 || i==3) {
				 st.push(input[i][0]);
 			result[i]=null;
			}
			if(i==4 || i==7) {
				int res=st.getMin();//# 5method calling
				result[i]=res;
			}
			if(i==5) {
				st.pop();//#6method calling
				result[i]=null;//res[5]=null
			}
			if(i==6) {
				result[i]=st.top();//#7
			}	
		}
		return result; 		
	} 

	
	public static void main(String[] args) {
	    // should return true
	    int[][] input= {{},{-2},{0},{-3},{},{},{},{}};//Array intialization #1
	    Integer[] result=minStack(input);////method calling #2
    
    for(int i=0;i<result.length;i++) {
    	System.out.print(result[i]+" ");
    }
 	
    
    
    MinStack minStack = new MinStack();
    //adding
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    //[-2,0,-3]
    int param1 = minStack.getMin(); //-3 mimimum
    minStack.pop();//deleted -3
    //[-2,0]
    int param2 = minStack.top(); //0  
    int param3 = minStack.getMin(); //-2
    System.out.println();
    System.out.println("Minmum:"+param1);
    System.out.println("Top:"+param2);
    System.out.println("Minimum:"+param3);
    }

	
}

	
	
