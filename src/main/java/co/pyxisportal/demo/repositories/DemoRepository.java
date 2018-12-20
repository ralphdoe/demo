package co.pyxisportal.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import co.pyxisportal.demo.models.Demo;

@Component
public interface DemoRepository extends JpaRepository<Demo, Long> {
	Demo findByName(String name);
}
