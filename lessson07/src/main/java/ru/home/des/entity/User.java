package ru.home.des.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_tbl")
public class User {
    private static final String SEQUANCE_NAME = "user_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = SEQUANCE_NAME)
    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "login_fld")
    private String login;

    @Column(name = "password_fld")
    private String password;

    @Column(name = "user_role_fld")
    private UserRole role;

    @Column(name = "user_authority")
    private UserAuthority authority;

}
