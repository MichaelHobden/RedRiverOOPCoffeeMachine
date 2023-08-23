import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
/*
    this class allows me to separate the storage of the recipe data,  I could it into a CSV file and that would allow me to add new
    recipes and steps.  For the moment I am going to just leave the values hardcoded.  I will include a couple functions just to indicate this functionality,
    but it seemed a little too far outside the projects spec
*/
public class DataManager {
    private ArrayList<Recipe> recipes = new ArrayList<>();
    private ArrayList<Step> steps = new ArrayList<>();

    public DataManager(File file) {
        //code to get data from CSV file
    }
    //populating data manually as previously mentioned (Ln 4-7)
    public DataManager() {
        recipes.add(new Recipe("Lemon Tea", "1/2/3/4"));
        recipes.add(new Recipe("Coffee", "1/5/6/7"));
        recipes.add(new Recipe("Chocolate", "1/8/9"));

        steps.add(new Step("Boil some water", 1));
        steps.add(new Step("Steep the water in the tea", 2));
        steps.add(new Step("Pour tea in the cup", 3));
        steps.add(new Step("Add Lemon", 4));
        steps.add(new Step("Brew the coffee grounds", 5));
        steps.add(new Step("Pour the coffee in the cup",6));
        steps.add(new Step("Add sugar and milk", 7));
        steps.add(new Step("Add drinking chocolate powder to the water", 8));
        steps.add(new Step("Pour chocolate in the cup", 9));
    }
    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public ArrayList<Step> getSteps() {
        return steps;
    }

    public void pushNewRecipe(Recipe r){
        /*Data would be taken from the recipe using the accessor methods coded into them and used to populate whatever it was being stored in*/
    }

    public void pushNewStep(Step s) {
        /*Data would be taken from the recipe using the accessor methods coded into them and used to populate whatever is was being stored in*/
    }
    public void pushNewRecipe(String recipeName, String recipe) {
        /*Similar deal to previous methods without needing to use accessor methods,  just for a different use case*/
    }
    public void pushNewStep(String step, int id) {
        /*Similar deal to previous methods without needing to use accessor methods,  just for a different use case*/
    }
}
