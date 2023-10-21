package dio.cardapioDigital.service;

import dio.cardapioDigital.model.Cardapio;

public interface CardapioService
{
    Iterable<Cardapio> buscarTodos();
    Cardapio buscarPorId(Long id);
    void inserirItem(Cardapio cardapio);
    void atualizar(Long id, Cardapio cardapio);
    void deletar(Long id);

}
