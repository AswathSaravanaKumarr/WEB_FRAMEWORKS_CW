package com.example.amreth_day11cw2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class AswathStudent {
    @Id
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private AswathStudentInfo studentInfo;
}
