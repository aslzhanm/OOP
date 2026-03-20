package pr4.problem3.game;

public class App {
	
	void getStats(Game g) {
		g.a();
		g.b();
		g.c();
		if (g instanceof IGame) {
			((IGame) g).d();
		}
	}

	public static void main(String[] args) {
		MemoryGame mG = new MemoryGame();
		LogicGame lG = new LogicGame();
		
		App app = new App();
		
		app.getStats(mG);
		System.out.println("\n");
		app.getStats(lG);

	}

}
