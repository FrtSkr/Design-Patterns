public class MenuItem extends Menu{

    public MenuItem(String menu_ad) {
        super(menu_ad);
    }

    @Override
    public void menuGetir(Menu menu) {
        System.out.println("\t"+menu.getMenu_ad());
    }
}
