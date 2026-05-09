package br.com.arecologico.erp.database.model;

public class FuncionarioEntity extends PessoaEntity {

    private Double salario;
    private FuncaoEntity funcao;

    FuncionarioEntity() {
        super();
        salario = 0.0;
        funcao = new FuncaoEntity();
    }

    FuncionarioEntity(Integer cod_Pessoa, String CPF, String nome, String email, String telefone, Double salario, EnderecoEntity endereco, FuncaoEntity funcao) {
        super(cod_Pessoa, CPF, nome, email, telefone, endereco);
        this.salario = salario;
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public FuncaoEntity getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoEntity funcao) {
        this.funcao = funcao;
    }
}
