import labs.List_of_shops;

public class Tester {
    public static void main(String[] args) {
        List_of_shops s = new List_of_shops();
        Shop shop1 = new Shop("Milk", 100, "NO", 1);
        Shop shop2 = new Shop("Bread", 70, "NO", 1);
        Shop shop3 = new Shop("Earrings", 50000, "NO", 1);
        Shop shop4 = new Shop("Iphone 15 Pro", 100000, "NO", 1);
        Shop shop5 = new Shop("Sweets", 100, "NO", 1);
        Shop shop6 = new Shop("Tomatoes", 50, "NO", 3);
        s.addShop(shop5);
        s.addShop(shop6);
        s.addShop(shop4);
        s.addShop(shop1);
        s.addShop(shop2);
        s.addShop(shop3);
        s.addMoney(500);
        s.buyShop(shop1);
        System.out.println(s.list());
        System.out.println(s.mayBuy(shop1));
        System.out.println(s.sumShops());
        System.out.println(s.sumNotBuyingShops());
        System.out.println(s.mayBuyAll());
        System.out.println(s.notEnoughMoney());
        System.out.println(s.buyAll());
        System.out.println(s.list());
        s.sortListIncreasing();
        System.out.println(s.list());
        System.out.println(s.mayBuyAmount());
        s.sortListDecreasing();
        System.out.println(s.list());
        System.out.println(s.theMostExpensive());
        System.out.println(s.theCheapest());
    }
}