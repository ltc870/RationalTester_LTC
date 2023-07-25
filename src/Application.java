
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 RationalNumber rationalNumber1 = new RationalNumber(10, 2);
		 RationalNumber rationalNumber2 = new RationalNumber(10, 5);
		 
		 int answer = rationalNumber1.compareTo(rationalNumber2);
		 
		 if (answer == 0) {
			 System.out.println("float1 is equal to float2");
		 } else if (answer < 0) {
			 System.out.println("float1 is less than float2");
		 } else {
			 System.out.println("float1 is greater than float2");
		 }
	}

}
