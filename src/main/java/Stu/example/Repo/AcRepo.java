package Stu.example.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Stu.example.Entity.AcEntitys;

public interface AcRepo extends JpaRepository<AcEntitys, Integer> {
	@Query(value = "select * from ac where brand like ?", nativeQuery = true)
	public List<AcEntitys> getByBrand(String brand);

	@Query(value = "select * from ac where model like ?", nativeQuery = true)
	public List<AcEntitys> getByModel(String model);
	
	@Query(value="select * from ac where price > ?",nativeQuery = true)
	public List<AcEntitys>getByPrice(int price);
	
	@Query(value="select * from ac where price > ? and price < ?",nativeQuery = true)
	public List<AcEntitys>getByPriceRange(int p1,int p2);
	
	@Query(value="select * from ac where price=(select max(price)from ac) limit 1",nativeQuery=true)
	public AcEntitys getMaxPrice();
	
	@Query(value="select * from ac where price=(select min(price)from ac) limit 1",nativeQuery=true)
	public AcEntitys getMinPrice();
	
	@Query(value="select max(price) from ac " ,nativeQuery = true)
	public int getMax();
	
	@Query(value="select min(price) from ac " ,nativeQuery = true)
	public int getMin();
	
	@Query(value="select * from ac where model like ?",nativeQuery=true)
	public List<AcEntitys>getByModell(String model);
	
	@Query(value="select * from ac where price > ?",nativeQuery = true)
	public List<AcEntitys> getPriceRange(int price);
	
	@Query(value="select * from ac where color like ?",nativeQuery=true)
	public List<AcEntitys>getByColor(String color);
	
	@Query(value="select * from ac where brand like ?",nativeQuery = true)
	public List<AcEntitys>updates(String brand);
	
//	@Query(value="select * from ac where brand like?",nativeQuery = true)
//	public List<AcEntitys>
    
	
}
