package classes;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double CalculoIMC(){
        return peso / Math.pow(altura, 2);        
    }

    public void ResultadoIMC(){
        if (CalculoIMC() < 17) {            
            System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                            + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                            + ". Você está muito abaixo do peso!");
        } else if (CalculoIMC() >= 17 && CalculoIMC() < 18.49) {                
                System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                                + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                                + ". Você está abaixo do peso!");
        } else if (CalculoIMC() > 18.49 && CalculoIMC() < 24.99) {                
                System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                                + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                                + ". Você está no seu peso normal!");
        } else if (CalculoIMC() > 24.99 && CalculoIMC() < 29.99) {                
                System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                                + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                                + ". Você está um pouco acima do peso!");
        } else if (CalculoIMC() > 29.99 && CalculoIMC() < 34.99) {                
                System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                                + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                                + ". Você está um pouco obeso!");
        } else if (CalculoIMC() > 35 && CalculoIMC() < 39.99) {                
                System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                                + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                                + ". Você está com obesidade severa!");
        } else {                
                System.out.println(nome + " seu peso é " + String.format("%.2f", peso)
                                + " e seu IMC é " + String.format("%.2f", CalculoIMC())
                                + ". Você está com obesidade severa!");
        }
    }    
}
