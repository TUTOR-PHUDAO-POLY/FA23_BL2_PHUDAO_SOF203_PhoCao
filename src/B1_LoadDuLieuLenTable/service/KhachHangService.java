/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_LoadDuLieuLenTable.service;

import java.util.ArrayList;
import B1_LoadDuLieuLenTable.entity.KhachHang;
import B1_LoadDuLieuLenTable.repository.KhachHangRepository;

/**
 *
 * @author hangnt
 */
public class KhachHangService {

    private KhachHangRepository repo = new KhachHangRepository();

    public ArrayList<KhachHang> getAll() {
        return repo.getAll();
    }
}
