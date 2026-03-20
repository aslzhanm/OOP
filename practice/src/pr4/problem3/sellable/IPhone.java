package pr4.problem3.sellable;

public class IPhone implements SellableAndPluggable {
	@Override public void a() {
		System.out.println("IPhone is for sale!");
	}
	@Override public void b() {
		System.out.println("IPhone has issues with plugging😢");
	}
}
