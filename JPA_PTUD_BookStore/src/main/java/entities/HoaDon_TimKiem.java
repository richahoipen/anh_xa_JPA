package entities;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
public class HoaDon_TimKiem {
	private String maHD, tenKH, tenNV,sdt;
	private Date ngayLap;
	private double tongTien;
	//hàm ngày tháng
	public LocalDate getNgayLapLocalDate()
	{
		return ngayLap.toLocalDate();
	}
	public String getNgayLapToString()
	{
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return df.format(getNgayLapLocalDate());
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon_TimKiem other = (HoaDon_TimKiem) obj;
		return Objects.equals(maHD, other.maHD);
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public HoaDon_TimKiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon_TimKiem(String maHD, String tenKH, String tenNV, Date ngayLap, double tongTien,String sdt) {
		super();
		this.maHD = maHD;
		this.tenKH = tenKH;
		this.tenNV = tenNV;
		this.sdt=sdt;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "HoaDon_TimKiem [maHD=" + maHD + ", tenKH=" + tenKH + ", tenNV=" + tenNV + ", sdt=" + sdt + ", ngayLap="
				+ ngayLap + ", tongTien=" + tongTien + "]";
	}
	
}
