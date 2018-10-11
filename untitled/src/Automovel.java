public class Automovel {
    String marca;
    String modelo;
    String matricula;

    public Automovel(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    public String toString(){
        return "A marca do carro é " + marca + ", o modelo é " + modelo + " e a matricula é " + matricula+ ".";
    }
}
