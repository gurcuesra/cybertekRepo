import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args){
		// SimpleDate format is a concrete class for formatting and parsing date which inherits
		// java.text.Dateformat class
		// formatting means converting date to string, parsing means converting string to date
		
		Date date = new Date();
		System.out.println(date);    // Wed Nov 21 08:18:09 PST 2018
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  // M -> month , m -> minute
		String strDate = formatter.format(date);
		System.out.println(strDate);   // 21/11/2018
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);   // 11/21/2018
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println(strDate);   // 21-11-2018 08:25:24
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");       // MMMM -> month's name
		strDate = formatter.format(date);
		System.out.println(strDate);   // 21 November 2018
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  // zzzz -> Time Zone
		strDate = formatter.format(date);
		System.out.println(strDate);   // 21 November 2018 Pacific Standard Time
		
		formatter = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss z");  // E-> weekday, MMM -> short month name
		strDate = formatter.format(date);
		System.out.println(strDate);   // Wed,21 Nov 2018 08:31:16 PST
		
		formatter = new SimpleDateFormat("EEEE,dd MMM yyyy HH:mm:ss z");  // EEEE -> whole weekday
		strDate = formatter.format(date);
		System.out.println(strDate);   // Wednesday,21 Nov 2018 08:31:16 PST
		
		
		
		// Convert String into Date
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);   // Tue Mar 31 00:00:00 PDT 2015

	}

}
