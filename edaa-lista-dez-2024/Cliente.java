public class Cliente {
    private int id;
    private int tempoEspera;

    public Cliente(int id) {
        this.id = id;
        this.tempoEspera = 0;
    }

    public int getId() {
        return id;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void incrementarTempoEspera() {
        tempoEspera++;
    }
}