package Model;

import Interface.Validavel;

public class CEP implements Validavel<String> {

    String numero;

    public CEP(String numero) {
        if (validar(numero)==true){
            this.numero = numero;
        } else{
            throw new RuntimeException("CEP Inválido");
            // Exceção
        }
    }

    @Override
    public boolean validar(String s){
        return s.matches("[0-9]{5}-[0-9]{3}");
        // o matches verifica se a String corresponde exatamente ao padrão fornecido por uma expressão regular (regex)
    }

    @Override
    public String toString() {
        return numero;
    }
}
