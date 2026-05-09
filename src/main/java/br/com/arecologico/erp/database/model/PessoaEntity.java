package br.com.arecologico.erp.database.model;

public class PessoaEntity {

    private Integer cod_Pessoa;
    private String CPF;
    private String nome;
    private String email;
    private String telefone;
    private EnderecoEntity endereco;

    PessoaEntity() {
        cod_Pessoa = 0;
        CPF = new String();
        nome = new String();
        email = new String();
        telefone = new String();
        endereco = new EnderecoEntity();
    }

    PessoaEntity(Integer cod_Pessoa, String CPF, String nome, String email, String telefone, EnderecoEntity endereco) {
        this.cod_Pessoa = 0;
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Integer getCod_Pessoa() {
        return cod_Pessoa;
    }

    public void setCod_Pessoa(Integer cod_Pessoa) {
        this.cod_Pessoa = cod_Pessoa;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }
}
