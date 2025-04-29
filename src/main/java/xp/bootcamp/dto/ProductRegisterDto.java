package xp.bootcamp.dto;

import lombok.Getter;
import lombok.Setter;
import xp.bootcamp.enums.Categoria;

@Getter
@Setter
public class ProductRegisterDto {
    private String nome;

    private double preco;

    private Categoria categoria;
}
