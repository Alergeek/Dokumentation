
import java.util.*;

/**
 * 
 */
public class Session {

    /**
     * 
     */
    public Session() {
    }

    /**
     * 
     */
    private string token;

    /**
     * 
     */
    private User user;

    /**
     * 
     */
    private bool admin;


    /**
     * @return
     */
    public static int generate_barcode() {
        // TODO implement here
        return 0;
    }

    /**
     * revoke existing session via auth token
     * @param token
     */
    public void __construct(string token) {
        // TODO implement here
    }

    /**
     * generate new session via  login credentials
     * @param email 
     * @param password
     */
    public void __construct(string email, string password) {
        // TODO implement here
    }

    /**
     * create new session via generated barcode
     * @param barcode
     */
    public void __construct(int barcode) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean destroy() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public User get_user() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public string get_token() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public bool is_admin() {
        // TODO implement here
        return null;
    }

    /**
     * checks if a given string matches the pattern of an auth token
     * @param token 
     * @return
     */
    public static boolean is_token(string token) {
        // TODO implement here
        return false;
    }

}