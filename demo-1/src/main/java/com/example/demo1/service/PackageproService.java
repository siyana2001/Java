package com.example.demo1.service;

import java.util.List;

import com.example.demo1.dto.PackageproDto;
import com.example.demo1.modal.Packagepro;


public interface PackageproService {
public	boolean saveOrUp(PackageproDto packagedto);

public List<Packagepro>getAllUser();
}
