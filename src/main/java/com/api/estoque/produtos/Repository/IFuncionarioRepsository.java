package com.api.estoque.produtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.estoque.produtos.Models.Funcionario;

public interface IFuncionarioRepsository extends JpaRepository<Funcionario,Long> {

}
