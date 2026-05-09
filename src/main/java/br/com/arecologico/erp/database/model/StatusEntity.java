package br.com.arecologico.erp.database.model;

public class StatusEntity {

    private Integer nrStatus;
    private String descricao;

    public StatusEntity() {
        nrStatus = 0;
        descricao = new String();
    }

    public StatusEntity(Integer nrStatus, String descricao) {
        this.nrStatus = nrStatus;
        this.descricao = descricao;
    }

    public Integer getNrStatus() {
        return nrStatus;
    }

    public void setNrStatus(Integer nrStatus) {
        this.nrStatus = nrStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
