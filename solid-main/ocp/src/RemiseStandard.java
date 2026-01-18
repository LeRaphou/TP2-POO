public class RemiseStandard implements Remise {
    @Override
    public double appliquer(double montant) {
        return montant;
    }
}