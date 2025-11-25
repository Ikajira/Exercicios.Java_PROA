package br.com.kaiquepeixoto.cadastro_produtos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(Integer quantProduto) {
        this.quantProduto = quantProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProduto;

    @Column(name = "nomeProduto")
    private String nomeProduto;

    @Column(name = "descricaoPRoduto")
    private String descricaoProduto;

    @Column(name = "quantProduto")
    private Integer quantProduto;

    @Column(name = "preco")
    private Double preco;

}
