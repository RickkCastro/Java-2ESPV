public class Main {
    public static void main(String[] args) {
        Pessoa laura = new Pessoa("Laura", 20, "F", 1.7, 58 );
        Pessoa dudu = new Pessoa("Dudu", 18, "M", 1.69, 88 );
        laura.viewPessoa();
        System.out.println("---------------");
        dudu.viewPessoa();

        System.out.println("---------------");

        for (int i = 40; i <= 90; i++) {
            laura.setWeight(i);
            System.out.println(i + "kg" + " -- " + laura.getIMCText());
        }

    }
}
