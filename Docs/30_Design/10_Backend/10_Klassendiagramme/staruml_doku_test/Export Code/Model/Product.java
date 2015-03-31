
import java.util.*;

/**
 * 
 */
public class Product {

    /**
     * 
     */
    public Product() {
    }

    /**
     * 
     */
    private int ean;

    /**
     * 
     */
    private string name;

    /**
     * 
     */
    private Set<Ingredient> ingredients;



    /**
     * @param ean 
     * @param name 
     * @return
     */
    public static Product create(int ean, string name) {
        // TODO implement here
        return null;
    }

    /**
     * Gibt ein Produkt anhand seiner ID aus der Datenbank zurück.
     * @param id 
     * @return
     */
    public static Product get_by_id(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static Set<Product> get_by_name() {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @param name
     */
    public void __construct(int id, string name) {
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
    public string get_name() {
        // TODO implement here
        return null;
    }

    /**
     * @param name 
     * @return
     */
    public boolean set_name(string name) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Set<Ingredient> get_ingredients() {
        // TODO implement here
        return null;
    }

    /**
     * @param ingredient 
     * @return
     */
    public boolean add_ingredient(Ingredient ingredient) {
        // TODO implement here
        return false;
    }

    /**
     * @param ingredient 
     * @return
     */
    public boolean rm_ingredient(Ingredient ingredient) {
        // TODO implement here
        return false;
    }

}