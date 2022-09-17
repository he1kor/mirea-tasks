package Programs.Task_7.SubTask_3;

public class SubMain {
    public static void main(){
        Furniture.setLastId(0);
        FurnitureShop furnitureShop = new FurnitureShop(3000);
        furnitureShop.tryAddFurniture(new Chair(130));
        furnitureShop.tryAddFurniture(new Chair(330));
        furnitureShop.tryAddFurniture(new Chair(450));
        furnitureShop.tryAddFurniture(new Table(1450));
        furnitureShop.tryAddFurniture(new Taburetochka(500));
        furnitureShop.showAssortment();
        System.out.println("Shop has " + furnitureShop.getBudget() + " money");

        System.out.println("Enter the balance you want to have at your new wallet: ");
        Wallet wallet = new Wallet(Input.getInteger());
        System.out.println(wallet);

        while (furnitureShop.getAssortmentAmount() > 0) {
            System.out.println("What id do you want to buy now? ");
            int id = Input.getId(furnitureShop);
            if (furnitureShop.getById(id).getPrice() > wallet.getBalance()) {
                System.out.println("YOU HAVE NO MONEY FOR IT!!!");
                break;
            }
            furnitureShop.buyFurniture(id, wallet);
            furnitureShop.showAssortment();
            System.out.println("Shop has " + furnitureShop.getBudget() + " money");
        }
        if (furnitureShop.getAssortmentAmount() == 0) System.out.println("The shop was bought!");
    }
}
