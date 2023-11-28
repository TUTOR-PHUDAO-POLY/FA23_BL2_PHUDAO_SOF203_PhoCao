/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_LoadDuLieuLenTable.entity;

/**
 *
 * @author hangnt
 */
public class KhachHang {

    private String ma;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private String loai;

    public KhachHang() {
    }

    public KhachHang(String ma, String ten, int tuoi, boolean gioiTinh, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", loai=" + loai + '}';
    }

}
