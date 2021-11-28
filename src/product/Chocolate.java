package product;

public class Chocolate extends Product {

    private String tezina;

    public Chocolate(String nazivProizvoda, String barCode, double cijena, String tezina) {
        super(nazivProizvoda, barCode, cijena);
        this.tezina = tezina;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Tezina " + tezina;
    }
}
