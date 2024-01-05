package filemanagement.filemanagement.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    public Long id;

    public String email;

    public String password;

    @Enumerated(EnumType.STRING)
    public UserRole role;

    @OneToMany(mappedBy = "user")
    public List<SharedFileUser> sharedFileUsers = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    public List<File> files = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    public List<SavedFile> savedFies = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    public List<GroupUser> groupUserList;
}
