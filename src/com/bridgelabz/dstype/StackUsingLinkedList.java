package com.bridgelabz.dstype;

public class StackUsingLinkedList<G> 
{
	LinkedList<G> stack = new LinkedList<G>();
	
	public static int top = -1; //initially the top -1

	

	/**
	 * Purpose: check size of stack
	 * 
	 * @return return the top value
	 */
	public int size() 
	{
		return top;
	}
	/**
	 * Purpose: push the element into stack 
	 * @param data  push data into stack
	 */
	public void push(G data) 
	{

		stack.add(data); //call function of list
		top++;

	}

	/**
	 * Purpose: pop the element from stack 
	 * @return returns data which is popped
	 */
	public void pop() 
	{

		if (isEmpty()) 
		{
			System.out.println("Stack is underflow");
		}
		else 
		{
			stack.deleteAt(top); 
			top--;

		}

	}

	/**
	 * Purpose: show top element of stack
	 * @return returns top data
	 */

	public G peek() 
	{
		G data;
		data = (G) stack.get(top);
		return data;
	}

	/**
	 * Purpose: check stack is empty or not 
	 * @return return true if empty else true
	 */
	public boolean isEmpty() 
	{

		return stack.isEmpty();
	}

	/**
	 * Purpose: check stack is full or not (not applicable in linked list)
	 * 
	 * @return return true if full else true
	 */
	
	/*
	 * public boolean isFull() {
	 * 
	 * return top == stack.length; }
	 * 
	 */
	/**
	 * Purpose: show stack values
	 */
	public void show() 
	{ 
		stack.display();
	}

	/**
	 * Purpose: method for showing list of stack without spaces
	 */
	public void showStackWithoutSpace() {
		stack.showListWithoutSpaces();
	}

	/**
	 * Purpose: method for returning the string of stack list
	 * @return returns the stack list without spaces
	 */
	public String returnStackWithoutSpaces() 
	{
		return stack.returnListInString();
	}
 

}
