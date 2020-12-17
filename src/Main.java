public class Main {
    public static void main(String[] args) {

        SecondClass person = new SecondClass();
        System.out.println(person.ticketsCount(123));
        System.out.println(person.message("viktor"));

        ThirdClass lena = new ThirdClass();
        System.out.println(lena.hello("Lena"));
        System.out.println(lena.ticketsCount(25));
        lena.counter("Lena");
    }

}
