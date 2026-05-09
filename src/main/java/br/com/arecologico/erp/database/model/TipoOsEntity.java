package br.com.arecologico.erp.database.model;

public class TipoOsEntity {

    private Integer codTipo;
    private String nomeTipo;

    public TipoOsEntity() {
        codTipo = 0;
        nomeTipo = new String();
    }

    public TipoOsEntity(Integer codTipo, String nomeTipo) {
        this.codTipo = codTipo;
        this.nomeTipo = nomeTipo;
    }

    public Integer getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Integer codTipo) {
        this.codTipo = codTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
}
