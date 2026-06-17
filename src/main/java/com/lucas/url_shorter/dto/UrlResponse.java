package com.lucas.url_shorter.dto;

public class UrlResponse {
    private String url;
    private String hoje;
    private Integer vontade;

    public UrlResponse(String url, String hoje, Integer vontade){
        this.url = url;
        this.hoje = hoje;
        this.vontade = vontade;
    }

    public String getUrl(){
        return url;
    }

    public String getHoje(){
        return hoje;
    }

    public Integer getVontade() {
        return vontade;
    }

}
