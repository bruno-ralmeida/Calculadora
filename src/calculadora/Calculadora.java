package calculadora;

/**
 *
 * @author Bruno Rocha
 */
public class Calculadora {
    //DECLARAÇÃO DE VARIÁVEIS
    private Double result, valor1, valor2;
    private String sinal;
    
    //MÉTODOS CONSTRUTOR
    public Calculadora() {
        
    }
    //MÉTODOS ACESSORES
    public Double getResult() {
        return result;
    }

    public void setResult(Double operacao) {
        this.result = operacao;
    }

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }
   //MÉTODO CALCULAR COM ESTRUTURA CONDICIONAL PARA DEFINIR QUAL OPERAÇÃO SERÁ REALIZADA 
    public Double operacao(Double valor, Double valor2){
         if (("+").equals(sinal)) {
            result = this.valor1 + this.valor2;
        }
        if (("-".equals(sinal))) {
            result = this.valor1 - this.valor2;
        }
        if (("x".equals(sinal))) {
            result = this.valor1 * this.valor2;
        }
        if (("÷").equals(sinal)) {
            result = this.valor1 / this.valor2;
        }
        if (("√").equals(sinal)) {
            result = Math.sqrt(this.valor2);
        }
        if(("%").equals(sinal)) {
            result = (this.valor1*this.valor2)/100;
        }
        if(("^").equals(sinal)) {
            result = Math.pow(this.valor1, this.valor2);
        }
        return result;
    }  
    
    
}
