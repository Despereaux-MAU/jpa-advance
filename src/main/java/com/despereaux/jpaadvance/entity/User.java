package com.despereaux.jpaadvance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
//    @ManyToMany 에도 mappedBy() 가 없음! 근데 왜 생략?? -> Spring이 알아서 만들어 줌! 대신에 관리가 어려움 ㅠㅠ
}
