package co.pyxisportal.demo.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.pyxisportal.demo.dtos.DemoDTO;
import co.pyxisportal.demo.facades.DemoFacade;

@RestController
@RequestMapping("/demos")
public class DemoController {

	@Resource
	private DemoFacade demoFacade;

	@GetMapping()
	public List<DemoDTO> findAll() {
		return demoFacade.findAll();
	}

	@PostMapping
	public DemoDTO addDemo(@RequestBody final DemoDTO demoDTO) {
		demoFacade.addDemo(demoDTO);
		return demoDTO;
	}

}
