package com.israel.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.israel.os.domain.OS;
import com.israel.os.domain.Tecnico;
import com.israel.os.domain.Usuario;
import com.israel.os.domain.enuns.Prioridade;
import com.israel.os.domain.enuns.Status;
import com.israel.os.repositories.OSRepository;
import com.israel.os.repositories.TecnicoRepository;
import com.israel.os.repositories.UsuarioRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private OSRepository osRepository;
	
	
	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Israel Souza", "272.663.660-89", "(99)98888-8888");
		Tecnico t2 = new Tecnico(null, "Linux Talveds", "299.188.620-09", "(99)98888-5555");
		Usuario u1 = new Usuario(null, "Betina Campos", "657.430.310-96", "(99)99888-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, u1);
		
		t1.getList().add(os1);
		u1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		usuarioRepository.saveAll(Arrays.asList(u1));
		osRepository.saveAll(Arrays.asList(os1));
		
	}

}
