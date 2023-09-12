import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double pi = 3.14, Alan, Cevre, DaireDilim;
        int r, a;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        Alan = pi * r * r;
        Cevre = 2 * pi * r;

        System.out.println("Daire dilimi alanını bulmak isteidiğiniz merkez açı ölçüsünü giriniz (1-360) : ");
        a = input.nextInt();
        System.out.println("Dairenin alanı : " + Alan);
        System.out.println("Dairenin çevresi : " + Cevre);
        if ((a < 360) && (a > 0)) {
            DaireDilim = (pi * (r * r) * a) / 360;
            System.out.println("Merkez açısının ölçüsü " + a + " olan daire diliminin alanı : " + DaireDilim);

        } else {
            System.out.println("Merkez açı ölçüsü 0 ile 360 derece arası olmalıdır. ");
        }

    }
}