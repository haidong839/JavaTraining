package training;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawImage extends Frame {

	public DrawImage() {
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	public void paint(Graphics g) {
		super.paint(g);
		BufferedImage image = new BufferedImage(200, 50, BufferedImage.TYPE_INT_RGB);
		Graphics g1 = image.createGraphics();
		g1.setColor(Color.BLUE);
		g1.fillRect(0, 0, 200, 50);
        g1.setColor(Color.RED);
        Font myFont = new Font("Serif", Font.BOLD, 12);
        g1.setFont(myFont);
        g1.drawString("hello",  10, 10);
		try {
			File f = new File("C:\\java\\CustomImage.jpg");
			ImageIO.write(image, "jpg", f);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		DrawImage di = new DrawImage();
		di.setVisible(true);
	}

}
