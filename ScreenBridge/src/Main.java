public class Main {

    public static void main(String[] args) {

        DisplayAbstraction displayAbstraction = new DisplayRefinedAbstraction(new FullScreenMode());
        displayAbstraction.settingDisplayMode();
        displayAbstraction.setScreenMode(new WindowMode());
        displayAbstraction.settingDisplayMode();

        DisplayAbstraction displayAbstraction1 = new DisplayRefinedAbstraction();
        displayAbstraction1.settingDisplayMode();


    }
}
