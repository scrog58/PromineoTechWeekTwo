
public class WeekTwoLoops {
	public static void main(String[] args) {
		
		//print all even numbers
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//print every 3rd number 1st try
		int orn = 3;		
		for(int i = 1; i < 34; i++) {
			int getnmb = orn * i;
			int total = 100 - getnmb;
			System.out.println(total);		
			
		}
		
		//print every 3rd number 2nd try
		for(int i = 99; i > 1; i--) {
			i += 1;
			i -= 3;
			System.out.println(i);		
		}
		
		//print every 3rd number 3rd try		
		for(int i = 100; i > 0; i -= 3) {
			System.out.println(i);		
			
		}	
		
		//print every other number
		for(int i = 0; i < 100; i++) {
			i += 1;
			System.out.println(i);
		}
		
		for(int i = 0; i < 25; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("HelloWorld");
			} else if(i % 3 == 0) {
				System.out.println("Hello");
	
			} else if(i % 5 == 0) {
				System.out.println("World");
			}
			
			
		}
			
		
	}

}
