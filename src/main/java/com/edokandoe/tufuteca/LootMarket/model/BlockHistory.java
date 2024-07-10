package com.edokandoe.tufuteca.LootMarket.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBlock")
    private Long id;

    @Column(name = "block_reason")
    private String blockReason;

    private LocalDate dateBlock;

    private LocalDate dateUnBlock;

    @ManyToOne
    @JoinColumn(name = "Users_idUsers")
    private Users user;
}
