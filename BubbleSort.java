//Viet Tran & Dabeer Masood
import java.io.*;
import java.util.*;
public class BubbleSort
{
    // instance variables - replace the example below with your own
     public static void main(String []args) throws FileNotFoundException {
    int swap;
    int swapCounter=0;
    Scanner sc= new Scanner(new FileReader("C:\\Users\\dabee_000\\Documents\\PracticeInput3.txt"));

            ArrayList<Integer> checker = new ArrayList<Integer>();
            while(sc.hasNextInt()){
            checker.add(sc.nextInt());
            
            
            }
            int numOfInt = checker.size();
    int array[] = new int[numOfInt];
    for(int i = 0; i < numOfInt; i++){
       array[i] = checker.get(i);
    }

    
    for (int i = 0; i < ( numOfInt - 1 ); i++) {
      for (int j = 0; j < numOfInt - i - 1; j++) {
        if (array[j] > array[j+1]){
            swapCounter++;
          swap = array[j];
          array[j]= array[j+1];
          array[j+1] = swap;
        }
      }
    }
    System.out.println(swapCounter);
    for(int i = 0; i < numOfInt-1; i++){
        System.out.print(array[i] + " ");
    }
    System.out.print(array[numOfInt-1]);
  }
  
  
}