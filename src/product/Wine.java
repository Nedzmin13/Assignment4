package product;

public class Wine extends Product {
    public static final double dodatniPorez = 10;
    private String zapremina;


    public Wine(String nazivProizvoda, String barCode, double cijena, String zapremina) {
        super(nazivProizvoda, barCode, cijena);
        this.zapremina = zapremina;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Zapremina: " + zapremina;
    }

    @Override
    public double konacnaCijenaProizvodaSaPdv() {
        double cijenaProizvoda = super.konacnaCijenaProizvodaSaPdv();
        return cijenaProizvoda + (cijenaProizvoda*dodatniPorez) / 100;
    }
}
