package model.agenda;

public class Contato {
    private Integer id;
    private String nome;
    private String numero;
    private String email;

    public Contato(Integer id, String nome, String numero, String email) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public String mostrarInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nID: ").append(id).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Número: (").append(numero.substring(0, 2)).append(") ").append(numero.substring(2, 11)).append("\n");
        sb.append("Email: ").append(email);
        return sb.toString();
    }

    public String infoSemFormatarNumero() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nID: ").append(id).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Email: ").append(email);
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }
}
