// java
// File: `FileFactureRepository.java`
import java.io.FileWriter;
import java.io.IOException;

public class FileFactureRepository implements FactureRepository {
    @Override
    public void save(Invoice invoice) {
        String filename = invoice.isDevis() ? "devis.txt" : "factures.txt";
        String line;
        if (invoice.isDevis()) {
            line = "DEVIS | " + invoice.getDate()
                    + " | HT=" + invoice.getMontantHT()
                    + " | TVA=" + invoice.getTva()
                    + " | TTC=" + invoice.getTotal()
                    + " | validite=" + invoice.getValiditeJours() + "j\n";
        } else {
            line = "FACTURE | " + invoice.getDate()
                    + " | Client=" + invoice.getClientName()
                    + " | HT=" + invoice.getMontantHT()
                    + " | TVA=" + invoice.getTva()
                    + " | TTC=" + invoice.getTotal() + "\n";
        }

        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
