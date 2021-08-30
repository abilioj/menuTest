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
    @NamedQuery(name = "Recsexo.findAll", query = "SELECT r FROM Recsexo r")
    , @NamedQuery(name = "Recsexo.findByIdsexo", query = "SELECT r FROM Recsexo r WHERE r.idsexo = :idsexo")
    , @NamedQuery(name = "Recsexo.findByNome", query = "SELECT r FROM Recsexo r WHERE r.nome = :nome")})
public class Recsexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idsexo;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsexoparentesco")
    private List<Recpaciente> recpacienteList;
    @OneToMany(mappedBy = "idsexopaciente")
    private List<Recpaciente> recpacienteList1;

    public Recsexo() {
    }

    public Recsexo(Integer idsexo) {
        this.idsexo = idsexo;
    }

    public Recsexo(Integer idsexo, String nome) {
        this.idsexo = idsexo;
        this.nome = nome;
    }

    public Integer getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(Integer idsexo) {
        this.idsexo = idsexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    @XmlTransient
    public List<Recpaciente> getRecpacienteList1() {
        return recpacienteList1;
    }

    public void setRecpacienteList1(List<Recpaciente> recpacienteList1) {
        this.recpacienteList1 = recpacienteList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsexo != null ? idsexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recsexo)) {
            return false;
        }
        Recsexo other = (Recsexo) object;
        if ((this.idsexo == null && other.idsexo != null) || (this.idsexo != null && !this.idsexo.equals(other.idsexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Recsexo[ idsexo=" + idsexo + " ]";
    }

}
