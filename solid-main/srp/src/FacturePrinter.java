// java
// File: `FacturePrinter.java`
public class FacturePrinter {
    public void print(Invoice invoice) {
        if (invoice.isDevis()) {
            System.out.println("\n--- DEVIS ---");
            System.out.println("Date : " + invoice.getDate());
            System.out.println("Montant HT : " + invoice.getMontantHT());
            System.out.println("TVA : " + invoice.getTva());
            System.out.println("Total TTC : " + invoice.getTotal());
            System.out.println("Valable " + invoice.getValiditeJours() + " jours");
        } else {
            System.out.println("\n--- FACTURE ---");
            System.out.println("Date : " + invoice.getDate());
            System.out.println("Client : " + invoice.getClientName());
            System.out.println("Montant HT : " + invoice.getMontantHT());
            System.out.println("TVA : " + invoice.getTva());
            System.out.println("Total TTC : " + invoice.getTotal());
        }
    }
}
