package mainprogram;

import java.awt.Color;

import javax.swing.ImageIcon;

public class DownCompare {

	static String sizeimg = "피팅룸.png";
	
	public void downcompare() {
		double tf4_down = Double.parseDouble(Main.tf4_down.getText());
		double tf6_down = Double.parseDouble(Main.tf6_down.getText());
		double tf8_down = Double.parseDouble(Main.tf8_down.getText());
		
		double tf444_down = Double.parseDouble(Main.tf444_down.getText());
		double tf666_down = Double.parseDouble(Main.tf666_down.getText());
		double tf888_down = Double.parseDouble(Main.tf888_down.getText());
		
		
		if (tf4_down == 0) {
			Main.tf44_down.setText("정 보 부 족");
		}
		
		else if (tf4_down == tf444_down) {
			Main.tf44_down.setText("!적합!");
			Main.tf44_down.setForeground(Color.BLACK);
			
			sizeimg = "하의타이트핏.png";
			
			Main.l_img_down.setIcon(new ImageIcon(sizeimg));
			Main.f.setVisible(true);
			
		}else if (tf4_down > tf444_down) {
			double a = tf4_down - tf444_down;
			String a2 = String.format("%.1f", a);
			Main.tf44_down.setText(" 옷 " + a2 +" 작음");
			Main.tf44_down.setForeground(Color.RED);
			
			if (a <= 2) {
				sizeimg = "하의타이트핏.png";
			}
			
			else if (a <= 4) {
				sizeimg = "하의슬림핏.png";
			}else {
				sizeimg = "너무작은옷.png";
			}
			Main.l_img_down.setIcon(new ImageIcon(sizeimg));
			Main.f.setVisible(true);
			
		}else {
			double b = tf444_down - tf4_down;
			String b2 = String.format("%.1f", b);
			Main.tf44_down.setText(" 옷 "+ b2 +" 큼");
			Main.tf44_down.setForeground(Color.BLUE);
			
			if (b <= 3) {
				sizeimg ="하의타이트핏.png";
			}else if (b <= 6) {
				sizeimg ="하의오버핏.png";
			}else if (b <= 9) {
				sizeimg ="루즈핏.png";
			}else {
				sizeimg ="너무큰옷.png";
			}
			Main.l_img_down.setIcon(new ImageIcon(sizeimg));
			Main.f.setVisible(true);
		}
		
		if (tf6_down == 0) {
			Main.tf66_down.setText("정 보 부 족");
		}
		
		else if (tf6_down == tf666_down) {
			Main.tf66_down.setText("!적합!");
			Main.tf66_down.setForeground(Color.BLACK);
			
		}else if (tf6_down > tf666_down) {
			double a = tf6_down - tf666_down;
			String a2 = String.format("%.1f", a);
			Main.tf66_down.setText(" 옷 " + a2 +" 작음");
			Main.tf66_down.setForeground(Color.RED);
			
		}else {
			double b = tf666_down - tf6_down;
			String b2 = String.format("%.1f", b);
			Main.tf66_down.setText(" 옷 "+ b2 +" 큼");
			Main.tf66_down.setForeground(Color.BLUE);
		}
		
		if (tf8_down == 0) {
			Main.tf88_down.setText("정 보 부 족");
		}
		
		else if (tf8_down == tf888_down) {
			Main.tf88_down.setText("!적합!");
			Main.tf88_down.setForeground(Color.BLACK);
			
		}else if (tf8_down > tf888_down) {
			double a = tf8_down - tf888_down;
			String a2 = String.format("%.1f", a);
			Main.tf88_down.setText(" 옷 " + a2 +" 작음");
			Main.tf88_down.setForeground(Color.RED);
			
		}else {
			double b = tf888_down - tf8_down;
			String b2 = String.format("%.1f", b);
			Main.tf88_down.setText(" 옷 "+ b2 +" 큼");
			Main.tf88_down.setForeground(Color.BLUE);
		}
		
		
		
	}
	
}
