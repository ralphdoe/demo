package co.pyxisportal.demo.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import co.pyxisportal.demo.models.Demo;
import co.pyxisportal.demo.repositories.DemoRepository;

@Component
public class DemoService {

	@Resource
	private DemoRepository demoRepository;

	public List<Demo> findAll() {
		return demoRepository.findAll();
	}

	public Demo addDemo(final Demo demo) {
		demoRepository.save(demo);
		return demo;
	}

}
