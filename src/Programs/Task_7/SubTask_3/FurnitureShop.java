package Programs.Task_7.SubTask_3;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitures;
    private int budget;
    public FurnitureShop(int budget){
        this.budget = budget;
        furnitures = new ArrayList<>();
    }
    public void showAssortment(){
        for (Furniture furniture : furnitures){
            System.out.println(furniture);
        }
    }
    public Furniture buyFurniture(int id, Wallet wallet){
        Furniture furniture = getById(id);

        if (wallet.getBalance() < furniture.getPrice()){
            throw new RuntimeException("NoEnoughMoney");
        }
        wallet.spendMoney(furniture.getPrice());
        budget += furniture.getPrice();
        removeId(id);
        return furniture;
    }
    public Furniture getById(int id){
        for (Furniture furniture : furnitures){
            if (furniture.id == id) return furniture;
        }
        throw new RuntimeException("NoSuchId");
    }
    private void removeId(int id){
        for (int i = 0; i < furnitures.size(); i++){

            if (furnitures.get(i).id == id) furnitures.remove(furnitures.get(i));
        }
    }
    public boolean isThereId(int id){
        boolean isThereId = false;
        for (Furniture furniture : furnitures) {
            if (furniture.getId() == id){
                isThereId = true;
                break;
            }
        }
        return isThereId;
    }
    public boolean tryAddFurniture(Furniture furniture){
        int prise = furniture.getPrice();
        if (prise <= budget) {
            furnitures.add(furniture);
            budget -= prise;
            return true;
        } else {
            return false;
        }
    }

    public int getBudget() {
        return budget;
    }
    public int getAssortmentAmount(){
        return furnitures.size();
    }
}
