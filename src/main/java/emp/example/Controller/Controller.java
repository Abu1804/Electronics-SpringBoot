package emp.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emp.example.entity.Entitys;

@RestController
public class Controller {
	@Autowired
	emp.example.service.Services ss;

	@PostMapping(value = "post")
	public String postvalues(@RequestBody Entitys e) {
		return ss.post(e);
	}

	@PostMapping(value = "postAll")
	public String postAll(@RequestBody List<Entitys> e) {
		return ss.postAll(e);
	}

	@GetMapping(value = "getById/{id}")
	public Entitys getById(@PathVariable int id) {
		return ss.getById(id);
	}

	@GetMapping(value = "getAll")
	public List<Entitys> getAll() {
		return ss.getAll();
	}

	@PutMapping(value = "/update")
	public String update(@RequestBody Entitys s) {
		return ss.update(s);
	}

	@DeleteMapping(value = "delete/{id}")
	public String deleteById(@PathVariable int id) {
		return ss.deleteById(id);
	}

	@GetMapping(value="/getByGender/{gender}")
	public List<Entitys>getByGender(@PathVariable String gender){
		return ss.getByGender(gender);
	}
	@GetMapping(value="/getByGenderr/{gender}")
	public List<String>getByGenderr(@PathVariable String gender){
		return ss.getByGenderr(gender);
	}
	@GetMapping(value="/minSalary")
	public Entitys findminSalary(){
		return ss.findminSalary();
	}
	@GetMapping(value="/getByAge/{age}/{age1}")
	public List<Entitys>getByAge(@PathVariable int age,@PathVariable int age1){
		return ss.getByAge(age,age1);
	}
	@GetMapping(value="getByname")
	public List<Character>getByName(){
		return ss.getByName();
	}
}
