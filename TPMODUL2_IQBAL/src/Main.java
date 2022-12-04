public class Main {
    public static void main(String[] args) {
        System.out.println("Laptop");
        Laptop laptop = new Laptop("Yamaha drive merk baru", 64, 5.00, true);
        laptop.informasi();
        laptop.bukaGame("Valorant 2");
        laptop.kirimEmail("iqbalinsan.haha.com");
        laptop.kirimEmail("iqbalinsan.haha.com", "iqballalaa.haha.co.id");
        
        System.out.println();

        System.out.println("Handphone");
        Handphone handphone = new Handphone("AdidayaMerk Baru", 32, 3.00, false);
        handphone.informasi();
        handphone.telfon(626969);
        handphone.kirimSMS(626969);
        handphone.kirimSMS(626969, 629696);
    }

}
