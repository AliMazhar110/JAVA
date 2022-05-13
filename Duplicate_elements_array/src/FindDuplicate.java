import java.util.Scanner;

public class FindDuplicate {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nNumber of elements in an array = ");
        int num = scan.nextInt();
        int[] arr1 = new int[num];
        for(int i=0;i<num;i++){
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            if(i==0){
                arr2[count++] = arr1[i];
            }
            else{
                int flag=0;
                for(int x: arr2){
                    if(arr1[i]==x) {
                        System.out.println(arr1[i]);
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    arr2[count++] = arr1[i];
                }
            }
        }
    }
}
