package bridge;
/**
 * 顺时针
 * @className AntiClockwiseDir
 * @todo 
 * @Date 2016年1月5日下午10:32:46
 */
public class AntiClockwiseDir extends Direction {
	protected void genNextPos() {
		int row = pos.getX();
		int col = pos.getY();
		if (row == min && col > min) {
			col--;
		} else if (row < max && col == min) {
			row++;
		} else if (row == max && col < max) {
			col++;
		} else if (row > min && col == max) {
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
