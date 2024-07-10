package com.edokandoe.tufuteca.LootMarket.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

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

    @Column(unique = true,nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false, columnDefinition = "default false") // Заблокирован ли аккаунт
    private Boolean Blocked;

    @Column(nullable = false, columnDefinition = "default false") // Активен ли аккаунт
    private Boolean Enabled;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role; //Роль пользователя

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<BlockHistory> blockHistories; //История блокировок
}
