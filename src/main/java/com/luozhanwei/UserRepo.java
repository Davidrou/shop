package com.luozhanwei;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luxiaolin on 17/7/8.
 */
public interface UserRepo extends JpaRepository<User, Integer> {
}
