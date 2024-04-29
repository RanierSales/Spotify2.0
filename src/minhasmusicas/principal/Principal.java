package minhasmusicas.principal;

import minhasmusicas.modelos.MinhasPreferidas;
import minhasmusicas.modelos.Musica;
import minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("All by Myself");
        minhaMusica.setCantor("Alok");

        for (int i = 0; i < 10000; i++ ) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Coisa de Nerd");
        meuPodcast.setApresentador("Leon e Nilce");

        for (int i = 0; i < 2000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 300; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }

}
