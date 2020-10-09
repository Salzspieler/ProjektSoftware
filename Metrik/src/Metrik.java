
import java.awt.*;  
public class Metrik {

	public static void main(String[] args) {
		
		First2 f=new First2();  
	}
	
}
	class First2{  
		final int width = 1200;
	    final int height = width / 16 * 9;
		First2(){  
		Frame f=new Frame();  
		Button b=new Button("click me");  
		b.setBounds(30,50,80,30);  
		f.add(b);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
		//Creating the canvas.
	    Canvas canvas = new Canvas();

	    canvas.setSize(width, height);
	    canvas.setBackground(Color.BLACK);
	    canvas.setVisible(true);
	    canvas.setFocusable(false);


	    //Putting it all together.
	    f.add(canvas);

}
		}
