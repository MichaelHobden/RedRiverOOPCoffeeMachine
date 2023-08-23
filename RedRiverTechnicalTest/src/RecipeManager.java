import java.util.ArrayList;
import java.util.Objects;

/*This class stores and manipulates the recipes and their steps in 2 separate array lists*/
public class RecipeManager {
    private ArrayList<Recipe> recipeList;
    private ArrayList<Step> stepList;

    public RecipeManager(ArrayList<Recipe> recipeList, ArrayList<Step> stepList) {
        this.recipeList = recipeList;
        this.stepList = stepList;
    }
    //this allows you to create a coffeeMachine class without populating any data,  this could be used if you wanted to insert the data after creating the class for whatevere reason really
    //or if you wanted to insert the recipes and lists one by one
    public RecipeManager(){
        this.recipeList = new ArrayList<Recipe>();
        this.stepList = new ArrayList<Step>();
    }

    public void addRecipe(Recipe r) {
        recipeList.add(r);
    }
    public void addStep(Step s){
        stepList.add(s);
    }

    public Recipe getRecipeByName(String name){
        for (Recipe r: recipeList
             ) {
            if(Objects.equals(r.getRecipeName(), name)){
                return r;
            }
        }
        return null;
    }
    //below are methods used by the CoffeeMachine Class to get the data to be printed out
    public String getRecipeByIndex(int index) {
        return recipeList.get(index).getRecipe();
    }
    public String getRecipeNameByIndex(int index) {
        return recipeList.get(index).getRecipeName();
    }

    public Step getStepById(int stepId){
        for (Step s: stepList
             ) {
            if(s.getId() == stepId){
                return s;
            }
        }
        return null;
    };

    public int getTotalRecipes(){
        return recipeList.size();
    }

    @Override
    public String toString() {
        String returnString = "";
        int count = 1;
        for (Recipe r: recipeList
             ) {
            returnString += count + " " + r.toString() + "\n";
            count++;
        }
        return returnString;
    }
}
