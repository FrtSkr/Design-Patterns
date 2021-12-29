public class IPhone extends BuilderPhone {
    public IPhone() {
        this.phone = new Phone();
    }

    @Override
    public void setBrand() {
        this.phone.setBrand("IPhone");
    }

    @Override
    public void setModel() {
        this.phone.setModel("11 Pro Max");
    }

    @Override
    public void setOS() {
        this.phone.setOS("IOS 13");
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
