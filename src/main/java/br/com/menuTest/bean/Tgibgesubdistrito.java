/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AJF
 */
@Entity
@Table(catalog = "whosp", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tgibgesubdistrito.findAll", query = "SELECT t FROM Tgibgesubdistrito t")
    , @NamedQuery(name = "Tgibgesubdistrito.findByIdtgibgesubdistrito", query = "SELECT t FROM Tgibgesubdistrito t WHERE t.idtgibgesubdistrito = :idtgibgesubdistrito")
    , @NamedQuery(name = "Tgibgesubdistrito.findByCod", query = "SELECT t FROM Tgibgesubdistrito t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgibgesubdistrito.findByCodcompleto", query = "SELECT t FROM Tgibgesubdistrito t WHERE t.codcompleto = :codcompleto")
    , @NamedQuery(name = "Tgibgesubdistrito.findByNome", query = "SELECT t FROM Tgibgesubdistrito t WHERE t.nome = :nome")})
public class Tgibgesubdistrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgibgesubdistrito;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cod;
    @Basic(optional = false)
    @Column(nullable = false)
    private int codcompleto;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @JoinColumn(name = "idtgibgedistrito", referencedColumnName = "idtgibgedistrito", nullable = false)
    @ManyToOne(optional = false)
    private Tgibgedistrito idtgibgedistrito;

    public Tgibgesubdistrito() {
    }

    public Tgibgesubdistrito(Integer idtgibgesubdistrito) {
        this.idtgibgesubdistrito = idtgibgesubdistrito;
    }

    public Tgibgesubdistrito(Integer idtgibgesubdistrito, int cod, int codcompleto, String nome) {
        this.idtgibgesubdistrito = idtgibgesubdistrito;
        this.cod = cod;
        this.codcompleto = codcompleto;
        this.nome = nome;
    }

    public Integer getIdtgibgesubdistrito() {
        return idtgibgesubdistrito;
    }

    public void setIdtgibgesubdistrito(Integer idtgibgesubdistrito) {
        this.idtgibgesubdistrito = idtgibgesubdistrito;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodcompleto() {
        return codcompleto;
    }

    public void setCodcompleto(int codcompleto) {
        this.codcompleto = codcompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tgibgedistrito getIdtgibgedistrito() {
        return idtgibgedistrito;
    }

    public void setIdtgibgedistrito(Tgibgedistrito idtgibgedistrito) {
        this.idtgibgedistrito = idtgibgedistrito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgesubdistrito != null ? idtgibgesubdistrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgesubdistrito)) {
            return false;
        }
        Tgibgesubdistrito other = (Tgibgesubdistrito) object;
        if ((this.idtgibgesubdistrito == null && other.idtgibgesubdistrito != null) || (this.idtgibgesubdistrito != null && !this.idtgibgesubdistrito.equals(other.idtgibgesubdistrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgibgesubdistrito[ idtgibgesubdistrito=" + idtgibgesubdistrito + " ]";
    }

}
