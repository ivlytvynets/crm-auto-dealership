package org.crm.auto.dealership.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.entity.Car;
import org.crm.auto.dealership.repository.CarRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarRepository carRepository;

  public Car save(Car car) {
    return carRepository.save(car);
  }

  public Car getById(Long id) {
    return carRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
        HttpStatusCode.valueOf(404), "Not found by id=" + id));
  }

  public List<Car> getAll() {
    return carRepository.findAll();
  }

  public void deleteById(Long id) {
    carRepository.deleteById(id);
  }

  public void deleteAll() {
    carRepository.deleteAll();
  }
}
