package org.crm.auto.dealership.controller;

import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.entity.Country;
import org.crm.auto.dealership.service.CountryService;
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
@RequestMapping("/v1/country")
@RequiredArgsConstructor
public class CountryController {
  private final CountryService countryService;

  @PostMapping
  public ResponseEntity<?> save(@RequestBody Country country) {
    return ResponseEntity.ok().body(countryService.save(country));
  }

  @PutMapping
  public ResponseEntity<?> update(@RequestBody Country country) {
    return ResponseEntity.ok().body(countryService.save(country));
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {
    return ResponseEntity.ok().body(countryService.getById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() {
    return ResponseEntity.ok().body(countryService.getAll());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteById(@PathVariable Long id) {
    countryService.deleteById(id);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public ResponseEntity<?> deleteAll() {
    countryService.deleteAll();
    return ResponseEntity.ok().build();
  }
}
