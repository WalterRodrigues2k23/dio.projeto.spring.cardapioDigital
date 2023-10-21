package dio.cardapioDigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String xSalada;
    private String xBacon;
    private String hamburguer;
    private String xTudo;
    private String suco;
    private String refrigerante;
    private String agua;

    public String getxSalada() {

        return xSalada;
    }

    public void setxSalada(String xSalada) {
        this.xSalada = xSalada;
    }

    public String getxBacon() {
        return xBacon;
    }

    public void setxBacon(String xBacon) {
        this.xBacon = xBacon;
    }

    public String getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getxTudo() {
        return xTudo;
    }

    public void setxTudo(String xTudo) {
        this.xTudo = xTudo;
    }

    public String getSuco() {
        return suco;
    }

    public void setSuco(String suco) {
        this.suco = suco;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }
}
