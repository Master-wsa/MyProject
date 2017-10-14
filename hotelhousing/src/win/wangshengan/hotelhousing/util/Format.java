package win.wangshengan.hotelhousing.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ��ʽת��������
 * @author AnJia
 *
 */
public class Format {

	/**
	 * �ж��ַ����Ƿ����ת��Ϊ����
	 * @param str
	 * @return
	 */
	public static boolean isStringToNumber(String str){
		Pattern pattern = Pattern.compile("^[0-9]*$");  
		Matcher matcher = pattern.matcher(str);  
		return matcher.matches();
	}
	public static boolean isDateFormat(String str){
		Pattern pattern = Pattern.compile("^[0-9]{4,4}-[0-1][0-9]-[0-3][0-9]$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	public static boolean isRoomno(String rno){
		Pattern pattern = Pattern.compile("^[2-5][0][1-9]$");
		Matcher matcher = pattern.matcher(rno);
		return matcher.matches();
	}
}
