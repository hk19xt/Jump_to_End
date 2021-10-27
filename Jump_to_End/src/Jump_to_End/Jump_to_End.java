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
    
    int lastArrayPosition = userArray.length - 1;
    for(int i = userArray.length - 2; i>=0; i--){
      if(i + userArray[i]>=lastArrayPosition){
        lastArrayPosition = i;
      }
    }
  return false;
  }
}
