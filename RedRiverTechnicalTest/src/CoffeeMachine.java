import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine{
    DataManager dm = new DataManager();
    RecipeManager rm = new RecipeManager(dm.getRecipes(), dm.getSteps());
    Scanner sc  = new Scanner(System.in);

    public CoffeeMachine(){

    }
    //main method this runs the entire program.  it takes the input that is verified in the input method by a separate method
    //it them formats it and receives other important information
    //and finally it's all published
    public void run() {
        int recipeIndex = getInput();
        String recipe = rm.getRecipeByIndex(recipeIndex);
        String recipeName = rm.getRecipeNameByIndex(recipeIndex);
        ArrayList<Integer> steps = formatRecipe(recipe);
        publishSteps(steps, recipeName);
    }
    //input could have been put in a separate class if the application had a front end and the code would have needed to be reused for the moment its alright ere

    private int getInput(){
        System.out.println("Please enter the number corresponding to your selection" + "\n");
        System.out.println(rm.toString());
        return(validateInput(sc.nextLine())-1);

    };
    //this is where the code is validated,  if the code is wrong in any way the getInput method is recalled, and it starts over from receiving input and gives a related error message
    private int validateInput(String input){
        try{
            int inputAsInteger = Integer.parseInt(input.trim());
            if(inputAsInteger > 0 && inputAsInteger <= rm.getTotalRecipes()) {
                return inputAsInteger;
            }else if(input.trim().length() == 0){
                return getInput();
            }

            else {
                System.out.println("Input was not an number in range of the options,  please enter the number corresponding to your choice");
                return getInput();
            }
        }catch(Exception ignored) {
            System.out.println("Input was not a number,  please enter a number");
            return getInput();
        }
    };
    //this is wherer the steps are outputted on by one based off of their ids,  a little more magic is done to be done with publishing (formatting and giving step numbers)
    private void publishSteps(ArrayList<Integer> stepList, String recipeName) {
        System.out.println("Here is the recipe for " + recipeName + ":\n");
        int count = 1;
        for (int i: stepList
             ) {
            System.out.println("" + count + ":" + rm.getStepById(i));
            count++;
        }
        System.out.println("\n\n");
    }
    //this converts the string into an arraylist which is a vital step so that the recipe can be processed
    private ArrayList<Integer> formatRecipe(String recipe) {
        ArrayList<Integer> integerList = new ArrayList<>();
        String[] splitString = recipe.split("/");
        for (String s: splitString
             ) {
            integerList.add(Integer.valueOf(s));
        }
        return integerList;
    }
}