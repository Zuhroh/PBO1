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
public class DataSet_Kelas {
    private ArrayList<Integer> KodeKls;
    private ArrayList<String> Kelas;
    private ArrayList<String> Kapasitas;
    
    public DataSet_Kelas (){
        KodeKls=new ArrayList<Integer>();
        Kelas=new ArrayList<String>();
        Kapasitas=new ArrayList<String>();
    }
    
    public void tambahKodeKls(int Value){
        KodeKls.add(Value);
    }
    public ArrayList<Integer> getDataSetKodeKls(){
        return this.KodeKls;
    }
    
    public void tambahKelas(String value){
        Kelas.add(value);
    }
    public ArrayList<String> getDataSetKelas(){
        return this.Kelas;
    }
    
    public void tambahKapasitas(String value){
        Kapasitas.add(value);
    }
    public ArrayList<String> getDataSetKapasitas(){
        return this.Kapasitas;
    }
    
    public void tambahData(int kodekls, String kelas, String kapasitas){
        this.KodeKls.add(kodekls);
        this.Kelas.add(kelas);
        this.Kapasitas.add(kapasitas);
    }
}
