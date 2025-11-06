package problem_solving_java;
import java.util.Scanner;
public class repartition_une_Classe {

    public static void main(String[]args){
        int studentIndex = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("How many students are there? ");
        int n = input.nextInt(); 
        int[] students=new int[n];
        System.out.print("How many benches are there? ");
        int m = input.nextInt(); 
        int totalCapacity = m * 2;
        if (n > totalCapacity) {
            System.out.println("Not enough benches! Only " + totalCapacity + " seats for " + n + " students.\n");
        }
        int[][] benches=new int[m][2];
        for (int row = 0; row < benches.length; row++) {
            System.out.print("Bench " + (row + 1) + " : ");
            for (int seat = 0; seat < benches[row].length; seat++) {
          
                if (studentIndex <= n ) {
                    benches[row][seat] =studentIndex;
                    System.out.print("Student " + benches[row][seat] + " ");
                    studentIndex++;

                } 
            
        
                }
            
                System.out.println();
            }
           
            if (studentIndex <= n) {
                for (int i = studentIndex; i <= n; i++) {
                    System.out.println("Student " + i + " did not find a seat.");
                }
            }
            input.close(); 
            }
           
        }

    
