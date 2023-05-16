/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitizuhrah2110010366;

/**
 *
 * @author ZUHRAH
 */
public class pelajaran {
    private int kode_pel;
    private String nama_pel;
    private int KKM;
    
    public pelajaran(){}
    
    public void setKodePel(int kodepel){
        this.kode_pel=kodepel;
    }
    public int getKodePel(){
        return this.kode_pel;
    }
    
    public void setNamaPel(String namapel){
        this.nama_pel=namapel;
    }
    public String getNamaPel(){
        return this.nama_pel;
    }
    
    public void setKKM(int kkm){
        this.KKM=kkm;
    }
    public int getKKM(){
        return this.KKM;
    }
}
