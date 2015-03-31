
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * 
     */
    public User() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private string email;

    /**
     * 
     */
    private string password;

    /**
     * 
     */
    private Set<Ingredient> blacklist;


    /**
     * @param email 
     * @param password 
     * @return
     */
    public static User create(string email, string password) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    public static User get_by_id(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param email 
     * @return
     */
    public static User get_by_email(string email) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @param email 
     * @param password
     */
    public void __construct(int id, string email, string password) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int get_id() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public string get_email() {
        // TODO implement here
        return null;
    }

    /**
     * @param password 
     * @return
     */
    public boolean check_password(string password) {
        // TODO implement here
        return false;
    }

    /**
     * @param email 
     * @return
     */
    public boolean set_email(string email) {
        // TODO implement here
        return false;
    }

    /**
     * @param password 
     * @return
     */
    public boolean set_password(string password) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Ingredient get_blacklist() {
        // TODO implement here
        return null;
    }

    /**
     * @param item_id 
     * @return
     */
    public boolean add_to_blacklist(int item_id) {
        // TODO implement here
        return false;
    }

    /**
     * @param item_id 
     * @return
     */
    public boolean rm_from_blacklist(int item_id) {
        // TODO implement here
        return false;
    }

}