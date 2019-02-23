/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplicationtrackingsystem;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ysfdnmz
 */
@Entity
@Table(name = "APPLICANTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applicants.findAll", query = "SELECT a FROM Applicants a")
    , @NamedQuery(name = "Applicants.findById", query = "SELECT a FROM Applicants a WHERE a.id = :id")
    , @NamedQuery(name = "Applicants.findByName", query = "SELECT a FROM Applicants a WHERE a.name = :name")
    , @NamedQuery(name = "Applicants.findBySurname", query = "SELECT a FROM Applicants a WHERE a.surname = :surname")
    , @NamedQuery(name = "Applicants.findByApplicationtext", query = "SELECT a FROM Applicants a WHERE a.applicationtext = :applicationtext")})
public class Applicants implements Serializable {

    @Column(name = "FLAG")
    private Integer flag;

    @Column(name = "GENDER")
    private String gender;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "APPLICATIONPOSITION")
    private String applicationposition;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "APPLICATIONTEXT")
    private String applicationtext;

    public Applicants() {
    }

    public Applicants(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getApplicationtext() {
        return applicationtext;
    }

    public void setApplicationtext(String applicationtext) {
        this.applicationtext = applicationtext;
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
        if (!(object instanceof Applicants)) {
            return false;
        }
        Applicants other = (Applicants) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jobapplicationtrackingsystem.Applicants[ id=" + id + " ]";
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getApplicationposition() {
        return applicationposition;
    }

    public void setApplicationposition(String applicationposition) {
        this.applicationposition = applicationposition;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
    
}
