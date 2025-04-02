public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal();
        animal1.setNome("Guaxinim");
        animal1.setPeso((float)3.5);
        animal1.setRecinto(1);
        System.out.println(animal1.toString());
        // -------
        Ave ave1 = new Ave("Calopsita", 0);
        ave1.setMigracao(false);
        ave1.setPeso((float)0.07);
        System.out.println(ave1.toString());
    }
}
