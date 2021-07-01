package com.mitocode.repository;

import com.mitocode.model.Usuario;

public interface IUsuarioRepo extends IGenericRepo<Usuario, Integer>  {

	//from usuario where username = ?
	Usuario findOneByUsername(String username);	
}
