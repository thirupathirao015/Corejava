package timemsg;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

	public class Weekmsg extends TimerTask
{

	  public void run()
	            {
	                System.out.println("Generating report");
	                     //TODO generate report
	             }

 

	  public static void main(String[] args) {
		  
	    Timer timer = new Timer();
	    Calendar date = Calendar.getInstance();
	    
	    date.set( Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY );
	    date.set(Calendar.HOUR, 20);
	    date.set(Calendar.MINUTE,59);
	    date.set(Calendar.SECOND,15);
	    date.set(Calendar.MILLISECOND, 0);
	    
	    // Schedule to run every Sunday in midnight
	    timer.schedule(new ReportGenerator(),date.getTime(),TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS) );//1000 * 60 * 60 * 24 * 7
	  }//Main method ends
	}//MainApplication ends


