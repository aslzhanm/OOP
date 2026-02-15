package lab1.p5;

import java.util.Vector;

public class DragonLaunch {
	
	private Vector<Person> victims = new Vector<>();
	
	public void kidnap(Person p) {
		victims.add(p);
	}
	
	
	
	public boolean willDragonEat() {
		int countBoys = 0;
		
		for(Person p : victims) {
			if(p.getGender() == Gender.BOY) {
				countBoys++;
			}else {
				if(countBoys > 0) {
					countBoys--;
				}else {
					return true;
				}
			}
		}
		return countBoys > 0;
	}

	public static void main(String[] args) {
		DragonLaunch dl = new DragonLaunch();
		
		dl.kidnap(new Person(Gender.BOY));
		dl.kidnap(new Person(Gender.BOY));
		dl.kidnap(new Person(Gender.GIRL));
		dl.kidnap(new Person(Gender.GIRL));
		
		System.out.println("Will dragon eat in case BBGG?\n" + dl.willDragonEat());
		

	}

}
