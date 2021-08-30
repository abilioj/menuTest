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
    @NamedQuery(name = "Tgprofissaocbo.findAll", query = "SELECT t FROM Tgprofissaocbo t")
    , @NamedQuery(name = "Tgprofissaocbo.findByIdtgprofissaocbo", query = "SELECT t FROM Tgprofissaocbo t WHERE t.idtgprofissaocbo = :idtgprofissaocbo")
    , @NamedQuery(name = "Tgprofissaocbo.findByCbo", query = "SELECT t FROM Tgprofissaocbo t WHERE t.cbo = :cbo")
    , @NamedQuery(name = "Tgprofissaocbo.findByDescricao", query = "SELECT t FROM Tgprofissaocbo t WHERE t.descricao = :descricao")})
public class Tgprofissaocbo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgprofissaocbo;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String cbo;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String descricao;
    @OneToMany(mappedBy = "idtgprofissaocbo")
    private List<Recpaciente> recpacienteList;

    public Tgprofissaocbo() {
    }

    public Tgprofissaocbo(Integer idtgprofissaocbo) {
        this.idtgprofissaocbo = idtgprofissaocbo;
    }

    public Tgprofissaocbo(Integer idtgprofissaocbo, String cbo, String descricao) {
        this.idtgprofissaocbo = idtgprofissaocbo;
        this.cbo = cbo;
        this.descricao = descricao;
    }

    public Integer getIdtgprofissaocbo() {
        return idtgprofissaocbo;
    }

    public void setIdtgprofissaocbo(Integer idtgprofissaocbo) {
        this.idtgprofissaocbo = idtgprofissaocbo;
    }

    public String getCbo() {
        return cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
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
        hash += (idtgprofissaocbo != null ? idtgprofissaocbo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgprofissaocbo)) {
            return false;
        }
        Tgprofissaocbo other = (Tgprofissaocbo) object;
        if ((this.idtgprofissaocbo == null && other.idtgprofissaocbo != null) || (this.idtgprofissaocbo != null && !this.idtgprofissaocbo.equals(other.idtgprofissaocbo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgprofissaocbo[ idtgprofissaocbo=" + idtgprofissaocbo + " ]";
    }

}
