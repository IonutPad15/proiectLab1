import java.util.Scanner;
import java.util.StringJoiner;
public class Restaurant {
    public static double _restaurant = 0;
    public static final String PAROLA = "12345678";
    public static void revenireMeniuPrincipal(Meniu[] meniuri)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Revenire meniul principal? Y/n");
        String optiune2 = sc.next();
        if(optiune2.equals("Y"))
        {
            afisareMeniu1(meniuri);
        }
        else if(optiune2.equals("n")){
            System.out.println("Multumim ca ati ales The Forest Man!");
        }
        else{
            System.out.println("Optiune invalida!");
            revenireMeniuPrincipal(meniuri);
        }
    }
    public static void afisareMeniu1(Meniu[] meniuri)
    {
        System.out.println("Bine ati venit la TheForestMan\nCe doriti sa faceti?\n1.Lista meniuri\n2.Creeare comanda\n3.Iesire\n4.Admin");
        Scanner sc = new Scanner(System.in);
        String optiune = sc.next();
        if(optiune.equals("1")){
            afisareMeniu2(meniuri);
        }
        else if(optiune.equals("2"))
        {
            int [] v = new int[4];
            boolean ok = false;
            System.out.println("Comanda:\n");
            int comanda = 0;
            for(int i = 0; i < 4; ++i) {
                System.out.println("Dati nr de meniuri:" + meniuri[i].getNumemeniu());
                v[i] = sc.nextInt();
                if(v[i] > 0){
                    ok = true;
                    comanda += meniuri[i].getPret()*v[i];
                }
            }
            if(ok) {
                System.out.println("\nDoriti chitanta?\n1.Cu chitanta\n2.Fara chitanta\n3.Anulare comanda\n Optiune:");
                int optiune3 = sc.nextInt();
                if(optiune3 == 3){
                    System.out.println("Comanda anulata\n");
                    revenireMeniuPrincipal(meniuri);
                }
                else {
                    _restaurant += comanda;
                    Chitanta bon = new Chitanta(meniuri, v);
                    StringJoiner rezultat = new StringJoiner("");
                    rezultat = bon.generareChitanta(optiune3);
                    System.out.println(rezultat);
                    revenireMeniuPrincipal(meniuri);
                }
            }
            else {
                System.out.println("Nu ati comandat nimic!");
                revenireMeniuPrincipal(meniuri);
            }
        }
        else if(optiune.equals("3")) {
            System.out.println("Multumim ca ati ales The Forest Man!");
        }
        else if(optiune.equals("4"))
        {
            System.out.println("Introduceti parola: ");
            String parola  = sc.next();
            if(parola.equals(PAROLA)) {
                System.out.println("Sold restaurant: " + _restaurant);
            }
            else System.out.println("Parola incorecta!");
            revenireMeniuPrincipal(meniuri);
        }
        else {
            System.out.println("Optiune invalida!");
            revenireMeniuPrincipal(meniuri);
        }
    }
    public static void afisareMeniu2(Meniu[] meniuri)
    {
        System.out.println("Lista meniuri:\n");
        for(int i = 0; i < 4; ++i)
        {
            System.out.println(i+1 + "." + meniuri[i].getNumemeniu());
        }
        System.out.println("Doriti mai multe detalii? Y/n:\n");
        Scanner sc = new Scanner(System.in);
        String optiune = sc.next();
        if(optiune.equals("Y"))
        {
            for(int i = 0; i < 4; ++i)
            {
                System.out.println(i+1 + "." + meniuri[i].toString() + "\n");
            }
            revenireMeniuPrincipal(meniuri);
        }
        else if(optiune.equals("n"))
        {
            revenireMeniuPrincipal(meniuri);
        }
        else {
            System.out.println("Optiune invalida!");
            revenireMeniuPrincipal(meniuri);
        }
    }
    public static void main(String[]args)
    {
        Meniu[] meniuri = new Meniu[4];
        //meniu maxi
        Produs[] produse1 = new Produs[3];
        produse1[0] = new Produs("Coca Cola",500,"ml",1);
        produse1[1] = new Produs("Burger Maxi King", 350, "g",1);
        produse1[2] = new Produs("Cartofi prajiti",250,"g",1);
        meniuri[0]= new Meniu(produse1,"Meniu Maxi",16.5,3);
        //meniu hot wings
        Produs[] produse2 = new Produs[3];
        produse2[0] = new Produs("Aripioare picante", 350, "g", 6);
        produse2[1] = new Produs("Cartofi prajiti", 250, "g", 1);
        produse2[2] = new Produs("Ketchup picant",50, "ml",1);
        meniuri[1] = new Meniu(produse2, "Hot wings ",14.5,3);
        //meniu mcchicken
        Produs[] produse3 = new Produs[3];
        produse3[0] = new Produs("Coca Cola", 500, "ml", 1);
        produse3[1] = new Produs("Cartofi prajiti", 250, "g", 1);
        produse3[2] = new Produs("Burger cu pui",250, "g",1);
        meniuri[2] = new Meniu(produse3, "McChicken ",13.5,3);
        //omleta campionilor
        Produs[] produse4 = new Produs[5];
        produse4[0] = new Produs("Oua", 35, "g", 3);
        produse4[1] = new Produs("Sunca", 250, "g", 1);
        produse4[2] = new Produs("Rosii",50, "g",1);
        produse4[3] = new Produs("Ardei",30, "g",1);
        produse4[4] = new Produs("Ardei picanti",30, "g",1);
        meniuri[3] = new Meniu(produse4, "Omleta    ",14.5,3);
        System.out.println(produse1[0].toString());
        afisareMeniu1(meniuri);
    }
}
