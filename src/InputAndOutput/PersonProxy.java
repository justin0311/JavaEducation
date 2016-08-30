package InputAndOutput;

/**
 * Created by mikim on 2016-08-29.
 */
import java.io.Serializable;

public class PersonProxy implements Serializable {
    private int id;

    public PersonProxy(int id) {
        this.id = id;
    }

    public Object readResolve() {
        return PersonDatabase.INSTANCE.findById(id);
    }
}
