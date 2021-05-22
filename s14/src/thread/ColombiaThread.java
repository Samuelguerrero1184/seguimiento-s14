package thread;

import model.*;

public class ColombiaThread extends Thread {

	public final static String ESC   = "\u001b[";
	Colombia col;
	int sleep;
	
	public ColombiaThread(Colombia col, int sleep) {
		this.col = col;
		this.sleep = sleep;
	}
	
	@Override
	public void run() {
		while(!col.isFinished()) {
			try {
				col.advance();
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
