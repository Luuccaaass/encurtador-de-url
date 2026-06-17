package com.lucas.url_shorter.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lucas.url_shorter.entity.Url;
import com.lucas.url_shorter.repository.UrlRep;
import com.lucas.url_shorter.dto.UrlRequest;

@RestController
@RequestMapping("/api")
public class UrlController {

    @Autowired
    private UrlRep repository;

    @PostMapping("/shortenlink")
    public String shortenLink(@RequestBody UrlRequest request) {

        try{
            CodeController code_controller = new CodeController();
            Url url = new Url();
            url.setOriginalUrl(request.getUrl());
            url.setCode(code_controller.codeGenerator(request.getUrl()));
            repository.save(url);
            return("Sucesso!");
        } 
        catch (Exception e){
            return ("Erro inesperado: " + e);
        }
    }
}

