package entities;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DonDatHang")
public class DonDatHang 
{
	@Id
	@Column(name = "maDDH", length = 100, columnDefinition = "varchar(20)",nullable = false)
	private String maDDH;
	@Column(name = "ngayDat", length = 100, columnDefinition = "varchar(20)",nullable = true)
	private Date ngayDat;
	@Column(name = "daLapHoaDon", length = 100,nullable = true)
	private boolean daLapHoaDon;
	
	//Nối với NhanVien
	@ManyToOne
    @JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	@ManyToOne
    @JoinColumn(name = "maKH")
	private KhachHang khachHang;
	//Nối với CTDonDatHang
	@OneToMany(mappedBy = "donDatHang", cascade = CascadeType.ALL)
	List<CTDonDatHang> listCTDonDatHang=new ArrayList<>();
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public List<CTDonDatHang> getListCTDonDatHang() {
		return listCTDonDatHang;
	}
	public void setListCTDonDatHang(List<CTDonDatHang> listCTDonDatHang) {
		this.listCTDonDatHang = listCTDonDatHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	//Các hàm về Date
	public LocalDate getNgayDatLocalDate()
	{
		return ngayDat.toLocalDate();
	}
	public String getNgayDatToString()
	{
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return df.format(getNgayDatLocalDate());
	}
	
	public String getNgayHetHanToString()
	{
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return df.format(getNgayDatLocalDate().plusDays(15));
	}
	@Override
	public int hashCode() {
		return Objects.hash(maDDH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDatHang other = (DonDatHang) obj;
		return Objects.equals(maDDH, other.maDDH);
	}
	public String getMaDDH() {
		return maDDH;
	}
	public void setMaDDH(String maDDH) {
		this.maDDH = maDDH;
	}
	public Date getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public boolean isDaLapHoaDon() {
		return daLapHoaDon;
	}
	public void setDaLapHoaDon(boolean daLapHoaDon) {
		this.daLapHoaDon = daLapHoaDon;
	}
	public DonDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonDatHang(String maDDH, Date ngayDat,boolean daLapHoaDon) {
		super();
		this.maDDH = maDDH;
		this.ngayDat = ngayDat;
		this.daLapHoaDon=daLapHoaDon;
	}
	
}
