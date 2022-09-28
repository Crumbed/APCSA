package potatoHead;

public class PotatoHead {

    private int eyes;
    private int arms;
    private String name;

    public PotatoHead () {
        arms = 2;
        eyes = 2;
        name = "Bob";
    }
    
    public PotatoHead (String name, int arms, int eyes) {
        this.name = name;
        this.arms = arms;
        this.eyes = eyes;
    }

    public int getEyes(){
        return eyes;
    }
    public int getArms(){
        return arms;
    }
    public String getName(){
        return name;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public void setArms(int arms) {
        this.arms = arms;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: "+name+"\n"+
        "Number of eyes: "+eyes+"\n"+
        "Number of arms: "+arms;
    }

}
