package game;
import java.awt.Image;

import javax.swing.ImageIcon;


public class Card {
	private String type;
	private String shape;
	private Image pic;
	
	//constructor without image
	public Card(String t, String s){
		this.setType(t);
		this.setShape(s);
		
	}
	

	//constructor with image
	public Card(String t, String s, String p){
		this.setType(t);
		this.setShape(s);
		this.setPic(p);
		
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Image getPic() {
		return pic;
	}

	public void setPic(String path) {
		this.pic = new ImageIcon("images//"+path+".png").getImage();
	}
	
	
}
