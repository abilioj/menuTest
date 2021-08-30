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
    @NamedQuery(name = "Tgbanco.findAll", query = "SELECT t FROM Tgbanco t")
    , @NamedQuery(name = "Tgbanco.findByIdtgbanco", query = "SELECT t FROM Tgbanco t WHERE t.idtgbanco = :idtgbanco")
    , @NamedQuery(name = "Tgbanco.findByCod", query = "SELECT t FROM Tgbanco t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgbanco.findByNome", query = "SELECT t FROM Tgbanco t WHERE t.nome = :nome")})
public class Tgbanco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgbanco;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cod;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @OneToMany(mappedBy = "idtgbanco")
    private List<Recpaciente> recpacienteList;

    public Tgbanco() {
    }

    public Tgbanco(Integer idtgbanco) {
        this.idtgbanco = idtgbanco;
    }

    public Tgbanco(Integer idtgbanco, int cod, String nome) {
        this.idtgbanco = idtgbanco;
        this.cod = cod;
        this.nome = nome;
    }

    public Integer getIdtgbanco() {
        return idtgbanco;
    }

    public void setIdtgbanco(Integer idtgbanco) {
        this.idtgbanco = idtgbanco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgbanco != null ? idtgbanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgbanco)) {
            return false;
        }
        Tgbanco other = (Tgbanco) object;
        if ((this.idtgbanco == null && other.idtgbanco != null) || (this.idtgbanco != null && !this.idtgbanco.equals(other.idtgbanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgbanco[ idtgbanco=" + idtgbanco + " ]";
    }

}
