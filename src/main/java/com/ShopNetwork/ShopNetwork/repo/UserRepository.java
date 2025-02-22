package com.ShopNetwork.ShopNetwork.repo;

import com.ShopNetwork.ShopNetwork.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    Iterable<User> findFollowers();
}
