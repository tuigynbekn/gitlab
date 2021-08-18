import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
      Players p1 = new Players("Kane",120_000_000,29);
        Players p2 = new Players("Grilish",100_000_000,22);
        Players p3 = new Players("Messi",45_000_000,35);
        Players p4 = new Players("Ronaldo",45_000_000,36);
        Players p5 = new Players("Sterling",90_000_000,27);
        Players p6 = new Players("Joax Felix",100_000_000,21);
        Players p7 = new Players("Varane",40_000_000,25);
        Players p8 = new Players("Ramos",25_000_000,25);
        Players p9 = new Players("Mbappe",170_000_000,20);
        Players p10 = new Players("Neymar",120_000_000,30);
        ArrayList<Players> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);

        double sum=0;
        int count=0;
        int old =0;
        for (Players player:players
             ) {
            old+=player.getAge();
            sum+=player.getPrice();
            count++;
        }
        System.out.println(sum/count);
        System.out.println(old);
    }
}
