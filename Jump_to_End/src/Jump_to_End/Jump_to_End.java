package Jump_to_End;

/*This class is the implementation class. */

public class Jump_to_End {
  
  public boolean Jump_to_End(int[] userArray){
  
    if(userArray.length == 0){ //If the user didn't put any array, then there is only one way to get to the destination from the starting point.
    return true;
    }
    
    if(userArray.length == null){ //If there is no input to the array, then there is only one way to get to the destination from the starting point.
    return true;
    }
    
    while(first_position<=end_position){ //If 
      end_position = Math.max(end_position, first_position+userArray[first_position++]);
        if(end_position>=userArray.length - 1){
        return true;}
    }
  return false;
  }
}
