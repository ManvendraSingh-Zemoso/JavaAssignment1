package manvendra.assignment2;

/**
 * Created by zemoso on 14/7/17.
 * This class is to find first 100 Vampire Numbers.
 * @author Manvendra
 */
public class question1 {
    static int count1 = 0;
    static int a;
    static int[] digits = new int[10];

    public static void main(String[] args) {
        System.out.println("First 100 vampire numbers are : ");
        Number();
    }

    /**
     * This Number() method is to iterate from 1000 to 1000000.
     */
    public static void Number(){
        for(int c=1000;c<=1000000;c++)
        {
            VampireNumber(c);
        }
    }

    /**
     * This VampireNumber method is to check if the input is Vampire Number or not.
     * @param vampirenumber integer type
     */
    public static void VampireNumber(int vampirenumber) {
        int d = (int) Math.sqrt(vampirenumber);
        int fang2;
        for(int fang1=10;fang1<=d;fang1++)
        {
            if(vampirenumber%fang1==0)
            {
                if (alldigits(vampirenumber) % 2 == 0)
                {
                    fang2 = vampirenumber / fang1;
                    alldigitscheck(fang1,1);
                    alldigitscheck(fang2,1);
                    alldigitscheck(vampirenumber,-1);
                    boolean check=checkdigitsequal();
                    for (int x = 0; x < 10; x++)digits[x] = 0;
                    if(check && alldigits(fang1)==alldigits(fang2)){
                        System.out.println(vampirenumber);
                        break;
                    }
                }
            }
        }

    }

    /**
     * this method is to find no. of digits
     * @param x integer type
     * @return no. of digits
     */
    public static int alldigits(int x) {
        count1=0;
        do {
            x = x / 10;
            count1++;
        } while (x != 0);
        return count1;
    }

    /**
     * This method is used to make an array where index no. represent digits and value represents the
     * count of that digit.By this we can check digits in fangs are same as in Vampire number.
     * @param x integer type takes fangs and vampire number as input
     * @param l whether to increase or decrease the count
     */
    public static void alldigitscheck(int x, int l) {
        do {
            int y = x % 10;
            digits[y] = digits[y] + l;
            x = x / 10;
        } while (x != 0);
    }

    /**
     * This method is used to check whether the digits in fangs are same as in Vampire number.
     * @return boolean type
     */
    public static boolean checkdigitsequal() {
        int count2=0;
        for (a = 0; a < 10; a++) {
            if (digits[a] == 0)
            {
                count2++;
                if(count2==10)return true;
            }
            else return false;
        }
        return false;
    }
}
