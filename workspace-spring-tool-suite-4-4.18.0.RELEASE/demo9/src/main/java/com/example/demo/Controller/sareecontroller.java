package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.textiles;
import com.example.demo.service.sareeService;

@RestController

public class sareecontroller {
	@Autowired sareeService obj;
	@PostMapping("/post")
	public textiles addDetail(@RequestBody textiles a)
	{
		return obj.save(a);
	}
	@GetMapping("/get")
	public List<textiles> getDtails()
	{
		return obj.findAllsaree();
		
	}
	@PutMapping("/put")
	public textiles updateDetails(@RequestBody textiles cid)
	
	{
		return obj.update(cid);
	}
@DeleteMapping("/dsaree/{sareeid}")
public String deleteDetails(@PathVariable("sareeid")int mid)
{
	obj.delete(mid);
	return "Deleted Sucessfully";
}
}

