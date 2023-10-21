package dio.cardapioDigital.controller;

import dio.cardapioDigital.model.Cardapio;
import dio.cardapioDigital.model.CardapioRepository;
import dio.cardapioDigital.model.Cliente;
import dio.cardapioDigital.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cardapio")
public class CardapioRestController {
    @Autowired
    private CardapioService cardapioService;

    @GetMapping
    public ResponseEntity<Iterable<Cardapio>> buscarTodos(){
        return ResponseEntity.ok(cardapioService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cardapio> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(cardapioService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cardapio> inserir(@RequestBody Cardapio cardapio) {
        cardapioService.inserirItem(cardapio);
        return ResponseEntity.ok(cardapio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cardapio> atualizar(@PathVariable Long id, @RequestBody Cardapio cardapio)
    {
        cardapioService.atualizar(id, cardapio);
        return ResponseEntity.ok(cardapio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        cardapioService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
