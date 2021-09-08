package br.com.menuTest.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author AJF
 */
@Entity
public class Tgibgemacroregiao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgibgemacroregiao;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cod;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @JoinColumn(name = "idtgibgemesoregiao", referencedColumnName = "idtgibgemesoregiao", nullable = false)
    @ManyToOne(optional = false)
    private Tgibgemesoregiao idtgibgemesoregiao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgemacroregiao")
    private List<Tgibgemunicipio> tgibgemunicipioList;

    public Tgibgemacroregiao() {
    }

    public Tgibgemacroregiao(Integer idtgibgemacroregiao) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
    }

    public Tgibgemacroregiao(Integer idtgibgemacroregiao, int cod, String nome) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
        this.cod = cod;
        this.nome = nome;
    }

    public Integer getIdtgibgemacroregiao() {
        return idtgibgemacroregiao;
    }

    public void setIdtgibgemacroregiao(Integer idtgibgemacroregiao) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
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

    public Tgibgemesoregiao getIdtgibgemesoregiao() {
        return idtgibgemesoregiao;
    }

    public void setIdtgibgemesoregiao(Tgibgemesoregiao idtgibgemesoregiao) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
    }

    public List<Tgibgemunicipio> getTgibgemunicipioList() {
        return tgibgemunicipioList;
    }

    public void setTgibgemunicipioList(List<Tgibgemunicipio> tgibgemunicipioList) {
        this.tgibgemunicipioList = tgibgemunicipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgemacroregiao != null ? idtgibgemacroregiao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgemacroregiao)) {
            return false;
        }
        Tgibgemacroregiao other = (Tgibgemacroregiao) object;
        if ((this.idtgibgemacroregiao == null && other.idtgibgemacroregiao != null) || (this.idtgibgemacroregiao != null && !this.idtgibgemacroregiao.equals(other.idtgibgemacroregiao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgibgemacroregiao[ idtgibgemacroregiao=" + idtgibgemacroregiao + " ]";
    }

}
