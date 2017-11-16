/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Toko.BukuJual.Buku;

import com.Toko.BukuJual.entity.Tokobuku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jonathansr
 */
@Repository
public interface PenjualanBuku 
    extends JpaRepository<Tokobuku, String>{
    
}
