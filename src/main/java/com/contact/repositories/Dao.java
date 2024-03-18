package com.contact.repositories;

import com.contact.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<UserInfo,String> {

}
