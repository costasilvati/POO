package model;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String uf;
    private Funcionario idFuncionario; // Funcionário que cadastrou

    public Cliente(int id, String nome, String cpf, String uf, Funcionario idFuncionario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.idFuncionario = idFuncionario;
    }

    public Cliente() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", uf='" + uf + '\'' +
               ", cadastradoPorFuncionarioId=" + (idFuncionario != null ? idFuncionario.getId() : "N/A") +
               '}';
    }
}