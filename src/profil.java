public class profil {

    private String broj;
    private double balans;
    private String ime;
    private String email;
    private String broj_telefona;

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBroj_telefona() {
        return broj_telefona;
    }

    public void setBroj_telefona(String broj_telefona) {
        this.broj_telefona = broj_telefona;
    }

    public  profil(String broj, double balans, String ime, String email, String broj_telefona){

        this.ime=ime;
        this.balans=balans;
        this.ime=ime;
        this.email=email;
        this.broj_telefona =broj_telefona;

    }


}

