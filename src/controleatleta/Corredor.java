package controleatleta;

public class Corredor extends Atleta {
	
	private char categoria; // A=Amador , P=Profissional
	private char pisada; // N=Neutra , S=Supinada, P=Pronada
	private int prova; // 1- 5km, 2- 10km, 3- maratona  
        private int distanciaMedia;
        private int velocidadeMedia;
        private char resistencia; // M=Media, B=Boa, R=Ruim
        private int totalCorridas;
        private int totalCompletas;
        private int totalIncompletas;
        private int vitoria;
        private int derrotas;
        
        
        public Corredor(String nome){
            super(nome);
        }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public char getPisada() {
        return pisada;
    }

    public void setPisada(char pisada) {
        this.pisada = pisada;
    }

    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
    }

    public int getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(int distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(int velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public char getResistencia() {
        return resistencia;
    }

    public void setResistencia(char resistencia) {
        this.resistencia = resistencia;
    }

    public int getTotalCorridas() {
        return totalCorridas;
    }

    public void setTotalCorridas(int totalCorridas) {
        this.totalCorridas = totalCorridas;
    }

    public int getTotalCompletas() {
        return totalCompletas;
    }

    public void setTotalCompletas(int totalCompletas) {
        this.totalCompletas = totalCompletas;
    }

    public int getTotalIncompletas() {
        return totalIncompletas;
    }

    public void setTotalIncompletas(int totalIncompletas) {
        this.totalIncompletas = totalIncompletas;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
        


}
