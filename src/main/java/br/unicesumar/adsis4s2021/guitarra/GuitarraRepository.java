package br.unicesumar.adsis4s2021.guitarra;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GuitarraRepository extends JpaRepository<Guitarra, String>{


    @Query(value = "select * from guitarra m where m.marca = :marca ", nativeQuery = true)
    public List<Guitarra> recuperarPelaMarca(String marca);
    
}
