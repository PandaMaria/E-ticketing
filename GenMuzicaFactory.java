package Platforma;

public class GenMuzicaFactory {
    private static int uniqueId = 0;

    public static void incrementUniqueId(int inc) {
        GenMuzicaFactory.uniqueId += inc;
    }

    public GenMuzica createGen(String gen){
        return new GenMuzica(gen, uniqueId++);
    }
}
