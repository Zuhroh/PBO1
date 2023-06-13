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
    private int KodePel;
    private String NamaPel;
    private int KKM;
    
    public pelajaran(){}
    
    public void setKodePel(int kodepel){
        this.KodePel=kodepel;
    }
    public int getKodePel(){
        return this.KodePel;
    }
    
    public void setNamaPel(String namapel){
        this.NamaPel=namapel;
    }
    public String getNamaPel(){
        return this.NamaPel;
    }
    
    public void setKKM(int kkm){
        this.KKM=kkm;
    }
    public int getKKM(){
        return this.KKM;
    }
}
