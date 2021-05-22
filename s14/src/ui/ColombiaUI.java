package ui;

import model.*;
import thread.ColombiaThread;

public class ColombiaUI {
	
	public void startProgress() {
		System.out.print("\u001b[2J");
		ColombiaThread thread1 = new ColombiaThread(new Yellow(), 10);
		ColombiaThread thread2 = new ColombiaThread(new Blue(), 30);
		ColombiaThread thread3 = new ColombiaThread(new Red(), 60);
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
}
