package model;

public class Tarefa {
    private static int contador = 0;
    private int id;
    private String titulo;
    private String descricao;
    private String status;
    private String prioridade;

    public Tarefa(String titulo, String descricao, String prioridade) {
        this.id = ++contador;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "Pendente";
        this.prioridade = prioridade;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", prioridade='" + prioridade + '\'' +
                '}';
    }
}
