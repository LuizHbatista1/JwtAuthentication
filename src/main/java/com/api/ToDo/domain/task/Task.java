package com.api.ToDo.domain.task;

import jakarta.persistence.*;
import lombok.*;


@Entity(name = "tasks")
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String title;
    private String description;
    private StatusType status;

}
