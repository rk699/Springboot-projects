package com.purusottam.fileuploadspringboot.service;

import java.util.stream.Stream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.purusottam.fileuploadspringboot.repository.FileDBrepository;
import com.purusottam.fileuploadspringboot.model.FileDB;

//The File Storage Service will use FileDBRepository to provide following methods:
//
//store(file): receives MultipartFile object, transform to FileDB object and save it to Database
//getFile(id): returns a FileDB object by provided Id
//getAllFiles(): returns all stored files as list of code>FileDB objects

@Service
public class FileStorageService {
	 @Autowired
	 private FileDBrepository fileDBrepository;

	  public FileDB store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//	    System.out.println(fileName);
	    
	    FileDB fileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
//	    System.out.println(fileDB.getName()+fileDB.getType()+fileDB.getData());

	    return fileDBrepository.save(fileDB);
	  }

	  public FileDB getFile(String id) {
	    return fileDBrepository.findById(id).get();
	  }
	  
	  public Stream<FileDB> getAllFiles() {
	    return fileDBrepository.findAll().stream();
	  }

}
