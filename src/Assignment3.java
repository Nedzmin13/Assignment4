import product.Chocolate;
import product.Wine;

public class Assignment3 {
    public static void main(String[] args) {


        Chocolate chocolate = new Chocolate("Cokolada", "0123456", 5, "100gr" );
        System.out.println(chocolate.getInfo());
        System.out.println(chocolate);
        System.out.println("Konacna cijena: " + chocolate.konacnaCijenaProizvodaSaPdv());

        System.out.println();

        Wine wine = new Wine("Vino", "12345", 100,  "0,75L");
        System.out.println(wine.getInfo());
        System.out.println("Konacna cijena: " + wine.konacnaCijenaProizvodaSaPdv());

    }
}
