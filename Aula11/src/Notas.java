import java.util.Random;

public class Notas {
    Random random = new Random();
    int tamanho;
    double[] notas;

    public Notas (int tamanho) {
        this.tamanho = tamanho;
        notas = new double[tamanho];

        atribuirNotas();
    }

    private void atribuirNotas() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextDouble() * 10;
        }
    }

    public double calMedia() {
        double totalNotas = 0;

        for (double nota : notas) {
            totalNotas += nota;
        }

        return totalNotas / notas.length;
    }

    public void exibirNotas() {
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(String.format("%.2f", nota) + ", ");
        }
        System.out.println();
    }
}
