package ru.zhuravlev.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import ru.zhuravlev.entity.enums.UserState;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@EqualsAndHashCode(exclude = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    @CreationTimestamp
    private LocalDateTime firstLoginDate;
    @CreationTimestamp
    private LocalDateTime lastLoginDate;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Boolean isActive;
    @Enumerated(EnumType.STRING)
    private UserState state;
}
