package lab2.problem2;

public class Test {

	public static void main(String[] args) {
		Knight k = new Knight(new Position(3, 3));
		System.out.println("Knight move: " + k.isLegal(new Position(5, 4)));
		
		Rook r = new Rook(new Position(3,3));
        System.out.println("Rook move: " + r.isLegal(new Position(3,7)));

        Bishop b = new Bishop(new Position(3,3));
        System.out.println("Bishop move: " + b.isLegal(new Position(6,6)));

        Queen q = new Queen(new Position(3,3));
        System.out.println("Queen move: " + q.isLegal(new Position(3,8)));

        King king = new King(new Position(3,3));
        System.out.println("King move: " + king.isLegal(new Position(4,4)));

        Pawn p = new Pawn(new Position(3,2));
        System.out.println("Pawn move: " + p.isLegal(new Position(3,4)));

	}

}
