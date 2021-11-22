/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro;

@javax.faces.bean.ManagedBean
public class OlaBean {
    private String nome;
    private String sobrenome;
    private String nomeCompleto;

    public void dizerOla() {
        this.nomeCompleto = this.nome.toUpperCase()
                + " " + this.sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
