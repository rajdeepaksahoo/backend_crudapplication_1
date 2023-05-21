package com.backend_crudapplication_1.backend_crudapplication_1.address;

import com.backend_crudapplication_1.backend_crudapplication_1.UserEntity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String at;
    String po;
    String dist;
    String state;
    Long pin;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    @JsonIgnore
    UserEntity user;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", at='" + at + '\'' +
                ", po='" + po + '\'' +
                ", dist='" + dist + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
