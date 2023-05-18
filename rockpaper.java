import java.util.ArrayList;
import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        rock();
    }
    static void rock(){
        Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList<>();
        al.add('r');
        al.add('p');
        al.add('s');
        int player1=0;
        int player2=0;
        while((player1<10 && player2<10)){
            System.out.println("player1 turn");
            char a=sc.next().charAt(0);
            //if(al.contains())
            System.out.println("player 2 turn");
            char b=sc.next().charAt(0);
            if(al.contains(a) || al.contains(b)) {
                if((a=='r' && b=='s')||(a=='s' && b=='p')||(a=='p' && b=='r') ) {
                    player1 += 1;
                    System.out.println("player 1 won");
                    //System.out.println("Score of player1:"+player1);
                }
                else{
                    player2+=1;
                    System.out.println("player 2 won");
                    //System.out.println("Score of player 2:" +player2);
                }
                System.out.println(player1+" : "+player2);
            }else{
                System.out.println("Invalid output");
            }
        }
        if(player1==10){
            System.out.println("PLAYER 1 WON");
        }
        if(player2==10){
            System.out.println("PLAYER 2 WON");
        }
    }


}
