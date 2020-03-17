package com.lucas.test.ex43;

import java.util.ArrayList;
import java.util.List;

public class Stack{
	
	private List<Integer> stack;
	private int max = 0;
	
	public Stack() {
		this.stack = new ArrayList<Integer>();
	}
	
	public void push(int value) {
		if(value > max) {
			this.stack.add(value + max);
			max = value;
		}
		else {
			this.stack.add(value);
		}
	}
	
	public Integer pop(){
		if(stack.size() > 0) {
			Integer value = stack.get(stack.size()-1);
			if(value > max) {
				value = max;
				max = (stack.get(stack.size()-1) - max);
			}
			stack.remove(stack.size()-1);
			return value;
		}
		return null;
	}
	
	public int max() {
		return this.max;
	}

}
