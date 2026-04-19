enum Nivel {
    BAIXO, MEDIO, ALTO;
}

public class Tarefa {
    String descricao;
    Nivel prioridade;

    public Tarefa(String d, Nivel p)
    {
        this.descricao = d;
        this.prioridade = p;
    }
}

