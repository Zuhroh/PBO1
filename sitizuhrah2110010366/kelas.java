/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitizuhrah2110010366;

/**
 *
 * @author ZUHRAH
 */
public class kelas {
    private int kode_kls;
    private String kelas;
    private String kapasitas;
    
    public kelas(){}
    
    public void setKodeKls(int kodekls){
        this.kode_kls=kodekls;
    }
    public int getKodeKls(){
        return this.kode_kls;
    }
    
    public void setKelas(String kelas){
        this.kelas=kelas;
    }
    public String getKelas(){
        return this.kelas;
    }
    
    public void setKapasitas(String kapasitas){
        this.kapasitas=kapasitas;
    }
    public String getKapasitas(){
        return this.kapasitas;
    }
}
