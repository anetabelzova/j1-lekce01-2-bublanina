package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska;
        Miska zlutaMiska;
        Mixer mixer;
        Vaha kuchynskaVaha;
        PlechNaPeceni plech;
        ElektrickaTrouba trouba;
        Vajicka vajicka;

        Ovoce ovoce;
        Maslo maslo125g;
        Mouka pytlikMouky;
        Cukr pytlikCukru;
        PrasekDoPeciva prasekDoPeciva;

        cervenaMiska = new Miska("cervenaMiska");
        zlutaMiska = new Miska("zlutaMiska");
        mixer = new Mixer("mixer");
        kuchynskaVaha = new Vaha("vaha");
        plech = new PlechNaPeceni("plech");
        trouba = new ElektrickaTrouba("trouba");

        vajicka = new Vajicka("vajicka");
        ovoce = new Ovoce("ovoce");
        maslo125g = new Maslo("maslo125g");
        pytlikMouky = new Mouka("pytlikMouky");
        pytlikCukru = new Cukr("pytlikCukru");
        prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik

        //1.
        cervenaMiska.nalozSiJedenKus(vajicka);
        for(int i=0; i<4;i++){

        }
        cervenaMiska.nalozSiCelyObsah(pytlikCukru);
        mixer.zamichej(cervenaMiska);
        //2.
        cervenaMiska.nalozSiCelyObsah(maslo125g);
        mixer.zamichej(cervenaMiska);



    }

}
