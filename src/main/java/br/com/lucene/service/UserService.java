package br.com.lucene.service;

import br.com.lucene.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
