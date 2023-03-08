public class Main {

    public static void main(String[] args) {

        CompositionMenu menu = new CompositionMenu("Top Menu");
        Menu menuItem = new MenuItem("Menu Item 1");
        Menu menuItem1 = new MenuItem("Menu Item 2");
        Menu menuItem2 = new MenuItem("Menu Item 3");

        menu.addMenu(menuItem);
        menu.addMenu(menuItem1);
        menu.addMenu(menuItem2);
    //    menu.menuGetir(menu);

        CompositionMenu menu2 = new CompositionMenu("Second Top Menu");
        Menu sMenuItem = new MenuItem("Second Menu Item 1");
        Menu sMenuItem1 = new MenuItem("Second Menu Item 2");

        menu2.addMenu(sMenuItem);
        menu2.addMenu(sMenuItem1);

        menu.addMenu(menu2);
        menu.menuGetir(menu);



    }
}
