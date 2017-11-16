/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Toko.BukuJual.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jonathansr
 */
@Entity
public class Tokobuku {
    @Id
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String JudulBuku;
    @Getter @Setter
    private String Harga;
}
