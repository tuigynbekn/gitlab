package GenericsExample;

import java.util.ArrayList;
import java.util.Random;

public class Team<T extends Participants> {
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    private ArrayList<T> participants = new ArrayList<>();

    public void addParticipants(T p){
        participants.add(p);

    }
    public String getResultMatch(Team<T> t){
        Random r = new Random();
        if(r.nextInt(2)==0)
            return this.name+" team wons";
        else
            return t.name+" team wons";
    }
}
