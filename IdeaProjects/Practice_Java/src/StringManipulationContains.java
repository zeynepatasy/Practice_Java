public class StringManipulationContains {
    public static void main(String[] args) {
        //Kullanicidan bir cumle alin
        //cumlede ev geciyorsa, "home home sweet home" yazdirin
                // cumlede is geciyorsa, "calismak guzeldir"
                // ikisini de iceriyorsa "Hem ev lazim hem is"
                //hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cumle="Ev de lazım, iş de lazım";

        if (cumle.contains("Ev") || cumle.contains("ev")){
            System.out.println("home home sweet home");
        }if (cumle.contains("iş")){
            System.out.println("calismak guzeldir");

        } if (cumle.contains("iş") && cumle.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        }else{
            System.out.println("cok calisman lazim");
        }
    }
}
