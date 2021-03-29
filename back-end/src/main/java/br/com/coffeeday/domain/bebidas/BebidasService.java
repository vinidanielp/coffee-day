package br.com.coffeeday.domain.bebidas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
public class BebidasService {

    @Autowired
    private BebidasRepository bebidasRepository;

    // Método de listar todas as bebidas.
    public List<Bebidas> findAll() {
        return bebidasRepository.findAll();
    }

    // Método de mostrar apenas uma bebida, usando o id.
    public Bebidas findById(long id) {
        return bebidasRepository.findById(id).get();
    }

    // Método de salvar.
    public Bebidas save(Bebidas bebidas, Errors errors) {
        return bebidasRepository.save(bebidas);
    }

    // Método de deletar
    public void deleteById(long id) {
        bebidasRepository.deleteById(id);
    }
}
