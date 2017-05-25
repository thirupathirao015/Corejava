package timemsg;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;                                    
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class ReportGenerator extends TimerTask
{

           public void run() {
	  
                          System.out.println("Generating report time MR.Thirupathirao");
                                  
                          }

 public static void main(String[] args)
  {
              Timer timer = new Timer();
         
              Calendar thiru = Calendar.getInstance();
              
              thiru.set(Calendar.HOUR_OF_DAY,20);
              thiru.set(Calendar.MINUTE,20);
              thiru.set(Calendar.SECOND, 0);

              // every morning at 9am you run your task

              timer.schedule(new ReportGenerator(), thiru.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)); // 60*60*24*100 = 8640000ms
  }//Main method ends
}//MainApplication ends
