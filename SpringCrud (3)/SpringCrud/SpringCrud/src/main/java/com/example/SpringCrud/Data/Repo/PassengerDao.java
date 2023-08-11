package com.example.SpringCrud.Data.Repo;

import com.example.SpringCrud.Data.Entities.PassengerIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDao extends JpaRepository<PassengerIn,Integer> {
}
