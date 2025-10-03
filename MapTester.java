import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester

{
    // instance variables - replace the example below with your own
    private int x;
    private HashMap<String, String> contacts;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        x = 0;
        contacts = new HashMap<>();
        contacts.put("Charles Nguyen", "(531) 9392 4587");
        contacts.put("Lisa Jones", "(402) 4536 4674");
        contacts.put("Hiroshi Ito", "(998) 5488 0123");
    }
    
    public void enterNumber(String name, String number)
    {
        contacts.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return contacts.get(name);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}