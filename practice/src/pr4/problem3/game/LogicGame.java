package pr4.problem3.game;

public class LogicGame implements IGame {
	@Override public void a() {
		System.out.println("forward");
	}
	@Override public void b() {
		System.out.println("to right");
	}
	@Override public void c() {
		System.out.println("to left");
	}
	@Override public void d() {
		System.out.println("back");
	}
}
