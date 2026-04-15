//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notas notas = new Notas(2);

        notas.exibirNotas();
        System.out.println("Media: " + String.format("%.2f", notas.calMedia()));
    }
}