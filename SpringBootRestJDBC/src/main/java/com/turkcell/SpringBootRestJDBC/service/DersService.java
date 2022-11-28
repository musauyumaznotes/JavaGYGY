package com.turkcell.SpringBootRestJDBC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkcell.SpringBootRestJDBC.model.Ders;
import com.turkcell.SpringBootRestJDBC.model.DersDTO;
import com.turkcell.SpringBootRestJDBC.model.Ogretmen;
import com.turkcell.SpringBootRestJDBC.repo.DersRepository;
import com.turkcell.SpringBootRestJDBC.repo.OgretmenRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DersService
{
	private DersRepository repo;

	public List<Ders> getAll()
	{
		return repo.getAll();
	}

	public List<DersDTO> getAllDTO()
	{
		return repo.getAllDTO();
	}
	
	public Ders getByID(long id)
	{
		return repo.getById(id);
	}

	public boolean save(Ders ders)
	{
		try
		{
			return repo.save(ders);
		}
		catch (Exception e)
		{
			return false;
		}
	}
}
