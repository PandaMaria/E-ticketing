package Platforma;

public class ArtistiFactory {
    private static int uniqueId = 0;

    public ArtistiFactory(String name, int i) {
    }

    public static void incrementUniqueId(int inc) {
        ArtistiFactory.uniqueId += inc;
    }

    public Artisti createArtist(String name){
        return new Artisti(name, uniqueId++);
    }
}
