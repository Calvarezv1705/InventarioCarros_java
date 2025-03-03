public class Carro {
    private String color;
    private int modelo;
    private int km;
    private String marca;
    private String placa;

    public Carro(String color, int modelo, int km, String marca, String placa) {
        this.color = color;
        this.modelo = modelo;
        this.km = km;
        this.marca = marca;
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public int getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toFileFormat() {
        return modelo + "," + marca + "," + color + "," + km + "," + placa;
    }

    public static Carro fromFileFormat(String line) {
        String[] data = line.split(",");
        int modelo = Integer.parseInt(data[0]);
        String marca = data[1];
        String color = data[2];
        int km = Integer.parseInt(data[3]);
        String placa = data[4];
        return new Carro(color, modelo, km, marca, placa);
    }
}
