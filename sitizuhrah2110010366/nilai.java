/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitizuhrah2110010366;

/**
 *
 * @author ZUHRAH
 */
public class nilai {
    private int kode_kls;
    private String NIS;
    private String NIK;
    private int kode_pel;
    private int nil_uts;
    private int nil_uas;
    private int nil_tgs;
    private int absen;
    
    public nilai(){}
    
    public void setKodeKls(int kodekls){
        this.kode_kls=kodekls;
    }
    public int getKodeKls(){
        return this.kode_kls;
    }
    
    public void setNIS(String nis){
        this.NIS=nis;
    }
    public String getNIS(){
        return this.NIK;
    }
    
    public void setNIK(String nik){
        this.NIK=nik;
    }
    public String getNIK(){
        return this.NIK;
    }
    
    public void setKodePel(int kodepel){
        this.kode_pel=kodepel;
    }
    public int getKodePel(){
        return this.kode_pel;
    }
    
    public void setNilUTS(int niluts){
        this.nil_uts=niluts;
    }
    public int getNilUTS(){
        return this.nil_uts;
    }
    
    public void setNilUAS(int niluas){
        this.nil_uas=niluas;
    }
    public int getNilUAS(){
        return this.nil_uas;
    }
    
    public void setNilTgs(int niltgs){
        this.nil_tgs=niltgs;
    }
    public int getNilTgs(){
        return this.nil_tgs;
    }
    
    public void setAbsen(int absen){
        this.absen=absen;
    }
    public int getAbsen(){
        return this.absen;
    }
}
