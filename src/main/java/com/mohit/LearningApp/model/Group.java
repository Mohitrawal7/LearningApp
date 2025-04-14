package com.mohit.LearningApp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "groups")
public class Group {

    @Id
    private String groupId;

   @Column(name = "groupName",nullable = false)
   private String groupName;

   @Column(name = "member" )
    private  String member;

   @Column(name = "description" , nullable = false)
    private String description;

   @Column(name = "Admin")
    private String Admin;



}
