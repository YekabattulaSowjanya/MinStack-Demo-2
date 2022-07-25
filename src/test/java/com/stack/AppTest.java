package com.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;

import java.util.EmptyStackException;

import org.junit.Test;

import minStack.MinStack;

//import static org.junit.Assert.*;

//import org.junit.Test;	

	public class AppTest{
		MinStack minStack = new MinStack();
		@Test
		//It enable the method,execution starts from here
		 //@DisplayName("Minmum")
	public void when_StackHasElements_Expect_TopEleToBeRemovedForPop() {
			//int actualTop=-3;
			//int expectedTop=-3;
			//two values are equal or not
			//assertEquals("Minimum is passed",expectedTop, actualTop);//assertEquals( message, expected, actual)
		
			 minStack.push(-2);
			    minStack.push(0);
			    minStack.push(-3);
			       
			    
			   minStack.getMin();
			   //assertEquals(-3,minStack.getMin());
				
			    minStack.pop();
			  //  minStack.pop();
		      //  assertEquals(0,minStack.top());
		
			    
			    minStack.getMin();
			    assertEquals(-2,minStack.getMin());
				
	} 
		

		
		@Test ( expected = EmptyStackException.class)
		public void When_StackIsEmpty_Expect_StackEmptyExceptionForPop()
		{
			minStack.pop();
		}


		
		
	}


