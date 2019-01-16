/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.volleyballKlassement.domain;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author demun
 */
@Entity
public class Competition {
     @Id
     @GeneratedValue
     private Long id;
     
     private String division;
     private String region;
     
     @ElementCollection
     @CollectionTable(name = "team")
     @Column(name = "team")
      private List<Team> playerList;
      
      public Competition(){
      }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Team> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Team> playerList) {
        this.playerList = playerList;
    }
      
     
}
