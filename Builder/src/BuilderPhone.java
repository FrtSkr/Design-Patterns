public abstract class BuilderPhone {
    protected Phone phone;

    public  Phone getPhone(){
        return this.phone;
    }

    public abstract void setBrand();

    public abstract void setModel();

    public abstract void setOS();

    public abstract void setMemory();

    public abstract void setRAM();
}
