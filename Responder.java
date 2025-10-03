import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responseMap;
    private ArrayList<String> defaultResponses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
    }

    private void fillResponseMap()
    {
        
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
}

