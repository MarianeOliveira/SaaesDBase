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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t600bibliografia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T600bibliografia.findAll", query = "SELECT t FROM T600bibliografia t")})
public class T600bibliografia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Column(name = "media_basica")
    private Integer mediaBasica;
    @Column(name = "media_completa")
    private Integer mediaCompleta;
    @Column(name = "periodico")
    private Integer periodico;
    @Column(name = "qnt_basica")
    private Integer qntBasica;
    @Column(name = "qnt_completa")
    private Integer qntCompleta;
    @Column(name = "qnt_disciplina")
    private Integer qntDisciplina;
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900UsuarioId;
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "id")
    @ManyToOne
    private T300cursos t300CursoId;

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

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
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

    public Integer getPeriodico() {
        return periodico;
    }

    public void setPeriodico(Integer periodico) {
        this.periodico = periodico;
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

    public Integer getQntDisciplina() {
        return qntDisciplina;
    }

    public void setQntDisciplina(Integer qntDisciplina) {
        this.qntDisciplina = qntDisciplina;
    }

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
    }

    public T300cursos getT300CursoId() {
        return t300CursoId;
    }

    public void setT300CursoId(T300cursos t300CursoId) {
        this.t300CursoId = t300CursoId;
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
