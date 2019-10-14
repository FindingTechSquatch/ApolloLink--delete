/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.catalina.realm.SecretKeyCredentialHandler;

/**
 *
 * @author tyleryork
 */
public class ec {
    public static String EC_dpw(String ec) {
        try {
            SecretKeyCredentialHandler ch = new SecretKeyCredentialHandler();
            ch.setAlgorithm("PBKDF2WithHmacSHA256");
            ch.setKeyLength(256);
            ch.setSaltLength(16);
            ch.setIterations(4096);

            String h = ch.mutate(ec+"YvqlQH7CwKgbK4VbsaK2atDvXZ6L");

            return h;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ec.class.getName()).log(Level.SEVERE, null, ex);
            //DO SOMETHING HERE
            return null;
        } catch (Exception ex) {
            //DO SOMETHING HERE
            return null;
        }
    }
    public static String EC_dus(String ec) {
        try {
            SecretKeyCredentialHandler ch = new SecretKeyCredentialHandler();
            ch.setAlgorithm("PBKDF2WithHmacSHA256");
            ch.setKeyLength(256);
            ch.setSaltLength(16);
            ch.setIterations(4096);

            String h = ch.mutate(ec+"gC3cQIsGyeC3eVosz9S8qrAWrWa9");

            return h;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ec.class.getName()).log(Level.SEVERE, null, ex);
            //DO SOMETHING HERE
            return null;
        } catch (Exception ex) {
            //DO SOMETHING HERE
            return null;
        }
    }
    public static String EC_epw(String ec) {
        try {
            SecretKeyCredentialHandler ch = new SecretKeyCredentialHandler();
            ch.setAlgorithm("PBKDF2WithHmacSHA256");
            ch.setKeyLength(256);
            ch.setSaltLength(16);
            ch.setIterations(4096);

            String h = ch.mutate(ec+"PuPs8QA20h6splz6BuUoR6h6MR1g");

            return h;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ec.class.getName()).log(Level.SEVERE, null, ex);
            //DO SOMETHING HERE
            return null;
        } catch (Exception ex) {
            //DO SOMETHING HERE
            return null;
        }
    }
    public static String EC_eus(String ec) {
        try {
            SecretKeyCredentialHandler ch = new SecretKeyCredentialHandler();
            ch.setAlgorithm("PBKDF2WithHmacSHA256");
            ch.setKeyLength(256);
            ch.setSaltLength(16);
            ch.setIterations(4096);

            String h = ch.mutate(ec+"tZC5EPXI404t5VxfeEB6z0nb4Iic");

            return h;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ec.class.getName()).log(Level.SEVERE, null, ex);
            //DO SOMETHING HERE
            return null;
        } catch (Exception ex) {
            //DO SOMETHING HERE
            return null;
        }
    }
}
