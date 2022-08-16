public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem obj =new FurnitureItem(123,"Plastic","Grade 1",
                "Red","Outdoor",450);
        System.out.println("Furniture Code = " + obj.furnitureCode);
        System.out.println("Furniture Type = " + obj.furnitureType);
        System.out.println("Grade Of Furniture = " + obj.gradeOfFurniture);
        System.out.println("Color = " + obj.color);
        System.out.println("Furniture Usage = " + obj.furnitureUsage);
        obj.discountedPrice(5);
        System.out.println("Price = " + obj.price);



    }
}
