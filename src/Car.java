public class Car {

    String Batery;
    String Selfdriven;
    String Breaks;
    String CompanyMind;
    String Service;

    Car(String Batery, String Selfdriven, String Breaks, String CompanyMind, String Service) {
        this.Batery = Batery;
        this.Selfdriven = Selfdriven;
        this.Breaks = Breaks;
        this.CompanyMind = CompanyMind;
        this.Service = Service;
    }

        Car (String Batery,String Selfdriven,String Breaks,String CompanyMind) {
            this.Batery = Batery;
            this.Selfdriven = Selfdriven;
            this.Breaks = Breaks;
            this.CompanyMind = CompanyMind;
        }

        Car (String Batery,String CompanyMind,String Breaks) {
            this.Batery = Batery;
            this.CompanyMind = CompanyMind;
            this.Breaks = Breaks;
        }

        Car (String Batery,String Breaks) {
            this.Batery = Batery;
            this.Breaks = Breaks;
        }

        Car(String Breaks) {
            this.Breaks = Breaks;
        }
    }


