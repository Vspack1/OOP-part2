public class Student {
    private String MaSV;
    private String HoTen;
    private String NgaySinh;
    private String Lop;
    private double Gpa;
    
    public Student() {
        this.MaSV = "";
        this.HoTen = "";
        this.NgaySinh = "";
        this.Lop = "";
        this.Gpa = 0.0;
    }
    
    public Student(String maSV, String hoTen, String ngaySinh, String lop, double gpa) {
        this.MaSV = maSV;
        this.HoTen = hoTen;
        this.NgaySinh = ngaySinh;
        this.Lop = lop;
        this.Gpa = gpa;
    }
    
    public void chuanHoaTen() {
        String[] words = this.HoTen.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        
        this.HoTen = result.toString().trim();
    }
    
    public void chuanHoaNgSinh() {
        String[] parts = this.NgaySinh.split("/");
        
        if (parts.length == 3) {
            String day = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
            String month = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
            String year = parts[2];
            
            this.NgaySinh = day + "/" + month + "/" + year;
        }
    }
    
    public void printInformation() {
        System.out.println("Mã SV: " + this.MaSV);
        System.out.println("Họ tên: " + this.HoTen);
        System.out.println("Ngày sinh: " + this.NgaySinh);
        System.out.println("Lớp: " + this.Lop);
        System.out.println("GPA: " + this.Gpa);
    }
    
    public String toString() {
        return MaSV + " " + HoTen + " " + NgaySinh + " " + Lop + " " + String.format("%.2f", Gpa);
    }
    
    public String getMaSV() {
        return MaSV;
    }
    
    public void setMaSV(String maSV) {
        this.MaSV = maSV;
    }
    
    public String getHoTen() {
        return HoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }
    
    public String getNgaySinh() {
        return NgaySinh;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.NgaySinh = ngaySinh;
    }
    
    public String getLop() {
        return Lop;
    }
    
    public void setLop(String lop) {
        this.Lop = lop;
    }
    
    public double getGpa() {
        return Gpa;
    }
    
    public void setGpa(double gpa) {
        this.Gpa = gpa;
    }
}