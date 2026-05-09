package br.com.arecologico.erp.database.model;

public class EstadoEntity {

    private Integer idEstado;
    private String siglaEstado;
    private String nomeEstado;

    public EstadoEntity() {
        idEstado = 0;
        siglaEstado = new String();
        nomeEstado = new String();
    }    

    public EstadoEntity(Integer idEstado, String siglaEstado, String nomeEstado) {
        this.idEstado = idEstado;
        this.siglaEstado = siglaEstado;
        this.nomeEstado = nomeEstado;
    }

    public Integer getId() {
        return idEstado;
    }

    public void setId(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getSigla() {
        return siglaEstado;
    }

    public void setSigla(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public String getNome() {
        return nomeEstado;
    }

    public void setNome(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
}
