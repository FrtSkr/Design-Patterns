public class DisplayRefinedAbstraction extends DisplayAbstraction {
    public DisplayRefinedAbstraction() {
    }

    public DisplayRefinedAbstraction(ScreenMode screenMode) {
        super(screenMode);
    }

    @Override
    public void settingDisplayMode() {
        this.screenMode.setDisplay();
    }
}
