package iterator;

import iterator.aggregate.Menu;
import iterator.aggregate.implementation.DinerMenu;
import iterator.aggregate.implementation.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();

    }

}
