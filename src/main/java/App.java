import utils.DateConverter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println("Hello!!!!!!!");
        System.out.println("Hi!");
        String testDateString = "14/04/2024";
        long testDateLong = 1713045600000L;
        System.out.println(DateConverter.stringToLong(testDateString));
        System.out.println(DateConverter.longToString(testDateLong));

    }
}
