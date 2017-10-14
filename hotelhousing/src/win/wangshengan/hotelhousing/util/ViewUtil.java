package win.wangshengan.hotelhousing.util;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 视图工具类
 * @author AnJia
 *
 */
public class ViewUtil {

	/**
	 * 使界面居中
	 * @param jframe
	 */
	public static void viewLocationCenter(JFrame jframe){
		int screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int jframe_width = jframe.getWidth();
		int jframe_height = jframe.getHeight();
		jframe.setLocation((screen_width-jframe_width)/2, (screen_height-jframe_height)/2);
	}
	//添加背景图片
	public static void addBackground(JFrame jframe,String imageIcon,int width,int height) {
		ImageIcon image = new ImageIcon(imageIcon);
		image.setImage(image.getImage().getScaledInstance(width, height,
				Image.SCALE_FAST));
		JLabel jlabel = new JLabel(image);
		jlabel.setBounds(0, 0, width, height);
		jframe.getLayeredPane().add(jlabel, new Integer(Integer.MIN_VALUE));
		((JPanel) jframe.getContentPane()).setOpaque(false);
	}
}
