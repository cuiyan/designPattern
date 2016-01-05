package bridge;

public class TopRight implements StartPos {

	@Override
	public Position getPos(int len) {
		return new Position(0, len - 1);
	}

}
