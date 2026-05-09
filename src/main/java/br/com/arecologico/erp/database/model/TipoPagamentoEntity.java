package br.com.arecologico.erp.database.model;

public class TipoPagamentoEntity {

    private Integer codTipoPagamento;
    private String tipoPagemento;

    public TipoPagamentoEntity() {
        codTipoPagamento = 0;
        tipoPagemento = new String();
    }

    public TipoPagamentoEntity(Integer codTipoPagamento, String tipoPagemento) {
        this.codTipoPagamento = codTipoPagamento;
        this.tipoPagemento = tipoPagemento;
    }

    public Integer getCodTipoPagamento() {
        return codTipoPagamento;
    }

    public void setCodTipoPagamento(Integer codTipoPagamento) {
        this.codTipoPagamento = codTipoPagamento;
    }

    public String getTipoPagemento() {
        return tipoPagemento;
    }

    public void setTipoPagemento(String tipoPagemento) {
        this.tipoPagemento = tipoPagemento;
    }
}
