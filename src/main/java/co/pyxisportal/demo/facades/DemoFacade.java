package co.pyxisportal.demo.facades;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import co.pyxisportal.demo.dtos.DemoDTO;
import co.pyxisportal.demo.models.Demo;
import co.pyxisportal.demo.services.DemoService;

@Component
public class DemoFacade {

	@Resource
	private DemoService demoService;

	public List<DemoDTO> findAll() {
		final List<Demo> demoList = demoService.findAll();
		final List<DemoDTO> demoDTOList = new ArrayList<>();

		for (final Demo demo : demoList) {
			demoDTOList.add(convertModelToDTO(demo));
		}

		return demoDTOList;
	}

	public DemoDTO addDemo(final DemoDTO demoDTO) {
		final Demo demo = convertDTOToModel(demoDTO);
		demoService.addDemo(demo);
		return demoDTO;
	}

	private DemoDTO convertModelToDTO(final Demo demo) {
		final DemoDTO demoDTO = new DemoDTO();
		demoDTO.setId(demo.getId());
		demoDTO.setName(demo.getName());
		demoDTO.setDescription(demo.getDescription());
		demoDTO.setActualDate(demo.getActualDate());
		return demoDTO;
	}

	private Demo convertDTOToModel(final DemoDTO demoDTO) {
		final Demo demo = new Demo();
		demo.setId(demoDTO.getId());
		demo.setName(demoDTO.getName());
		demo.setDescription(demoDTO.getDescription());
		demo.setActualDate(demoDTO.getActualDate());
		return demo;
	}
}
