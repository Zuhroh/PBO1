/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;
/**
 *
 * @author ZUHRAH
 */
public class DataSet_Pelajaran {
    private ArrayList<Integer> KodePel;
    private ArrayList<String> NamaPel;
    private ArrayList<Integer> KKM;
    
    public DataSet_Pelajaran (){
        KodePel=new ArrayList<Integer>();
        NamaPel=new ArrayList<String>();
        KKM=new ArrayList<Integer>();
    }
    
    public void tambahKodePel(int value){
        KodePel.add(value);
    }
    public ArrayList<Integer> getDataSetKodePel(){
        return this.KodePel;
    }
    
    public void tambahNamaPel(String value){
        NamaPel.add(value);
    }
    public ArrayList<String> getDataSetNamaPel(){
        return this.NamaPel;
    }
    
    public void tambahKKM(int value){
        KKM.add(value);
    }
    public ArrayList<Integer> getDataSetKKM(){
        return this.KKM;
    }
    
    public void tambahData(int kodepel, String namapel, int KKM){
        this.KodePel.add(kodepel);
        this.NamaPel.add(namapel);
        this.KKM.add(KKM);
    }
}
