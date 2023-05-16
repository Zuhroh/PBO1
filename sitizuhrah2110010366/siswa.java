/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitizuhrah2110010366;

/**
 *
 * @author ZUHRAH
 */
public class siswa {
    private String NIS;
    private String nama_siswa;
    private String tmpt_lhr_siswa;
    private java.util.Date tgl_lhr_siswa;
    private String agm_siswa;
    private String jk_siswa;
    private String almt_siswa;
    private String tlp_siswa;
    private String asal_sekolah;
    private int kode_kls;
    private int kondisi;
    private String nama_wali;
    
    public siswa() {}
    
    public void setNIS(String nis){
        this.NIS=nis;
    }
    public String getNIS(){
        return this.NIS;
    }
    
    public void setNamaSiswa(String namasiswa){
        this.nama_siswa=namasiswa;
    }
    public String getNamaSiswa(){
        return this.nama_siswa;
    }
    
    public void setTmptLhrSiswa(String tmptlhrsiswa){
        this.tmpt_lhr_siswa=tmptlhrsiswa;
    }
    public String getTmptLhrSiswa(){
        return this.tmpt_lhr_siswa;
    }
    
    public void setTglLhrSiswa(java.util.Date tgllhrsiswa){
        this.tgl_lhr_siswa=tgllhrsiswa;
    }
    public java.util.Date getTglLhrSiswa(){
        return this.tgl_lhr_siswa;
    }
    
    public void setAgmSiswa(String agmsiswa){
        this.agm_siswa=agmsiswa;
    }
    public String getAgmSiswa(){
        return this.agm_siswa;
    }
    
    public void setJkSiswa(String jksiswa){
        this.jk_siswa=jksiswa;
    }
    public String getJkSiswa(){
        return this.jk_siswa;
    }
    
    public void setAlmtSiswa(String almtsiswa){
        this.almt_siswa=almtsiswa;
    }
    public String getAlmtSiswa(){
        return this.almt_siswa;
    }
    
    public void setTlpSiswa(String tlpsiswa){
        this.tlp_siswa=tlpsiswa;
    }
    public String getTlpSiswa(){
        return this.tlp_siswa;
    }
    
    public void setAsalSekolah(String asalsekolah){
        this.asal_sekolah=asalsekolah;
    }
    public String getAsalSekolah(){
        return this.asal_sekolah;
    }
    
    public void setKodeKls(int kodekls){
        this.kode_kls=kodekls;
    }
    public int getKodeKls(){
        return this.kode_kls;
    }
    
    public void setKondisi(int kondisi){
        this.kondisi=kondisi;
    }
    public int getKondisi(){
        return this.kondisi;
    }
    
    public void setNamaWali(String namawali){
        this.nama_wali=namawali;
    }
    public String getNamaWali(){
        return this.nama_wali;
    }
}
