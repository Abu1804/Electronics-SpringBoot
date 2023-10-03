package emp.example.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emp.example.entity.Entitys;

@Service
public class Services {
	@Autowired
	emp.example.Dao.Dao ed;

	public String post(Entitys s) {
		return ed.post(s);
	}

	public String postAll(List<Entitys> s) {
		return ed.postAll(s);
	}

	public Entitys getById(int id) {
		return ed.getById(id);
	}

	public List<Entitys> getAll() {
		return ed.getAll();
	}
	public String update(Entitys s) {
		return ed.update(s);
	}
	public String deleteById(int id) {
		return ed.deleteById(id);
	}
	public List<Entitys>getgender(List<Entitys> a){
		return a;
	}
	public List<Entitys>getByGender(String gender){
		List<Entitys>x=ed.getAll();
		List<Entitys>a=x.stream().filter(z->z.getGender().equals(gender)).collect(Collectors.toList());
		return a;
	}
	public Entitys findminSalary(){
		List<Entitys> y=ed.getAll();
		Optional<Entitys> b=y.stream().min(Comparator.comparingInt(Entitys::getSalary));
		return b.orElse(null);
	}
	public List<String> getByGenderr(String gender){
		List<Entitys>c=ed.getAll();
		List<String>e=c.stream().filter(v->v.getGender().equals(gender)).map(p->p.getName()).collect(Collectors.toList());
		return e;
	}

	public List<Entitys> getByAge(int age,int age1) {
		List<Entitys>v=ed.getAll();
		List<Entitys>t=v.stream().filter(f->f.getAge()>age && f.getAge()<age1).collect(Collectors.toList());
		return t;
	}

	public List<Character> getByName() {
		List<Entitys>c=ed.getAll();
		List<Character>t=c.stream().map(g->g.getName().charAt(g.getName().length()-1)).collect(Collectors.toList());
		return t;
	}
}
