package model;

public class Blue implements Colombia {

	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	
	private int x = 0;
	private int y = 8;
	
	@Override
	public boolean isFinished() {
		if(x == 50) {
			return true;
		}
		return false;
	}
	
	@Override
	public void advance() {
		System.out.print(ESC+ x +"G"+ESC+ y +"d");
		System.out.print(ESC+"44m ");
		y++;
		if(y == 14) {
			y = 8;
			x++;
		}
	}
	
}
