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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author AJF
 */
@Entity
public class Gugusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idusuarios;
    @Basic(optional = false)
    @Column(nullable = false)
    private short ativo;
    @Basic(optional = false)
    @Column(nullable = false)
    private short bloqueado;
    @Column(length = 255)
    private String cpf;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @JoinTable(name = "gugusuario_gestor", joinColumns = {
        @JoinColumn(name = "idgugusuario", referencedColumnName = "idusuarios", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "idguggestor", referencedColumnName = "idgestor", nullable = false)})
    @ManyToMany
    private List<Tggestor> tggestorList;
    @JoinColumn(name = "idgrupo", referencedColumnName = "idguggrupos", nullable = false)
    @ManyToOne(optional = false)
    private Guggrupos idgrupo;

    public Gugusuarios() {
    }

    public Gugusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Gugusuarios(Integer idusuarios, short ativo, short bloqueado, String nome) {
        this.idusuarios = idusuarios;
        this.ativo = ativo;
        this.bloqueado = bloqueado;
        this.nome = nome;
    }

    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public short getAtivo() {
        return ativo;
    }

    public void setAtivo(short ativo) {
        this.ativo = ativo;
    }

    public short getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(short bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tggestor> getTggestorList() {
        return tggestorList;
    }

    public void setTggestorList(List<Tggestor> tggestorList) {
        this.tggestorList = tggestorList;
    }

    public Guggrupos getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Guggrupos idgrupo) {
        this.idgrupo = idgrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarios != null ? idusuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gugusuarios)) {
            return false;
        }
        Gugusuarios other = (Gugusuarios) object;
        if ((this.idusuarios == null && other.idusuarios != null) || (this.idusuarios != null && !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Gugusuarios[ idusuarios=" + idusuarios + " ]";
    }

}
