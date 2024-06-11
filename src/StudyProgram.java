import java.util.stream.IntStream;

public class StudyProgram {
    private String nazwaKierunku;
    private String opis;
    private double czasTrwania;

    private int maxITNs;

    public StudyProgram(String nazwaKierunku, String opis, double czasTrwania, int maxITNs) {
        this.nazwaKierunku = nazwaKierunku;
        this.opis = opis;
        this.czasTrwania = czasTrwania;
        this.maxITNs=maxITNs;
    }

    public String getNazwaKierunku() {
        return nazwaKierunku;
    }

    public String getOpis() {
        return opis;
    }

    public double getCzasTrwania() {
        return czasTrwania;
    }

    public int getMaxITNs() {
        return maxITNs;
    }
}