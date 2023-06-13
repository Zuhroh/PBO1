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
public class DataSet_JadwalSiswa {
    private ArrayList<Integer> IdJadwal;
    private ArrayList<Integer> KodeKls;
    private ArrayList<Integer> KodePel;
    private ArrayList<String> NIK;
    private ArrayList<String> JamMasuk;
    private ArrayList<String> HariMasuk;
    
    public DataSet_JadwalSiswa (){
        IdJadwal=new ArrayList<Integer>();
        KodeKls=new ArrayList<Integer>();
        KodePel=new ArrayList<Integer>();
        NIK=new ArrayList<String>();
        JamMasuk=new ArrayList<String>();
        HariMasuk=new ArrayList<String>();
    }
    
    public void tambahIdJadwal(int value){
        IdJadwal.add(value);
    }
    public ArrayList<Integer> getDataSetIdJadwal() {
        return this.IdJadwal;
    }
    
    public void tambahKodeKls(int value){
        KodeKls.add(value);
    }
    public ArrayList<Integer> getDataSetKodeKls() {
        return this.KodeKls;
    }
    
    public void tambahKodePel(int value){
        KodePel.add(value);
    }
    public ArrayList<Integer> getDataSetKodePel() {
        return this.KodePel;
    }
    
    public void tambahNIK(String value){
        NIK.add(value);
    }
    public ArrayList<String> getDataSetNIK(){
        return this.NIK;
    }
    
    public void tambahJamMasuk(String value){
        JamMasuk.add(value);
    }
    public ArrayList<String> getDataSetJamMasuk(){
        return this.JamMasuk;
    }    
    
    public void tambahHariMasuk(String value){
        HariMasuk.add(value);
    }
    public ArrayList<String> getDataSetHariMasuk(){
        return this.HariMasuk;
    }
    
    public void tambahData(int idjadwal, int kodekls, int kodepel, String nik, String jammasuk, String harimasuk){
        this.IdJadwal.add(idjadwal);
        this.KodeKls.add(kodekls);
        this.KodePel.add(kodepel);
        this.NIK.add(nik);
        this.JamMasuk.add(jammasuk);
        this.HariMasuk.add(harimasuk);
    }
    
}
