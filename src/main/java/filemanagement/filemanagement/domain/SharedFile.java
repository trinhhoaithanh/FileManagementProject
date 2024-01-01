package filemanagement.filemanagement.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class SharedFile {
    @Id @GeneratedValue
    @Column(name = "shared_file_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "file_id")
    private File file;

    @ManyToOne
    @JoinColumn(name = "group_user_id")
    private GroupUser groupUser;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
