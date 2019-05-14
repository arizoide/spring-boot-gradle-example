package br.alura.arithomazini.springbootgradleexample.repositories;

import br.alura.arithomazini.springbootgradleexample.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
