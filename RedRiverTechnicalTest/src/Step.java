/*This is a step,  it has an id and a text,  if the data was stored in SQL it would have a Unique id and if its stored in a CSV the id would be the steps index in the file* */

public class Step {
    private String stepText;
    private int id;

    public Step(String stepText, int id){
        this.stepText = stepText;
        this.id = id;
    }

    public int getId() {
        return id;
    }
/*
    This function is useless at the moment but if you wanted to add a form to update the text of a specific text based off of its id it could be used
*/
    public String getStepText() {
        return stepText;
    };

    @Override
    public String toString() {
        return stepText;
    }
}
