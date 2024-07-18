/*
package Vault_Application.authantication;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class hashPassword {
    //Logger logger = Logger.getLogger(hashPassword.class.getName());
    private String password;
    private static String hashPasswordToString;
    private static String saltToString;

    hashPassword(String password){
        this.password = password;
        if (!isRegistered){
            createPassword(this.password);
        }else {
            validatePassword(this.password);
        }
    }

    private static void createPassword(String password){
        byte[] salt = generateSalt();
        byte[] hashedPassword = hashPassword(password, salt);

        hashPasswordToString = Base64.getEncoder().encodeToString(hashedPassword);
        saltToString = Base64.getEncoder().encodeToString(salt);
        isRegistered = true;

        //store password in separate database
        System.out.println("Salt (Base64): " + hashPasswordToString);
        System.out.println("Hashed Password (Base64): " + saltToString);
    }

    private static void validatePassword(String password){
        if (isPasswordValid(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Invalid password.");
        }
    }

    private static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    private static byte[] hashPassword(String password, byte[] salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            byte[] bytes = md.digest(password.getBytes());
            return bytes;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password: " + e.getMessage());
        }
    }

    private static boolean isPasswordValid(String newPassword) {
        byte[] storedSalt = Base64.getDecoder().decode(saltToString);
        byte[] generatedHashedPassword = hashPassword(newPassword, storedSalt);
        String newPasswordToString = Base64.getEncoder().encodeToString(generatedHashedPassword);
        return newPasswordToString.equals(hashPasswordToString);
    }
}




*/
