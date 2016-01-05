package bridge;

public class BottomRight implements StartPos {

	@Override
	public Position getPos(int len) {
		// TODO Auto-generated method stub
		return new Position(len - 1, len - 1);
	}

}
