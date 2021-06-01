package HomeTask1;

public class HomeTask1 {
    public static void main(String[] args) {
        //задача №1
        int cube = 2;
        int cube2 = cube * cube * cube;
        System.out.println(cube2);

        // задача №2
        int a = 12;
        int b = a % 10;
        if (b == 3) {
            System.out.println("Последнее число = 3");
        } else if (b != 3) {
            System.out.println("Последнее число не равно 3");
        }
        //задача №3
        int bochka = 70;
        int vedro = 10;
        int leika = (bochka - vedro * 5) / 4;
        System.out.println(leika + " " + "литров в каждую");

        //задача №4
        int dlina = 7;
        int shirina = 8;
        int ploshad = dlina * shirina;
        int perimetr = 2 * (dlina + shirina);
        System.out.println("площадь равна" + " " + ploshad);
        System.out.println("периметр равен" + " " + perimetr);

        //задача №5
        int z = 1;
        int x = 2;
        int c;
        c = z;
        z = x;
        x = c;
        System.out.println(z);
        System.out.println(x);
// задача №6
        int chislo = 120;
        int padezh = chislo % 10;
        if (padezh == 1) {
            System.out.println(chislo + " " + "рубль");
        }
        if (padezh == 2) {
            System.out.println(chislo + " " + "рубля");
        }
        if (padezh == 3) {
            System.out.println(chislo + " " + "рубля");
        }
        if (padezh == 4) {
            System.out.println(chislo + " " + "рубля");
        }
        if (padezh == 5) {
            System.out.println(chislo + " " + "рублей");
        }
        if (padezh == 6) {
            System.out.println(chislo + " " + "рублей");
        }
        if (padezh == 7) {
            System.out.println(chislo + " " + "рублей");
        }
        if (padezh == 8) {
            System.out.println(chislo + " " + "рублей");
        }
        if (padezh == 9) {
            System.out.println(chislo + " " + "рублей");
        }
        if (padezh == 0) {
            System.out.println(chislo + " " + "рублей");
        }
//задача №7 - как-то должно быть связано с делением через %, но мозг не работает(


    }
}


