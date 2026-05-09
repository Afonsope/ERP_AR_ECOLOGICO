package br.com.arecologico.erp.database.model;

public class TipoContratoEntity {

    private Integer codTipoContrato;
    private String tipoContrato;

    public TipoContratoEntity() {
        codTipoContrato = 0;
        tipoContrato = new String();
    }

    public TipoContratoEntity(Integer codTipoContrato, String tipoContrato) {
        this.codTipoContrato = codTipoContrato;
        this.tipoContrato = tipoContrato;
    }

    public Integer getCodTipoContrato() {
        return codTipoContrato;
    }

    public void setCodTipoContrato(Integer codTipoContrato) {
        this.codTipoContrato = codTipoContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
