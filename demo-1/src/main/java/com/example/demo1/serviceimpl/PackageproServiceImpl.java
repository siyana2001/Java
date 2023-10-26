package com.example.demo1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.dto.PackageproDto;
import com.example.demo1.modal.Packagepro;
import com.example.demo1.repository.PackageproRepository;
import com.example.demo1.service.PackageproService;
@Service
public class PackageproServiceImpl  implements  PackageproService{
	@Autowired
	PackageproRepository packageRepository;

	@Override
	public boolean saveOrUp(PackageproDto packagedto) {
	Packagepro pack =new Packagepro();
	
	pack.setPtid(packagedto.getPtid());
	pack.setAddress(packagedto.getAddress());
	pack.setClimate(packagedto.getClimate());
	pack.setCost(packagedto.getCost());
	pack.setPlace(packagedto.getPlace());
	pack.setHotel(packagedto.getHotel());
	packageRepository.save(pack);

		return true;
	}
	
	  @Override
	    public List<Packagepro> getAllUser() {
	        List<Packagepro> product = packageRepository.findAll();
	        return product;
	    }


}
