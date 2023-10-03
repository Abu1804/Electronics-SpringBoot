package emp.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import emp.example.entity.Entitys;

@Repository
public class Dao {
	@Autowired
	emp.example.repo.Repo er;

	public String post(Entitys s) {
		er.save(s);
		return "Data Saved Successfully";
	}

	public String postAll(List<Entitys> s) {
		er.saveAll(s);
		return "All Data Saved Successfully";
	}

	public Entitys getById(int id) {
		return er.findById(id).get();
	}

	public List<Entitys> getAll() {
		return er.findAll();
	}

	public String update(Entitys s) {
		er.save(s);
		return "Data Updated";
	}

	public String deleteById(int id) {
		er.deleteById(id);
		return "Data Deleted";
	}
}
