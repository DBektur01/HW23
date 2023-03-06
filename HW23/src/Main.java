import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList  = new ArrayList<>();
        for (int i = 0; i <=100; i++) {
            numbersList.add(i);
        }
        ArrayList<Integer>oddNumbers= new ArrayList<>();
        ArrayList<Integer>evenNumbers= new ArrayList<>();
        for (int numbers:numbersList) {
            if(numbers%2==1){
                oddNumbers.add(numbers);
            }else{
                evenNumbers.add(numbers);
            }
        }
        System.out.println("All Numbers: "+numbersList+"\n\nOdd Numbers: "+oddNumbers+"\n\nEven Numbers: "+evenNumbers);
    }
}