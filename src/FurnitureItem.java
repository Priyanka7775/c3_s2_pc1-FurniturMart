public class FurnitureItem {
   int furnitureCode;
   String furnitureType;
   String gradeOfFurniture;
   String color;
   String furnitureUsage;
   double price;

   FurnitureItem(int furnitureCode, String furnitureType, String gradeOfFurniture, String color, String furnitureUsage, double price) {
      this.furnitureCode = furnitureCode;
      this.furnitureType = furnitureType;
      this.gradeOfFurniture = gradeOfFurniture;
      this.color = color;
      this.furnitureUsage = furnitureUsage;
      this.price = price;
   }

   public double discountedPrice(double discountPercentage) {
      price = price - (price * discountPercentage / 100);
      return price;
   }
}


