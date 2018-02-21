package by.javacourse.sp.musicShop.instruments;

public class GuitarModels {

    public Guitars GibsonLesPaul() {

        Guitars gibsonLesPaul = new Guitars();
        gibsonLesPaul.setBrand( "Gibson" );
        gibsonLesPaul.setModel( "Les Paul" );
        gibsonLesPaul.setType( "Guitar" );
        gibsonLesPaul.setPickups( "PAF" );
        gibsonLesPaul.setTypeOfBridge( "Fixed" );
        gibsonLesPaul.setColor( "White" );
        gibsonLesPaul.setDescription( "Lorem ipsum..." );
        gibsonLesPaul.setPrice( 999 );
        gibsonLesPaul.setTypeOfGuitar( "6 string guitar" );
        gibsonLesPaul.setNumberOfStrings( 6 );

        return gibsonLesPaul;
    }
    public Guitars gibsonSD() {
        Guitars gibsonSD = new Guitars();
        gibsonSD.setBrand( "Gibson" );
        gibsonSD.setModel( "SD" );gibsonSD.setType( "Guitar" );
        gibsonSD.setPickups( "EMG" );
        gibsonSD.setTypeOfBridge( "Fixed" );
        gibsonSD.setColor( "Red" );
        gibsonSD.setDescription( "Lorem ipsum..." );
        gibsonSD.setPrice( 899 );
        gibsonSD.setTypeOfGuitar( "6 string guitar" );
        gibsonSD.setNumberOfStrings( 6 );

        return gibsonSD;

}

}
