package test_0511;
//한메일
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class gwajeh_4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<>();
		Stack<Character> stack = new Stack<>();

		System.out.print("수식을 입력하세요: ");
		String expression  = s.nextLine(); 

		for (int i = 0; i < expression.length(); i++) {
			
			char ch = expression.charAt(i);
			
		    if (Character.isDigit(ch)) { 
			  queue.offer(ch - '0');
		    }
		    
		    else if (ch == '+' || ch == '-') { 
			  stack.push(ch);
		    }
			
		}
		
		if (stack.peek() == '+') {
			int result = queue.peek();
		
			queue.remove();
		
			result += queue.peek();
		
			System.out.println("계산 결과 : " + result);
		}
		
		else if(stack.peek() == '-') {
			
			int result = queue.peek();
			
			queue.remove();
		
			result -= queue.peek();
		
			System.out.println("계산 결과 : " + result);
			
		}
		

	}

}
