public abstract class Menu {

    private String menu_ad;

    public Menu(String menu_ad) {
        this.menu_ad = menu_ad;
    }

    public String getMenu_ad() {
        return menu_ad;
    }

    public abstract void menuGetir(Menu menu);
}
