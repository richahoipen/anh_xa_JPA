package entities;



import java.util.Objects;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "CTDonDatHang")
public class CTDonDatHang
{
	@Id
	@Column(name = "sTT", length = 100,nullable = false)
	private int sTT;
	@Column(name = "donGia", length = 100,nullable = true)
	private double donGia;
	@Column(name = "soLuong", length = 100,nullable = true)
	private int soLuong;
	@Column(name = "thanhTien", length = 100,nullable = true)
	private double thanhTien;
	@Column(name = "maSP", length = 100, columnDefinition = "nvarchar(50)",nullable = true)
	private String maSP;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	//Nối SanPham 
	
	@ManyToOne
    @JoinColumn(name = "maDDH",nullable = true)
	private DonDatHang donDatHang;

	public int getsTT() {
		return sTT;
	}
	public void setsTT(int sTT) {
		this.sTT = sTT;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public DonDatHang getDonDatHang() {
		return donDatHang;
	}
	public void setDonDatHang(DonDatHang donDatHang) {
		this.donDatHang = donDatHang;
	}
	public CTDonDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CTDonDatHang(int sTT, double donGia, int soLuong, double thanhTien,String maSP) {
		super();
		this.sTT = sTT;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
		this.maSP = maSP;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sTT);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CTDonDatHang other = (CTDonDatHang) obj;
		return sTT == other.sTT;
	}
	public CTDonDatHang(double donGia, int soLuong, double thanhTien, String maSP) {
		super();
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
		this.maSP = maSP;
	}
	
	
	
}
