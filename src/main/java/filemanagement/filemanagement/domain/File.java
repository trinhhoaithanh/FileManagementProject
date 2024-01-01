package filemanagement.filemanagement.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class File {
    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;

    private String fileName;

    private int fileSize;

    private String path;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "file")
    private List<SharedFile> sharedFileList = new ArrayList<>();

    @OneToMany(mappedBy = "file")
    private List<SavedFile> savedFiles = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private FileStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
