package br.com.saaes.modelo;

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
import javax.validation.constraints.NotNull;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t600bibliografia")
@NamedQueries({
    @NamedQuery(name = "T600bibliografia.findAll", query = "SELECT t FROM T600bibliografia t")})
public class T600bibliografia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "media_basica")
    private Integer mediaBasica;
    @Column(name = "media_completa")
    private Integer mediaCompleta;
    @Column(name = "qnt_disciplina")
    private Integer qntDisciplina;
    @Column(name = "qnt_basica")
    private Integer qntBasica;
    @Column(name = "qnt_completa")
    private Integer qntCompleta;
    @Column(name = "periodico")
    private Integer periodico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @JoinColumn(name = "id_t900_usuario", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario T900Usuario;
    @JoinColumn(name = "id_curso", referencedColumnName = "id")
    @ManyToOne
    private T300cursos t300cursos;

    public T600bibliografia() {
    }

    public T600bibliografia(Long id) {
        this.id = id;
    }

    public T600bibliografia(Long id, Date dtCadastro) {
        this.id = id;
        this.dtCadastro = dtCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMediaBasica() {
        return mediaBasica;
    }

    public void setMediaBasica(Integer mediaBasica) {
        this.mediaBasica = mediaBasica;
    }

    public Integer getMediaCompleta() {
        return mediaCompleta;
    }

    public void setMediaCompleta(Integer mediaCompleta) {
        this.mediaCompleta = mediaCompleta;
    }

    public Integer getQntDisciplina() {
        return qntDisciplina;
    }

    public void setQntDisciplina(Integer qntDisciplina) {
        this.qntDisciplina = qntDisciplina;
    }

    public Integer getQntBasica() {
        return qntBasica;
    }

    public void setQntBasica(Integer qntBasica) {
        this.qntBasica = qntBasica;
    }

    public Integer getQntCompleta() {
        return qntCompleta;
    }

    public void setQntCompleta(Integer qntCompleta) {
        this.qntCompleta = qntCompleta;
    }

    public Integer getPeriodico() {
        return periodico;
    }

    public void setPeriodico(Integer periodico) {
        this.periodico = periodico;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public T900Usuario getT900Usuario() {
        return T900Usuario;
    }

    public void setT900Usuario(T900Usuario T900Usuario) {
        this.T900Usuario = T900Usuario;
    }

    public T300cursos getT300cursos() {
        return t300cursos;
    }

    public void setT300cursos(T300cursos t300cursos) {
        this.t300cursos = t300cursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T600bibliografia)) {
            return false;
        }
        T600bibliografia other = (T600bibliografia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T600bibliografia[ id=" + id + " ]";
    }
    
}
