package mainprogram;

import java.util.ArrayList;

public class UiSizeMethodClass {

	UiSizeDaoTest use = new UiSizeDaoTest();
	
	public void UiSizeMethod() {
		ArrayList uselist = new ArrayList();
		uselist = use.mysizelist;

		
		String[] rechance = new String[uselist.size()];
		for (int i = 0; i < rechance.length; i++) {
			rechance[i] = (String) uselist.get(i);
		}
		

		Main.tf4_down.setText(rechance[8]);  // 하의전체기장
		Main.tf6_down.setText(rechance[6]); // 허리둘레
		Main.tf8_down.setText(rechance[7]); // 허벅지둘레
		
		Main.tf4_up.setText(rechance[1]);//상의전체기장
		Main.tf5_up.setText(rechance[2]);//어깨너비
		Main.tf6_up.setText(rechance[3]);//가슴둘레
		Main.tf7_up.setText(rechance[4]);//팔길이
		Main.tf8_up.setText(rechance[5]);//팔둘레
		
		
	}
}
