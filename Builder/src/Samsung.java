public class Samsung extends BuilderPhone{
    public Samsung() {
        this.phone = new Phone();
    }

    @Override
    public void setBrand() {
        this.phone.setBrand("Samsung");
    }

    @Override
    public void setModel() {
        this.phone.setModel("Galaxy S10");
    }

    @Override
    public void setOS() {
        this.phone.setOS("Android 9.0 (Pie)");
    }

    @Override
    public void setMemory() {
        this.phone.setMemory(256);
    }

    @Override
    public void setRAM() {
        this.phone.setRAM(16);
    }
}
