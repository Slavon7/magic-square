/**
*        @Created by Vyacheslav Omeniuk
*        The magic square is an interesting mathematical trick "if you don't know what it consists of".
*        If we enter a number from 21 to 60, then we will see that any horizontal
*        and vertical lines in total contain your entered number.
*        But this is not all, if you look closely, then diagonally,
*        too, even if you take the left or right square.
*        Choose any square from 4 numbers
 */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 21 to 60");
        System.out.print("Input num: ");
        int num = in.nextInt();


        if(num <= 20 || num > 60){
            System.out.println("Error num");
        }

        System.out.println("\t " + num + "\n");

        int [][] square = {{num-20,1,12,7}, {11,8,num-21,2}, {5,10,3,num-18}, {4,num-19,6,9}};

        for (int i = 0;i < square.length;i++){
            for (int j = 0;j < square[i].length;j++){
                System.out.print(square[i][j] + "\t");
            }
            System.out.println("=   " + num);
        }
        System.out.println("|\t|\t|\t|\t");
        System.out.println(num + "\t" + num + "\t" + num + "\t" + num + "\t");
    }
}