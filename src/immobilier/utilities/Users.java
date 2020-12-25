/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier.utilities;

/**
 *
 * @author Youcode
 */
public class Users {
  private  String id,name , adressUser, cin;

    public Users(String id,String name, String adressUser, String cin) {
       this.id = id;
        this.name = name;
        this.adressUser = adressUser;
        this.cin = cin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressUser() {
        return adressUser;
    }

    public void setAdressUser(String adressUser) {
        this.adressUser = adressUser;
    }

 

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    
}
