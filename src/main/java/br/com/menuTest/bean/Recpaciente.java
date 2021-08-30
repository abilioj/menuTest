/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AJF
 */
@Entity
@Table(catalog = "whosp", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recpaciente.findAll", query = "SELECT r FROM Recpaciente r")
    , @NamedQuery(name = "Recpaciente.findByIdpaciente", query = "SELECT r FROM Recpaciente r WHERE r.idpaciente = :idpaciente")
    , @NamedQuery(name = "Recpaciente.findByApelido", query = "SELECT r FROM Recpaciente r WHERE r.apelido = :apelido")
    , @NamedQuery(name = "Recpaciente.findByCargo", query = "SELECT r FROM Recpaciente r WHERE r.cargo = :cargo")
    , @NamedQuery(name = "Recpaciente.findByCartorio", query = "SELECT r FROM Recpaciente r WHERE r.cartorio = :cartorio")
    , @NamedQuery(name = "Recpaciente.findByCelular", query = "SELECT r FROM Recpaciente r WHERE r.celular = :celular")
    , @NamedQuery(name = "Recpaciente.findByCns", query = "SELECT r FROM Recpaciente r WHERE r.cns = :cns")
    , @NamedQuery(name = "Recpaciente.findByComplementoend", query = "SELECT r FROM Recpaciente r WHERE r.complementoend = :complementoend")
    , @NamedQuery(name = "Recpaciente.findByComplpaciente", query = "SELECT r FROM Recpaciente r WHERE r.complpaciente = :complpaciente")
    , @NamedQuery(name = "Recpaciente.findByCpf", query = "SELECT r FROM Recpaciente r WHERE r.cpf = :cpf")
    , @NamedQuery(name = "Recpaciente.findByCpfparentesco", query = "SELECT r FROM Recpaciente r WHERE r.cpfparentesco = :cpfparentesco")
    , @NamedQuery(name = "Recpaciente.findByDatacadastro", query = "SELECT r FROM Recpaciente r WHERE r.datacadastro = :datacadastro")
    , @NamedQuery(name = "Recpaciente.findByDataemissao", query = "SELECT r FROM Recpaciente r WHERE r.dataemissao = :dataemissao")
    , @NamedQuery(name = "Recpaciente.findByDatanascimento", query = "SELECT r FROM Recpaciente r WHERE r.datanascimento = :datanascimento")
    , @NamedQuery(name = "Recpaciente.findByDataparentesco", query = "SELECT r FROM Recpaciente r WHERE r.dataparentesco = :dataparentesco")
    , @NamedQuery(name = "Recpaciente.findByDddcelular", query = "SELECT r FROM Recpaciente r WHERE r.dddcelular = :dddcelular")
    , @NamedQuery(name = "Recpaciente.findByDddtelcomercial", query = "SELECT r FROM Recpaciente r WHERE r.dddtelcomercial = :dddtelcomercial")
    , @NamedQuery(name = "Recpaciente.findByDddtelefone", query = "SELECT r FROM Recpaciente r WHERE r.dddtelefone = :dddtelefone")
    , @NamedQuery(name = "Recpaciente.findByDdicelular", query = "SELECT r FROM Recpaciente r WHERE r.ddicelular = :ddicelular")
    , @NamedQuery(name = "Recpaciente.findByDditelcomercial", query = "SELECT r FROM Recpaciente r WHERE r.dditelcomercial = :dditelcomercial")
    , @NamedQuery(name = "Recpaciente.findByDditelefone", query = "SELECT r FROM Recpaciente r WHERE r.dditelefone = :dditelefone")
    , @NamedQuery(name = "Recpaciente.findByDnv", query = "SELECT r FROM Recpaciente r WHERE r.dnv = :dnv")
    , @NamedQuery(name = "Recpaciente.findByDtemissaocart", query = "SELECT r FROM Recpaciente r WHERE r.dtemissaocart = :dtemissaocart")
    , @NamedQuery(name = "Recpaciente.findByEmail", query = "SELECT r FROM Recpaciente r WHERE r.email = :email")
    , @NamedQuery(name = "Recpaciente.findByFolha", query = "SELECT r FROM Recpaciente r WHERE r.folha = :folha")
    , @NamedQuery(name = "Recpaciente.findByIdentidade", query = "SELECT r FROM Recpaciente r WHERE r.identidade = :identidade")
    , @NamedQuery(name = "Recpaciente.findByLivro", query = "SELECT r FROM Recpaciente r WHERE r.livro = :livro")
    , @NamedQuery(name = "Recpaciente.findByLocaltrabalho", query = "SELECT r FROM Recpaciente r WHERE r.localtrabalho = :localtrabalho")
    , @NamedQuery(name = "Recpaciente.findByNome", query = "SELECT r FROM Recpaciente r WHERE r.nome = :nome")
    , @NamedQuery(name = "Recpaciente.findByNomeparentesco", query = "SELECT r FROM Recpaciente r WHERE r.nomeparentesco = :nomeparentesco")
    , @NamedQuery(name = "Recpaciente.findByNomesocial", query = "SELECT r FROM Recpaciente r WHERE r.nomesocial = :nomesocial")
    , @NamedQuery(name = "Recpaciente.findByNumendereco", query = "SELECT r FROM Recpaciente r WHERE r.numendereco = :numendereco")
    , @NamedQuery(name = "Recpaciente.findByNumeroagencia", query = "SELECT r FROM Recpaciente r WHERE r.numeroagencia = :numeroagencia")
    , @NamedQuery(name = "Recpaciente.findByNumeroconta", query = "SELECT r FROM Recpaciente r WHERE r.numeroconta = :numeroconta")
    , @NamedQuery(name = "Recpaciente.findByOrgaoemissor", query = "SELECT r FROM Recpaciente r WHERE r.orgaoemissor = :orgaoemissor")
    , @NamedQuery(name = "Recpaciente.findByRegistrofuncionario", query = "SELECT r FROM Recpaciente r WHERE r.registrofuncionario = :registrofuncionario")
    , @NamedQuery(name = "Recpaciente.findByTelcomercial", query = "SELECT r FROM Recpaciente r WHERE r.telcomercial = :telcomercial")
    , @NamedQuery(name = "Recpaciente.findByTelefone", query = "SELECT r FROM Recpaciente r WHERE r.telefone = :telefone")})
