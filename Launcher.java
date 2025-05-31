package main.Librarium;

import java.awt.EventQueue;

public class Launcher {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
					login.show();
					
					//Register r = new Register();
					//r.show();
					
					//UserWindow u = new UserWindow();
					//u.show();
					
					//AdminWindow a = new AdminWindow();
					//a.show();
					
					//Sample s = new Sample();
					//s.show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}