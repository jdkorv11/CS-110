package assignments.chap11;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
	
	public Object peek() {
		return this.get(size() - 1);
	}
	
	public Object pop() {
		Object o = peek();
		this.remove(size() - 1);
		return o;
	}
	
	public void push(Object o) {
		this.add(o);
	}
	
	@Override
	public String toString() {
		return "Stack: " + super.toString();
	}
}
