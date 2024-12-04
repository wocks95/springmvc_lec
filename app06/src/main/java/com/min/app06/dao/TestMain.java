package com.min.app06.dao;

public class TestMain {

  public static void main(String[] args) {

    IContactDao dao = new ContactDaoImpl();
    dao.getContactList();
  }

}
