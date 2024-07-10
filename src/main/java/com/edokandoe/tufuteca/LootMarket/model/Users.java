package com.edokandoe.tufuteca.LootMarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Long id;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false) // Заблокирован ли аккаунт
    private Boolean Blocked = false;

    @Column(nullable = false) // Активен ли аккаунт
    private Boolean Enabled = false;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id_role")
    private Role role;

    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<BlockHistory> blockHistories; // История блокировок
}
