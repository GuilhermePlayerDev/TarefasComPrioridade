/* 9. Lista de Tarefas com Prioridade: Crie uma classe Tarefa com atributos para
descrição e prioridade (use um Enum para as prioridades: ALTA, MEDIA, BAIXA).
Crie uma classe ListaDeTarefas que armazene tarefas e as exiba ordenadas por
prioridade */

public class Main {
    public static void main(String[] args) {
        ListadeTarefas lista = new ListadeTarefas();

        Tarefa t1 = new Tarefa("Fazer comida.\n", Nivel.ALTO);
        Tarefa t2 = new Tarefa("Estudar.\n", Nivel.MEDIO);
        Tarefa t3 = new Tarefa("Acordar.\n", Nivel.BAIXO);
        Tarefa t4 = new Tarefa("Consertar sistema.\n", Nivel.ALTO);
        Tarefa t5 = new Tarefa("Ajudar pais.\n", Nivel.MEDIO);
        Tarefa t6 = new Tarefa("Dormir.\n", Nivel.BAIXO);

        lista.adicionar_tarefa(t1);
        lista.adicionar_tarefa(t2);
        lista.adicionar_tarefa(t3);
        lista.adicionar_tarefa(t4);
        lista.adicionar_tarefa(t5);
        lista.adicionar_tarefa(t6);

        lista.exibir();
    }
}