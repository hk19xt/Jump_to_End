package Jump_to_End;

/*This is the main class. The users can change the values in the input array. 
The calculation whether the first element can jump to the end position will be conducted by the implementation class. 
Name: Hyejin Kim
Date: 10/29/2021 */

public class Main {
    public static void main(String[] args){
        Jump_to_End  je = new Jump_to_End();
        int[] userArray= {2,3,1,1,4}; //The users can change the array values here.
        boolean result;
        result = je.Jump_to_End(userArray);
        System.out.println(result);
    }
}
