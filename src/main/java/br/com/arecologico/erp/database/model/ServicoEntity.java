package br.com.arecologico.erp.database.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ServicoEntity {

    private Integer codServico;
    private BigDecimal valorServico;
    private String descricao;
    private LocalDateTime dataServicoInicio;
    private LocalDateTime dataServicoFim;
    private TipoServicoEntity codTipoServico;

    public ServicoEntity() {
        codServico = 0;
        valorServico = new BigDecimal(0.00);
        descricao = new String();
        dataServicoInicio = LocalDateTime.now();
        dataServicoFim = null;
        codTipoServico = new TipoServicoEntity();
    }

    public ServicoEntity(Integer codServico, BigDecimal valorServico, String descricao, LocalDateTime dataServicoInicio,
            LocalDateTime dataServicoFim, TipoServicoEntity codTipoServico) {
        this.codServico = codServico;
        this.valorServico = valorServico;
        this.descricao = descricao;
        this.dataServicoInicio = dataServicoInicio;
        this.dataServicoFim = dataServicoFim;
        this.codTipoServico = codTipoServico;
    }

    public Integer getCodServico() {
        return codServico;
    }

    public void setCodServico(Integer codServico) {
        this.codServico = codServico;
    }

    public BigDecimal getValorServico() {
        return valorServico;
    }

    public void setValorServico(BigDecimal valorServico) {
        this.valorServico = valorServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataServicoInicio() {
        return dataServicoInicio;
    }

    public void setDataServicoInicio(LocalDateTime dataServicoInicio) {
        this.dataServicoInicio = dataServicoInicio;
    }

    public LocalDateTime getDataServicoFim() {
        return dataServicoFim;
    }

    public void setDataServicoFim(LocalDateTime dataServicoFim) {
        this.dataServicoFim = dataServicoFim;
    }

    public TipoServicoEntity getCodTipoServico() {
        return codTipoServico;
    }

    public void setCodTipoServico(TipoServicoEntity codTipoServico) {
        this.codTipoServico = codTipoServico;
    }
}
