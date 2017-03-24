package com.company;

public class Person {

  private static Person p = new Person();
  private String name;
  private String account;

  private Person(){
    this.name="";
    this.account="";
  }

  static Person getInstance(){
    return p;
  }

  public static void setP(Person p) {
    Person.p = p;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }
}