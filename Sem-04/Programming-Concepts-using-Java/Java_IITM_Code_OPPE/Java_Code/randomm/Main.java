package randomm;
import java.util.*;

class CricketPlayer {
    private String name;
    private int wickets;
    private int runs;
    private int matches;

    public CricketPlayer(String s, int w, int r, int m) {
        this.name = s;
        this.wickets = w;
        this.runs = r;
        this.matches = m;
    }

    public String getName() {
        return name;
    }

    public int getWickets() {
        return wickets;
    }

    public int getRuns() {
        return runs;
    }

    public double avgRuns() {
        return runs / matches;
    }

    public double avgWickets() {
        return wickets / matches;
    }
}

public class Main {
    // Define displayPlayers() method here

    public static void displayPlayers(ArrayList<CricketPlayer> BW, ArrayList<CricketPlayer> BT) {
        for (CricketPlayer p : BW) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();

        for (CricketPlayer p : BT) {
            System.out.print(p.getName() + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());
        CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());
        CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());
        CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());

        // Define ArrayList objects here

        ArrayList<CricketPlayer> temp = new ArrayList<CricketPlayer>();
        ArrayList<CricketPlayer> bt = new ArrayList<CricketPlayer>();
        ArrayList<CricketPlayer> bw = new ArrayList<CricketPlayer>();

        temp.add(p1);
        temp.add(p2);
        temp.add(p3);
        temp.add(p4);

        for (CricketPlayer cricketPlayer : temp) {
            if (cricketPlayer.avgRuns() > 25) {
                bt.add(cricketPlayer);
            }

            if (cricketPlayer.avgWickets() > 1) {
                bw.add(cricketPlayer);
            }
        }

        displayPlayers(bw, bt);
    }
}