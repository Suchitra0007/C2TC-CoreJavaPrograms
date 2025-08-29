package fileio;

import java.io.Serializable;

public class SerializablePerson implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public SerializablePerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
