import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private List<String> produkty;
    private String kontoUzytkownika;

    public Koszyk() {
        this.produkty = new ArrayList<>();
        this.kontoUzytkownika = null;
    }

    public Koszyk(String kontoUzytkownika) {
        this.produkty = new ArrayList<>();
        this.kontoUzytkownika = kontoUzytkownika;
    }

    public Koszyk(String kontoUzytkownika, List<String> produkty) {
        this.produkty = new ArrayList<>(produkty);
        this.kontoUzytkownika = kontoUzytkownika;
    }

    public void dodajUzytkownika(String kontoUzytkownika) {
        this.kontoUzytkownika = kontoUzytkownika;
    }

    public void dodajProdukt(String produkt) {
        produkty.add(produkt);
    }

    public void usunProdukt(String produkt) {
        produkty.remove(produkt);
    }

    public void zaplac() {
        System.out.println("Cena produktów w koszyku: [tu powinna być cena]");
    }


    public void wyswietlZawartosc() {
        System.out.println("Zawartość koszyka:");
        for (String produkt : produkty) {
            System.out.println("- " + produkt);
        }
    }

    public static void main(String[] args) {
        String konto1 = "Konto użytkownika 1";
        String konto2 = "Konto użytkownika 2";


        Koszyk koszyk1 = new Koszyk();
        koszyk1.dodajUzytkownika(konto1);

        Koszyk koszyk2 = new Koszyk(konto1);
        Koszyk koszyk3 = new Koszyk(konto2, List.of("Produkt1", "Produkt2"));

        koszyk1.dodajProdukt("Produkt1");
        koszyk1.dodajProdukt("Produkt2");

        koszyk2.dodajProdukt("Produkt3");

        koszyk1.usunProdukt("Produkt2");

        koszyk1.wyswietlZawartosc();
        koszyk2.wyswietlZawartosc();
        koszyk3.wyswietlZawartosc();

        koszyk1.zaplac();
        koszyk2.zaplac();
        koszyk3.zaplac();
    }
}
