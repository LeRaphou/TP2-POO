public class RemiseVIP implements Remise {
    @Override
    public double appliquer(double montant) {
        return montant * 0.8;
    }
}