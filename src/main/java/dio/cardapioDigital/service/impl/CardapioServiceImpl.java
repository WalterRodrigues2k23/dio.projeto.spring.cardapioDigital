package dio.cardapioDigital.service.impl;

import dio.cardapioDigital.model.Cardapio;
import dio.cardapioDigital.model.CardapioRepository;
import dio.cardapioDigital.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardapioServiceImpl implements CardapioService
{
    @Autowired
    private CardapioRepository cardapioRepository;
    @Override
    public Iterable<Cardapio> buscarTodos() {
        return cardapioRepository.findAll();
    }

    @Override
    public Cardapio buscarPorId(Long id) {
        Optional<Cardapio> cardapioImpl = cardapioRepository.findById(id);
        return cardapioImpl.get();
    }

    @Override
    public void inserirItem(Cardapio cardapio) {
        inserirItem(cardapio);
    }

    @Override
    public void atualizar(Long id, Cardapio cardapio) {
        Optional<Cardapio> cardapiodb = cardapioRepository.findById(id);
        if (cardapiodb.isPresent()) {
            inserirItem(cardapio);
        }
    }

    @Override
    public void deletar(Long id) {
        deletar(id);
    }
}
