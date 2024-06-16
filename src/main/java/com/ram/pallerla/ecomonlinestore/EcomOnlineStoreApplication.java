package com.ram.pallerla.ecomonlinestore;

import com.ram.pallerla.ecomonlinestore.entity.User;
import com.ram.pallerla.ecomonlinestore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EcomOnlineStoreApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcomOnlineStoreApplication.class, args);
	}

	/*@EventListener(ApplicationReadyEvent.class)
	public void testRespoistory(){
		User user = new User();
		user.setFirstName("Ram");
		user.setLastName("Pallerla");
		user.setEmail("ram1.pallerla@gmail.com");
		user.setPhone("602-516-4833");
		user.setRole("ADMIN");
		user.setPassword("credit123");
		user.setAddress("50596 Bailys Lndg, Canton, MI, 48187");
		userRepository.save(user);

	}*/

}
