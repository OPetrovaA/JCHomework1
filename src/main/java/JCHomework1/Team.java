package JCHomework1;
/*
@author Petrova Olga
 */

public class Team {
    private  String name;
    private Athlete[] peoples;

    Team (String name, Athlete[] peoples){
        this.name = name;
        this.peoples = peoples;
    }

    public String getName() {
        return name;
    }

    public Athlete[] getPeoples() {
        return peoples;
    }
}

