import java.util.Scanner;

public class Add {
    

	public static void main(String args[]){
        
        System.out.println("In Main Class>>");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int no1 = input.nextInt();
        
        System.out.println("Enter Second Number:");
        int no2 = input.nextInt();
        input.close();
		
		int result =  no1 + no2;
		System.out.printf("%d + %d = %d",no1,no2,result);
	}
}
