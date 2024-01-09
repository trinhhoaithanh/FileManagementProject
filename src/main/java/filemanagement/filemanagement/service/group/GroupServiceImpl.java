package filemanagement.filemanagement.service.group;

import filemanagement.filemanagement.domain.Group;
import filemanagement.filemanagement.repository.GroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GroupServiceImpl implements GroupService{
    private GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void createAGroup(String groupName) {
        Group newGroup = new Group();
        newGroup.setGroupName(groupName);
        groupRepository.saveGroup(newGroup);
    }
}
