package Memento;

public class MainClass {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setTime("Sunday");
        careTaker.add(originator.setTimeToMemento());

        originator.setTime("Monday");
        originator.setTime("Tuesday");
        originator.setTime("Wednesday");
        careTaker.add(originator.setTimeToMemento());

        System.out.println(originator.restoreTimeFromMemento(careTaker.get(1)));
    }
}
