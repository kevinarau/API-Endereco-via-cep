package Dio.projeto.Spring.Spring.projeto.service;

import Dio.projeto.Spring.Spring.projeto.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente );
    void deletar(Long id);

}
