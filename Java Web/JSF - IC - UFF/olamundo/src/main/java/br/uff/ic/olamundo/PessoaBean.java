/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.olamundo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mathe
 */
@Named(value = "pessoaBean")
@RequestScoped
public class PessoaBean {
    
    private String nome;
    
    public PessoaBean() {
        nome = "Anônimo";
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
