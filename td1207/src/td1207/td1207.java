package td1207;
import java.util.*;
import java.lang.*;
import java.io.*;

public class td1207 {
	public static void main(String[] args) {
		int   nale = 1 + (int)(Math.random() * 100);
        Scanner sc= new Scanner(System.in);
        int j=0;
       
            
        do{
             System.out.println("Entrer un nombre à deviner compris entre 1 et 100 :");
             int n = sc.nextInt();
            j++;
            if (n==nale){
                System.out.println("Vous avez gagné");
                break;
            }else if(n>nale){
                System.out.println(n+" est supérieur au nombre aléatoire à deviner ");
            }
            else {
                System.out.println(n+" est inférieur au nombre aléatoire à deviner ");
            }
            if(j==10){
                 System.out.println("Vous avez atteint "+j+" essais donc vous avez perdu");
                break;
            }
        }while(true);

}
}
