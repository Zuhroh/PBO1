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
    private String NamaGuru;
    private String TmptLhrGuru;
    private int TglLhrGuru;
    private String PassGuru;
    private String AgmGuru;
    private String JkGuru;
    private String TlpGuru;
    private String EmailGuru;
    private String AlmtGuru;
    private String PendGuru;
    private String StatusGuru;
    private Boolean BlokirGuru;
    
    public guru() {}
    
    public void setNik(String nik){
        this.NIK=nik;        
    }
    public String getNik(){
        return this.NIK;
    }
    
    public void setNamaGuru(String namaguru){
        this.NamaGuru=namaguru;
    }
    public String getNamaGuru(){
        return this.NamaGuru;
    }
    
    public void seTmptLhrGuru(String tmptlhrguru){
        this.TmptLhrGuru=tmptlhrguru;
    }
    public String getTmptLhrGuru(){
        return this.TmptLhrGuru;
    }
    
    public void setTglLhrGuru(int tgllhrguru){
        this.TglLhrGuru=tgllhrguru;
    }
    public int getTglLhrGuru(){
        return this.TglLhrGuru;
    }
    
    public void setPassGuru(String passguru){
        this.PassGuru=passguru;
    }
    public String getPasGuru(){
        return this.PassGuru;
    }
    
    public void setAgmGuru(String agmguru){
        this.AgmGuru=agmguru;
    }
    public String getAgmGuru(){
        return this.AgmGuru;
    }
    
    public void setJkGuru(String jkguru){
        this.JkGuru=jkguru;
    }
    public String getJkGuru(){
        return this.JkGuru;
    }
    
    public void setTlpGuru(String tlpguru){
        this.TlpGuru=tlpguru;
    }
    public String getTlpGuru(){
        return this.TlpGuru;
    }
    
    public void setEmailGuru(String emailguru){
        this.EmailGuru=emailguru;
    }
    public String getEmailGuru(){
        return this.EmailGuru;
    }
    
    public void setAlmtGuru(String almtguru){
        this.AlmtGuru=almtguru;
    }
    public String getAlmtGuru(){
        return this.AlmtGuru;
    }
    
    public void setPendGuru(String pendguru){
        this.PendGuru=pendguru;
    }
    public String getPendGuru(){
        return this.PendGuru;
    }
    
    public void setStatusGuru(String statusguru){
        this.StatusGuru=statusguru;
    }
    public String getStatusGuru(){
        return this.StatusGuru;
    }
    
    public void setBlokirGuru(String blokir){
        if(blokir.equalsIgnoreCase("Y")){
            this.BlokirGuru=true;
        } else if (blokir.equalsIgnoreCase("T")){
            this.BlokirGuru=false;
        }
    }
    public Boolean getBlokirGuru(){
        return this.BlokirGuru;
    }
}
