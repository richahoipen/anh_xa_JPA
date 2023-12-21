package entities;



import java.util.Objects;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CTHoaDon")
public class CTHoaDon {

	@Id
	@Column(name = "sTT", length = 100,nullable = false)
	private int sTT;
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
		CTHoaDon other = (CTHoaDon) obj;
		return sTT == other.sTT;
	}

	public int getsTT() {
		return sTT;
	}

	public void setsTT(int sTT) {
		this.sTT = sTT;
	}
	@Column(name = "donGia", length = 100, nullable = true)
	private double donGia;
	@Column(name = "soLuong", length = 100, nullable = true)
	private int soLuong;
	@Column(name = "thanhTien", length = 100, nullable = true)
	private double thanhTien;
	@Column(name = "maSP", length = 100, columnDefinition = "nvarchar(50)",nullable = true)
	private String maSP;
	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	// Nối CTHoaDon và HoaDon
	@ManyToOne
	@JoinColumn(name = "maHD")
	private HoaDon hoaDon;

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

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public CTHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CTHoaDon(int sTT,String maSP,double donGia, int soLuong, double thanhTien) {
		super();
		this.sTT = sTT;
		this.maSP=maSP;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;	
	}

}
