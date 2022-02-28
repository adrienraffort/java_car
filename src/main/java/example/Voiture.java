package example;

public class Voiture {
    public String marque;
    public String modele;
    public int autonomie; // En km
    public int recharge; // En min


    Voiture(String pMarque, String pModele, int pAutonomie, int pRecharge) {
        this.marque = pMarque;
        this.modele = pModele;
        this.autonomie = pAutonomie;
        this.recharge = pRecharge;
    }
}
