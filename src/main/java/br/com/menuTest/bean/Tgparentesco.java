/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
    @NamedQuery(name = "Tgparentesco.findAll", query = "SELECT t FROM Tgparentesco t")
    , @NamedQuery(name = "Tgparentesco.findByIdtgparentesco", query = "SELECT t FROM Tgparentesco t WHERE t.idtgparentesco = :idtgparentesco")
    , @NamedQuery(name = "Tgparentesco.findByDescricao", query = "SELECT t FROM Tgparentesco t WHERE t.descricao = :descricao")})
public class Tgparentesco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgparentesco;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String descricao;
    @OneToMany(mappedBy = "idtgparentesco")
    private List<Recpaciente> recpacienteList;

    public Tgparentesco() {
    }

    public Tgparentesco(Integer idtgparentesco) {
        this.idtgparentesco = idtgparentesco;
    }

    public Tgparentesco(Integer idtgparentesco, String descricao) {
        this.idtgparentesco = idtgparentesco;
        this.descricao = descricao;
    }

    public Integer getIdtgparentesco() {
        return idtgparentesco;
    }

    public void setIdtgparentesco(Integer idtgparentesco) {
        this.idtgparentesco = idtgparentesco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgparentesco != null ? idtgparentesco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgparentesco)) {
            return false;
        }
        Tgparentesco other = (Tgparentesco) object;
        if ((this.idtgparentesco == null && other.idtgparentesco != null) || (this.idtgparentesco != null && !this.idtgparentesco.equals(other.idtgparentesco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgparentesco[ idtgparentesco=" + idtgparentesco + " ]";
    }

}
