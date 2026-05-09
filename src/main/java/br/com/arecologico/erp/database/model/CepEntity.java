package br.com.arecologico.erp.database.model;

public class CepEntity {

    private Integer idCep;
    private String numeroCep;
    private CidadeEntity cidade;

    public CepEntity() {
        idCep = 0;
        numeroCep = new String();
        cidade = new CidadeEntity();
    }
    
    public CepEntity(Integer idCep, String numeroCep, CidadeEntity cidade) {
        this.idCep = idCep;
        this.numeroCep = numeroCep;
        this.cidade = cidade;
    }

    public Integer getIdCep() {
        return idCep;
    }

    public void setIdCep(Integer idCep) {
        this.idCep = idCep;
    }

    public String getNumeroCep() {
        return numeroCep;
    }

    public void setNumeroCep(String numeroCep) {
        this.numeroCep = numeroCep;
    }

    public CidadeEntity getCidade() {
        return cidade;
    }

    public void setCidade(CidadeEntity cidade) {
        this.cidade = cidade;
    }
}
