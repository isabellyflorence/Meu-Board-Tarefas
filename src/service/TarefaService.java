package service;

import model.Tarefa;
import repository.TarefaRepository;

import java.util.List;
import java.util.Optional;

public class TarefaService {
    private TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public void criarTarefa(String titulo, String descricao, String prioridade) {
        Tarefa tarefa = new Tarefa(titulo, descricao, prioridade);
        repository.adicionar(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return repository.listar();
    }

    public boolean atualizarStatus(int id, String novoStatus) {
        Optional<Tarefa> tarefaOpt = repository.buscarPorId(id);
        if (tarefaOpt.isPresent()) {
            tarefaOpt.get().setStatus(novoStatus);
            return true;
        }
        return false;
    }

    public boolean removerTarefa(int id) {
        Optional<Tarefa> tarefaOpt = repository.buscarPorId(id);
        if (tarefaOpt.isPresent()) {
            repository.remover(tarefaOpt.get());
            return true;
        }
        return false;
    }
}
