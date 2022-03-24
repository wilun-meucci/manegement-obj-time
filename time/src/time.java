public class time {
    protected int ore;
    protected int minuti;
    protected int secondi;
    
    public time(int secondi) {
        this.secondi = secondi;
    }

    public time(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    @Override
    public String toString() {
        return "Time {" + ore + ":" + minuti + ":" + secondi + "}";
    }


    
}
