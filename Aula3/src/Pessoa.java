public class Pessoa {

    private String name;
    private int age;
    private String  gender;
    private double height;
    private double weight;

    public double getImc() {
        return weight / (height * height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pessoa(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void viewPessoa() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Gênero: " + (gender != null ? gender : "Não informado"));
        System.out.println("Altura: " + height);
        System.out.println("Peso: " + weight);
        // Usamos o printf para limitar as casas decimais do IMC
        System.out.printf("IMC: %.2f%n", getImc());
        System.out.println("Status: " + getIMCText());
    }

    public String getIMCText() {
        double imc = getImc();

        if (imc <18.53) return "TA RUIM PAE, MAGRO DMS";
        if (imc >= 18.53 && imc < 25) return "TA BAUM";
        if (imc >= 25 && imc < 30) return "VIXI, GORDO KK";
        return "OBESOOOOOOO, THAIS CARLAA!!!";
    }
}

