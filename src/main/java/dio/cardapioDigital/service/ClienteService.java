package dio.cardapioDigital.service;

import dio.cardapioDigital.model.Cliente;

public interface ClienteService
{
    Iterable<Cliente> buscarClientes();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
