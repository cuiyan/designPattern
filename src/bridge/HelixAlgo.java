package bridge;

public class HelixAlgo {
	public void print(Direction dir,int initVal,int step) {
		int len = dir.getLen();
		if (len <= 0) {
			System.out.println("请输入大于0的整数！");
			return;
		}
		int[][] helix = calculate(dir, len,initVal,step);
		for (int i = 0; i < helix.length; i++) {
			for (int j = 0; j < helix[i].length; j++) {
				System.out.print(helix[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	private int[][] calculate(Direction dir, int len,int val,int step) {
		int[][] helix = new int[len][len];
		for (int i = 0; i < len * len; i++) {
			Position pos = dir.getPos();
			int row = pos.getX();
			int col = pos.getY();
			helix[row][col] = val;
			val+=step;
		}
		return helix;
	}

	public static void main(String[] args) {
		HelixAlgo algo = new HelixAlgo();
		int len = 5;
		Direction dir_clockwise = new ClockwiseDir();
		dir_clockwise.setLen(len); //用set方法动态地插入长度

		Direction dir_antiClockwise = new AntiClockwiseDir();
		dir_antiClockwise.setLen(len);

		System.out.println("\n左上角开始顺时针内旋(长度" + len + ")：");
		dir_clockwise.setStartPos(new TopLeft()); //用set方法动态地插入开始位置
		algo.print(dir_clockwise,1,1);
		System.out.println("\n右上角开始顺时针内旋(长度" + len + ")：");
		dir_clockwise.setStartPos(new TopRight());
		algo.print(dir_clockwise,1,1);
		System.out.println("\n右下角开始顺时针内旋(长度" + len + ")：");
		dir_clockwise.setStartPos(new BottomRight());
		algo.print(dir_clockwise,1,1);
		System.out.println("\n左下角开始顺时针内旋(长度" + len + ")：");
		dir_clockwise.setStartPos(new BottomLeft());
		algo.print(dir_clockwise,1,1);
		
		System.out.println("\n左上角开始逆时针内旋(长度" + len + ")：");
		dir_antiClockwise.setStartPos(new TopLeft());
		algo.print(dir_antiClockwise,1,1);
		System.out.println("\n右上角开始逆时针内旋(长度" + len + ")：");
		dir_antiClockwise.setStartPos(new TopRight());
		algo.print(dir_antiClockwise,1,1);
		System.out.println("\n右下角开始逆时针内旋(长度" + len + ")：");
		dir_antiClockwise.setStartPos(new BottomRight());
		algo.print(dir_antiClockwise,1,1);
		System.out.println("\n左下角开始逆时针内旋(长度" + len + ")：");
		dir_antiClockwise.setStartPos(new BottomLeft());
		algo.print(dir_antiClockwise,1,1);
		
		System.out.println("\n中心点开始顺时针外旋(长度" + len + ")：");
		dir_antiClockwise.setStartPos(new TopLeft());
		algo.print(dir_antiClockwise,len*len,-1);
		System.out.println("\n中心点开始逆时针外旋(长度" + len + ")：");
		dir_clockwise.setStartPos(new TopLeft());
		algo.print(dir_clockwise,len*len,-1);
	}

}
