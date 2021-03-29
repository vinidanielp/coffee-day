package br.com.coffeeday.domain.bebidas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coffeeday.core.controller.ResponseAbstractController;

@RestController
@RequestMapping("/bebidas")
public class BebidasController extends ResponseAbstractController {

    @Autowired
    private BebidasService bebidasService;

    // Listar tudo
    @GetMapping
    public ResponseEntity<?> findAll() {
        return jsonResponse(bebidasService.findAll());
    }

    // Listar de acordo com o ID
    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return jsonResponse(bebidasService.findById(id));
    }

    // Salvar
    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Bebidas bebidas, Errors errors) {
        return jsonResponse(bebidasService.save(bebidas, errors));
    }

    // Atualizar/Update
    @PutMapping
    public ResponseEntity<?> update(@Validated @RequestBody Bebidas bebidas, Errors errors) {
        return jsonResponse(bebidasService.save(bebidas, errors));
    }

    // Deletar
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id) {
        bebidasService.deleteById(id);
        return jsonResponse();
    }
}
