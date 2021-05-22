package model;

public class Red implements Colombia {

	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	
	private int x = 0;
	private int y = 14;
	
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
		System.out.print(ESC+"41m ");
		y++;
		if(y == 18) {
			y = 14;
			x++;
		}
	}
	
}
