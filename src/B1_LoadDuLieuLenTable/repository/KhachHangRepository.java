/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_LoadDuLieuLenTable.repository;

import java.util.ArrayList;
import B1_LoadDuLieuLenTable.entity.KhachHang;
import java.sql.*; // IMPORT TAT CA THU VIEN TRONG SQL 

/**
 *
 * @author hangnt
 */
public class KhachHangRepository {
    // CRUD:
    // CREATE - READ  - UPDATE - DELETE
    // Insert into - SELECT- UPDATE - DELETE

    public ArrayList<KhachHang> getAll() {
        // B1: Viet cau SQL 
        String sql = "SELECT [ma]\n"
                + "      ,[ten]\n"
                + "      ,[tuoi]\n"
                + "      ,[gioi_tinh]\n"
                + "      ,[loai]\n"
                + "  FROM [dbo].[khach_hang]";
        ArrayList<KhachHang> lists = new ArrayList<>();
        // Code 
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { // Doc tung dong 
                // tao 1 doi tuong 
                KhachHang kh = new KhachHang();
                kh.setMa(rs.getString(1));
                kh.setTen(rs.getString(2));
                kh.setTuoi(rs.getInt(3));
                kh.setGioiTinh(rs.getBoolean(4));
                kh.setLoai(rs.getString(5));
                // add vao list 
                lists.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    public static void main(String[] args) {
        ArrayList<KhachHang> lists = new KhachHangRepository().getAll();
        for (KhachHang kh : lists) {
            System.out.println(kh.toString());
        }
    }
}
