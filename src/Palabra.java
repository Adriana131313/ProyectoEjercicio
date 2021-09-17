
public class Palabra {

private char palabra;
private boolean valor1 ;
private boolean valor ; 



public Palabra(char palabra) {

    this.palabra =palabra;
    this.idioma = false;
}

public boolean esVocal(int letra) {

    switch(letra) {

    case 1 :

         if ( palabra == 'silla' || palabra == 'sillujem' ||
        	  palabra == 'camion' || palabra == 'camiujem' ) {

             idioma = true;

            }

        break;

    case 2:

         if ( palabra != 'silla' || palabra != 'sillakov' ||
        	  palabra != 'camion' || palabra != 'camiokov' ) {

            idioma = false;
            }

        break;


        default : System.out.println("Error!");

        break;



    }

    return this.idioma;


}

}