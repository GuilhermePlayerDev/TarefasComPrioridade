import java.util.ArrayList;

public class ListadeTarefas {
    ArrayList<Tarefa> lista = new ArrayList<>();

    public void adicionar_tarefa(Tarefa t)
    {
        lista.add(t);
            }
    public void exibir()
    {
        for(int i= 0; i<lista.size(); i++)
        {
            if(lista.get(i).prioridade == Nivel.ALTO)
            {
                System.out.println("Tarefa de prioridade alta: " + lista.get(i).descricao + "");
            }
        }
        for(int i= 0; i<lista.size(); i++)
        {
            if(lista.get(i).prioridade == Nivel.MEDIO)
            {
                System.out.println("Tarefa de prioridade média: " + lista.get(i).descricao + "");
            }
        }
        for(int i= 0; i<lista.size(); i++)
        {
            if(lista.get(i).prioridade == Nivel.BAIXO)
            {
                System.out.println("Tarefa de prioridade baixa: " + lista.get(i).descricao + "");
            }
        }
    }
}
