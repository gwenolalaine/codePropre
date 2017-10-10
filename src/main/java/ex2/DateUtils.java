package ex2;

import java.util.Date;
import java.text.SimpleDateFormat;

final class DateUtils {
	
	private DateUtils(){
		
	}
	/**
	 * @param date
	 * @return 
	 * String
	 */
	public static String format(Date date){
		if(date == null){
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formatter.format(date);
	}
}
