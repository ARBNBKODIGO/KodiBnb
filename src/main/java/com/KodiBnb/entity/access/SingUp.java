package com.KodiBnb.entity.access;

import lombok.Getter;
import lombok.Setter;

public class SingUp implements ISingUp {

  @Getter @Setter private String name;

  @Getter @Setter private String email;
  @Getter @Setter private String password;
  @Getter @Setter private String celphone;

  @Override
  public void singUp() {}
}
