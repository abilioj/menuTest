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
    @NamedQuery(name = "Gugfavoritos.findAll", query = "SELECT g FROM Gugfavoritos g")
    , @NamedQuery(name = "Gugfavoritos.findByIdGugfavoritos", query = "SELECT g FROM Gugfavoritos g WHERE g.idGugfavoritos = :idGugfavoritos")
    , @NamedQuery(name = "Gugfavoritos.findByFavoritoativo", query = "SELECT g FROM Gugfavoritos g WHERE g.favoritoativo = :favoritoativo")})
public class Gugfavoritos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_gugfavoritos", nullable = false)
    private Integer idGugfavoritos;
    private Short favoritoativo;
    @JoinColumn(name = "id_gugmenugrupos", referencedColumnName = "idmenugrupo", nullable = false)
    @ManyToOne(optional = false)
    private Gugmenugrupos idGugmenugrupos;

    public Gugfavoritos() {
    }

    public Gugfavoritos(Integer idGugfavoritos) {
        this.idGugfavoritos = idGugfavoritos;
    }

    public Integer getIdGugfavoritos() {
        return idGugfavoritos;
    }

    public void setIdGugfavoritos(Integer idGugfavoritos) {
        this.idGugfavoritos = idGugfavoritos;
    }

    public Short getFavoritoativo() {
        return favoritoativo;
    }

    public void setFavoritoativo(Short favoritoativo) {
        this.favoritoativo = favoritoativo;
    }

    public Gugmenugrupos getIdGugmenugrupos() {
        return idGugmenugrupos;
    }

    public void setIdGugmenugrupos(Gugmenugrupos idGugmenugrupos) {
        this.idGugmenugrupos = idGugmenugrupos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGugfavoritos != null ? idGugfavoritos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gugfavoritos)) {
            return false;
        }
        Gugfavoritos other = (Gugfavoritos) object;
        if ((this.idGugfavoritos == null && other.idGugfavoritos != null) || (this.idGugfavoritos != null && !this.idGugfavoritos.equals(other.idGugfavoritos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Gugfavoritos[ idGugfavoritos=" + idGugfavoritos + " ]";
    }

}
