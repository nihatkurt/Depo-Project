package depo;

import java.util.HashMap;
import java.util.Scanner;

public class DepoIslemleri {


    // 4.Adim ürünleri saklmak icin HashMap turunde Collection olusturuldu.

    HashMap<Integer, PojoUrun> urunListesi =new HashMap<>();

    // 5.Adim method olusturuyoruz

    Scanner scanner=new Scanner(System.in);
    int id=1000;
    PojoUrun urun=urunListesi.get(id);

    public void urunTanimlama() {


        System.out.println("Urun ismi giriniz");
        String urunIsmi= scanner.next();


        System.out.println("Uretici : ");
        String uretici=scanner.next();


        System.out.println("Birimi : ");
        String birim=scanner.next();



        PojoUrun urun=new PojoUrun(id,urunIsmi,uretici,0,birim,"-"); // Yeni urun listesi olusturur ve id artirir...
        id++;
        urunListesi.put(id,urun);

        System.out.println("Urun tanimlandi...");

    }

    public void urunListele() {

        System.out.println(String.format("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|","id","isim","uretici","miktari","birimi","raf"));
        // Tablo icin

        System.out.println("---------------------------------------------------------------");

        for(PojoUrun urun : urunListesi.values()){

            System.out.println(urun);

        }

    }

    public  void urunGirisi() {

        System.out.println("Ürün Id giriniz :");
        int id= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ürün miktari giriniz :");
        int miktar= scanner.nextInt();
        scanner.nextLine();

        PojoUrun urun=urunListesi.get(id);

        if (urun!=null){ // HashMap ler birden fazla null degeri atar.

            urun.setMiktar(urun.getMiktar()+ miktar);
            System.out.println("Urun girisi yapildi.");

        }else {

            System.out.println("Urun bulunamadi...");
            System.out.println("Yeni urun eklemek istiyor musunuz? (Evet : E icin 'E' giriniz.)");
            String cevap=scanner.next();

            if (cevap.equalsIgnoreCase("E")){
                urunTanimlama();

            }else {
                System.out.println("Islem iptal edildi...");
            }


        }

    }

    public void urunuRafaKoy() {



        System.out.println("Lütfen id giriniz");
        int id=scanner.nextInt();

        System.out.println("Lütfen Raf numarasi giriniz.");
        String rafNo=scanner.next();

        PojoUrun urun=urunListesi.get(id);

        if (urun!=null){

            urun.setRaf(urun.getRaf()+rafNo);
            System.out.println("Urun rafa yerlestirildi...");

        }else {

            System.out.println("Urun rafa yerlestirilmedi...");
        }


    }

    public void urunCikisi() {

        urunListele();

        System.out.println("Lütfen Id giriniz :");
        int id=scanner.nextInt();
        PojoUrun urun=urunListesi.get(id);

        System.out.println("Satilan ürün miktari giriniz :");
        int satilanMiktar= scanner.nextInt();

        if (urun!=null) {

            if (urun.getMiktar() >= satilanMiktar && satilanMiktar>0  ) {

                System.out.println("Ürün cikisi yapildi ");
                System.out.println("Kalan Miktar : " +  (urun.getMiktar() - satilanMiktar));

            }else{
                System.out.println("Yeterli miktarda ürün yoktur.");
            }
        }else{

            System.out.println("Ürün bulunamadi... ");

        }





    }
}