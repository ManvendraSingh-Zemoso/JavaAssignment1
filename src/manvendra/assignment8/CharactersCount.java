package manvendra.assignment8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by zemoso on 24/7/17.
 * This class is used to take input from a file and count frequency of characters and save the output
 * to a file.
 * @author Manvendra
 */
public class CharactersCount {
    /**
     * Main method is used to take filename as input.
     * @param args used to get command line arguments here filename
     */
    public static void main(String[] args) {
        Map<Character,Integer> map;
        if(args.length>0){
            String s;
            try {
                s=read(args[0]);
                //System.out.println(s);
                map=maps(s);
                //System.out.println(map);
                write(map);
            }catch(Exception e){
                System.err.println("Exception : " + e.toString());
            }

        }
        else System.out.println("no argument as input");
    }
    /**
     * This method is used to read input from the text file.
     * @param filename string type
     * @return string, contents of the input file
     * @throws IOException throws exception when file not found.
     */
    public static String read(String filename) throws IOException {
        //FileInputStream fstream = new FileInputStream(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str=br.readLine()) != null)
            sb.append(str);
        in.close();
        return sb.toString();
    }
    /**
     * This method is used to count frequency of characters using map
     * @param file contents of file
     * @return map containing characters as key and their frequency as value
     */
    public static Map maps(String file){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int length = file.length();
        for(int i=0;i<length;i++){
            if (i==0){
                map.put(file.charAt(i),1);
            }
            else{
                if(map.get(file.charAt(i))==null)map.put(file.charAt(i),1);
                else{
                    int v= map.get(file.charAt(i));
                    map.put(file.charAt(i),v+1);
                }
            }
        }
        return map;
    }
    /**
     * This method is used to write the output to another file.
     * @param map map containing characters as key and their frequency as value
     * @throws IOException throws exceptions
     */
    public static void write(Map map) throws IOException{
        //File Output = new File("Output.txt");
        PrintWriter Poutput = new PrintWriter(new FileOutputStream("Output.txt"));
        Poutput.write(map.toString());
        Poutput.flush();
        out.close();
        Poutput.close();
    }
}
