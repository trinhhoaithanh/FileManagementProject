package filemanagement.filemanagement.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "groups")
public class Group {
    @Id @GeneratedValue
    @Column(name = "group_id")
    private Long id;

    private String groupName;

    @OneToMany(mappedBy = "groupUser")
    private List<GroupUser> groupUsers = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<SharedFileInGroup> sharedFileInGroupList = new ArrayList<>();
}
