package timemsg;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;                                    
import java.util.TimerTask;

public  class MyTimeTask extends TimerTask
{

    public void run()
    {
        System.out.println("thirupathi your code is exicuted.");//write your code here
    }

public static void main(String[] args) throws ParseException {

    //the Date and time at which you want to execute
    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = dateFormatter .parse("2017-03-22 19:45:30");

    //Now create the time and schedule it
    Timer timer = new Timer();

    //Use this if you want to execute it once
    timer.schedule(new MyTimeTask(), date);

    //Use this if you want to execute it repeatedly
    //int period = 10000;//10secs
    //timer.schedule(new MyTimeTask(), date, period );
}
}