import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
//import java.util.DoubleList;
public class Test {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        int a;
        Queue<Integer> player1=new LinkedList<> ();
        Queue <Integer> player2=new LinkedList<> ();
        int k=0;
        System.out.print("Введите 5 карт первого игрока: ");
        for (int i=1; i<=5;i++) {
            a=a1.nextInt();
            player1.add(a);
        }
        System.out.println("");
        System.out.print("Введите 5 карт второго игрока: ");
        for (int i=1;i<=5;i++) {
            a = a1.nextInt();
            player2.add(a);
        }
        System.out.println("");
        GameDrunk Drunk=new GameDrunk();
        Drunk.setPlayer1(player1);
        Drunk.setPlayer2(player2);
        while (k!=106) {
            k=k+1;
            Drunk.Step(player1,player2,k);
            if ((player1.peek()==null) || (player2.peek()==null)) break;
            if (k==106) System.out.println("botva");
        }

    }
}
