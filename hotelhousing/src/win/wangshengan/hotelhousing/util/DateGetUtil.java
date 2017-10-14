package win.wangshengan.hotelhousing.util;

import java.sql.Date;

/**
 * 通过年月获取日的天数
 * @author AnJia
 *
 */
public class DateGetUtil {

	public static int getDate(int year,int month){
		int day = 0;
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 2:
				//如果该年为闰年
				if((year%4 == 0 && year%100 != 0) || year%400 != 0){
					day = 29;
				}else{
					day = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
		}
		return day;
	}
	
	public static Date getCurrentDate(){
		java.util.Date date = new java.util.Date();
		Date currentDate = new Date(date.getTime());
		return currentDate;
	}
}
