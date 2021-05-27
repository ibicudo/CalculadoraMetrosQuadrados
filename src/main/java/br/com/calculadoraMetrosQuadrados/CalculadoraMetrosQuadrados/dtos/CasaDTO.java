package br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.dtos;

import java.util.ArrayList;
import java.util.List;

public class CasaDTO {
    private String nome;
    private String endereco;
    private List<ComodoDTO> comodos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ComodoDTO> getComodos() {
        return comodos;
    }

    public void setComodos(List<ComodoDTO> comodos) {
        this.comodos = comodos;
    }
}
