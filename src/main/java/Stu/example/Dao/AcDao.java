package Stu.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Stu.example.Entity.AcEntitys;
import Stu.example.Exception.ColourException;
import Stu.example.Exception.ModelNotFoundException;
import Stu.example.Exception.PriceAboveException;

@Repository
public class AcDao {
	@Autowired
	Stu.example.Repo.AcRepo acr;

	public String postAll(List<AcEntitys> x) {
		acr.saveAll(x);
		return "data saved Successfully";
	}

	public AcEntitys getById(int id) {
		return acr.findById(id).get();
	}

	public List<AcEntitys> getAll() {
		return acr.findAll();
	}

	public String update(AcEntitys s) {
		acr.save(s);
		return "Data Updated";
	}

	public List<AcEntitys> getByBrand(String brand) {
		return acr.getByBrand(brand);
	}

	public List<AcEntitys> getByModel(String model) {
		return acr.getByModel(model);
	}

	public List<AcEntitys> getByPrice(int price) {
		return acr.getByPrice(price);
	}

	public List<AcEntitys> getByPriceRange(int p1, int p2) {
		return acr.getByPriceRange(p1, p2);
	}

	public AcEntitys getMaxPrice() {
		return acr.getMaxPrice();
	}

	public AcEntitys getMinPrice() {
		return acr.getMinPrice();
	}

	public int getMax() {
		return acr.getMax();
	}

	public int getMin() {
		return acr.getMin();
	}

	public List<AcEntitys> getByModell(String b) throws ModelNotFoundException {
		if (acr.getByModell(b).isEmpty()) {
			throw new ModelNotFoundException("This model not found");
		} else {
			return acr.getByModell(b);
		}
	}

	public List<AcEntitys> getByColor(String color) throws Exception {
		return acr.getByColor(color);
	}

//	public List<AcEntitys>getpriceRange(List<AcEntitys> a) {
//		acr.save(a);
//		return "data uploded";
//	}
	public String postByBrandYear(AcEntitys s) {
		acr.save(s);
		return "dataSaved Succesfully";
	}
}
