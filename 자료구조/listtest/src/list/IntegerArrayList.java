package list;

public class IntegerArrayList implements InteferListInterface  {
	private Integer[] item;
    private int numItems;
    /*
    	stack의 범위 지정, 
        static이 없다면 동적으로 바인딩
        -> 새 객체가 생성될때 상수(final)가 생성
        static이 있다면 정적으로 바인딩
        -> 컴파일 시점에서 상수(final)가 생성
    */
    private static final int DEFAULT_CAPACITY = 64; 
     
    
    public IntegerArrayList() {   //생성자 1
    	item = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }
    
    public IntegerArrayList(int n) {   //생성자 2: n만큼의 stack의 길이 생성
    	item = new Integer[n];
        numItems = 0; //리스트의 총 원소 수
    }
    
    // 배열 리스트의 k번째 자리에 원소 x를 삽입하기
   	public void add(int index, Integer x) {
   		if(numItems >= item.length || index < 0 || index > numItems) {
        	/*
            예외 처리 -> ArrayIndexOutOfBoundsException
            k번째 자리가 0미만이거나
            스택의 크기보다 총 원소수가 큰 경우
            k가 총 원소수 보다 큰 경우
            */
        } else {
        	for(int i = numItems-1; i>= index; i--)
            	item[i+1] = item[i]; // 우 시프트 
            item[index] = x;
            numItems++;
           // System.out.println(item[index]);
        }
   		
   	}
    
    //배열 리스트의 맨 뒤에 원소 추가하기 
   	public void append(Integer x) {
    	if(numItems >= item.length) { /*예외 처리*/ }
        else { item[numItems++] = x; }
    }
    
    // 배열 리스트의 k번째 원소 삭제하기
    public Integer remove(int index) {
    	if(isEmpty() || index < 0 || index > numItems -1)
        	return null;
        else {
        	Integer tmp = item[index];
            for (int i = index; i<= numItems -2; i++)
            	item[i] = item[i+1];
            numItems--;
            return tmp;
        }
    }
    
    //배열 리스트에서 원소 x 삭제하기
     public boolean removeItem(Integer x) {
        int k = 0;
        while (k < numItems && item[k].compareTo(x) != 0) {
            k++;
        }
        if (k == numItems) {
            return false;
        } else {
            for (int i = k; i < numItems - 2; i++)
                item[i] = item[i + 1];
            numItems--;
            return true;
        }
    }

    // 배열 리스트의 i번째 원소 알려주기 
    public Integer get(int index) {
        if (index >= 0 && index <= numItems - 1) {
            return item[index];
        } else {
            return null;
        }
    }

    // 배열 리스트의 i번째 원소를 x로 대체하기
    public void set(int index, Integer x) {
        if (index >= 0 &&  index <= numItems - 1) {
           	item[index] = x; 
        } else { /*예외처리*/ }
    }

    
    private final int  NOT_FOUND = -12345;
    public int indexOf(Integer x) {
        for (int i = 0; i < numItems; i++) {
            if (((Comparable) item[i]).compareTo(x) == 0) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    // 배열 리스트의 총 원소수 알려주기
    public int len() {
        return numItems;
    }

    // 배열 리스트가 비었는지 알려주기
    public boolean isEmpty() {
        return numItems == 0;
    }

    // 배열 리스트 깨끗이 청소하기 
    public void clear() {
        item = new Integer[item.length];
        numItems = 0;
    }
    public void printAll() {
		System.out.print("Print list (#items=" + numItems + ") ");
		for(int i = 0; i < numItems; i++) 
			System.out.print(item[i] + " ");
		System.out.println();
	}
}