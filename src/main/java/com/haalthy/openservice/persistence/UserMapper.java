package com.haalthy.openservice.persistence;

import com.haalthy.openservice.domain.User;

public interface UserMapper {
	  String getUserByUsername(String username);
}
