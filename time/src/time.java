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

        if (controlloInput(ore, minuti, secondi))
        {
            this.ore = 0;
            this.minuti = 0;
            this.secondi = 0;
        }
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

    public void addSecondi(int secondi)
    {
        this.secondi += secondi;
    }
    public int convertiSecondi()
    {
        return this.ore * 3600 + this.minuti * 60 + this.secondi;

    }
    private boolean controlloInput(int ore, int minuti, int secondi)
    {
        if ((ore < 0 || ore > 23) || (minuti < 0 || minuti > 59) || (secondi < 0 || secondi > 59))
            return true;
        return false;
    }
}
