package com.purusottam.uac.service;



import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.purusottam.uac.entity.Role;


@Service
public interface RoleService {

	 public List<Role> getAllRole();

	    public Optional<Role> findId(Long theId);

	    public void save(Role therole);
	    
	    public void update(Long theId,Role therole);

	    public void deleteRole(Long theId);
	    

}
