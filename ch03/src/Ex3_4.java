
public class Ex3_4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	int a = 1_000_000;
    	int b = 2_000_000;
    	
//    	long c = a * b;
//    	결과 값으로 오버플로우가 발생된다.
    	
    	long c = (long)a * b;
    	
    	
    	System.out.println(c);
    	
    	
    	

    }

}
