package dio.cardapioDigital.service.impl;

import dio.cardapioDigital.model.Cliente;
import dio.cardapioDigital.model.ClienteRepository;
import dio.cardapioDigital.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Iterable<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        inserir(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clientedb = clienteRepository.findById(id);
        if(clientedb.isPresent()) {
            inserir(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        deletar(id);
    }
}
