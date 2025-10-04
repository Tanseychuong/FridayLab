import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {2,5,8,3,4,6,10,15,20,1,11};

        //Task one
        int value = 0;
        for(int i= 0; i<numbers.length;i++){
            value = numbers[i];
            System.out.println(i+ " : "+value);
        }
        
        //Task two
        int placeholder = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = placeholder;
        System.out.println(Arrays.toString(numbers));

        // task three

        for(int i = 0; i<numbers.length-1; i++){
            int min = i;
            for (int j = i+1; j<numbers.length; j++){
                if(numbers[j]<numbers[min]){
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i<numbers.length-1; i++){
            int maxIndex = i;
            for (int k = i+1; k<numbers.length; k++){
                if (numbers[k]>numbers[maxIndex]){
                    maxIndex = k;
                }
            }
            int temp2 = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp2;
        }
        System.out.println(Arrays.toString(numbers));

        // Task 4: Linear search

        Scanner input = new Scanner(System.in); // creating new scanner for reading the user input
        System.out.println("Enter the number you want check: "); //Prompting user for the number the want to check
        int num1 =  input.nextInt();
        int index = 0;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == num1){
                index = i;
                found = true;
                System.out.println(numbers[index]+ " is at index "+index);
            }
        }
        if (!found){
            System.out.println("The number you entered is not found");
        }



        // Task 5: Binary search

        System.out.println("Enter the number you want to search: ");
        int numToSearch = input.nextInt();
        Arrays.sort(numbers);
        boolean found2 = false;
        int lowNumber = 0;
        int highNumber = numbers.length - 1;

        while ( lowNumber<=highNumber){
            int mid = (lowNumber + highNumber) / 2;
            if(numbers[mid] == numToSearch){
                found2 = true;
                System.out.println("Your number " +numToSearch + " is found at index " + mid);
                break;
            }else if(numbers[mid] < numToSearch){
                lowNumber = mid+1;
            }else {
                highNumber = mid-1;
            }
        }
        if (!found2){
            System.out.println("The number you entered is not found");
        }

    }
}