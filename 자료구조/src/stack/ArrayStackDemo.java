package stack;

public class ArrayStackDemo {

	public static void main(String[] args) {
		System.out.println("Array Stack Demo!"); 
		ArrayStack<Integer> list = new ArrayStack<>();
		list.push(1);
		list.push(2);
		list.push(3);
		System.out.print("printAll(): "); list.printAll();  
		list.popAll();
		System.out.println("isEmpty?: " + list.isEmpty());
		list.push(10);
		list.push(20);
		list.push(30);
		list.pop();
		list.push(40);
		int st = list.top();
		System.out.print("printAll(): "); list.printAll();
		System.out.println("pop() " + list.pop());
		System.out.println("pop() " + list.pop());
		System.out.println("pop() " + list.pop());
		System.out.println("pop() " + list.pop()); // no effect
		System.out.println("isEmpty?: " + list.isEmpty());
	}
}  // 코드 6-3
