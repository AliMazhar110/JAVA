import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of elements in an array = ");
        int num = scan.nextInt();
        int[] arr1 = new int[num];
        for(int i=0;i<num;i++){
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = new int[num];
        System.arraycopy(arr1, 0, arr2, 0, num);
        System.out.println("\nElements in copied array - ");
        for(int i=0;i<num;i++){
            System.out.println("Element "+i+" = "+arr2[i]);
        }
    }
}
