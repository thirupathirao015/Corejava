package string;

public class Bomber 
{
    public static void main(String args[])
    {
        String s  = "aabcccdee";//input
        String output = "";
        char prevchar = s.charAt(0);
        for(int i  = 0 ; i < s.length()   ; )
        {

             char outputlastchar = ' ';
             if(output.length() > 0)
            {
                          outputlastchar =  output.charAt(output.length()-1);
            }

            if( i == s.length() -1 )
            {
                          if(outputlastchar != s.charAt(i))
                          {
                             output +=s.charAt(i);
                          }
                              else
                          {
                                    if(output.length() > 0)
                                    {
                                       output = output.substring(0,output.length()-1);
                                    }
                           }
                          break;
            }

            if((s.charAt(i) == s.charAt(i+1)) )
            {
               int j = i;

                          while(j< s.length() && s.charAt(j) == s.charAt(i))
                          { 
                                       j++;
                          }
                i=j;
                prevchar = s.charAt(j-1);
            }
            else if(   s.charAt(i) == outputlastchar )
            {

                if(output.length() > 0)
                {
                     output = output.substring(0,output.length()-1);
                }

                prevchar = s.charAt(i);
                i++;
               
            }
            else
            {
                output +=s.charAt(i);
                prevchar = s.charAt(i);
                i++;

            }

        }

        System.out.println("output:"+output);
	}
}
