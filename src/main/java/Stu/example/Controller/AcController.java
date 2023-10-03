package Stu.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Stu.example.Entity.AcEntitys;
import Stu.example.Exception.ColourException;
import Stu.example.Exception.CromaNotFoundException;
import Stu.example.Exception.ModelNotFoundException;
import Stu.example.Exception.PriceAboveException;

@RestController
public class AcController {
	@Autowired
	Stu.example.Service.AcService acs;

	@PostMapping(value = "postAll")
	public String postAll(@RequestBody List<AcEntitys> x) {
		return acs.postAll(x);
	}

	@GetMapping(value = "getById/{id}")
	public AcEntitys getById(@PathVariable int id) {
		return acs.getById(id);
	}

	@GetMapping(value = "getAll")
	public List<AcEntitys> getAll() {
		return acs.getAll();
	}

	@PutMapping(value = "/update")
	public String update(@RequestBody AcEntitys s) {
		return acs.update(s);
	}
	@GetMapping(value="getByBrand/{b}")
	public List<AcEntitys>getByBrand(@PathVariable String b){
		String brand=b.toLowerCase();
		return acs.getByBrand(brand);
	}
	@GetMapping(value="getByModel/{b}")
	public List<AcEntitys>getByModel(@PathVariable String b){
		String model=b.toLowerCase();
		return acs.getByModel(model);
	}
	@GetMapping(value="getByPrice/{b}")
	public List<AcEntitys>getByPrice(@PathVariable int b){
		//String price=b.toLowerCase();
		return acs.getByPrice(b);
	}
	@GetMapping(value="getByPriceRange/{p1}/{p2}")
	public List<AcEntitys>getByPriceRange(@PathVariable int p1,@PathVariable int p2){
		//String price=b.toLowerCase();
		return acs.getByPriceRange(p1,p2);
	}
	@GetMapping(value="getMaxprice")
	public AcEntitys getMaxPrice() {
		return acs.getMaxPrice();
	}
	@GetMapping(value="getMinprice")
	public AcEntitys getMinPrice() {
		return acs.getMinPrice();
	}
	@GetMapping(value="getMax")
	public int getMax(){
		return acs.getMax();
	}
	@GetMapping(value="getMin")
	public int getMin(){
		return acs.getMin();
	}
	@GetMapping(value="getByModell/{b}")
	public List<AcEntitys>getByModell(@PathVariable String b)throws ModelNotFoundException {
		String model=b.toLowerCase();
		return acs.getByModell(model);
	}
//	@GetMapping(value = "getPriceRange/{a}")
//	public List<AcEntitys>getPriceRange(@PathVariable int a){
//		return acs.getPriceRange(a);
//	}
	@GetMapping(value="getBycol/{b}")
	public List<AcEntitys>getByColor(@PathVariable String b)throws Exception {
		return acs.getByColor(b);
	}
	@PostMapping(value="/postobject")
	public String postByBrandYear(@RequestBody AcEntitys a)throws CromaNotFoundException{
		return acs.postByBrandYear(a);
	}
}
