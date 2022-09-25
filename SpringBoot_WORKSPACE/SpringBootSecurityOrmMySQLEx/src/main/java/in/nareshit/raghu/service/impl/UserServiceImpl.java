package in.nareshit.raghu.service.impl;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.User;
import in.nareshit.raghu.repo.UserRepository;
import in.nareshit.raghu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public Integer saveUser(User user) {
		//encode pwd and set back to same object
		String encPwd = encoder.encode(user.getPwd());
		user.setPwd(encPwd);
		
		return repo.save(user).getId();
	}

	public Optional<User> findUserByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		Optional<User> opt = findUserByEmail(username);
		
		if(opt.isEmpty())
				throw new UsernameNotFoundException("Not exist");
		else {
			User user = opt.get();
			return new org.springframework.security.core.userdetails.User(
					user.getEmail(),
					user.getPwd(), 
					user.getRoles().stream()
					.map(role->new SimpleGrantedAuthority(role))
					.collect(Collectors.toSet())
					);
		}
		
	}

}
