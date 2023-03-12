package com.purusottam.fileuploadspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purusottam.fileuploadspringboot.model.FileDB;



@Repository
public interface FileDBrepository extends JpaRepository<FileDB, String> {

}