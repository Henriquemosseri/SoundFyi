package br.com.alura.SoundFyi;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private String Classificacoes;
    private boolean curtida;
    private boolean reproduzindo;

    public boolean isCurtida() {
        return curtida;
    }

    public void setCurtida(boolean curtida) {
        this.curtida = curtida;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public String getClassificacoes() {
        return Classificacoes;
    }

    public void setClassificacoes(String classificacoes) {
        Classificacoes = classificacoes;
    }

    public void curtir(){
        if ((isCurtida()==true)){
            System.out.println("você curtiu: "+ getTitulo());
        }else{
            System.out.println("Você não curtiu "+ getTitulo()+ ", gostaria de curtir?");
        }
    }

    public void reproduzir(){
        if (isReproduzindo()==true){
            System.out.println("Você está ouvindo: "+ getTitulo());
        }else {
            System.out.println("Gostaria de reproduzir: "+getTitulo() + "?") ;
        }
    }

    public void fichaTecnica(){
        System.out.println(titulo);
        System.out.println(duracao + " minutos");
        System.out.println("reproduções: "+ totalReproducoes);
        System.out.println("curtidas: "+ curtidas);
        System.out.println(getClassificacoes());
    }

    }


