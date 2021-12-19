import java.util.Queue;
import java.util.LinkedList;

public class GameDrunk {
    private Queue<Integer> player1;
    private Queue<Integer> player2;

    public void setPlayer1(Queue<Integer> player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Queue<Integer> player2) {
        this.player2 = player2;
    }

    public Queue<Integer> getPlayer1() {
        return player1;
    }

    public Queue<Integer> getPlayer2() {
        return player2;
    }
    public void Step(Queue<Integer> player1, Queue<Integer> player2, int k) {
        int b;
        int b1;
        if ((player1.peek()==9) && (player2.peek()==0)) {
            b = player2.poll();
            b1 = player1.poll();
            player2.add(b);
            player2.add(b1);
            if (player1.peek() == null) {
                System.out.println("Second, " + k);

            }
        }
        else
        if ((player2.peek()==9) && (player1.peek()==0)) {
            b = player1.poll();
            b1 = player2.poll();
            player1.add(b);
            player1.add(b1);
            if (player2.peek() == null) {
                System.out.println("First, " + k);

            }
        }
        else
        if (player1.peek() < player2.peek()) {
            b = player2.poll();
            b1 = player1.poll();
            player2.add(b);
            player2.add(b1);
            if (player1.peek() == null) {
                System.out.println("Second, " + k);

            }
        }
        else {
            b = player1.poll();
            b1 = player2.poll();
            player1.add(b);
            player1.add(b1);
            if (player2.peek() == null) {
                System.out.println("First, " + k);

            }
        }
    }
}
