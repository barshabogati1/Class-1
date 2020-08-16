package day23;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		Date date = new Date ();
		System.out.println(date);
		parseDate(date);
		
	}
public static void parseDateToString (Date date) {
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a MM//dd/yyyy");
	String formattedDate=sdf.format(date);
	System.out.println(formattedDate);
}
}
