/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kafka.api.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mac
 */
@Entity
@Table(name = "events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e"),
    @NamedQuery(name = "Events.findById", query = "SELECT e FROM Events e WHERE e.id = :id"),
    @NamedQuery(name = "Events.findByProcessId", query = "SELECT e FROM Events e WHERE e.processId = :processId"),
    @NamedQuery(name = "Events.findByDlNumber", query = "SELECT e FROM Events e WHERE e.dlNumber = :dlNumber"),
    @NamedQuery(name = "Events.findByDealerId", query = "SELECT e FROM Events e WHERE e.dealerId = :dealerId"),
    @NamedQuery(name = "Events.findByCreated", query = "SELECT e FROM Events e WHERE e.created = :created"),
    @NamedQuery(name = "Events.findByCreatedBy", query = "SELECT e FROM Events e WHERE e.createdBy = :createdBy")})
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_id")
    private long processId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dl_number")
    private long dlNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dealer_id")
    private long dealerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "created_by")
    private BigInteger createdBy;

    public Events() {
    }

    public Events(Integer id) {
        this.id = id;
    }

    public Events(Integer id, long processId, long dlNumber, long dealerId, Date created) {
        this.id = id;
        this.processId = processId;
        this.dlNumber = dlNumber;
        this.dealerId = dealerId;
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getProcessId() {
        return processId;
    }

    public void setProcessId(long processId) {
        this.processId = processId;
    }

    public long getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(long dlNumber) {
        this.dlNumber = dlNumber;
    }

    public long getDealerId() {
        return dealerId;
    }

    public void setDealerId(long dealerId) {
        this.dealerId = dealerId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigInteger getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigInteger createdBy) {
        this.createdBy = createdBy;
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
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kafka.api.model.Events[ id=" + id + " ]";
    }
    
}
