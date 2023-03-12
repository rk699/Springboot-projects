package com.purusottam.uac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purusottam.uac.entity.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}