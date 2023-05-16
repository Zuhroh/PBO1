/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitizuhrah2110010366;

/**
 *
 * @author ZUHRAH
 */
public class jadwalsiswa {
    private int id_jadwal;
    private int kode_kls;
    private int kode_pel;
    private String NIK;
    private String jam_masuk;
    private String hari_masuk;
    
    public jadwalsiswa(){}
    
    public void setIdJadwal(int idjadwal){
        this.id_jadwal=idjadwal;
    }
    public int getIdJadwal(){
        return this.id_jadwal;
    }
    
    public void setKodeKls(int kodekls){
        this.kode_kls=kodekls;
    }
    public int getKodeKls(){
        return this.kode_kls;
    }
    
    public void setKodePel(int kodepel){
        this.kode_pel=kodepel;
    }
    public int getKodePel(){
        return this.kode_pel;
    }
    
    public void setNik(String nik){
        this.NIK=nik;
    }
    public String getNik(){
        return this.NIK;
    }
    
    public void setJamMasuk(String jammasuk){
        this.jam_masuk=jammasuk;
    }
    public String getJamMasuk(){
        return this.jam_masuk;
    }
    
    public void setHariMasuk(String harimasuk){
        this.hari_masuk=harimasuk;
    }
    public String getHariMasuk(){
        return this.hari_masuk;
    }
}
