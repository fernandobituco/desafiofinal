# Relatório do desafio final do bootcamp Arquitetura de Software
Projeto desenvolvido em Java com uso do SpringInitializr e persistência em H2, para fins de testes, que implementa um CRUD de produtos de um sistema de vendas

## Interface
Os endpoints da API ficaram expostos e documentados com uso do swagger

![image](https://github.com/user-attachments/assets/76575490-6a99-4522-a7a1-86e61299e728)

## Estrutura de Pastas

```shell
/src/main/java
/xp/bootcamp
  /controller                 # Controladores que gerenciam as requisições HTTP
    ProdutoController.java
  /model                      # Entidades de domínio
    Produto.java
  /enums                      # Enumeradores de auxílio das entidades
    Categoria.java
  /service                    # Serviços que implementam a lógica de negócio
    ProdutoService.java
  /repository                 # Repositórios para leitura e escrita no banco de dados
    IProdutoRepository.java
  BootcampApplication.java    # Classe principal para iniciar a aplicação
```

## Arquitetura
Diagramação com uso do modelo C4
### Contexto
![image](https://github.com/user-attachments/assets/16d7a063-d360-4875-b854-2fbc365b78a7)
### Containers
![image](https://github.com/user-attachments/assets/f358c335-03fa-4656-9b11-5747e028fa0b)
### Componente
![image](https://github.com/user-attachments/assets/4a876ff1-9540-4113-9bdf-023bcec2f704)

