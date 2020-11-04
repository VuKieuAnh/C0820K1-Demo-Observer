import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
    List<Observer> list = new ArrayList<>();



    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notification(String mess) {
        for (Observer o: list
             ) {
            o.update(mess);
        }
    }
}
