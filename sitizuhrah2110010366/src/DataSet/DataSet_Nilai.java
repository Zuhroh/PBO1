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
public class DataSet_Nilai {
    private ArrayList<Integer> KodeKls;
    private ArrayList<String> NIS;
    private ArrayList<String> NIK;
    private ArrayList<Integer> KodePel;
    private ArrayList<Integer> NilUTS;
    private ArrayList<Integer> NilUAS;
    private ArrayList<Integer> NilTgs;
    private ArrayList<Integer> Absen;
    
    public DataSet_Nilai (){
        KodeKls=new ArrayList<Integer>();
        NIS=new ArrayList<String>();
        NIK=new ArrayList<String>();
        KodePel=new ArrayList<Integer>();
        NilUTS=new ArrayList<Integer>();
        NilUAS=new ArrayList<Integer>();
        NilTgs=new ArrayList<Integer>();
        Absen=new ArrayList<Integer>();
    }
    
    public void tambahKodeKls(int value){
        KodeKls.add(value);
    }
    public ArrayList<Integer> getDataSetKodeKls(){
        return this.KodeKls;
    }
    
    public void tambahNIS(String value){
        NIS.add(value);
    }
    public ArrayList<String> getDataSetNIS(){
        return this.NIS;
    }
    
    public void tambahNIK(String value){
        NIK.add(value);
    }
    public ArrayList<String> getDataSetNIK(){
        return this.NIK;
    }
    
    public void tambahKodePel(int value){
        KodePel.add(value);
    }
    public ArrayList<Integer> getDataSetKodePel(){
        return this.KodePel;
    }
    
    public void tambahNilUTS(int value){
        NilUTS.add(value);
    }
    public ArrayList<Integer> getDataSetNilUTS(){
        return this.NilUTS;
    }
    
    public void tambahNilUAS(int value){
        NilUAS.add(value);
    }
    public ArrayList<Integer> getDataSetNilUAS(){
        return this.NilUAS;
    }
    
    public void tambahNilTgs(int value){
        NilTgs.add(value);
    }
    public ArrayList<Integer> getDataSetNilTgs(){
        return this.NilTgs;
    }
    
    public void tambahAbsen(int value){
        Absen.add(value);
    }
    public ArrayList<Integer> getDataSetAbsen(){
        return this.Absen;
    }
    
    public void tambahData(int kodekls, String NIS, String NIK, int kodepel, int niluts, int niluas, int niltgs, int absen){
        this.KodeKls.add(kodekls);
        this.NIS.add(NIS);
        this.NIK.add(NIK);
        this.KodePel.add(kodepel);
        this.NilUTS.add(niluts);
        this.NilUAS.add(niluas);
        this.NilTgs.add(niltgs);
        this.Absen.add(absen);
    }

}

