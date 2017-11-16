/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Toko.BukuJual.controller;

import com.Toko.BukuJual.entity.Tokobuku;
import com.Toko.BukuJual.Buku.PenjualanBuku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jonathansr
 */
@Controller
public class WebController {
    @Autowired
    private PenjualanBuku Buku;
    
    @RequestMapping("/dataBuku")
    public void datamhs(Model model) {
        model.addAttribute("dataBuku", Buku.findAll());
    }
    
    @RequestMapping(value ="/tambah", method = RequestMethod.GET)
    public void addData(@ModelAttribute("Buku") PenjualanBuku Buku, BindingResult bind){}
    
    @RequestMapping(value = "/tambah", method = RequestMethod.POST)
    public void addDataProcessing(@ModelAttribute("Buku") PenjualanBuku Buku, BindingResult bind){
        System.out.println(Buku.getid());
        System.out.println(Buku.getJudulBuku());
        System.out.println(Buku.getHarga());
        // proses simpan data
        PenjualanBuku.save(Buku);
    }
    
    @RequestMapping("/hapus")
    public String hapusData(@RequestParam("id") String id){
        PenjualanBuku.delete(id);
        return "redirect:datamhs";
    }
    
    @RequestMapping(value = "/ubah", method = RequestMethod.GET)
    public void getubahdata(@RequestParam("id") String id, Model model){
        PenjualanBuku data = PenjualanBuku.findOne(id);
        model.addAttribute("Buku", data);
    }
    
    @RequestMapping(value = "/ubah", method = RequestMethod.POST)
    public String saveubahdata(@ModelAttribute("Buku") PenjualanBuku Buku, BindingResult result){
        System.out.println("id : " + Buku.getid());
        System.out.println("JudulBuku : " + Buku.getJudulBuku());
        System.out.println("Harga : " + Buku.getHarga());
        PenjualanBuku.save(Buku);
        return "redirect:datamhs";
    }
    
}