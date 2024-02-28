package com.batcode.crud.repositories;

import com.batcode.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Nos permite hacer consultas a la base de datos
@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {



}
