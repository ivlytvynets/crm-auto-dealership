package org.crm.auto.dealership.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.entity.Country;
import org.crm.auto.dealership.repository.CountryRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CountryService {
  private final CountryRepository countryRepository;

  public Country save(Country car) {
    return countryRepository.save(car);
  }

  public Country getById(Long id) {
    return countryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
        HttpStatusCode.valueOf(404), "Not found by id=" + id));
  }

  public List<Country> getAll() {
    return countryRepository.findAll();
  }

  public void deleteById(Long id) {
    countryRepository.deleteById(id);
  }

  public void deleteAll() {
    countryRepository.deleteAll();
  }
}
