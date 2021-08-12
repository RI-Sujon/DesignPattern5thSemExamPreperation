package Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> savedTimes = new ArrayList<Memento>() ;

    public void add(Memento memento){
        savedTimes.add(memento) ;
    }

    public Memento get(int index){
        return savedTimes.get(index);
    }
}
