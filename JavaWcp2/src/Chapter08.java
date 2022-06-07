
public class Chapter08 {
	public static void main(String[] args) {
		int number =1;
				while(number<5) {
					number*=number;
					System.out.println(number);
					number++;
				}
				
		int array[]= {3,6,8,10};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int val :array) {
			if (val%2==0) {
				continue;
			}
			System.out.println(val);
		}
	}
	
}
