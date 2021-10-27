package Jump_to_End;

/*This class is the implementation class. */

public class Jump_to_End {

    public boolean Jump_to_End(int[] userArray){

        if(userArray.length == 0){ //If the user didn't put any array, then there is only one way to get to the destination from the starting point.
            return true;
        }

        if(userArray == null){ //If there is no input to the array, then there is only one way to get to the destination from the starting point.
            return true;
        }

        int lastArrayPosition = userArray.length - 1; //The lastposition of the array which is the array length - 1.
        for(int i = userArray.length - 2; i>=0; i--){ //Calculate from the second last position of the array.
            if(i + userArray[i]>=lastArrayPosition){ //If the last position is lower than equal to the second last position value and the second position value,
                lastArrayPosition = i; //then last position is moved onto the next last position.
            }
            return true;//If i + userArray[i] is larger and equal to the last array position, then it returns true, which means that the first element can jump to the end position of the array. 
        }
        return false;//If i + userArray[i] is less than the last array po
    }
}
