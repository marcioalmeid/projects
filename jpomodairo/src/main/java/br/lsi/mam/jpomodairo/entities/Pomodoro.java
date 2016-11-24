/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lsi.mam.jpomodairo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcioam
 */
@Entity
@Table(name = "pomodoro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pomodoro.findAll", query = "SELECT p FROM Pomodoro p")
    , @NamedQuery(name = "Pomodoro.findById", query = "SELECT p FROM Pomodoro p WHERE p.id = :id")
    , @NamedQuery(name = "Pomodoro.findByName", query = "SELECT p FROM Pomodoro p WHERE p.name = :name")
    , @NamedQuery(name = "Pomodoro.findByType", query = "SELECT p FROM Pomodoro p WHERE p.type = :type")
    , @NamedQuery(name = "Pomodoro.findByPomodoros", query = "SELECT p FROM Pomodoro p WHERE p.pomodoros = :pomodoros")
    , @NamedQuery(name = "Pomodoro.findByUnplanned", query = "SELECT p FROM Pomodoro p WHERE p.unplanned = :unplanned")
    , @NamedQuery(name = "Pomodoro.findByInterruptions", query = "SELECT p FROM Pomodoro p WHERE p.interruptions = :interruptions")
    , @NamedQuery(name = "Pomodoro.findByCreated", query = "SELECT p FROM Pomodoro p WHERE p.created = :created")
    , @NamedQuery(name = "Pomodoro.findByClosed", query = "SELECT p FROM Pomodoro p WHERE p.closed = :closed")
    , @NamedQuery(name = "Pomodoro.findByParent", query = "SELECT p FROM Pomodoro p WHERE p.parent = :parent")
    , @NamedQuery(name = "Pomodoro.findByVisible", query = "SELECT p FROM Pomodoro p WHERE p.visible = :visible")
    , @NamedQuery(name = "Pomodoro.findByOrdinal", query = "SELECT p FROM Pomodoro p WHERE p.ordinal = :ordinal")
    , @NamedQuery(name = "Pomodoro.findByDone", query = "SELECT p FROM Pomodoro p WHERE p.done = :done")
    , @NamedQuery(name = "Pomodoro.findByEstimated", query = "SELECT p FROM Pomodoro p WHERE p.estimated = :estimated")})
public class Pomodoro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "pomodoros")
    private Integer pomodoros;
    @Column(name = "unplanned")
    private Integer unplanned;
    @Column(name = "interruptions")
    private Integer interruptions;
    @Column(name = "created")
    private String created;
    @Column(name = "closed")
    private String closed;
    @Column(name = "parent")
    private Integer parent;
    @Column(name = "visible")
    private Integer visible;
    @Column(name = "ordinal")
    private Integer ordinal;
    @Column(name = "done")
    private Integer done;
    @Column(name = "estimated")
    private Integer estimated;

    public Pomodoro() {
    }

    public Pomodoro(Integer id) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPomodoros() {
        return pomodoros;
    }

    public void setPomodoros(Integer pomodoros) {
        this.pomodoros = pomodoros;
    }

    public Integer getUnplanned() {
        return unplanned;
    }

    public void setUnplanned(Integer unplanned) {
        this.unplanned = unplanned;
    }

    public Integer getInterruptions() {
        return interruptions;
    }

    public void setInterruptions(Integer interruptions) {
        this.interruptions = interruptions;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public Integer getDone() {
        return done;
    }

    public void setDone(Integer done) {
        this.done = done;
    }

    public Integer getEstimated() {
        return estimated;
    }

    public void setEstimated(Integer estimated) {
        this.estimated = estimated;
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
        if (!(object instanceof Pomodoro)) {
            return false;
        }
        Pomodoro other = (Pomodoro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.lsi.mam.jpomodairo.entities.Pomodoro[ id=" + id + " ]";
    }
    
}
