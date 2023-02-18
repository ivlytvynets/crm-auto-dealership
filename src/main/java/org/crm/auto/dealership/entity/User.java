package org.crm.auto.dealership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.crm.auto.dealership.common.enums.Role;

@Entity
@Table(name = "users_t")
@Data
@EqualsAndHashCode
public class User extends AbstractEntity {

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "lastName")
  private String lastName;

  @Column(name = "role")
  private Role role;
}
