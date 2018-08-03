import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PlayWithDates {

  public static void main(String[] args) throws ParseException {

	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  
	   
	   Calendar cal = Calendar.getInstance();
	   System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));

	   cal.add(Calendar.DATE, 1);
	   System.out.println("Add one day to current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.MONTH, 1);
	   System.out.println("Add one month to current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.YEAR, 1);
	   System.out.println("Add one year to current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.HOUR, 1);
	   System.out.println("Add one hour to current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.MINUTE, 1);
	   System.out.println("Add one minute to current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.SECOND, 1);
	   System.out.println("Add one second to current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.DATE, -1);
	   System.out.println("Subtract one day from current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.MONTH, -1);
	   System.out.println("Subtract one month from current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.YEAR, -1);
	   System.out.println("Subtract one year from current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.HOUR, -1);
	   System.out.println("Subtract one hour from current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.MINUTE, -1);
	   System.out.println("Subtract one minute from current date : " + dateFormat.format(cal.getTime()));

	   cal = Calendar.getInstance();
	   cal.add(Calendar.SECOND, -1);
	   System.out.println("Subtract one second from current date : " + dateFormat.format(cal.getTime()));

	   String date_s = "2011 05 18"; 
	   SimpleDateFormat dt = new SimpleDateFormat("yyyy MM dd"); 
	   
	   DateFormat df2 = new SimpleDateFormat("MM");
	   DateFormat df3 = new SimpleDateFormat("MMMM");

	   Date date = dt.parse(date_s); 
	   System.out.println(dt.format(date));
	   System.out.println(df2.format(date));
	   System.out.println(df3.format(date));
	   
	   String date_x = "11";
	   SimpleDateFormat dx  = new SimpleDateFormat("MM");
	   
	   Date dtx = dx.parse(date_x);
	   System.out.println(df2.format(dtx));
	   System.out.println(df3.format(dtx));
	   
	   // now do a couple of DAYS
	   DateFormat dfd2 = new SimpleDateFormat("d");
	   DateFormat dfd3 = new SimpleDateFormat("dd");
	   String date_d = "21";
	   Date dtd = dfd3.parse(date_d);
	   System.out.println(dfd2.format(dtd));
	   System.out.println(dfd3.format(dtd));
	   
	   String date_d3 = "3";
	   Date dtd3 = dfd3.parse(date_d3);
	   System.out.println(dfd2.format(dtd3));
	   System.out.println(dfd3.format(dtd3));
  }
}

