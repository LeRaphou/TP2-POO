public class CompteCourant extends CompteBancaire implements Retirable {
    private final double decouvertAutorise;

    public CompteCourant(String numeroCompte, double soldeInitial, double decouvertAutorise) {
        super(numeroCompte, soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public boolean retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide.");
            return false;
        }
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
            System.out.println("Retrait effectué. Nouveau solde : " + solde + "€");
            return true;
        }
        System.out.println("Retrait refusé : fonds insuffisants.");
        return false;
    }

    @Override
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    @Override
    public String getTypeCompte() {
        return "Compte Courant";
    }
}
