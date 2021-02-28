package ru.home.des.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "student_tbl")
public class Student {
    private static final String SEQUANCE_NAME = "student_seq";

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = SEQUANCE_NAME)
    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
    private Long id;

    @Column(name = "name_fld")
    private String name;

    @Column(name = "age_fld")
    private Integer age;

}
