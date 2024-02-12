import br.com.alura.SoundFyi.Musica;
import br.com.alura.SoundFyi.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica1= new Musica();
        musica1.setCantor("TvGirl");
        musica1.setClassificacoes("Indie/pop");
        musica1.setTitulo("Loving Machine");
        musica1.setTotalReproducoes(54352570);
        musica1.setCurtidas(200000);
        musica1.setDuracao(3.47);
        musica1.setReproduzindo(true);
        musica1.setCurtida(false);

        musica1.fichaTecnica();
        musica1.reproduzir();
        musica1.curtir();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        Podcast podcast1= new Podcast();
        podcast1.setNome("Flow Podcast");
        podcast1.setClassificacoes("entrevista");
        podcast1.setTitulo("Flow 350- Sérgio Sacani");
        podcast1.setTotalReproducoes(3000000);
        podcast1.setCurtidas(30000);
        podcast1.setDuracao(75);
        podcast1.setReproduzindo(false);
        podcast1.setCurtida(true);

        podcast1.fichaTecnica();
        podcast1.reproduzir();
        podcast1.curtir();

    }


}