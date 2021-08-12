package Memento;

public class Memento {
    private String time ;

    public Memento(String saveTime){
        time = saveTime ;
    }

    public String getSavedTime(){
        return time;
    }
}
