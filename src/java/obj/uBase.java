/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import encrypt.ec;

/**
 *
 * @author tyleryork
 */
public class uBase {

    public String uus; //unhashed username
    public String hus; //hashed username
    public String hpw; //hashed password

    public uBase() {
    }

    public uBase(String uus, String hus, String hpw) {
        this.uus = uus;
        this.hus = hus;
        this.hpw = hpw;
    }

    public String getUus() {
        return uus;
    }

    public void setUus(String uus) {
        this.uus = uus;
    }

    public String getHus() {
        return hus;
    }

    public void setHus(String hus) {
        this.hus = hus;
    }

    public String getHpw() {
        return hpw;
    }

    public void setHpw(String hpw) {
        this.hpw = hpw;
    }

}
