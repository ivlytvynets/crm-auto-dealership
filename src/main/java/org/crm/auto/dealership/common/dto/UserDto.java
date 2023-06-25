package org.crm.auto.dealership.common.dto;

import lombok.Data;
import org.crm.auto.dealership.common.enums.Role;

@Data
public class UserDto {
  private String email;
  private String firstName;
  private String lastName;
  private Role role;
}
