package org.crm.auto.dealership.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.entity.Manufacturer;
import org.crm.auto.dealership.repository.ManufacturerRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ManufacturerService {
  private final ManufacturerRepository manufacturerRepository;

  public Manufacturer save(Manufacturer car) {
    return manufacturerRepository.save(car);
  }

  public Manufacturer getById(Long id) {
    return manufacturerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
        HttpStatusCode.valueOf(404), "Not found by id=" + id));
  }

  public List<Manufacturer> getAll() {
    return manufacturerRepository.findAll();
  }

  public void deleteById(Long id) {
    manufacturerRepository.deleteById(id);
  }

  public void deleteAll() {
    manufacturerRepository.deleteAll();
  }
}
