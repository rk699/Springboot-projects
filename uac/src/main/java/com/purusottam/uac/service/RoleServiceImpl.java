package com.purusottam.uac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.purusottam.uac.entity.Role;
import com.purusottam.uac.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
    private RoleRepository roleRepository;

	@Override
	public List<Role> getAllRole() {
		
		List<Role> rol = new ArrayList<Role>();
		 rol = roleRepository.findAll();
		 System.out.println("hii " + rol.indexOf(1) );
		 return rol;
	     
	}
	

	@Override
	public Optional<Role> findId(Long theId) {
		 return roleRepository.findById(theId);
				//.orElseThrow(() -> new ResourceNotFoundException("Role", "thrid", commentId));
		      
	
	}

	
	@Override
	public void save(Role theRole) {
		// TODO Auto-generated method stub
		roleRepository.save(theRole);
		
	}

	@Override
	public void deleteRole(Long theId) {
		// TODO Auto-generated method stub
		 roleRepository.deleteById(theId);
				//.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

		//roleRepository.deleteById(role);
		
	}


	@Override
	public void update(Long theId,Role therole) {
		// TODO Auto-generated method stub
		 Optional<Role> role = roleRepository.findById(theId);
		 if (role.isPresent()) {
		      Role rol = role.get();
		      rol.setRoleName(therole.getRoleName());
		      rol.setRoleDescription(therole.getRoleDescription());
		      rol.setCreatedBy(therole.getCreatedBy());
		      rol.setLastUpdatedBy(therole.getLastUpdatedBy());
		      rol.setIsActive(therole.getIsActive());
		      roleRepository.save(rol);
	}

}
}
