package br.com.arecologico.erp.database.model;

public class EnderecoEntity {

    private Integer idEndereco;
    private String numeroCasa;
    private CepEntity cep;

    public EnderecoEntity() {
        idEndereco = 0;
        numeroCasa = new String();
        cep = new CepEntity();
    }

    public EnderecoEntity(Integer idEndereco, String numeroCasa, CepEntity cep) {
        this.idEndereco = idEndereco;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public CepEntity getCep() {
        return cep;
    }

    public void setCep(CepEntity cep) {
        this.cep = cep;
    }
}
