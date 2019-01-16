/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.volleyballKlassement.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author demun
 */
@Entity
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    
    private Team thuisPloeg;
    private Team uitPloeg;
    
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date birthDate;
    
    public Game(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getThuisPloeg() {
        return thuisPloeg;
    }

    public void setThuisPloeg(Team thuisPloeg) {
        this.thuisPloeg = thuisPloeg;
    }

    public Team getUitPloeg() {
        return uitPloeg;
    }

    public void setUitPloeg(Team uitPloeg) {
        this.uitPloeg = uitPloeg;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}
