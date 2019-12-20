/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrasi;

public class Data {
    public String nama;
    public String alam;
    public String noHp;
    public Data(String nama,String alam,String noHp){
    this.nama=nama;
    this.alam=alam;
    this.noHp=noHp;
    }
   public String getNama(){
    return nama;
    }
   public String getNoHp(){
    return noHp;
    }
    
}
