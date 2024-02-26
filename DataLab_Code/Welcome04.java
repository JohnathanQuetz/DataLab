import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome04 {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://www.epa.gov/sites/default/files/sitemaps/endangered-species.xml").load();
        ArrayList<EndangeredSpecies> allSpecies = ds.fetchList("Species",
                "Species/Name", "Species/Status", "Species/Description");
        System.out.println("Total species: " + allSpecies.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a keyword to search for endangered species: ");
        String keyword = sc.next();
        System.out.println("Endangered species matching keyword '" + keyword + "':");
        for (EndangeredSpecies species : allSpecies) {
            if (species.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Name: " + species.getName());
                System.out.println("Status: " + species.getStatus());
                System.out.println("Description: " + species.getDescription());
                System.out.println("-----");
            }
        }
    }
}