public class Recpaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idpaciente;
    @Column(length = 255)
    private String apelido;
    @Column(length = 255)
    private String cargo;
    @Column(length = 255)
    private String cartorio;
    @Column(length = 255)
    private String celular;
    @Column(length = 255)
    private String cns;
    @Column(length = 255)
    private String complementoend;
    @Column(length = 255)
    private String complpaciente;
    @Column(length = 255)
    private String cpf;
    @Column(length = 255)
    private String cpfparentesco;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datacadastro;
    @Temporal(TemporalType.DATE)
    private Date dataemissao;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Temporal(TemporalType.DATE)
    private Date dataparentesco;
    @Column(length = 255)
    private String dddcelular;
    @Column(length = 255)
    private String dddtelcomercial;
    @Column(length = 255)
    private String dddtelefone;
    @Column(length = 255)
    private String ddicelular;
    @Column(length = 255)
    private String dditelcomercial;
    @Column(length = 255)
    private String dditelefone;
    @Column(length = 255)
    private String dnv;
    @Temporal(TemporalType.DATE)
    private Date dtemissaocart;
    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String folha;
    @Column(length = 255)
    private String identidade;
    @Column(length = 255)
    private String livro;
    @Column(length = 255)
    private String localtrabalho;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @Column(length = 255)
    private String nomeparentesco;
    @Column(length = 255)
    private String nomesocial;
    @Column(length = 255)
    private String numendereco;
    @Column(length = 255)
    private String numeroagencia;
    @Column(length = 255)
    private String numeroconta;
    @Column(length = 255)
    private String orgaoemissor;
    @Column(length = 255)
    private String registrofuncionario;
    @Column(length = 255)
    private String telcomercial;
    @Column(length = 255)
    private String telefone;
    @JoinColumn(name = "idtgclasseecon", referencedColumnName = "idtgclasseecon")
    @ManyToOne
    private Tgclasseecon idtgclasseecon;
    @JoinColumn(name = "idsexoparentesco", referencedColumnName = "idsexo", nullable = false)
    @ManyToOne(optional = false)
    private Recsexo idsexoparentesco;
    @JoinColumn(name = "idsexopaciente", referencedColumnName = "idsexo")
    @ManyToOne
    private Recsexo idsexopaciente;
    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade", nullable = false)
    @ManyToOne(optional = false)
    private Tgunidade idunidade;
    @JoinColumn(name = "idtbnacionalidade", referencedColumnName = "idtbnacionalidade")
    @ManyToOne
    private Tbnacionalidade idtbnacionalidade;
    @JoinColumn(name = "idtgbanco", referencedColumnName = "idtgbanco")
    @ManyToOne
    private Tgbanco idtgbanco;
    @JoinColumn(name = "idcep", referencedColumnName = "cep")
    @ManyToOne
    private Tgcep idcep;
    @JoinColumn(name = "idtgetnia", referencedColumnName = "idtgetnia", nullable = false)
    @ManyToOne(optional = false)
    private Tgetnia idtgetnia;
    @JoinColumn(name = "idtggrauinstrucao", referencedColumnName = "idtggrauinstrucao")
    @ManyToOne
    private Tggrauinstrucao idtggrauinstrucao;
    @JoinColumn(name = "idtgvinculoemprego", referencedColumnName = "idtgvinculoemprego")
    @ManyToOne
    private Tgvinculoemprego idtgvinculoemprego;
    @JoinColumn(name = "ididtgreligiao", referencedColumnName = "idtgreligiao", nullable = false)
    @ManyToOne(optional = false)
    private Tgreligiao ididtgreligiao;
    @JoinColumn(name = "idtnaturalidade", referencedColumnName = "idtgibgemunicipio")
    @ManyToOne
    private Tgibgemunicipio idtnaturalidade;
    @JoinColumn(name = "idtgparentesco", referencedColumnName = "idtgparentesco")
    @ManyToOne
    private Tgparentesco idtgparentesco;
    @JoinColumn(name = "idtgprofissaocbo", referencedColumnName = "idtgprofissaocbo")
    @ManyToOne
    private Tgprofissaocbo idtgprofissaocbo;

    public Recpaciente() {
    }

    public Recpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Recpaciente(Integer idpaciente, Date datacadastro, Date datanascimento, String nome) {
        this.idpaciente = idpaciente;
        this.datacadastro = datacadastro;
        this.datanascimento = datanascimento;
        this.nome = nome;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getComplementoend() {
        return complementoend;
    }

    public void setComplementoend(String complementoend) {
        this.complementoend = complementoend;
    }

    public String getComplpaciente() {
        return complpaciente;
    }

    public void setComplpaciente(String complpaciente) {
        this.complpaciente = complpaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpfparentesco() {
        return cpfparentesco;
    }

    public void setCpfparentesco(String cpfparentesco) {
        this.cpfparentesco = cpfparentesco;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Date getDataparentesco() {
        return dataparentesco;
    }

    public void setDataparentesco(Date dataparentesco) {
        this.dataparentesco = dataparentesco;
    }

    public String getDddcelular() {
        return dddcelular;
    }

    public void setDddcelular(String dddcelular) {
        this.dddcelular = dddcelular;
    }

    public String getDddtelcomercial() {
        return dddtelcomercial;
    }

    public void setDddtelcomercial(String dddtelcomercial) {
        this.dddtelcomercial = dddtelcomercial;
    }

    public String getDddtelefone() {
        return dddtelefone;
    }

    public void setDddtelefone(String dddtelefone) {
        this.dddtelefone = dddtelefone;
    }

    public String getDdicelular() {
        return ddicelular;
    }

    public void setDdicelular(String ddicelular) {
        this.ddicelular = ddicelular;
    }

    public String getDditelcomercial() {
        return dditelcomercial;
    }

    public void setDditelcomercial(String dditelcomercial) {
        this.dditelcomercial = dditelcomercial;
    }

    public String getDditelefone() {
        return dditelefone;
    }

    public void setDditelefone(String dditelefone) {
        this.dditelefone = dditelefone;
    }

    public String getDnv() {
        return dnv;
    }

    public void setDnv(String dnv) {
        this.dnv = dnv;
    }

    public Date getDtemissaocart() {
        return dtemissaocart;
    }

    public void setDtemissaocart(Date dtemissaocart) {
        this.dtemissaocart = dtemissaocart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFolha() {
        return folha;
    }

    public void setFolha(String folha) {
        this.folha = folha;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getLocaltrabalho() {
        return localtrabalho;
    }

    public void setLocaltrabalho(String localtrabalho) {
        this.localtrabalho = localtrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeparentesco() {
        return nomeparentesco;
    }

    public void setNomeparentesco(String nomeparentesco) {
        this.nomeparentesco = nomeparentesco;
    }

    public String getNomesocial() {
        return nomesocial;
    }

    public void setNomesocial(String nomesocial) {
        this.nomesocial = nomesocial;
    }

    public String getNumendereco() {
        return numendereco;
    }

    public void setNumendereco(String numendereco) {
        this.numendereco = numendereco;
    }

    public String getNumeroagencia() {
        return numeroagencia;
    }

    public void setNumeroagencia(String numeroagencia) {
        this.numeroagencia = numeroagencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getOrgaoemissor() {
        return orgaoemissor;
    }

    public void setOrgaoemissor(String orgaoemissor) {
        this.orgaoemissor = orgaoemissor;
    }

    public String getRegistrofuncionario() {
        return registrofuncionario;
    }

    public void setRegistrofuncionario(String registrofuncionario) {
        this.registrofuncionario = registrofuncionario;
    }

    public String getTelcomercial() {
        return telcomercial;
    }

    public void setTelcomercial(String telcomercial) {
        this.telcomercial = telcomercial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Tgclasseecon getIdtgclasseecon() {
        return idtgclasseecon;
    }

    public void setIdtgclasseecon(Tgclasseecon idtgclasseecon) {
        this.idtgclasseecon = idtgclasseecon;
    }

    public Recsexo getIdsexoparentesco() {
        return idsexoparentesco;
    }

    public void setIdsexoparentesco(Recsexo idsexoparentesco) {
        this.idsexoparentesco = idsexoparentesco;
    }

    public Recsexo getIdsexopaciente() {
        return idsexopaciente;
    }

    public void setIdsexopaciente(Recsexo idsexopaciente) {
        this.idsexopaciente = idsexopaciente;
    }

    public Tgunidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Tgunidade idunidade) {
        this.idunidade = idunidade;
    }

    public Tbnacionalidade getIdtbnacionalidade() {
        return idtbnacionalidade;
    }

    public void setIdtbnacionalidade(Tbnacionalidade idtbnacionalidade) {
        this.idtbnacionalidade = idtbnacionalidade;
    }

    public Tgbanco getIdtgbanco() {
        return idtgbanco;
    }

    public void setIdtgbanco(Tgbanco idtgbanco) {
        this.idtgbanco = idtgbanco;
    }

    public Tgcep getIdcep() {
        return idcep;
    }

    public void setIdcep(Tgcep idcep) {
        this.idcep = idcep;
    }

    public Tgetnia getIdtgetnia() {
        return idtgetnia;
    }

    public void setIdtgetnia(Tgetnia idtgetnia) {
        this.idtgetnia = idtgetnia;
    }

    public Tggrauinstrucao getIdtggrauinstrucao() {
        return idtggrauinstrucao;
    }

    public void setIdtggrauinstrucao(Tggrauinstrucao idtggrauinstrucao) {
        this.idtggrauinstrucao = idtggrauinstrucao;
    }

    public Tgvinculoemprego getIdtgvinculoemprego() {
        return idtgvinculoemprego;
    }

    public void setIdtgvinculoemprego(Tgvinculoemprego idtgvinculoemprego) {
        this.idtgvinculoemprego = idtgvinculoemprego;
    }

    public Tgreligiao getIdidtgreligiao() {
        return ididtgreligiao;
    }

    public void setIdidtgreligiao(Tgreligiao ididtgreligiao) {
        this.ididtgreligiao = ididtgreligiao;
    }

    public Tgibgemunicipio getIdtnaturalidade() {
        return idtnaturalidade;
    }

    public void setIdtnaturalidade(Tgibgemunicipio idtnaturalidade) {
        this.idtnaturalidade = idtnaturalidade;
    }

    public Tgparentesco getIdtgparentesco() {
        return idtgparentesco;
    }

    public void setIdtgparentesco(Tgparentesco idtgparentesco) {
        this.idtgparentesco = idtgparentesco;
    }

    public Tgprofissaocbo getIdtgprofissaocbo() {
        return idtgprofissaocbo;
    }

    public void setIdtgprofissaocbo(Tgprofissaocbo idtgprofissaocbo) {
        this.idtgprofissaocbo = idtgprofissaocbo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recpaciente)) {
            return false;
        }
        Recpaciente other = (Recpaciente) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Recpaciente[ idpaciente=" + idpaciente + " ]";
    }

}
