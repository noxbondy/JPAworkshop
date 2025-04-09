package entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "createDate")
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, length = 100, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    private LocalDate regDate;


@OneToOne
@JoinColumn(name="details_id")
private Details details;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
@PrePersist
public void persist() {
        this.regDate = LocalDate.now();

}


}
