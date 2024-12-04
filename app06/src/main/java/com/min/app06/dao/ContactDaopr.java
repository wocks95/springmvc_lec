package com.min.app06.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.app06.dto.ContactDto;

@Repository
public class ContactDaopr implements IContactDao {
  
  @Autowired
  private JdbcConnection jdbcConnection;
  private Connection conn;
  private PreparedStatement ps;
  private ResultSet rs;
  

  @Override
  public List<ContactDto> getContactList() {
    List<ContactDto> contacts = new ArrayList<ContactDto>();
    conn = jdbcConnection.getConnection();
    try {
      String sql = "SELECT contact_id, last_name, first_name, email, mobile, create_dt FROM tbl_contact";
      ps = conn.prepareStatement(sql);
      rs = ps.executeQuery();
      while(rs.next()) {
        int contact_id = rs.getInt("contact_id");
        String last_name = rs.getString("last_name"); 
        String first_name = rs.getString("first_name");
        String email = rs.getString("email"); 
        String mobile = rs.getString("mobile"); 
        Date create_dt = rs.getDate("create_dt");
        
        ContactDto contactDto = ContactDto.builder()
                                   .contact_id(contact_id)
                                   .last_name(last_name)
                                   .first_name(first_name)
                                   .email(email)
                                   .mobile(mobile)
                                   .contact_id(contact_id)
                                   .build();
        contacts.add(contactDto);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    jdbcConnection.close(conn, ps, rs);
    return contacts;
  }

  @Override
  public ContactDto getContactById(int contact_id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getContactCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int register(ContactDto contactDto) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int modify(ContactDto contactDto) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int remove(int contact_id) {
    // TODO Auto-generated method stub
    return 0;
  }

}
