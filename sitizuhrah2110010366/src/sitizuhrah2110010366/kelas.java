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
    private int KodeKls;
    private String Kelas;
    private String Kapasitas;
    
    public kelas(){}
    
    public void setKodeKls(int kodekls){
        this.KodeKls=kodekls;
    }
    public int getKodeKls(){
        return this.KodeKls;
    }
    
    public void setKelas(String kelas){
        this.Kelas=kelas;
    }
    public String getKelas(){
        return this.Kelas;
    }
    
    public void setKapasitas(String kapasitas){
        this.Kapasitas=kapasitas;
    }
    public String getKapasitas(){
        return this.Kapasitas;
    }
}
