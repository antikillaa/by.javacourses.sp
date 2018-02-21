package by.javacourse.sp.musicShop.instruments;

public class Guitars extends Instrument {

   private int numberOfStrings;
   private String typeOfBridge;
   private String typeOfGuitar;
   private String pickups;

   public int getNumberOfStrings() {
      return numberOfStrings;
   }

   public void setNumberOfStrings(int numberOfStrings) {
      this.numberOfStrings = numberOfStrings;
   }

   public String getTypeOfBridge() {
      return typeOfBridge;
   }

   public void setTypeOfBridge(String typeOfBridge) {
      this.typeOfBridge = typeOfBridge;
   }

   public String getTypeOfGuitar() {
      return typeOfGuitar;
   }

   public void setTypeOfGuitar(String typeOfGuitar) {
      this.typeOfGuitar = typeOfGuitar;
   }

   public String getPickups() {
      return pickups;
   }

   public void setPickups(String pickups) {
      this.pickups = pickups;
   }

   public void guitarsInfo() {

      System.out.println(getPrice() + getBrand() + getModel() + getType() + getColor() + getDescription() + numberOfStrings + typeOfBridge + typeOfGuitar + pickups);

   }
}
