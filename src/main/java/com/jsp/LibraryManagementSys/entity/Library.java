package com.jsp.LibraryManagementSys.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "lib_seq",allocationSize = 1,initialValue = 100)
    private int id;
    String name;
    LocalDate establishedAt;
    String location;
}

