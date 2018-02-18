package by.javacourse.sp.musicShop.instruments;

public class Pianos extends Instrument{
    private int numberOfButtons;
    private String formatOfPiano;

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public String getFormatOfPiano() {
        return formatOfPiano;
    }

    public void setFormatOfPiano(String formatOfPiano) {
        this.formatOfPiano = formatOfPiano;
    }

    public void pianoInfo() {
        Instrument instrumentInfo = new Instrument();
        instrumentInfo.instrumentInfo();
        System.out.println(numberOfButtons + formatOfPiano);

    }
}
