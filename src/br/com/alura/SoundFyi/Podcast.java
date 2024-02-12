package br.com.alura.SoundFyi;

public class Podcast extends Audio {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    @Override
    public void reproduzir(){
        if (isReproduzindo()==true){
            System.out.println("Você está ouvindo: "+ getTitulo()+", "+ getNome());
        }
    }

}
