package vamk.phatmai;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class pacman extends JFrame{

	public pacman() {
		add(new Model());
	}
	
	
	public static void main(String[] args) {
		pacman pac = new pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman_e2000587");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}