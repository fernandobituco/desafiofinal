package xp.bootcamp.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xp.bootcamp.dto.ProductRegisterDto;
import xp.bootcamp.enums.Categoria;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;

    private double preco;

    private Categoria categoria;

    public Produto(ProductRegisterDto productRegisterDto) {
        nome = productRegisterDto.getNome();
        preco = productRegisterDto.getPreco();
        categoria = productRegisterDto.getCategoria();
    }
}
