import java.util.Scanner;

public class MaxNumbers {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the integers: ");
    int num = input.nextInt();
    int max = num;
    int count = 0;
    
    do{
      num = input.nextInt();
      if (num > max){
        max = num;
        count = 0;
      }
      if (num == max)
        count++;  
    } while (num != 0);
    
    System.out.println("The largest number is " + max);
    System.out.println("The occurance count of the largest number is " + count);
  }   // main 
}    // MaxNumbers
