package com.backend_crudapplication_1.backend_crudapplication_1.UserEntity;

import com.backend_crudapplication_1.backend_crudapplication_1.address.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    String firstName;
    String lastName;
    @Id
    Long userId;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    List<Address> address;
    String password;
    String confirmPassword;

}
