package bridge;

public class ClockwiseDir extends Direction {
	protected void genNextPos() {
		int row = pos.getX();
		int col = pos.getY();
		if (row == min && col < max) {
			col++;
		} else if (row < max && col == max) {
			row++;
		} else if (row == max && col > min) {
			col--;
		} else if (row > min && col == min) {
			row--;
		} else{
			return; //匹配不到任何条件，则直接跳出（指螺旋的最后一个位置）
		}
		if (row == periodPos.getX() && col == periodPos.getY()) {
			min++;
			max--;
			genNextPos();
			periodPos = new Position(pos.getX(), pos.getY());
		} else {
			pos.setX(row);
			pos.setY(col);
		}
	}

}
