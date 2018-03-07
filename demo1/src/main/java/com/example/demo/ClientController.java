package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
	@RequestMapping("/getall")
	public List<Client> getAll(){
		List<Client> result = new ArrayList<Client>();
		Client client = new Client();
		client.setId(1);
		client.setName("Name");
		client.setAddress("Address");
		result.add(client);

		return result;
	}
}
