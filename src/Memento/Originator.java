package Memento;

public class Originator {
    private String time ;

    public void setTime(String time){
        this.time = time ;
    }

    public Memento setTimeToMemento(){
        return new Memento(time) ;
    }

    public String restoreTimeFromMemento(Memento memento){
        return memento.getSavedTime();
    }
}
