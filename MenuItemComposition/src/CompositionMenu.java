import java.util.ArrayList;
import java.util.List;

public class CompositionMenu extends  Menu {
    private List<Menu> menuList;
    public CompositionMenu(String menu_ad) {
        super(menu_ad);
        this.menuList = new ArrayList<>();
    }

    public void addMenu(Menu menu){
       this.menuList.add(menu);
    }

    public void removeMenu(Menu menu){
        this.menuList.remove(menu);
    }

    @Override
    public void menuGetir(Menu menu) {
        System.out.println(menu.getMenu_ad());
        for (Menu m: menuList) {
            m.menuGetir(m);
        }
    }
}
