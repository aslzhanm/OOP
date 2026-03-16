package lab2.problem2;

public abstract class Piece {
	Position a;
	Piece(Position a){
		this.a = a;
		
	}
	abstract boolean isLegal(Position b);
	

}

class Rook extends Piece {
	Rook(Position a){
		super(a);
	}
	@Override boolean isLegal(Position b) {
		if ((a.x == b.x) || (a.y == b.y)) {
			return true;
		}
		return false;
	}
}

class King extends Piece {
	King(Position a){
		super(a);
	}
	@Override boolean isLegal(Position b) {
		if (Math.abs(a.x - b.x) <= 1 && Math.abs(a.y - b.y) <= 1) {
			return true;
		}
		return false;
	}
}

class Queen extends Piece {
	Queen(Position a){
		super(a);
	}
	@Override boolean isLegal(Position b) {
		if (Math.abs(a.x - b.x) == Math.abs(a.y - b.y) || a.x == b.x || a.y == b.y) {
			return true;
		}
		return false;
	}
}

class Bishop extends Piece {
	Bishop(Position a){
		super(a);
	}
	@Override boolean isLegal(Position b) {
		if (Math.abs(a.x - b.x) == Math.abs(a.y - b.y)) {
			return true;
		}
		return false;
	}
}

class Knight extends Piece {
	Knight(Position a){
		super(a);
	}
	@Override boolean isLegal(Position b) {
		if (Math.abs(a.x - b.x) == 1 && Math.abs(a.y - b.y) == 2 || Math.abs(a.x - b.x) == 2 && Math.abs(a.y - b.y) == 1) {
			return true;
		}
		return false;
	}
}

class Pawn extends Piece {
	Pawn(Position a){
		super(a);
	}
	@Override boolean isLegal(Position b) {
		if (a.y == 2) {
			if (b.y - a.y == 2 || b.y - a.y == 1) {
				return true;
			}
		}
		if (a.y != 2 && b.y - a.y == 1) {
			return true;
		}
		return false;
	}
}






























