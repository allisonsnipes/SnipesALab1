public class Main {

    public static void main(String[] args) {
        /**
         * Here I will declare variables that are needed to run the program
         * efficiently
         */
        int wasEmpty =  0;

        /**
         * Here I will perform error handling to read the file, and throw errors
         * if it cannot read the file
         */

        /**
         * Here I will have the runtime arguments, if it does not have the necessary
         * runtime arguments then the file will quit.
         */


        //here I will envoke the stack
        elevatorStack elevator = new elevatorStack();

        /**
         * Since the method exists in elevatorStack class we can test for an empty stack
         * by
         */
        if (elevator.emptyElevator()) {
            System.out.println("The elevator is empty");
            wasEmpty++;
        }

    }
}
