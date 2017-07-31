package java_assignments.assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import static java.lang.System.in;
/**
 * Created by zemoso on 28/7/17.
 * This Class is used to print the range in which KYC form is to be filled given SignUp date and Current Date.
 * @author Manvendra
 */
public class KYCForm {
    /**
     * It is used to read input and call other methods.
     * @param args used to get command-line arguments.
     */
    public static void main(String[] args) {
        System.out.print("Enter number of inputs : ");
        Scanner scan = new Scanner(in);
        int input = scan.nextByte();
        System.out.println("Enter the sign up date and current date (format is dd-MM-yyyy dd-MM-yyyy) : ");
        String str[] = new String[input];
        for(int i=0;i<input;i++){
            Scanner scandate = new Scanner(in);
            str[i]=scandate.nextLine();
        }
        parseDateAndRange(str,input);
    }

    /**
     * This method is used to parse SignUp date and Current Date to "dd-MM-yyyy" format.
     * @param str input string
     * @param input no. of inputs
     */
    public static void parseDateAndRange(String str[],int input){
        try {
            Calendar signupDate, currentDate;
            for (int i = 0; i < input; i++) {
                String[] splited = str[i].split("\\s+");
                signupDate = Calendar.getInstance();
                currentDate = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                signupDate.setTime(formatter.parse(splited[0]));
                currentDate.setTime(formatter.parse(splited[1]));
                getRange(signupDate,currentDate);
            }
        }catch (Exception e){
            System.out.println("Exception Caught : " + e.toString());
        }
    }

    /**
     * It is used to calculate range for SignUp Date and Current Date.
     * @param signupDate calender data type contains SignUp date.
     * @param currentDate calender data type contains Current date.
     */
    public static void getRange(Calendar signupDate,Calendar currentDate){
        Calendar range[] = new Calendar[2];
        if(currentDate.before(signupDate)) System.out.println("No range.");
        else {
            Calendar rangeStart, rangeEnd;
            rangeStart = (Calendar) signupDate.clone();
            rangeEnd = (Calendar) signupDate.clone();
            rangeStart.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
            rangeEnd.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
            rangeStart.add(Calendar.DAY_OF_MONTH, -30);
            rangeEnd.add(Calendar.DAY_OF_MONTH, 30);
            if (currentDate.after(rangeStart) && currentDate.before(rangeEnd)) {
                range[0] = rangeStart;
                range[1] = currentDate;
            } else {
                range[0] = rangeStart;
                range[1] = rangeEnd;
            }
            printRange(range);
        }
    }

    /**
     * It is used to print the range of dates when the KYC form is to be filled.
     * @param range calendar data type contains starting date and ending date of range.
     */
    public static void printRange(Calendar range[]){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        StringBuilder output = new StringBuilder(formatter.format(range[0].getTime()));
        output.append(" ");
        output.append(formatter.format(range[1].getTime()));
        System.out.println(output);
                    /*Input:
                        16-07-1998 27-06-2017
                        04-02-2016 04-04-2017
                        04-05-2017 04-04-2017
                        04-04-2015 04-04-2016
                        04-04-2015 15-03-2016
                      Output:
                        16-06-2017 27-06-2017
                        05-01-2017 06-03-2017
                        No range.
                        05-03-2016 04-04-2016
                        05-03-2016 15-03-2016
                         */
    }
}
