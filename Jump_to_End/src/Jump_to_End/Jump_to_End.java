package Jump_to_End;

public class Jump_to_End {
  
  public boolean Jump_to_End(int[] userArray){
  
    if(userArray.length == 0){
    return true;
    }
    
    if(userArray.length == null){
    return true;
    }
    
    while(first_position<=end_position){
      end_position = Math.max(end_position, first_position+userArray[first_position++]);
        if(end_position>=userArray.length - 1){
        return true;}
    }
  return false;
  }
}
