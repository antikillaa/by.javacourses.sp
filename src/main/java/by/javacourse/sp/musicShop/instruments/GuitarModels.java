package by.javacourse.sp.musicShop.instruments;

public class GuitarModels {

    public void GibsonLesPaul() {

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

        gibsonLesPaul.getBrand();
        gibsonLesPaul.getModel();
        gibsonLesPaul.getType();
        gibsonLesPaul.getPickups();
        gibsonLesPaul.getTypeOfBridge();
        gibsonLesPaul.getColor();
        gibsonLesPaul.getDescription();
        gibsonLesPaul.getPrice();
        gibsonLesPaul.getTypeOfGuitar();
        gibsonLesPaul.getNumberOfStrings();
    }
        public void gibsonSD() {
            Guitars gibsonSD = new Guitars();
            gibsonSD.setBrand( "Gibson" );
            gibsonSD.setModel( "SD" );
            gibsonSD.setType( "Guitar" );
            gibsonSD.setPickups( "EMG" );
            gibsonSD.setTypeOfBridge( "Fixed" );
            gibsonSD.setColor( "Red" );
            gibsonSD.setDescription( "Lorem ipsum..." );
            gibsonSD.setPrice( 899 );
            gibsonSD.setTypeOfGuitar( "6 string guitar" );
            gibsonSD.setNumberOfStrings( 6 );

            gibsonSD.getBrand();
            gibsonSD.getModel();
            gibsonSD.getType();
            gibsonSD.getPickups();
            gibsonSD.getTypeOfBridge();
            gibsonSD.getColor();
            gibsonSD.getDescription();
            gibsonSD.getPrice();
            gibsonSD.getTypeOfGuitar();
            gibsonSD.getNumberOfStrings();

}

}
