import java.util.Scanner;

public class IfElseCondition {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int grade;

        System.out.println("Enter student's grade");
        grade = input.nextInt();
        if(grade>=80){
            System.out.println("She/He deserve grade A ");
        }
        else
            System.out.println("He or she doesn't deserve A");
    }
}
