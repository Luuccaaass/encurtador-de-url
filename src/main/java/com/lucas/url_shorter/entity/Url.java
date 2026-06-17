package com.lucas.url_shorter.entity;
import jakarta.persistence.*;

@Entity
@Table(name="links")

public class Url {
    @Id //identifica a chave primaria 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //faz comque o numero seja auto incrementado
    private Long id;

    private String code;

    @Column(name = "original_url")
    private String originalUrl;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

}
