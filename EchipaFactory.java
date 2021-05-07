package Platforma;

public class EchipaFactory {
    private static int uniqueId = 0;

    public static void incrementUniqueId(int inc) {
        EchipaFactory.uniqueId += inc;
    }

    public Echipa createEchipa(String name, int buget){
        return new Echipa(name, buget, uniqueId++);
    }
}
