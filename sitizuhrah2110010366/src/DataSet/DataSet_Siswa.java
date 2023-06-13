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
public class DataSet_Siswa {
    private ArrayList<String> NIS;
    private ArrayList<String> NamaSiswa;
    private ArrayList<String> TmptLhrSiswa;
    private ArrayList<Integer> TglLhrSiswa;
    private ArrayList<String> AgmSiswa;
    private ArrayList<String> JkSiswa;
    private ArrayList<String> AlmtSiswa;
    private ArrayList<String> TlpSiswa;
    private ArrayList<String> AsalSekolah;
    private ArrayList<Integer> KodeKls;
    private ArrayList<Integer> Kondisi;
    private ArrayList<String> NamaWali;
    
    public DataSet_Siswa (){
        NIS=new ArrayList<String>();
        NamaSiswa=new ArrayList<String>();
        TmptLhrSiswa=new ArrayList<String>();
        TglLhrSiswa=new ArrayList<Integer>();
        AgmSiswa=new ArrayList<String>();
        JkSiswa=new ArrayList<String>();
        AlmtSiswa=new ArrayList<String>();
        TlpSiswa=new ArrayList<String>();
        AsalSekolah=new ArrayList<String>();
        KodeKls=new ArrayList<Integer>();
        Kondisi=new ArrayList<Integer>();
        NamaWali=new ArrayList<String>();
    }
    
    public void tambahNIS(String value){
        NIS.add(value);
    }
    public ArrayList<String> getDataSetNIS(){
        return this.NIS;
    }
    
    public void tambahNamaSiswa(String value){
        NamaSiswa.add(value);
    }
    public ArrayList<String> getDataSetNamaSiswa(){
        return this.NamaSiswa;
    }
    
    public void tambahTmptLhrSiswa(String value){
        TmptLhrSiswa.add(value);
    }
    public ArrayList<String> getDataSetTmptLhrSiswa(){
        return this.TmptLhrSiswa;
    }
    
    public void tambahTglLhrSiswa(int value){
        TglLhrSiswa.add(value);
    }
    public ArrayList<Integer> getDataSetTglLhrSiswa(){
        return this.TglLhrSiswa;
    }
    
    public void tambahAgmSiswa(String value){
        AgmSiswa.add(value);
    }
    public ArrayList<String> getDataSetAgmSiswa(){
        return this.AgmSiswa;
    }
    
    public void tambahJkSiswa(String value){
        JkSiswa.add(value);
    }
    public ArrayList<String> getDataSetJkSiswa(){
        return this.JkSiswa;
    }
    
    public void tambahAlmtSiswa(String value){
        AlmtSiswa.add(value);
    }
    public ArrayList<String> getDataSetAlmtSiswa(){
        return this.AlmtSiswa;
    }
    
    public void tambahTlpSiswa(String value){
        TlpSiswa.add(value);
    }
    public ArrayList<String> getDataSetTlpSiswa(){
        return this.TlpSiswa;
    }
    
    public void tambahAsalSekolah(String value){
        AsalSekolah.add(value);
    }
    public ArrayList<String> getDataSetAsalSekolah(){
        return this.AsalSekolah;
    }
    
    public void tambahKodeKls(int value){
        KodeKls.add(value);
    }
    public ArrayList<Integer> getDataSetKodeKls(){
        return this.KodeKls;
    }
    
    public void tambahKondisi(int value){
        Kondisi.add(value);
    }
    public ArrayList<Integer> getDataSetKondisi(){
        return this.Kondisi;
    }
    
    public void tambahNamaWali(String value){
        NamaWali.add(value);
    }           
    public ArrayList<String> getDataSetNamaWali(){
        return this.NamaWali;
    }
    
    public void tambahData(String nis, String namasiswa, String tmptlhrsiswa, int tgllhrsiswa, String agmsiswa,
            String jksiswa, String tlpsiswa, String almtsiswa, String asalsekolah, int kodekls, int kondisi, String namawali){
        this.NIS.add(nis);
        this.NamaSiswa.add(namasiswa);
        this.TmptLhrSiswa.add(tmptlhrsiswa);
        this.TglLhrSiswa.add(tgllhrsiswa);
        this.AgmSiswa.add(agmsiswa);
        this.JkSiswa.add(jksiswa);
        this.TlpSiswa.add(tlpsiswa);
        this.AlmtSiswa.add(almtsiswa);
        this.AsalSekolah.add(asalsekolah);
        this.KodeKls.add(kodekls);
        this.Kondisi.add(kondisi);
        this.NamaWali.add(namawali);
                
              
    }
}
