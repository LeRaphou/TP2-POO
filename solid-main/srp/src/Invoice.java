// java
// File: `Invoice.java`
import java.time.LocalDate;

public class Invoice {
    private final LocalDate date;
    private final String clientName; // null pour un devis sans client
    private final double montantHT;
    private final double tva;
    private final double total;
    private final boolean devis;
    private final int validiteJours; // 0 pour facture

    public Invoice(LocalDate date, String clientName, double montantHT, double tva, double total, boolean devis, int validiteJours) {
        this.date = date;
        this.clientName = clientName;
        this.montantHT = montantHT;
        this.tva = tva;
        this.total = total;
        this.devis = devis;
        this.validiteJours = validiteJours;
    }

    public LocalDate getDate() { return date; }
    public String getClientName() { return clientName; }
    public double getMontantHT() { return montantHT; }
    public double getTva() { return tva; }
    public double getTotal() { return total; }
    public boolean isDevis() { return devis; }
    public int getValiditeJours() { return validiteJours; }
}
