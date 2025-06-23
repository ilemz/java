package stack;

public class ArrayStack<E> implements StackInterface<E> {	
	private E stack[];
	private int topIndex;              // ������ ž �ε���
	private static final int DEFAULT_CAPACITY = 64;
	private final E ERROR = null;     // ������ ���� �� 
 
	public ArrayStack() {	// ������ 1
		stack = (E[]) new Object[DEFAULT_CAPACITY];
		topIndex = -1;
	}

	public ArrayStack(int n) {	// ������ 2
		stack = (E[]) new Object[n];
		topIndex = -1;
	}
	
	// [�˰��� 6-1] ����: ���ÿ� ���� x �����ϱ�
	public void push(E newItem) {
		if (isFull()) { /* ���� ó�� */ }
		else stack[++topIndex] = newItem;
	}
	
	// [�˰��� 6-2] ����: ���ÿ��� ���� �����ϱ�
	public E pop() {
		if (isEmpty()) return ERROR;
		else return stack[topIndex--];
	}
	
	// [�˰��� 6-3] ����: ���� ž ���� �˷��ֱ�
	public E top() {
		if (isEmpty()) return ERROR;
		else return stack[topIndex];
	}
	
	// [�˰��� 6-4] ����: ������ �� á���� Ȯ���ϱ�
	public boolean isEmpty() {
		return (topIndex < 0);
	}
	
	// [�˰��� 6-5] ����: ������ ������� Ȯ���ϱ�
	public boolean isFull() {
		return (topIndex == stack.length-1);
	}
 
	// [�˰��� 6-6] ����: ���� ����
	public void popAll( ) {
		stack = (E[]) new Object[stack.length];
		topIndex = -1;
	}

	////////////////////////////////////////////
	public void printAll() {
		System.out.print("Stack from top:");
		for(int i=topIndex; i>=0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public int getTopIndex() {
		return topIndex;
	}
} 
