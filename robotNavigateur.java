package problem_solving_java;
import java.util.Scanner;

public class robotNavigateur {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int x=0,y=0;
System.out.print("How many commands? ");
int n = input.nextInt();  // user chooses how many commands HE WANT TO APPLIED OF THE ROBOT
String[] commands=new String[n];
    for(int i = 0 ; i < n ; i++){
        System.out.println("enter un commande (UP,DOWN,RIGHT,LEFT) : ");
        commands[i] =input.next();
    }
    for(int i = 0 ; i < n ; i++){
        if(commands[i].equalsIgnoreCase("UP")){
            y++;
        }else if(commands[i].equalsIgnoreCase("DOWN")){
            y--;
        }else if(commands[i].equalsIgnoreCase("RIGHT")){
            x++;
        }else if (commands[i].equalsIgnoreCase("LEFT")){
            x--;
        }   
    }
    System.out.println("la position finale est : "+x+" et "+y);
    input.close();

}
  
}
