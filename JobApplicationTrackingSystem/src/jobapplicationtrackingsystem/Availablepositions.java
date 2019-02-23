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
@Table(name = "AVAILABLEPOSITIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Availablepositions.findAll", query = "SELECT a FROM Availablepositions a")
    , @NamedQuery(name = "Availablepositions.findById", query = "SELECT a FROM Availablepositions a WHERE a.id = :id")
    , @NamedQuery(name = "Availablepositions.findByPosition", query = "SELECT a FROM Availablepositions a WHERE a.position = :position")})
public class Availablepositions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "POSITION")
    private String position;

    public Availablepositions() {
    }

    public Availablepositions(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        if (!(object instanceof Availablepositions)) {
            return false;
        }
        Availablepositions other = (Availablepositions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jobapplicationtrackingsystem.Availablepositions[ id=" + id + " ]";
    }
    
}
