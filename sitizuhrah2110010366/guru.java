/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitizuhrah2110010366;

/**
 *
 * @author ZUHRAH
 */

public class guru {
    private String NIK;
    private String nama_guru;
    private String tmpt_lhr_guru;
    private java.util.Date tgl_lhr_guru;
    private String pass_guru;
    private String agm_guru;
    private String jk_guru;
    private String tlp_guru;
    private String email_guru;
    private String almt_guru;
    private String pend_guru;
    private String status_guru;
    private boolean blokir_guru;
    
    public guru() {}
    
    public void setNik(String nik){
        this.NIK=nik;        
    }
    public String getNik(){
        return this.NIK;
    }
    
    public void setNamaGuru(String namaguru){
        this.nama_guru=namaguru;
    }
    public String getNamaGuru(){
        return this.nama_guru;
    }
    
    public void seTmptLhrGuru(String tmptlhrguru){
        this.tmpt_lhr_guru=tmptlhrguru;
    }
    public String getTmptLhrGuru(){
        return this.tmpt_lhr_guru;
    }
    
    public void setTglLhrGuru(java.util.Date tgllhrguru){
        this.tgl_lhr_guru=tgllhrguru;
    }
    public java.util.Date getTglLhrGuru(){
        return this.tgl_lhr_guru;
    }
    
    public void setPassGuru(String passguru){
        this.pass_guru=passguru;
    }
    public String getPasGuru(){
        return this.pass_guru;
    }
    
    public void setAgmGuru(String agmguru){
        this.agm_guru=agmguru;
    }
    public String getAgmGuru(){
        return this.agm_guru;
    }
    
    public void setJkGuru(String jkguru){
        this.jk_guru=jkguru;
    }
    public String getJkGuru(){
        return this.jk_guru;
    }
    
    public void setTlpGuru(String tlpguru){
        this.tlp_guru=tlpguru;
    }
    public String getTlpGuru(){
        return this.tlp_guru;
    }
    
    public void setEmailGuru(String emailguru){
        this.email_guru=emailguru;
    }
    public String getEmailGuru(){
        return this.email_guru;
    }
    
    public void setAlmtGuru(String almtguru){
        this.almt_guru=almtguru;
    }
    public String getAlmtGuru(){
        return this.almt_guru;
    }
    
    public void setPendGuru(String pendguru){
        this.pend_guru=pendguru;
    }
    public String getPendGuru(){
        return this.pend_guru;
    }
    
    public void setStatusGuru(String statusguru){
        this.status_guru=statusguru;
    }
    public String getStatusGuru(){
        return this.status_guru;
    }
    
    public void setBlokirGuru(String blokir){
        if(blokir.equalsIgnoreCase("Y")){
            this.blokir_guru=true;
        } else if (blokir.equalsIgnoreCase("T")){
            this.blokir_guru=false;
        }
    }
    public boolean getBlokirGuru(){
        return this.blokir_guru;
    }
}
