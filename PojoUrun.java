package depo;

public class PojoUrun {

// 1.adim instance variables

    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String  raf;


// 2.Adim Constructor olusturdu, Baslangic degerleri atayip, kullanicidan gelen degerleri atamak icin

    public PojoUrun(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = 0;
        this.birim = birim;
        this.raf ="-";
    }

// 3.adim getter ve setter yaptik..

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|",id,urunIsmi,uretici,miktar,birim,raf);
    }
}