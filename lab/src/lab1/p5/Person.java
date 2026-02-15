package lab1.p5;

enum Gender{
	BOY,
	GIRL
}

public class Person {
	
	private Gender gender;
	
	public Person(Gender gen) {
		this.gender = gen;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	@Override
	public String toString() {
		
		return (gender == Gender.BOY) ? "B" : "G";
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
