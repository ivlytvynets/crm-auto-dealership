package org.crm.auto.dealership.controller;

import java.security.Principal;
import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.entity.Car;
import org.crm.auto.dealership.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/car")
@RequiredArgsConstructor
public class CarController {
  private final CarService carService;

  @PostMapping
  public ResponseEntity<?> save(@RequestBody Car car) {
    return ResponseEntity.ok().body(carService.save(car));
  }

  @PutMapping
  public ResponseEntity<?> update(@RequestBody Car car) {
    return ResponseEntity.ok().body(carService.save(car));
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {
    return ResponseEntity.ok().body(carService.getById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll(Principal principal) {
    return ResponseEntity.ok().body(carService.getAll());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteById(@PathVariable Long id) {
    carService.deleteById(id);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public ResponseEntity<?> deleteAll() {
    carService.deleteAll();
    return ResponseEntity.ok().build();
  }
}
