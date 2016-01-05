package bridge;

public abstract class Direction {
	protected StartPos startPos;
	protected Position pos;// 当期的位置
	protected Position periodPos;// 一个周期的开始位置
	protected int max;// 行列的最大值
	protected int min;// 行列的最小值
	protected int len;// 方阵的阶数
	private void init() {
		if (startPos == null || len <= 0)
			return;
		Position tempPos = startPos.getPos(len);
		pos = new Position(tempPos.getX(), tempPos.getY());
		periodPos = new Position(tempPos.getX(), tempPos.getY());
		max = len - 1;
		min = 0;
	}

	public void setStartPos(StartPos startPos) {// 设置开始位置并重新初始化
		this.startPos = startPos;
		init();
	}

	public void setLen(int len) {// 设置长度并重新初始化
		this.len = len;
		init();
	}

	public int getLen() {
		return len;
	}

	public Position getPos() {
		int currRow = pos.getX();
		int currCol = pos.getY();
		Position currPos = new Position(currRow, currCol);
		genNextPos();
		return currPos;
	}

	protected abstract void genNextPos();

}
