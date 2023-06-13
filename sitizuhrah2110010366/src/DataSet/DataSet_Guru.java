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
public class DataSet_Guru {
    private ArrayList<String> NIK;
    private ArrayList<String> NamaGuru;
    private ArrayList<String> TmptLhrGuru;
    private ArrayList<Integer> TglLhrGuru;
    private ArrayList<String> PassGuru;
    private ArrayList<String> AgmGuru;
    private ArrayList<String> JkGuru;
    private ArrayList<String> TlpGuru;
    private ArrayList<String> EmailGuru;
    private ArrayList<String> AlmtGuru;
    private ArrayList<String> PendGuru;
    private ArrayList<String> StatusGuru;
    private ArrayList<Boolean> BlokirGuru;
    
    public DataSet_Guru () {
        NIK=new ArrayList<String>();
        NamaGuru=new ArrayList<String>();
        TmptLhrGuru=new ArrayList<String>();
        TglLhrGuru=new ArrayList<Integer>();
        PassGuru=new ArrayList<String>();
        AgmGuru=new ArrayList<String>();
        JkGuru=new ArrayList<String>();
        TlpGuru=new ArrayList<String>();
        EmailGuru=new ArrayList<String>();
        PendGuru=new ArrayList<String>();
        StatusGuru=new ArrayList<String>();
        BlokirGuru=new ArrayList<Boolean>();
        
    }
    
    public void tambahNIK(String value){
        NIK.add(value);
    }
    public ArrayList<String> getDataSetNIK(){
        return this.NIK;
    }
    
    public void tambahNamaGuru(String value){
        NamaGuru.add(value);
    }
    public ArrayList<String> getDataSetNamaGuru(){
        return this.NamaGuru;
    }
    
    public void tambahTmptLhrGuru(String value){
        TmptLhrGuru.add(value);
    }
    public ArrayList<String> getDataSetTmptLhrGuru(){
        return this.TmptLhrGuru;
    }
    
    public void tambahTglLhrGuru(int value){
        TglLhrGuru.add(value);
    }
    public ArrayList<Integer> getDataSetTglLhrGuru(){
        return this.TglLhrGuru;
    }
   
    public void tambahPassGuru(String value){
        PassGuru.add(value);
    }
    public ArrayList<String> getDataSetPassGuru(){
        return this.PassGuru;
    }
    
    public void tambahAgmGuru(String value){
        AgmGuru.add(value);
    }
    public ArrayList<String> getDataSetAgmGuru(){
        return this.AgmGuru;
    }
    
    public void tambahJkGuru(String value){
        JkGuru.add(value);
    }
    public ArrayList<String> getDatSetJkGuru(){
        return this.JkGuru;
    }
    
    public void tambahTlpGuru(String value){
        TlpGuru.add(value);
    }
    public ArrayList<String> getDataSetTlpGuru(){
        return this.TlpGuru;
    }
    
    public void tambahEmailGuru(String value){
        EmailGuru.add(value);
    }
    public ArrayList<String> getDataSetEmailGuru(){
        return this.EmailGuru;
    }
    
    public void tambahAlmtGuru(String value){
        AlmtGuru.add(value);
    }
    public ArrayList<String> getDataSetAlmtGuru() {
        return this.AlmtGuru;
    }
    
    public void tambahPendGuru(String value){
        PendGuru.add(value);
    }
    public ArrayList<String> getDataSetPendGuru() {
        return this.PendGuru;
    }
    
    public void tambahStatusGuru(String value){
        StatusGuru.add(value);
    }
    public ArrayList<String> getDataSetStatusGuru() {
        return this.StatusGuru;
    }
    
    public void tambahBlokirGuru(Boolean value){
        BlokirGuru.add(value);
    }
    public ArrayList<Boolean> getDataSetBlokirGuru() {
        return this.BlokirGuru;
    }
        
    public void tambahData(String nik, String namaguru, String tmptlhrguru, int tgllhrguru, String passguru, String agmguru,
            String jkguru, String tlpguru, String emailguru, String almtguru, String pendguru, String statusguru, Boolean blokirguru){
        this.NIK.add(nik);
        this.NamaGuru.add(namaguru);
        this.TmptLhrGuru.add(tmptlhrguru);
        this.TglLhrGuru.add(tgllhrguru);
        this.PassGuru.add(passguru);
        this.AgmGuru.add(agmguru);
        this.JkGuru.add(jkguru);
        this.TlpGuru.add(tlpguru);
        this.EmailGuru.add(emailguru);
        this.AlmtGuru.add(almtguru);
        this.PendGuru.add(pendguru);
        this.StatusGuru.add(statusguru);
        this.BlokirGuru.add(blokirguru);
    }

    public void NIK(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void NamaGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void TmptLhrGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void TglLhrGuru(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void PassGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void AgmGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void JkGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void TlpGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void EmailGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void AlmtGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void PendGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void StatusGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void BlokirGuru(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getDataSetJenisAkun() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
