package emp.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import emp.example.entity.Entitys;

public interface Repo extends JpaRepository<Entitys,Integer>{

}
