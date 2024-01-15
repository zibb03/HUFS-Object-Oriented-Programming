import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
public class St_Main {
//course should store with comma. ex)a,b,c,d
	public static void main(String[] args) throws IOException {
		run();
	}
	static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File file = new File("st_info");
					file.createNewFile();
					st_GUI GUI = new st_GUI ();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
	