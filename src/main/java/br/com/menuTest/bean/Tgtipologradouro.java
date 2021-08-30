/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AJF
 */
@Entity
@Table(catalog = "whosp", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tgtipologradouro.findAll", query = "SELECT t FROM Tgtipologradouro t")
    , @NamedQuery(name = "Tgtipologradouro.findByIdtipolog", query = "SELECT t FROM Tgtipologradouro t WHERE t.idtipolog = :idtipolog")
    , @NamedQuery(name = "Tgtipologradouro.findByAtivo", query = "SELECT t FROM Tgtipologradouro t WHERE t.ativo = :ativo")
    , @NamedQuery(name = "Tgtipologradouro.findByNome", query = "SELECT t FROM Tgtipologradouro t WHERE t.nome = :nome")
    , @NamedQuery(name = "Tgtipologradouro.findBySigla", query = "SELECT t FROM Tgtipologradouro t WHERE t.sigla = :sigla")})
public class Tgtipologradouro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtipolog;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean ativo;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String sigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipolog")
    private List<Tgcep> tgcepList;

    public Tgtipologradouro() {
    }

    public Tgtipologradouro(Integer idtipolog) {
        this.idtipolog = idtipolog;
    }

    public Tgtipologradouro(Integer idtipolog, boolean ativo, String nome, String sigla) {
        this.idtipolog = idtipolog;
        this.ativo = ativo;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Integer getIdtipolog() {
        return idtipolog;
    }

    public void setIdtipolog(Integer idtipolog) {
        this.idtipolog = idtipolog;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @XmlTransient
    public List<Tgcep> getTgcepList() {
        return tgcepList;
    }

    public void setTgcepList(List<Tgcep> tgcepList) {
        this.tgcepList = tgcepList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipolog != null ? idtipolog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgtipologradouro)) {
            return false;
        }
        Tgtipologradouro other = (Tgtipologradouro) object;
        if ((this.idtipolog == null && other.idtipolog != null) || (this.idtipolog != null && !this.idtipolog.equals(other.idtipolog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgtipologradouro[ idtipolog=" + idtipolog + " ]";
    }

}
