/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t600biografia")
@NamedQueries({
    @NamedQuery(name = "T600biografia.findAll", query = "SELECT t FROM T600biografia t")})
public class T600biografia implements Serializable {
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
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @JoinColumn(name = "id_curso", referencedColumnName = "id")
    @ManyToOne
    private T300cursos t300cursos;
    @JoinColumn(name = "id_t900_usuario", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900Usuario;

    public T600biografia() {
    }

    public T600biografia(Long id) {
        this.id = id;
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

    public T300cursos getT300cursos() {
        return t300cursos;
    }

    public void setT300cursos(T300cursos t300cursos) {
        this.t300cursos = t300cursos;
    }

    public T900Usuario getT900Usuario() {
        return t900Usuario;
    }

    public void setT900Usuario(T900Usuario t900Usuario) {
        this.t900Usuario = t900Usuario;
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
        if (!(object instanceof T600biografia)) {
            return false;
        }
        T600biografia other = (T600biografia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T600biografia[ id=" + id + " ]";
    }
    
}
