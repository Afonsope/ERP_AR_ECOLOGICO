package br.com.arecologico.erp.database.model;

public class CidadeEntity {

    private Integer idCidade;
    private String nomeCidade;
    private EstadoEntity estado;

    public CidadeEntity() {
        idCidade = 0;
        nomeCidade = new String();
        estado = new EstadoEntity();
    }
    
    public CidadeEntity(Integer idCidade, String nomeCidade, EstadoEntity estado) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}
