public class Product {
    private String fiyat;
    private Boolean isChanged = false;

    public Product(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
        this.isChanged = true;
    }

    public Boolean getChanged() {
        return isChanged;
    }

    public void setChanged(Boolean changed) {
        isChanged = changed;
    }
}
