package com.rabelinho.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rabelinho.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

  public boolean execute( VerifyIfHasCertificationDTO dto ) {
    if (dto.getEmail().equals("adrianrabeloe10@gmail.com") && dto.getTechnology().equals("Java")) {
      return true;
    }
    return false;
  }
}
