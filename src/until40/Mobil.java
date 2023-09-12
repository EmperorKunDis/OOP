package until40;

public class Mobil {
    private String Company;
    private String Model;
    private int Megapixels;

    Mobil(String Company,String Model,int Megapixels){
        this.setCompany(Company);
        this.setModel(Model);
        this.setMegapixels(Megapixels);
    }
    Mobil(Mobil x) {
        this.copy(x);
     }

    public String getCompany() {
        return Company;
    }
    public String getModel() {
        return Model;
    }
    public int getMegapixels() {
        return Megapixels;
    }
    public void setCompany(String Company) {
        this.Company = Company;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public void setMegapixels(int Megapixels) {
        this.Megapixels = Megapixels;
    }
    public void copy(Mobil x) {
        this.setCompany(x.getCompany());
        this.setModel(x.getModel());
        this.setMegapixels(x.getMegapixels());
    }

}
