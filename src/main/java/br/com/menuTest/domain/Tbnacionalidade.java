/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author AJF
 */
@Entity
public class Tbnacionalidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtbnacionalidade;
    @Column(length = 255)
    private String ddi;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @OneToMany(mappedBy = "idtbnacionalidade")
    private List<Recpaciente> recpacienteList;

    public Tbnacionalidade() {
    }

    public Tbnacionalidade(Integer idtbnacionalidade) {
        this.idtbnacionalidade = idtbnacionalidade;
    }

    public Tbnacionalidade(Integer idtbnacionalidade, String nome) {
        this.idtbnacionalidade = idtbnacionalidade;
        this.nome = nome;
    }

    public Integer getIdtbnacionalidade() {
        return idtbnacionalidade;
    }

    public void setIdtbnacionalidade(Integer idtbnacionalidade) {
        this.idtbnacionalidade = idtbnacionalidade;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtbnacionalidade != null ? idtbnacionalidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbnacionalidade)) {
            return false;
        }
        Tbnacionalidade other = (Tbnacionalidade) object;
        if ((this.idtbnacionalidade == null && other.idtbnacionalidade != null) || (this.idtbnacionalidade != null && !this.idtbnacionalidade.equals(other.idtbnacionalidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tbnacionalidade[ idtbnacionalidade=" + idtbnacionalidade + " ]";
    }

}
