package dio.cardapioDigital.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>
{
    Optional<Cliente> findById(Long id);
}
