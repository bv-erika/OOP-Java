package interfaces;

import java.awt.Color;

public interface Colorable {

	public static Color defaultcolor = Color.RED;
	
	public default Color getDefaultColor() {
		return defaultcolor;
	}
	
	public void setDefaultColor();
}
