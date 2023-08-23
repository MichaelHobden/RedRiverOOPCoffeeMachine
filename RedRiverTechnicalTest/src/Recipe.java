/*
* simple class to store data for the recipe,  its has a recipe name, and the actual recipe stored with a / delimiter,  another way of doing this would be to
* store the steps as an array of numbers and this would cut down on the code required later because it has to be split up and processed,  but it would require more code
* where the data is loaded into the classes as the data would either have to be stored differently or split up when its laoded.
* */

public class Recipe {
    private String recipeName;
    private String recipe;

    public Recipe(String recipeName, String recipe) {
        this.recipeName = recipeName;
        this.recipe = recipe;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public String toString() {
        return recipeName;
    }
}
