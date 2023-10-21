package dio.cardapioDigital.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardapioRepository extends CrudRepository<Cardapio, String>
{
    Optional<Cardapio> findById(Long id);
}
