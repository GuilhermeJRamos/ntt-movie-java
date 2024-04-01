package com.guilhermeramos.nttmoviejava.application.dtos.user;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public class UserDTO implements UserInterfaceDTO {
    /* Properties */
    private String name;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    /* Getters */
    public String getName() {
        return this.name;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    /* Setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    /* Relations */
    private List<MovieDTO> FavoriteMovies;

    /* Relations Getters */
    @Override
    public List<MovieDTO> getFavoriteMovies() {
        return this.FavoriteMovies;
    }

    /* Relations Setters */
    @Override
    public void setFavoriteMovies(List<MovieDTO> movies) {
        this.FavoriteMovies = movies;
    }
}
