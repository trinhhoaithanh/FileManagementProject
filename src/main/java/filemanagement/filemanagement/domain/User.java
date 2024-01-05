package filemanagement.filemanagement.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "users")
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "user")
    private List<SharedFileUser> sharedFileUsers = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<File> files = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<SavedFile> savedFies = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<GroupUser> groupUserList;
}
