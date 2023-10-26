package com.example.demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo1.modal.Packagepro;




public interface PackageproRepository extends JpaRepository<Packagepro, Integer> {

	@Query(nativeQuery = true, value = "SELECT id, name, phone, mail, password, is_delete FROM user UNION SELECT ptid, address, climate, cost, place, hotel FROM packagepro;")
	List<Object[]> mergeUserAndPackageproData();
	
	
}
