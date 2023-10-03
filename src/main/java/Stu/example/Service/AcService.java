package Stu.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Stu.example.Entity.AcEntitys;
import Stu.example.Exception.ColourException;
import Stu.example.Exception.CromaNotFoundException;
import Stu.example.Exception.ModelNotFoundException;
import Stu.example.Exception.PriceAboveException;
import Stu.example.Exception.UpdateException;

@Service
public class AcService {
	@Autowired
	Stu.example.Dao.AcDao acd;

	public String postAll(List<AcEntitys> x) {
		return acd.postAll(x);
	}

	public AcEntitys getById(int id) {
		return acd.getById(id);
	}

	public List<AcEntitys> getAll() {
		return acd.getAll();
	}

	public String update(AcEntitys s) {
		return acd.update(s);
	}

	public List<AcEntitys> getByBrand(String b) {
		return acd.getByBrand(b);
	}

	public List<AcEntitys> getByModel(String b) {
		return acd.getByModel(b);
	}

	public List<AcEntitys> getByPrice(int b) {
		return acd.getByPrice(b);
	}

	public List<AcEntitys> getByPriceRange(int p1, int p2) {
		return acd.getByPriceRange(p1, p2);
	}

	public AcEntitys getMaxPrice() {
		return acd.getMaxPrice();
	}

	public AcEntitys getMinPrice() {
		return acd.getMinPrice();
	}

	public int getMax() {
		return acd.getMax();
	}

	public int getMin() {
		return acd.getMin();
	}

	public List<AcEntitys> getByModell(String b) throws ModelNotFoundException {
		return acd.getByModell(b);
	}

//	public String postpriceRange(AcEntitys x) throws PriceAboveException {
//		try {
//			if (x.getPrice() >= 50000) {
//				throw new PriceAboveException("Above 50k");
//			} 
//			else {
//				return acd.getpriceRange(x);
//			}
//		} catch (PriceAboveException p) {
//			return "price catched";
//		}
//	}

	public List<AcEntitys> getByColor(String color) throws Exception {
		List<AcEntitys> j = acd.getByColor(color);
		if (j.isEmpty()) {
			throw new ColourException("This colour not found");
		}
		else {
			return acd.getByColor(color);

		}
	}

//	public List<AcEntitys> getByPriceRange(int a) {
//		return null;
//	}
	public String postByBrandYear(AcEntitys y) throws CromaNotFoundException{
		if(y.getModelYear()==2021 && y.getBrand().equals("Croma")) {
		return acd.postByBrandYear(y);		
		}
	else {
		throw new CromaNotFoundException("This Brand Not Equal");
	}
	}
	public List<AcEntitys> getByColor1(String color) throws Exception {
		List<AcEntitys> j = acd.getByColor(color);
		if (j.isEmpty()) {
			throw new ColourException("This colour not found");
		}
		else {
			return acd.getByColor(color);

		}
	}
}
