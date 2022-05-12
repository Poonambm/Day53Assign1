public class TvShow {
    private int episodes;
    private String genre;
    private String name;

    public TvShow(String showname, String showgenre, int epi) {
        name = showname;
        genre = showgenre;
        episodes = epi;
    }

    public String getName() {
        return name;
    }
        
    public String getgenre() {
        return genre;
    }
    public int getepisodes() {
        return episodes;
    }

    public String toString() {
        String s;
        s = "The name of the show is " + getName() + " With " + getepisodes() + " number of episodes. The genre is "
                + getgenre();
        return s;
    }
}
