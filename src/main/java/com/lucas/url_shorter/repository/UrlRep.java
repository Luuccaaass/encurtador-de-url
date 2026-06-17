package com.lucas.url_shorter.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lucas.url_shorter.entity.Url;


public interface UrlRep extends JpaRepository<Url, Long> {

}
