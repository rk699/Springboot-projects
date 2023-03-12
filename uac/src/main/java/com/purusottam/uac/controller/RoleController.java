package com.purusottam.uac.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purusottam.uac.entity.Role;
import com.purusottam.uac.service.RoleService;



@RestController
@RequestMapping("/uac")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	 @GetMapping("/allrole")
	 public ResponseEntity <?> allRole() {
//		 System.out.println("hiids");
		 List<Role> rol=roleService.getAllRole();
	     HttpHeaders headers=new HttpHeaders();
	     headers.add("Responded", "RoleController");
	     
		return ResponseEntity.ok().headers(headers).body(rol);
	}

	 @PostMapping("/addrole")
	 public ResponseEntity <?> addRole(@RequestBody Role theRole) {
		 roleService.save(theRole);
	     HttpHeaders headers=new HttpHeaders();
	     headers.add("Responded", "RoleController");
	     
		return ResponseEntity.ok().headers(headers).build();
	}
	 
	 @PutMapping("/update/{id}")
	 public ResponseEntity <?> updateRole(@PathVariable("id") Long theId, @RequestBody Role theRole) {
		 roleService.update(theId,theRole);
	     HttpHeaders headers=new HttpHeaders();
	     headers.add("Responded", "RoleController");
	     
		return ResponseEntity.ok().headers(headers).build();
	}
	 
	 @DeleteMapping("/role/{id}")
		public ResponseEntity<?> deleteRole(@PathVariable(value = "id") Long roleId) {
		 roleService.deleteRole(roleId);
			HttpHeaders headers=new HttpHeaders();
		     headers.add("Responded", "RoleController");
			return ResponseEntity.ok().headers(headers).build();
}
	 @GetMapping("/role/{id}")
		public ResponseEntity<?> getRoleId(@PathVariable(value = "id") Long roleId) {
		 Optional<Role> role=roleService.findId(roleId);
			HttpHeaders headers=new HttpHeaders();
		     headers.add("Responded", "RoleController");
			return ResponseEntity.ok().headers(headers).body(role);
}
}
