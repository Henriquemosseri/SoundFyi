package br.com.alura.SoundFyi;

public class Musica extends Audio{
    private String cantor;
    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public void reproduzir(){
        if (isReproduzindo()==true){
            System.out.println("Você está ouvindo: "+ getTitulo()+", "+ getCantor());
        }
    }

    @Override
    public void fichaTecnica(){
        System.out.println(getTitulo() + ", "+ getCantor());
        System.out.println(getDuracao());
        System.out.println("reproduções: "+ getTotalReproducoes());
        System.out.println("curtidas: "+ getCurtidas());
        System.out.println(getClassificacoes());
    }
}
