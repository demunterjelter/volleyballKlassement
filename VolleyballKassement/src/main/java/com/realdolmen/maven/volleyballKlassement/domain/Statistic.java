/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.volleyballKlassement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author demun
 */
@Entity
public class Statistic {
     @Id
     @GeneratedValue
     private Long id;
     
     private int aantalWedstrijden;
     
     public Statistic(){
     }
}
