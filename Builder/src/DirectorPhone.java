public class DirectorPhone {

    private BuilderPhone builderPhone;

    public DirectorPhone(BuilderPhone builderPhone) {
        this.builderPhone = builderPhone;
    }

    public void setBuilderPhone(BuilderPhone builderPhone) {
        this.builderPhone = builderPhone;
    }

    public void producePhone(){
        this.builderPhone.setBrand();
        this.builderPhone.setModel();
        this.builderPhone.setOS();
        this.builderPhone.setMemory();
        this.builderPhone.setRAM();

        showFeatures();
        System.out.println();
    }

    private void showFeatures(){
        System.out.println("Marka: "+ this.builderPhone.getPhone().getBrand());
        System.out.println("Model: "+ this.builderPhone.getPhone().getModel());
        System.out.println("İşletim Sistemi: "+ this.builderPhone.getPhone().getOS());
        System.out.println("Bellek: "+ this.builderPhone.getPhone().getMemory()+"GB");
        System.out.println("RAM: "+ this.builderPhone.getPhone().getRAM()+"GB");
    }
}
