package xp.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xp.bootcamp.model.Produto;

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNome(String Nome);
}
