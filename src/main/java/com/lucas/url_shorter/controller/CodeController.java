package com.lucas.url_shorter.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CodeController {
    public String codeGenerator(String link){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(link.getBytes());

            StringBuilder code = new StringBuilder();

            for (int i = 0; i < 5; i++){
                code.append(String.format("%02x", hashBytes[i]));
            }

            return code.toString();
        }
        catch(Exception e){
            return("Erro");
        }
        
    }
}
