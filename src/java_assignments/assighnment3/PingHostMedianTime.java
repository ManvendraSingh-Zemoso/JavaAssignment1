package java_assignments.assighnment3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;

/**
 * Created by zemoso on 27/7/17.
 * This class is used to calculate median of time taken to ping a host/ip address.
 * @author Manvendra
 */
public class PingHostMedianTime {
    /**
     *It is used read/scan input host and no. of packets and ping the host and find the median time taken.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        try{
            System.out.println("Enter the host to be pinged : ");
            Scanner sc = new Scanner(in);
            String str = sc.next();
            System.out.println("Enter the no. of packets to be sent : ");
            int packets = sc.nextByte();
            String pingResult;
            int count=0;
            double array[]= new double[packets];
            String command = "ping -c "+ packets +" " + str;
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                if(count<=packets && count>0) {
                    pingResult = (inputLine.substring(inputLine.indexOf("time=")));
                    array[count-1]= Double.valueOf(pingResult.substring(5,pingResult.indexOf("ms")));
                    }
                    count++;
                }
                in.close();
                if(count==0){
                    System.out.println("Wrong host entered.");
                    return;
                }
                Arrays.sort(array);
                if(packets%2==0)
                    System.out.print((array[packets/2] + array[(packets/2) +1])/2 + " ms");
                else
                    System.out.print(array[(packets/2)] + " ms");
            }catch(Exception e){
                System.out.print("Exception caught: " + e.toString());
            }
    }
}