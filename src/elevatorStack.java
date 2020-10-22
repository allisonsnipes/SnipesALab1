/**
 * This class is responsible for creating the elevator stack. Within this stack all
 * functions related to a pop, push, delete will be accounted for.
 */

public class elevatorStack {
    private final int STACKSIZE = 5;
    private int top;
    private int[] people;

    //stack methods will go here

    /**
     * Here I will do error handling to ensure that first the stack is not empty and
     * if it was ever empty I want to count that instance.
     */

    public boolean emptyElevator() {
        if (top == -1){
            return true;

        }else {
            return false;
        }
    }

    /**
     * Here I will implement a pop method that will check if the stack is empty and throw an error
     */

}
