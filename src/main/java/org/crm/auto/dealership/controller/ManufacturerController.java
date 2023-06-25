package org.crm.auto.dealership.controller;

import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.entity.Manufacturer;
import org.crm.auto.dealership.service.ManufacturerService;
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
@RequestMapping("/v1/manufacturer")
@RequiredArgsConstructor
public class ManufacturerController {
  private final ManufacturerService manufacturerService;

  @PostMapping
  public ResponseEntity<?> save(@RequestBody Manufacturer manufacturer) {
    return ResponseEntity.ok().body(manufacturerService.save(manufacturer));
  }

  @PutMapping
  public ResponseEntity<?> update(@RequestBody Manufacturer manufacturer) {
    return ResponseEntity.ok().body(manufacturerService.save(manufacturer));
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {
    return ResponseEntity.ok().body(manufacturerService.getById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() {
    return ResponseEntity.ok().body(manufacturerService.getAll());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteById(@PathVariable Long id) {
    manufacturerService.deleteById(id);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public ResponseEntity<?> deleteAll() {
    manufacturerService.deleteAll();
    return ResponseEntity.ok().build();
  }
}
