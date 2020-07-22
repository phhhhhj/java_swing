package mainprogram;

import java.awt.Color;

import javax.swing.ImageIcon;

public class UpCompare {

	//double L4_up = Double.parseDouble(s)
	
	static String sizeimg = "피팅룸.png";
	
	public void upcompare() {
		double tf4_up = Double.parseDouble(Main.tf4_up.getText());
		double tf5_up = Double.parseDouble(Main.tf5_up.getText());
		double tf6_up = Double.parseDouble(Main.tf6_up.getText());
		double tf7_up = Double.parseDouble(Main.tf7_up.getText());
		double tf8_up = Double.parseDouble(Main.tf8_up.getText());
		
		
		double tf444_up = Double.parseDouble(Main.tf444_up.getText());
		double tf555_up = Double.parseDouble(Main.tf555_up.getText());
		double tf666_up = Double.parseDouble(Main.tf666_up.getText());
		double tf777_up = Double.parseDouble(Main.tf777_up.getText());
		double tf888_up = Double.parseDouble(Main.tf888_up.getText());
		
		
		if (tf4_up == 0) {
			Main.tf44_up.setText("정 보 부 족");
		}
		
		else if (tf4_up == tf444_up) {
			Main.tf44_up.setText("!적합!");
			Main.tf44_up.setForeground(Color.BLACK);
			
			sizeimg = "상의타이트핏.png";
			Main.l_img_up.setIcon(new ImageIcon(sizeimg));
			Main.f.setVisible(true);
			
			
		}else if (tf4_up > tf444_up) {
			double a = tf4_up - tf444_up;
			String a2 = String.format("%.1f", a);
			Main.tf44_up.setText(" 옷 " + a2 +" 작음");
			Main.tf44_up.setForeground(Color.RED);
			
			if (a <= 2) {
				sizeimg = "상의타이트핏.png";
			}
			
			else if (a <= 4) {
				sizeimg = "상의슬림핏.png";
			}else {
				sizeimg = "너무작은옷.png";
			}
			Main.l_img_up.setIcon(new ImageIcon(sizeimg));
			Main.f.setVisible(true);
			
		}else {
			double b = tf444_up - tf4_up;
			String b2 = String.format("%.1f", b);
			Main.tf44_up.setText(" 옷 "+ b2 +" 큼");
			Main.tf44_up.setForeground(Color.BLUE);
			
			if (b <= 3) {
				sizeimg ="상의타이트핏.png";
			}else if (b <= 6) {
				sizeimg ="상의오버핏.png";
			}else if (b <= 9) {
				sizeimg ="루즈핏.png";
			}else {
				sizeimg ="너무큰옷.png";
			}
			Main.l_img_up.setIcon(new ImageIcon(sizeimg));
			Main.f.setVisible(true);
			
			
		}
		
		
		if (tf5_up == 0) {
			Main.tf55_up.setText("정 보 부 족");
		}
		
		else if (tf5_up == tf555_up) {
			Main.tf55_up.setText("!적합!");
			Main.tf55_up.setForeground(Color.BLACK);
			
		}else if (tf5_up > tf555_up) {
			double a = tf5_up - tf555_up;
			String a2 = String.format("%.1f", a);
			Main.tf55_up.setText(" 옷 " + a2 +" 작음");
			Main.tf55_up.setForeground(Color.RED);
			
		}else {
			double b = tf555_up - tf5_up;
			String b2 = String.format("%.1f", b);
			Main.tf55_up.setText(" 옷 "+ b2 +" 큼");
			Main.tf55_up.setForeground(Color.BLUE);
		}
		
		
		if (tf6_up == 0) {
			Main.tf66_up.setText("정 보 부 족");
		}
		
		else if (tf6_up == tf666_up) {
			Main.tf66_up.setText("!적합!");
			Main.tf66_up.setForeground(Color.BLACK);
			
		}else if (tf6_up > tf666_up) {
			double a = tf6_up - tf666_up;
			String a2 = String.format("%.1f", a);
			Main.tf66_up.setText(" 옷 " + a2 +" 작음");
			Main.tf66_up.setForeground(Color.RED);
			
		}else {
			double b = tf666_up - tf6_up;
			String b2 = String.format("%.1f", b);
			Main.tf66_up.setText(" 옷 "+ b2 +" 큼");
			Main.tf66_up.setForeground(Color.BLUE);
		}
		
		
		if (tf7_up == 0) {
			Main.tf77_up.setText("정 보 부 족");
		}
		
		else if (tf7_up == tf777_up) {
			Main.tf77_up.setText("!적합!");
			Main.tf77_up.setForeground(Color.BLACK);
			
		}else if (tf7_up > tf777_up) {
			double a = tf7_up - tf777_up;
			String a2 = String.format("%.1f", a);
			Main.tf77_up.setText(" 옷 " + a2 +" 작음");
			Main.tf77_up.setForeground(Color.RED);
			
		}else {
			double b = tf777_up - tf7_up;
			String b2 = String.format("%.1f", b);
			Main.tf77_up.setText(" 옷 "+ b2 +" 큼");
			Main.tf77_up.setForeground(Color.BLUE);
		}
		
		
		if (tf8_up == 0) {
			Main.tf88_up.setText("정 보 부 족");
		}
		
		else if (tf8_up == tf888_up) {
			Main.tf88_up.setText("!적합!");
			Main.tf88_up.setForeground(Color.BLACK);
			
		}else if (tf8_up > tf888_up) {
			double a = tf8_up - tf888_up;
			String a2 = String.format("%.1f", a);
			Main.tf88_up.setText(" 옷 " + a2 +" 작음");
			Main.tf88_up.setForeground(Color.RED);
			
		}else {
			double b = tf888_up - tf8_up;
			String b2 = String.format("%.1f", b);
			Main.tf88_up.setText(" 옷 "+ b2 +" 큼");
			Main.tf88_up.setForeground(Color.BLUE);
		}
		
	}
	
}
