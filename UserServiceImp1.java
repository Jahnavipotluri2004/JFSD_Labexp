package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.User;
import com.klef.jfsd.springboot.repository.UserRepository;

@Service
public class UserServiceImp1 implements UserService
{
	
	@Autowired
	private UserRepository repository;
	@Override
	public String addUser(User user) {
		repository.save(user);
		return "User Added Successfully";
	}

	@Override
	public String updateUser(User user) 
	{
		
		Optional<User> object = repository.findById(user.getId());
        if(object.isPresent()) {
        User u =  object.get();
        u.setAge(user.getAge());
        u.setContact(user.getContact());
        u.setGender(user.getGender());
        u.setLocation(user.getLocation());
        u.setName(user.getName());
        
        repository.save(u);
        
        return "User Updated Successfully";
        
        }
        else {
        	return "User ID not found";
        }
	}
	

	@Override
	public String deleteUser(int uid) {
		
		Optional<User> object = repository.findById(uid);
        if(object.isPresent()) {
        User u =  object.get();
        
        
        repository.delete(u);
        
        return "User Deleted Successfully";
        
        }
        else {
        	return "User ID not found";
        }
	}

	@Override
	public List<User> displayAllUsers() {
		return (List<User>) repository.findAll();
		
	}

	@Override
	public User displayById(int uid) {
	return	repository.findById(uid).get();
	}

}
